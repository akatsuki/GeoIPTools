/*
 * Copyright 2011 Sebastian K�hler <sebkoehler@whoami.org.uk>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.org.whoami.geoip.util;

import java.util.logging.Logger;

/**
 * @author Sebastian Köhler <whoami@whoami.org.uk>
 */
//Cleanup by Fishrock123 <Fishrock123@rocketmail.com>
public class ConsoleLogger {
    private static final Logger log = Logger.getLogger("Minecraft");

    public static void info(String message) {
        log.info("[GeoIPTools] " + message);
    }
}