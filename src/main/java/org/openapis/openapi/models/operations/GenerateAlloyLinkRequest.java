/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.openapis.openapi.utils.SpeakeasyMetadata;
import org.openapis.openapi.utils.Utils;

public class GenerateAlloyLinkRequest {

    /**
     * The user to generate the Embedded Link for
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=userId")
    private String userId;

    /**
     * The Id of the integration you want to generate the Embedded Link for
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=integrationId")
    private String integrationId;

    @JsonCreator
    public GenerateAlloyLinkRequest(
            String userId,
            String integrationId) {
        Utils.checkNotNull(userId, "userId");
        Utils.checkNotNull(integrationId, "integrationId");
        this.userId = userId;
        this.integrationId = integrationId;
    }

    /**
     * The user to generate the Embedded Link for
     */
    @JsonIgnore
    public String userId() {
        return userId;
    }

    /**
     * The Id of the integration you want to generate the Embedded Link for
     */
    @JsonIgnore
    public String integrationId() {
        return integrationId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The user to generate the Embedded Link for
     */
    public GenerateAlloyLinkRequest withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    /**
     * The Id of the integration you want to generate the Embedded Link for
     */
    public GenerateAlloyLinkRequest withIntegrationId(String integrationId) {
        Utils.checkNotNull(integrationId, "integrationId");
        this.integrationId = integrationId;
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
        GenerateAlloyLinkRequest other = (GenerateAlloyLinkRequest) o;
        return 
            java.util.Objects.deepEquals(this.userId, other.userId) &&
            java.util.Objects.deepEquals(this.integrationId, other.integrationId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            userId,
            integrationId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GenerateAlloyLinkRequest.class,
                "userId", userId,
                "integrationId", integrationId);
    }
    
    public final static class Builder {
 
        private String userId;
 
        private String integrationId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The user to generate the Embedded Link for
         */
        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }

        /**
         * The Id of the integration you want to generate the Embedded Link for
         */
        public Builder integrationId(String integrationId) {
            Utils.checkNotNull(integrationId, "integrationId");
            this.integrationId = integrationId;
            return this;
        }
        
        public GenerateAlloyLinkRequest build() {
            return new GenerateAlloyLinkRequest(
                userId,
                integrationId);
        }
    }
}
