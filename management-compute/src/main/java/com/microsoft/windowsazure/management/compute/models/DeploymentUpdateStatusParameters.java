/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.compute.models;

/**
* Parameters supplied to the Update Deployment Status operation.
*/
public class DeploymentUpdateStatusParameters {
    private UpdatedDeploymentStatus status;
    
    /**
    * Required. The new status of the deployment.
    * @return The Status value.
    */
    public UpdatedDeploymentStatus getStatus() {
        return this.status;
    }
    
    /**
    * Required. The new status of the deployment.
    * @param statusValue The Status value.
    */
    public void setStatus(final UpdatedDeploymentStatus statusValue) {
        this.status = statusValue;
    }
    
    /**
    * Initializes a new instance of the DeploymentUpdateStatusParameters class.
    *
    */
    public DeploymentUpdateStatusParameters() {
    }
    
    /**
    * Initializes a new instance of the DeploymentUpdateStatusParameters class
    * with required arguments.
    *
    * @param status The status.
    */
    public DeploymentUpdateStatusParameters(UpdatedDeploymentStatus status) {
        this.setStatus(status);
    }
}
