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
import org.openapis.openapi.utils.LazySingletonValue;
import org.openapis.openapi.utils.Utils;
/**
 * DeleteWorkflowResponseBody - 200
 */

public class DeleteWorkflowResponseBody {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deleted")
    private Optional<? extends Boolean> deleted;

    @JsonCreator
    public DeleteWorkflowResponseBody(
            @JsonProperty("deleted") Optional<? extends Boolean> deleted) {
        Utils.checkNotNull(deleted, "deleted");
        this.deleted = deleted;
    }
    
    public DeleteWorkflowResponseBody() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> deleted() {
        return (Optional<Boolean>) deleted;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public DeleteWorkflowResponseBody withDeleted(boolean deleted) {
        Utils.checkNotNull(deleted, "deleted");
        this.deleted = Optional.ofNullable(deleted);
        return this;
    }

    public DeleteWorkflowResponseBody withDeleted(Optional<? extends Boolean> deleted) {
        Utils.checkNotNull(deleted, "deleted");
        this.deleted = deleted;
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
        DeleteWorkflowResponseBody other = (DeleteWorkflowResponseBody) o;
        return 
            java.util.Objects.deepEquals(this.deleted, other.deleted);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            deleted);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeleteWorkflowResponseBody.class,
                "deleted", deleted);
    }
    
    public final static class Builder {
 
        private Optional<? extends Boolean> deleted;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder deleted(boolean deleted) {
            Utils.checkNotNull(deleted, "deleted");
            this.deleted = Optional.ofNullable(deleted);
            return this;
        }

        public Builder deleted(Optional<? extends Boolean> deleted) {
            Utils.checkNotNull(deleted, "deleted");
            this.deleted = deleted;
            return this;
        }
        
        public DeleteWorkflowResponseBody build() {
            if (deleted == null) {
                deleted = _SINGLETON_VALUE_Deleted.value();
            }
            return new DeleteWorkflowResponseBody(
                deleted);
        }

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_Deleted =
                new LazySingletonValue<>(
                        "deleted",
                        "true",
                        new TypeReference<Optional<? extends Boolean>>() {});
    }
}

