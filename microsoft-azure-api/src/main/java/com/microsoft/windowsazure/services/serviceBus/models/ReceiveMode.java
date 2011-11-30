/**
 * Copyright 2011 Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.microsoft.windowsazure.services.serviceBus.models;

/**
 * Specifies the mode when a message is received.
 */
public enum ReceiveMode {
    /**
     * The message is retrieved and locked for processing, until either the receiver deletes the message, unlocks it, or
     * the lock duration expires.
     */
    PEEK_LOCK,
    /**
     * The message is retrieved and deleted.
     */
    RECEIVE_AND_DELETE,
}
