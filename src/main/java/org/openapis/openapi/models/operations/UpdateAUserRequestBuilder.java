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


public class UpdateAUserRequestBuilder {

    private String userId;
    private Optional<? extends UpdateAUserRequestBody> requestBody = Optional.empty();
    private final SDKMethodInterfaces.MethodCallUpdateAUser sdk;

    public UpdateAUserRequestBuilder(SDKMethodInterfaces.MethodCallUpdateAUser sdk) {
        this.sdk = sdk;
    }

    public UpdateAUserRequestBuilder userId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }
                
    public UpdateAUserRequestBuilder requestBody(UpdateAUserRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = Optional.of(requestBody);
        return this;
    }

    public UpdateAUserRequestBuilder requestBody(Optional<? extends UpdateAUserRequestBody> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public UpdateAUserResponse call() throws Exception {

        return sdk.updateAUser(
            userId,
            requestBody);
    }
}
