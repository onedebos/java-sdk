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

public class GetAnIntegrationData {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("integrationId")
    private Optional<? extends String> integrationId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("app")
    private Optional<? extends String> app;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("installed")
    private Optional<? extends Boolean> installed;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("icon")
    private Optional<? extends String> icon;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("workflows")
    private Optional<? extends java.util.List<GetAnIntegrationWorkflows>> workflows;

    @JsonCreator
    public GetAnIntegrationData(
            @JsonProperty("integrationId") Optional<? extends String> integrationId,
            @JsonProperty("app") Optional<? extends String> app,
            @JsonProperty("installed") Optional<? extends Boolean> installed,
            @JsonProperty("icon") Optional<? extends String> icon,
            @JsonProperty("workflows") Optional<? extends java.util.List<GetAnIntegrationWorkflows>> workflows) {
        Utils.checkNotNull(integrationId, "integrationId");
        Utils.checkNotNull(app, "app");
        Utils.checkNotNull(installed, "installed");
        Utils.checkNotNull(icon, "icon");
        Utils.checkNotNull(workflows, "workflows");
        this.integrationId = integrationId;
        this.app = app;
        this.installed = installed;
        this.icon = icon;
        this.workflows = workflows;
    }
    
    public GetAnIntegrationData() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> integrationId() {
        return (Optional<String>) integrationId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> app() {
        return (Optional<String>) app;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> installed() {
        return (Optional<Boolean>) installed;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> icon() {
        return (Optional<String>) icon;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<GetAnIntegrationWorkflows>> workflows() {
        return (Optional<java.util.List<GetAnIntegrationWorkflows>>) workflows;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetAnIntegrationData withIntegrationId(String integrationId) {
        Utils.checkNotNull(integrationId, "integrationId");
        this.integrationId = Optional.ofNullable(integrationId);
        return this;
    }

    public GetAnIntegrationData withIntegrationId(Optional<? extends String> integrationId) {
        Utils.checkNotNull(integrationId, "integrationId");
        this.integrationId = integrationId;
        return this;
    }

    public GetAnIntegrationData withApp(String app) {
        Utils.checkNotNull(app, "app");
        this.app = Optional.ofNullable(app);
        return this;
    }

    public GetAnIntegrationData withApp(Optional<? extends String> app) {
        Utils.checkNotNull(app, "app");
        this.app = app;
        return this;
    }

    public GetAnIntegrationData withInstalled(boolean installed) {
        Utils.checkNotNull(installed, "installed");
        this.installed = Optional.ofNullable(installed);
        return this;
    }

    public GetAnIntegrationData withInstalled(Optional<? extends Boolean> installed) {
        Utils.checkNotNull(installed, "installed");
        this.installed = installed;
        return this;
    }

    public GetAnIntegrationData withIcon(String icon) {
        Utils.checkNotNull(icon, "icon");
        this.icon = Optional.ofNullable(icon);
        return this;
    }

    public GetAnIntegrationData withIcon(Optional<? extends String> icon) {
        Utils.checkNotNull(icon, "icon");
        this.icon = icon;
        return this;
    }

    public GetAnIntegrationData withWorkflows(java.util.List<GetAnIntegrationWorkflows> workflows) {
        Utils.checkNotNull(workflows, "workflows");
        this.workflows = Optional.ofNullable(workflows);
        return this;
    }

    public GetAnIntegrationData withWorkflows(Optional<? extends java.util.List<GetAnIntegrationWorkflows>> workflows) {
        Utils.checkNotNull(workflows, "workflows");
        this.workflows = workflows;
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
        GetAnIntegrationData other = (GetAnIntegrationData) o;
        return 
            java.util.Objects.deepEquals(this.integrationId, other.integrationId) &&
            java.util.Objects.deepEquals(this.app, other.app) &&
            java.util.Objects.deepEquals(this.installed, other.installed) &&
            java.util.Objects.deepEquals(this.icon, other.icon) &&
            java.util.Objects.deepEquals(this.workflows, other.workflows);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            integrationId,
            app,
            installed,
            icon,
            workflows);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAnIntegrationData.class,
                "integrationId", integrationId,
                "app", app,
                "installed", installed,
                "icon", icon,
                "workflows", workflows);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> integrationId = Optional.empty();
 
        private Optional<? extends String> app = Optional.empty();
 
        private Optional<? extends Boolean> installed;
 
        private Optional<? extends String> icon = Optional.empty();
 
        private Optional<? extends java.util.List<GetAnIntegrationWorkflows>> workflows = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder integrationId(String integrationId) {
            Utils.checkNotNull(integrationId, "integrationId");
            this.integrationId = Optional.ofNullable(integrationId);
            return this;
        }

        public Builder integrationId(Optional<? extends String> integrationId) {
            Utils.checkNotNull(integrationId, "integrationId");
            this.integrationId = integrationId;
            return this;
        }

        public Builder app(String app) {
            Utils.checkNotNull(app, "app");
            this.app = Optional.ofNullable(app);
            return this;
        }

        public Builder app(Optional<? extends String> app) {
            Utils.checkNotNull(app, "app");
            this.app = app;
            return this;
        }

        public Builder installed(boolean installed) {
            Utils.checkNotNull(installed, "installed");
            this.installed = Optional.ofNullable(installed);
            return this;
        }

        public Builder installed(Optional<? extends Boolean> installed) {
            Utils.checkNotNull(installed, "installed");
            this.installed = installed;
            return this;
        }

        public Builder icon(String icon) {
            Utils.checkNotNull(icon, "icon");
            this.icon = Optional.ofNullable(icon);
            return this;
        }

        public Builder icon(Optional<? extends String> icon) {
            Utils.checkNotNull(icon, "icon");
            this.icon = icon;
            return this;
        }

        public Builder workflows(java.util.List<GetAnIntegrationWorkflows> workflows) {
            Utils.checkNotNull(workflows, "workflows");
            this.workflows = Optional.ofNullable(workflows);
            return this;
        }

        public Builder workflows(Optional<? extends java.util.List<GetAnIntegrationWorkflows>> workflows) {
            Utils.checkNotNull(workflows, "workflows");
            this.workflows = workflows;
            return this;
        }
        
        public GetAnIntegrationData build() {
            if (installed == null) {
                installed = _SINGLETON_VALUE_Installed.value();
            }
            return new GetAnIntegrationData(
                integrationId,
                app,
                installed,
                icon,
                workflows);
        }

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_Installed =
                new LazySingletonValue<>(
                        "installed",
                        "true",
                        new TypeReference<Optional<? extends Boolean>>() {});
    }
}
