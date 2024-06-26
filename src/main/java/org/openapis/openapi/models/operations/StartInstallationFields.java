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

public class StartInstallationFields {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<? extends String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("displayName")
    private Optional<? extends String> displayName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends String> type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("required")
    private Optional<? extends Boolean> required;

    @JsonCreator
    public StartInstallationFields(
            @JsonProperty("name") Optional<? extends String> name,
            @JsonProperty("displayName") Optional<? extends String> displayName,
            @JsonProperty("type") Optional<? extends String> type,
            @JsonProperty("required") Optional<? extends Boolean> required) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(displayName, "displayName");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(required, "required");
        this.name = name;
        this.displayName = displayName;
        this.type = type;
        this.required = required;
    }
    
    public StartInstallationFields() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> name() {
        return (Optional<String>) name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> displayName() {
        return (Optional<String>) displayName;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> type() {
        return (Optional<String>) type;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> required() {
        return (Optional<Boolean>) required;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public StartInstallationFields withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public StartInstallationFields withName(Optional<? extends String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public StartInstallationFields withDisplayName(String displayName) {
        Utils.checkNotNull(displayName, "displayName");
        this.displayName = Optional.ofNullable(displayName);
        return this;
    }

    public StartInstallationFields withDisplayName(Optional<? extends String> displayName) {
        Utils.checkNotNull(displayName, "displayName");
        this.displayName = displayName;
        return this;
    }

    public StartInstallationFields withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public StartInstallationFields withType(Optional<? extends String> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public StartInstallationFields withRequired(boolean required) {
        Utils.checkNotNull(required, "required");
        this.required = Optional.ofNullable(required);
        return this;
    }

    public StartInstallationFields withRequired(Optional<? extends Boolean> required) {
        Utils.checkNotNull(required, "required");
        this.required = required;
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
        StartInstallationFields other = (StartInstallationFields) o;
        return 
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.displayName, other.displayName) &&
            java.util.Objects.deepEquals(this.type, other.type) &&
            java.util.Objects.deepEquals(this.required, other.required);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            name,
            displayName,
            type,
            required);
    }
    
    @Override
    public String toString() {
        return Utils.toString(StartInstallationFields.class,
                "name", name,
                "displayName", displayName,
                "type", type,
                "required", required);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> name = Optional.empty();
 
        private Optional<? extends String> displayName = Optional.empty();
 
        private Optional<? extends String> type = Optional.empty();
 
        private Optional<? extends Boolean> required;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        public Builder name(Optional<? extends String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder displayName(String displayName) {
            Utils.checkNotNull(displayName, "displayName");
            this.displayName = Optional.ofNullable(displayName);
            return this;
        }

        public Builder displayName(Optional<? extends String> displayName) {
            Utils.checkNotNull(displayName, "displayName");
            this.displayName = displayName;
            return this;
        }

        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<? extends String> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder required(boolean required) {
            Utils.checkNotNull(required, "required");
            this.required = Optional.ofNullable(required);
            return this;
        }

        public Builder required(Optional<? extends Boolean> required) {
            Utils.checkNotNull(required, "required");
            this.required = required;
            return this;
        }
        
        public StartInstallationFields build() {
            if (required == null) {
                required = _SINGLETON_VALUE_Required.value();
            }
            return new StartInstallationFields(
                name,
                displayName,
                type,
                required);
        }

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_Required =
                new LazySingletonValue<>(
                        "required",
                        "true",
                        new TypeReference<Optional<? extends Boolean>>() {});
    }
}

