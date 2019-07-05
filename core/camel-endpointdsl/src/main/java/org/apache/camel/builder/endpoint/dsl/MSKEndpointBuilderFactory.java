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
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The aws-kms is used for managing Amazon KMS
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface MSKEndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS MSK component.
     */
    public interface MSKEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedMSKEndpointBuilder advanced() {
            return (AdvancedMSKEndpointBuilder) this;
        }
        /**
         * Logical name.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default MSKEndpointBuilder label(String label) {
            setProperty("label", label);
            return this;
        }
        /**
         * The region in which MSK client needs to work. When using this
         * parameter, the configuration will expect the capitalized name of the
         * region (for example AP_EAST_1) You'll need to use the name
         * Regions.EU_WEST_1.name().
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default MSKEndpointBuilder region(String region) {
            setProperty("region", region);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AWS MSK component.
     */
    public interface AdvancedMSKEndpointBuilder
            extends
                EndpointProducerBuilder {
        default MSKEndpointBuilder basic() {
            return (MSKEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedMSKEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedMSKEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedMSKEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedMSKEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.aws.msk.MSKOperations</code> enum.
     */
    enum MSKOperations {
        listClusters,
        createCluster,
        deleteCluster,
        describeCluster;
    }
    /**
     * AWS MSK (camel-aws-msk)
     * The aws-kms is used for managing Amazon KMS
     * 
     * Category: cloud,management
     * Available as of version: 3.0
     * Maven coordinates: org.apache.camel:camel-aws-msk
     * 
     * Syntax: <code>aws-msk:label</code>
     * 
     * Path parameter: label (required)
     * Logical name
     */
    default MSKEndpointBuilder mSK(String path) {
        class MSKEndpointBuilderImpl extends AbstractEndpointBuilder implements MSKEndpointBuilder, AdvancedMSKEndpointBuilder {
            public MSKEndpointBuilderImpl(String path) {
                super("aws-msk", path);
            }
        }
        return new MSKEndpointBuilderImpl(path);
    }
}
