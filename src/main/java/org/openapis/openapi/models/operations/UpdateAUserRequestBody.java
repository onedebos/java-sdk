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

public class UpdateAUserRequestBody {

    /**
     * The unique identifier of the user
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("username")
    private Optional<? extends String> username;

    /**
     * The name of the user
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fullName")
    private Optional<? extends String> fullName;

    @JsonCreator
    public UpdateAUserRequestBody(
            @JsonProperty("username") Optional<? extends String> username,
            @JsonProperty("fullName") Optional<? extends String> fullName) {
        Utils.checkNotNull(username, "username");
        Utils.checkNotNull(fullName, "fullName");
        this.username = username;
        this.fullName = fullName;
    }
    
    public UpdateAUserRequestBody() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * The unique identifier of the user
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> username() {
        return (Optional<String>) username;
    }

    /**
     * The name of the user
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> fullName() {
        return (Optional<String>) fullName;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The unique identifier of the user
     */
    public UpdateAUserRequestBody withUsername(String username) {
        Utils.checkNotNull(username, "username");
        this.username = Optional.ofNullable(username);
        return this;
    }

    /**
     * The unique identifier of the user
     */
    public UpdateAUserRequestBody withUsername(Optional<? extends String> username) {
        Utils.checkNotNull(username, "username");
        this.username = username;
        return this;
    }

    /**
     * The name of the user
     */
    public UpdateAUserRequestBody withFullName(String fullName) {
        Utils.checkNotNull(fullName, "fullName");
        this.fullName = Optional.ofNullable(fullName);
        return this;
    }

    /**
     * The name of the user
     */
    public UpdateAUserRequestBody withFullName(Optional<? extends String> fullName) {
        Utils.checkNotNull(fullName, "fullName");
        this.fullName = fullName;
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
        UpdateAUserRequestBody other = (UpdateAUserRequestBody) o;
        return 
            java.util.Objects.deepEquals(this.username, other.username) &&
            java.util.Objects.deepEquals(this.fullName, other.fullName);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            username,
            fullName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateAUserRequestBody.class,
                "username", username,
                "fullName", fullName);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> username = Optional.empty();
 
        private Optional<? extends String> fullName = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The unique identifier of the user
         */
        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = Optional.ofNullable(username);
            return this;
        }

        /**
         * The unique identifier of the user
         */
        public Builder username(Optional<? extends String> username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }

        /**
         * The name of the user
         */
        public Builder fullName(String fullName) {
            Utils.checkNotNull(fullName, "fullName");
            this.fullName = Optional.ofNullable(fullName);
            return this;
        }

        /**
         * The name of the user
         */
        public Builder fullName(Optional<? extends String> fullName) {
            Utils.checkNotNull(fullName, "fullName");
            this.fullName = fullName;
            return this;
        }
        
        public UpdateAUserRequestBody build() {
            return new UpdateAUserRequestBody(
                username,
                fullName);
        }
    }
}

