/*
 * //******************************************************************
 * //
 * // Copyright 2016 Samsung Electronics All Rights Reserved.
 * //
 * //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
 * //
 * // Licensed under the Apache License, Version 2.0 (the "License");
 * // you may not use this file except in compliance with the License.
 * // You may obtain a copy of the License at
 * //
 * //      http://www.apache.org/licenses/LICENSE-2.0
 * //
 * // Unless required by applicable law or agreed to in writing, software
 * // distributed under the License is distributed on an "AS IS" BASIS,
 * // WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * // See the License for the specific language governing permissions and
 * // limitations under the License.
 * //
 * //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
 */
package org.iotivity.cloud.base;

public class OCFConstants {
    /* resource Interface for keep-alive */
    public static final String DEFAULT_INTERFACE   = "oic.if.baseline";

    public static final String LINK_INTERFACE      = "oic.if.ll";

    public static final String PREFIX_WELL_KNOWN   = ".well-known";

    public static final String PREFIX_OCF          = "ocf";

    public static final String PREFIX_OIC          = "oic";

    public static final String RS_INTERFACE        = "if";

    /* resource url for account */
    public static final String ACCOUNT_URI         = "account";

    public static final String SESSION_URI         = "session";

    public static final String DEVICE_URI          = "device";

    public static final String TOKEN_REFRESH_URI   = "tokenrefresh";

    /* resource uri to publish, update, delete resource info */
    public static final String RD_URI              = "rd";

    /* resource uri for keep-alive */
    public static final String KEEP_ALIVE_URI      = "ping";

    /* resource uri to discover resource info */
    public static final String WELL_KNOWN_URI      = "res";

    /* resource uri for resource presence */
    public static final String RES_PRESENCE_URI    = "ad";

    /* resource uri for device presence */
    public static final String DEVICE_PRESENCE_URI = "prs";

    /* resource uri for message queue */
    public static final String MQ_BROKER_URI       = "ps";
    public static final String MQ_BROKER_RT        = "oic.wk.ps";

    /* file path for tls communication - Modify filePath to yours */
    public static final String ROOT_CERT_FILE      = "./rootca.crt";

    public static final String CLOUD_CERT_FILE     = "./iotivitycloud.crt";

    public static final String CLOUD_KEY_FILE      = "./iotivitycloud.key";

}
