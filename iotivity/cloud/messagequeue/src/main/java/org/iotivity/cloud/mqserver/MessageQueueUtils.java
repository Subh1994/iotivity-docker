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
package org.iotivity.cloud.mqserver;

import java.util.HashMap;

import org.iotivity.cloud.util.Cbor;
import org.iotivity.cloud.util.Logger;

public class MessageQueueUtils {

    public static <T> T extractDataFromPayload(byte[] payload, String key) {

        if (payload == null || key.isEmpty()) {
            Logger.e("payload or key is empty");
            return null;
        }

        Cbor<HashMap<String, T>> cbor = new Cbor<>();
        HashMap<String, T> parsedData = null;

        parsedData = cbor.parsePayloadFromCbor(payload, HashMap.class);

        if (parsedData == null || parsedData.containsKey(key) == false) {
            Logger.e("payload doesn't contain " + key + " information");
            return null;
        }

        return parsedData.get(key);
    }

    public static <T> byte[] buildPayload(String key, T value) {

        Cbor<HashMap<String, T>> cbor = new Cbor<>();

        HashMap<String, T> map = new HashMap<>();
        map.put(key, value);

        return cbor.encodingPayloadToCbor(map);
    }
}