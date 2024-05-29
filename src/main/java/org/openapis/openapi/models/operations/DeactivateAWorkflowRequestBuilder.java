/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapis.openapi.models.errors.SDKError;
import org.openapis.openapi.utils.LazySingletonValue;
import org.openapis.openapi.utils.Utils;
import org.openapitools.jackson.nullable.JsonNullable;


public class DeactivateAWorkflowRequestBuilder {

    private Optional<? extends DeactivateAWorkflowRequestBody> request = Optional.empty();
    private final SDKMethodInterfaces.MethodCallDeactivateAWorkflow sdk;

    public DeactivateAWorkflowRequestBuilder(SDKMethodInterfaces.MethodCallDeactivateAWorkflow sdk) {
        this.sdk = sdk;
    }
                
    public DeactivateAWorkflowRequestBuilder request(DeactivateAWorkflowRequestBody request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public DeactivateAWorkflowRequestBuilder request(Optional<? extends DeactivateAWorkflowRequestBody> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public DeactivateAWorkflowResponse call() throws Exception {

        return sdk.deactivateAWorkflow(
            request);
    }
}