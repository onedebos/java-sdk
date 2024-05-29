/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.openapis.openapi.utils.Utils;

public class CreateACredentialRequestBody {

    /**
     * The data for the credential you want to create.
     */
    @JsonProperty("credential")
    private String credential;

    /**
     * The id of the currently logged in user
     */
    @JsonProperty("userId")
    private String userId;

    @JsonCreator
    public CreateACredentialRequestBody(
            @JsonProperty("credential") String credential,
            @JsonProperty("userId") String userId) {
        Utils.checkNotNull(credential, "credential");
        Utils.checkNotNull(userId, "userId");
        this.credential = credential;
        this.userId = userId;
    }

    /**
     * The data for the credential you want to create.
     */
    @JsonIgnore
    public String credential() {
        return credential;
    }

    /**
     * The id of the currently logged in user
     */
    @JsonIgnore
    public String userId() {
        return userId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The data for the credential you want to create.
     */
    public CreateACredentialRequestBody withCredential(String credential) {
        Utils.checkNotNull(credential, "credential");
        this.credential = credential;
        return this;
    }

    /**
     * The id of the currently logged in user
     */
    public CreateACredentialRequestBody withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateACredentialRequestBody other = (CreateACredentialRequestBody) o;
        return 
            java.util.Objects.deepEquals(this.credential, other.credential) &&
            java.util.Objects.deepEquals(this.userId, other.userId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            credential,
            userId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateACredentialRequestBody.class,
                "credential", credential,
                "userId", userId);
    }
    
    public final static class Builder {
 
        private String credential;
 
        private String userId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The data for the credential you want to create.
         */
        public Builder credential(String credential) {
            Utils.checkNotNull(credential, "credential");
            this.credential = credential;
            return this;
        }

        /**
         * The id of the currently logged in user
         */
        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }
        
        public CreateACredentialRequestBody build() {
            return new CreateACredentialRequestBody(
                credential,
                userId);
        }
    }
}

