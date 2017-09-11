/*
 * Copyright 2017 Axway Software
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.axway.ats.log.autodb.entities;

public class Checkpoint extends DbEntity {

    private static final long serialVersionUID = 1L;

    public int                checkpointId;
    public String             name;

    public int                responseTime;
    public float              transferRate;
    public String             transferRateUnit;

    public int                result;
    // used when checkpoint is copied from one db to another
    public long               copyEndTimestamp;
    
    
}
