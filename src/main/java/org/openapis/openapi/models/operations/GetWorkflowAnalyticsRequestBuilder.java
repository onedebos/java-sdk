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


public class GetWorkflowAnalyticsRequestBuilder {

    private String workflowId;
    private final SDKMethodInterfaces.MethodCallGetWorkflowAnalytics sdk;

    public GetWorkflowAnalyticsRequestBuilder(SDKMethodInterfaces.MethodCallGetWorkflowAnalytics sdk) {
        this.sdk = sdk;
    }

    public GetWorkflowAnalyticsRequestBuilder workflowId(String workflowId) {
        Utils.checkNotNull(workflowId, "workflowId");
        this.workflowId = workflowId;
        return this;
    }

    public GetWorkflowAnalyticsResponse call() throws Exception {

        return sdk.getWorkflowAnalytics(
            workflowId);
    }
}
