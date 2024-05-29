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


public class DeleteACredentialRequestBuilder {

    private String credentialId;
    private String userId;
    private final SDKMethodInterfaces.MethodCallDeleteACredential sdk;

    public DeleteACredentialRequestBuilder(SDKMethodInterfaces.MethodCallDeleteACredential sdk) {
        this.sdk = sdk;
    }

    public DeleteACredentialRequestBuilder credentialId(String credentialId) {
        Utils.checkNotNull(credentialId, "credentialId");
        this.credentialId = credentialId;
        return this;
    }

    public DeleteACredentialRequestBuilder userId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    public DeleteACredentialResponse call() throws Exception {

        return sdk.deleteACredential(
            credentialId,
            userId);
    }
}