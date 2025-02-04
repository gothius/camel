/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.camel.component.couchdb.consumer;

import org.apache.camel.component.couchdb.CouchDbClientWrapper;
import org.apache.camel.resume.Offset;
import org.apache.camel.resume.Resumable;
import org.apache.camel.support.resume.Offsets;

/**
 * Wraps the resume data for CouchDb
 */
public class CouchDbResumable implements Resumable<String, String> {
    private final CouchDbClientWrapper clientWrapper;
    private String offset;

    public CouchDbResumable(CouchDbClientWrapper clientWrapper, String offset) {
        this.clientWrapper = clientWrapper;
        this.offset = offset;
    }

    @Override
    public void updateLastOffset(String offset) {
        this.offset = offset;
    }

    @Override
    public Offset<String> getLastOffset() {
        return Offsets.of(offset);
    }

    @Override
    public String getAddressable() {
        return null;
    }

    /**
     * Gets the client wrapper. Fine for local access, but should be restricted for global access on the API
     * 
     * @return the client wrapper
     */
    CouchDbClientWrapper getClientWrapper() {
        return clientWrapper;
    }
}
