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


public class GetWorkflowLogsRequestBuilder {

    private GetWorkflowLogsRequest request;
    private final SDKMethodInterfaces.MethodCallGetWorkflowLogs sdk;

    public GetWorkflowLogsRequestBuilder(SDKMethodInterfaces.MethodCallGetWorkflowLogs sdk) {
        this.sdk = sdk;
    }

    public GetWorkflowLogsRequestBuilder request(GetWorkflowLogsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetWorkflowLogsResponse call() throws Exception {

        return sdk.getWorkflowLogs(
            request);
    }
}
