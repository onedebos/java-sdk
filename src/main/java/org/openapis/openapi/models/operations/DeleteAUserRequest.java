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

public class DeleteAUserRequest {

    /**
     * The Id of the user you want to lookup. Returned from the Create User endpoint. Note: you can also use the Embedded user's `username` in this field.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=userId")
    private String userId;

    @JsonCreator
    public DeleteAUserRequest(
            String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
    }

    /**
     * The Id of the user you want to lookup. Returned from the Create User endpoint. Note: you can also use the Embedded user's `username` in this field.
     */
    @JsonIgnore
    public String userId() {
        return userId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The Id of the user you want to lookup. Returned from the Create User endpoint. Note: you can also use the Embedded user's `username` in this field.
     */
    public DeleteAUserRequest withUserId(String userId) {
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
        DeleteAUserRequest other = (DeleteAUserRequest) o;
        return 
            java.util.Objects.deepEquals(this.userId, other.userId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            userId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeleteAUserRequest.class,
                "userId", userId);
    }
    
    public final static class Builder {
 
        private String userId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The Id of the user you want to lookup. Returned from the Create User endpoint. Note: you can also use the Embedded user's `username` in this field.
         */
        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }
        
        public DeleteAUserRequest build() {
            return new DeleteAUserRequest(
                userId);
        }
    }
}

