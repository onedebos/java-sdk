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
 * DeleteLogsForAUserResponseBody - 200
 */

public class DeleteLogsForAUserResponseBody {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    private Optional<? extends String> message;

    @JsonCreator
    public DeleteLogsForAUserResponseBody(
            @JsonProperty("message") Optional<? extends String> message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
    }
    
    public DeleteLogsForAUserResponseBody() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> message() {
        return (Optional<String>) message;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public DeleteLogsForAUserResponseBody withMessage(String message) {
        Utils.checkNotNull(message, "message");
        this.message = Optional.ofNullable(message);
        return this;
    }

    public DeleteLogsForAUserResponseBody withMessage(Optional<? extends String> message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
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
        DeleteLogsForAUserResponseBody other = (DeleteLogsForAUserResponseBody) o;
        return 
            java.util.Objects.deepEquals(this.message, other.message);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            message);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeleteLogsForAUserResponseBody.class,
                "message", message);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> message = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder message(String message) {
            Utils.checkNotNull(message, "message");
            this.message = Optional.ofNullable(message);
            return this;
        }

        public Builder message(Optional<? extends String> message) {
            Utils.checkNotNull(message, "message");
            this.message = message;
            return this;
        }
        
        public DeleteLogsForAUserResponseBody build() {
            return new DeleteLogsForAUserResponseBody(
                message);
        }
    }
}

