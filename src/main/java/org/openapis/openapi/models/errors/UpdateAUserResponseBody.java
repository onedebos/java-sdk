/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.errors;

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
import java.net.http.HttpResponse;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;

/**
 * UpdateAUserResponseBody - 401
 */
public class UpdateAUserResponseBody extends RuntimeException {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    private Optional<? extends String> message;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("-")
    private Optional<? extends HttpResponse<InputStream>> rawResponse;

    @JsonCreator
    public UpdateAUserResponseBody(
            @JsonProperty("message") Optional<? extends String> message,
            @JsonProperty("RawResponse") Optional<? extends HttpResponse<InputStream>> rawResponse) {
        Utils.checkNotNull(message, "message");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.message = message;
        this.rawResponse = rawResponse;
    }
    
    public UpdateAUserResponseBody() {
        this(Optional.empty(), Optional.empty());
    }

    public Optional<? extends String> message(){
        return message;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public Optional<? extends HttpResponse<InputStream>> rawResponse(){
        return rawResponse;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public UpdateAUserResponseBody withMessage(String message) {
        Utils.checkNotNull(message, "message");
        this.message = Optional.ofNullable(message);
        return this;
    }
    
    public UpdateAUserResponseBody withMessage(Optional<? extends String> message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public UpdateAUserResponseBody withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = Optional.ofNullable(rawResponse);
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public UpdateAUserResponseBody withRawResponse(Optional<? extends HttpResponse<InputStream>> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
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
        UpdateAUserResponseBody other = (UpdateAUserResponseBody) o;
        return
            java.util.Objects.deepEquals(this.message, other.message) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            message,
            rawResponse);
    }

    @Override
    public String toString() {
        return Utils.toString(UpdateAUserResponseBody.class,
                "message", message,
                "rawResponse", rawResponse);
    }

    public final static class Builder {

        private Optional<? extends String> message = Optional.empty();

        private Optional<? extends HttpResponse<InputStream>> rawResponse;

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

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = Optional.ofNullable(rawResponse);
            return this;
        }
        
        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(Optional<? extends HttpResponse<InputStream>> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }

        public UpdateAUserResponseBody build() {
            return new UpdateAUserResponseBody(
                message,
                rawResponse);
        }
    }
}
