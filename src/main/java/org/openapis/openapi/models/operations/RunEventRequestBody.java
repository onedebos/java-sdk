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

public class RunEventRequestBody {

    /**
     * The name of the custom event to run.
     */
    @JsonProperty("event")
    private String event;

    /**
     * The user Id the workflow belongs to
     */
    @JsonProperty("userId")
    private String userId;

    /**
     * The key-value pairs you want to send as defined in the custom event. This data will be used in expressions during the workflow execution.
     */
    @JsonProperty("data")
    private String data;

    @JsonCreator
    public RunEventRequestBody(
            @JsonProperty("event") String event,
            @JsonProperty("userId") String userId,
            @JsonProperty("data") String data) {
        Utils.checkNotNull(event, "event");
        Utils.checkNotNull(userId, "userId");
        Utils.checkNotNull(data, "data");
        this.event = event;
        this.userId = userId;
        this.data = data;
    }

    /**
     * The name of the custom event to run.
     */
    @JsonIgnore
    public String event() {
        return event;
    }

    /**
     * The user Id the workflow belongs to
     */
    @JsonIgnore
    public String userId() {
        return userId;
    }

    /**
     * The key-value pairs you want to send as defined in the custom event. This data will be used in expressions during the workflow execution.
     */
    @JsonIgnore
    public String data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The name of the custom event to run.
     */
    public RunEventRequestBody withEvent(String event) {
        Utils.checkNotNull(event, "event");
        this.event = event;
        return this;
    }

    /**
     * The user Id the workflow belongs to
     */
    public RunEventRequestBody withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    /**
     * The key-value pairs you want to send as defined in the custom event. This data will be used in expressions during the workflow execution.
     */
    public RunEventRequestBody withData(String data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
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
        RunEventRequestBody other = (RunEventRequestBody) o;
        return 
            java.util.Objects.deepEquals(this.event, other.event) &&
            java.util.Objects.deepEquals(this.userId, other.userId) &&
            java.util.Objects.deepEquals(this.data, other.data);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            event,
            userId,
            data);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RunEventRequestBody.class,
                "event", event,
                "userId", userId,
                "data", data);
    }
    
    public final static class Builder {
 
        private String event;
 
        private String userId;
 
        private String data;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The name of the custom event to run.
         */
        public Builder event(String event) {
            Utils.checkNotNull(event, "event");
            this.event = event;
            return this;
        }

        /**
         * The user Id the workflow belongs to
         */
        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }

        /**
         * The key-value pairs you want to send as defined in the custom event. This data will be used in expressions during the workflow execution.
         */
        public Builder data(String data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public RunEventRequestBody build() {
            return new RunEventRequestBody(
                event,
                userId,
                data);
        }
    }
}

