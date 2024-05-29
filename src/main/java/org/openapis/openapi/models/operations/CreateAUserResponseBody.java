/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;
/**
 * CreateAUserResponseBody - 200
 */

public class CreateAUserResponseBody {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("userId")
    private Optional<? extends String> userId;

    @JsonCreator
    public CreateAUserResponseBody(
            @JsonProperty("userId") Optional<? extends String> userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
    }
    
    public CreateAUserResponseBody() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> userId() {
        return (Optional<String>) userId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateAUserResponseBody withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = Optional.ofNullable(userId);
        return this;
    }

    public CreateAUserResponseBody withUserId(Optional<? extends String> userId) {
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
        CreateAUserResponseBody other = (CreateAUserResponseBody) o;
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
        return Utils.toString(CreateAUserResponseBody.class,
                "userId", userId);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> userId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = Optional.ofNullable(userId);
            return this;
        }

        public Builder userId(Optional<? extends String> userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }
        
        public CreateAUserResponseBody build() {
            return new CreateAUserResponseBody(
                userId);
        }
    }
}
