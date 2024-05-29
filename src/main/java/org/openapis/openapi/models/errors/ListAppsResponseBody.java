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
 * ListAppsResponseBody - 400
 */
public class ListAppsResponseBody extends RuntimeException {

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("-")
    private Optional<? extends HttpResponse<InputStream>> rawResponse;

    @JsonCreator
    public ListAppsResponseBody(
            @JsonProperty("RawResponse") Optional<? extends HttpResponse<InputStream>> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
    }
    
    public ListAppsResponseBody() {
        this(Optional.empty());
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

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListAppsResponseBody withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = Optional.ofNullable(rawResponse);
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListAppsResponseBody withRawResponse(Optional<? extends HttpResponse<InputStream>> rawResponse) {
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
        ListAppsResponseBody other = (ListAppsResponseBody) o;
        return
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            rawResponse);
    }

    @Override
    public String toString() {
        return Utils.toString(ListAppsResponseBody.class,
                "rawResponse", rawResponse);
    }

    public final static class Builder {

        private Optional<? extends HttpResponse<InputStream>> rawResponse;

        private Builder() {
          // force use of static builder() method
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

        public ListAppsResponseBody build() {
            return new ListAppsResponseBody(
                rawResponse);
        }
    }
}
