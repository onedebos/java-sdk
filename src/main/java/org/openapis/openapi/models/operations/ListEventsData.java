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

public class ListEventsData {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<? extends String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<? extends String> description;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("body")
    private Optional<? extends Body> body;

    @JsonCreator
    public ListEventsData(
            @JsonProperty("name") Optional<? extends String> name,
            @JsonProperty("description") Optional<? extends String> description,
            @JsonProperty("body") Optional<? extends Body> body) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(body, "body");
        this.name = name;
        this.description = description;
        this.body = body;
    }
    
    public ListEventsData() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> name() {
        return (Optional<String>) name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> description() {
        return (Optional<String>) description;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Body> body() {
        return (Optional<Body>) body;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ListEventsData withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public ListEventsData withName(Optional<? extends String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public ListEventsData withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    public ListEventsData withDescription(Optional<? extends String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public ListEventsData withBody(Body body) {
        Utils.checkNotNull(body, "body");
        this.body = Optional.ofNullable(body);
        return this;
    }

    public ListEventsData withBody(Optional<? extends Body> body) {
        Utils.checkNotNull(body, "body");
        this.body = body;
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
        ListEventsData other = (ListEventsData) o;
        return 
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.description, other.description) &&
            java.util.Objects.deepEquals(this.body, other.body);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            name,
            description,
            body);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListEventsData.class,
                "name", name,
                "description", description,
                "body", body);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> name = Optional.empty();
 
        private Optional<? extends String> description = Optional.empty();
 
        private Optional<? extends Body> body = Optional.empty();  
        
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

        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = Optional.ofNullable(description);
            return this;
        }

        public Builder description(Optional<? extends String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        public Builder body(Body body) {
            Utils.checkNotNull(body, "body");
            this.body = Optional.ofNullable(body);
            return this;
        }

        public Builder body(Optional<? extends Body> body) {
            Utils.checkNotNull(body, "body");
            this.body = body;
            return this;
        }
        
        public ListEventsData build() {
            return new ListEventsData(
                name,
                description,
                body);
        }
    }
}

