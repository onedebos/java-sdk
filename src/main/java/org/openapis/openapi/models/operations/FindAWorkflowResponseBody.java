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
 * FindAWorkflowResponseBody - 200
 */

public class FindAWorkflowResponseBody {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    private Optional<? extends FindAWorkflowData> data;

    @JsonCreator
    public FindAWorkflowResponseBody(
            @JsonProperty("data") Optional<? extends FindAWorkflowData> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }
    
    public FindAWorkflowResponseBody() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<FindAWorkflowData> data() {
        return (Optional<FindAWorkflowData>) data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public FindAWorkflowResponseBody withData(FindAWorkflowData data) {
        Utils.checkNotNull(data, "data");
        this.data = Optional.ofNullable(data);
        return this;
    }

    public FindAWorkflowResponseBody withData(Optional<? extends FindAWorkflowData> data) {
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
        FindAWorkflowResponseBody other = (FindAWorkflowResponseBody) o;
        return 
            java.util.Objects.deepEquals(this.data, other.data);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            data);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FindAWorkflowResponseBody.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private Optional<? extends FindAWorkflowData> data = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(FindAWorkflowData data) {
            Utils.checkNotNull(data, "data");
            this.data = Optional.ofNullable(data);
            return this;
        }

        public Builder data(Optional<? extends FindAWorkflowData> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public FindAWorkflowResponseBody build() {
            return new FindAWorkflowResponseBody(
                data);
        }
    }
}

