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


public class DeleteAUserRequestBuilder {

    private String userId;
    private final SDKMethodInterfaces.MethodCallDeleteAUser sdk;

    public DeleteAUserRequestBuilder(SDKMethodInterfaces.MethodCallDeleteAUser sdk) {
        this.sdk = sdk;
    }

    public DeleteAUserRequestBuilder userId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    public DeleteAUserResponse call() throws Exception {

        return sdk.deleteAUser(
            userId);
    }
}
