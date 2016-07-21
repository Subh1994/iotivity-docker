# Dockerfile to create iotivity framework container image

# Using ubuntu:14.04 latest image

FROM ubuntu:14.04

MAINTAINER Subhash Kumar <subhash.kumar@smartron.com>

RUN apt-get install -y \
build-essential \
g++ \
libglib2.0-dev \
scons \
unzip \
uuid-dev \
python-dev \
autotools-dev \
libicu-dev \
libbz2-dev

ADD iotivity\ \iotivity\
ADD boost_1_55_0/ /boost_1_55_0/
RUN cd boost_1_55_0/ \
&& ./bootstrap.sh --with-libraries=system,filesystem,date_time,thread,regex,log,iostreams,program_options --prefix=/usr/local \
&& ./b2 install \
&& sh -c 'echo '/usr/local/lib' >> /etc/ld.so.conf.d/local.conf' \
ldconfig \
cd ../iotivity/ \
scons



