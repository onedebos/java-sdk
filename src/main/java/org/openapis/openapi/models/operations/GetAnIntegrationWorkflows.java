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

public class GetAnIntegrationWorkflows {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("workflowId")
    private Optional<? extends String> workflowId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<? extends String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("installed")
    private Optional<? extends Boolean> installed;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("version")
    private Optional<? extends Long> version;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("installedVersion")
    private Optional<? extends Long> installedVersion;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("active")
    private Optional<? extends Boolean> active;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("blocks")
    private Optional<? extends java.util.List<GetAnIntegrationBlocks>> blocks;

    @JsonCreator
    public GetAnIntegrationWorkflows(
            @JsonProperty("workflowId") Optional<? extends String> workflowId,
            @JsonProperty("name") Optional<? extends String> name,
            @JsonProperty("installed") Optional<? extends Boolean> installed,
            @JsonProperty("version") Optional<? extends Long> version,
            @JsonProperty("installedVersion") Optional<? extends Long> installedVersion,
            @JsonProperty("active") Optional<? extends Boolean> active,
            @JsonProperty("blocks") Optional<? extends java.util.List<GetAnIntegrationBlocks>> blocks) {
        Utils.checkNotNull(workflowId, "workflowId");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(installed, "installed");
        Utils.checkNotNull(version, "version");
        Utils.checkNotNull(installedVersion, "installedVersion");
        Utils.checkNotNull(active, "active");
        Utils.checkNotNull(blocks, "blocks");
        this.workflowId = workflowId;
        this.name = name;
        this.installed = installed;
        this.version = version;
        this.installedVersion = installedVersion;
        this.active = active;
        this.blocks = blocks;
    }
    
    public GetAnIntegrationWorkflows() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> workflowId() {
        return (Optional<String>) workflowId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> name() {
        return (Optional<String>) name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> installed() {
        return (Optional<Boolean>) installed;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> version() {
        return (Optional<Long>) version;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> installedVersion() {
        return (Optional<Long>) installedVersion;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> active() {
        return (Optional<Boolean>) active;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<GetAnIntegrationBlocks>> blocks() {
        return (Optional<java.util.List<GetAnIntegrationBlocks>>) blocks;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetAnIntegrationWorkflows withWorkflowId(String workflowId) {
        Utils.checkNotNull(workflowId, "workflowId");
        this.workflowId = Optional.ofNullable(workflowId);
        return this;
    }

    public GetAnIntegrationWorkflows withWorkflowId(Optional<? extends String> workflowId) {
        Utils.checkNotNull(workflowId, "workflowId");
        this.workflowId = workflowId;
        return this;
    }

    public GetAnIntegrationWorkflows withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public GetAnIntegrationWorkflows withName(Optional<? extends String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public GetAnIntegrationWorkflows withInstalled(boolean installed) {
        Utils.checkNotNull(installed, "installed");
        this.installed = Optional.ofNullable(installed);
        return this;
    }

    public GetAnIntegrationWorkflows withInstalled(Optional<? extends Boolean> installed) {
        Utils.checkNotNull(installed, "installed");
        this.installed = installed;
        return this;
    }

    public GetAnIntegrationWorkflows withVersion(long version) {
        Utils.checkNotNull(version, "version");
        this.version = Optional.ofNullable(version);
        return this;
    }

    public GetAnIntegrationWorkflows withVersion(Optional<? extends Long> version) {
        Utils.checkNotNull(version, "version");
        this.version = version;
        return this;
    }

    public GetAnIntegrationWorkflows withInstalledVersion(long installedVersion) {
        Utils.checkNotNull(installedVersion, "installedVersion");
        this.installedVersion = Optional.ofNullable(installedVersion);
        return this;
    }

    public GetAnIntegrationWorkflows withInstalledVersion(Optional<? extends Long> installedVersion) {
        Utils.checkNotNull(installedVersion, "installedVersion");
        this.installedVersion = installedVersion;
        return this;
    }

    public GetAnIntegrationWorkflows withActive(boolean active) {
        Utils.checkNotNull(active, "active");
        this.active = Optional.ofNullable(active);
        return this;
    }

    public GetAnIntegrationWorkflows withActive(Optional<? extends Boolean> active) {
        Utils.checkNotNull(active, "active");
        this.active = active;
        return this;
    }

    public GetAnIntegrationWorkflows withBlocks(java.util.List<GetAnIntegrationBlocks> blocks) {
        Utils.checkNotNull(blocks, "blocks");
        this.blocks = Optional.ofNullable(blocks);
        return this;
    }

    public GetAnIntegrationWorkflows withBlocks(Optional<? extends java.util.List<GetAnIntegrationBlocks>> blocks) {
        Utils.checkNotNull(blocks, "blocks");
        this.blocks = blocks;
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
        GetAnIntegrationWorkflows other = (GetAnIntegrationWorkflows) o;
        return 
            java.util.Objects.deepEquals(this.workflowId, other.workflowId) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.installed, other.installed) &&
            java.util.Objects.deepEquals(this.version, other.version) &&
            java.util.Objects.deepEquals(this.installedVersion, other.installedVersion) &&
            java.util.Objects.deepEquals(this.active, other.active) &&
            java.util.Objects.deepEquals(this.blocks, other.blocks);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            workflowId,
            name,
            installed,
            version,
            installedVersion,
            active,
            blocks);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAnIntegrationWorkflows.class,
                "workflowId", workflowId,
                "name", name,
                "installed", installed,
                "version", version,
                "installedVersion", installedVersion,
                "active", active,
                "blocks", blocks);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> workflowId = Optional.empty();
 
        private Optional<? extends String> name = Optional.empty();
 
        private Optional<? extends Boolean> installed;
 
        private Optional<? extends Long> version;
 
        private Optional<? extends Long> installedVersion;
 
        private Optional<? extends Boolean> active;
 
        private Optional<? extends java.util.List<GetAnIntegrationBlocks>> blocks = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder workflowId(String workflowId) {
            Utils.checkNotNull(workflowId, "workflowId");
            this.workflowId = Optional.ofNullable(workflowId);
            return this;
        }

        public Builder workflowId(Optional<? extends String> workflowId) {
            Utils.checkNotNull(workflowId, "workflowId");
            this.workflowId = workflowId;
            return this;
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

        public Builder version(long version) {
            Utils.checkNotNull(version, "version");
            this.version = Optional.ofNullable(version);
            return this;
        }

        public Builder version(Optional<? extends Long> version) {
            Utils.checkNotNull(version, "version");
            this.version = version;
            return this;
        }

        public Builder installedVersion(long installedVersion) {
            Utils.checkNotNull(installedVersion, "installedVersion");
            this.installedVersion = Optional.ofNullable(installedVersion);
            return this;
        }

        public Builder installedVersion(Optional<? extends Long> installedVersion) {
            Utils.checkNotNull(installedVersion, "installedVersion");
            this.installedVersion = installedVersion;
            return this;
        }

        public Builder active(boolean active) {
            Utils.checkNotNull(active, "active");
            this.active = Optional.ofNullable(active);
            return this;
        }

        public Builder active(Optional<? extends Boolean> active) {
            Utils.checkNotNull(active, "active");
            this.active = active;
            return this;
        }

        public Builder blocks(java.util.List<GetAnIntegrationBlocks> blocks) {
            Utils.checkNotNull(blocks, "blocks");
            this.blocks = Optional.ofNullable(blocks);
            return this;
        }

        public Builder blocks(Optional<? extends java.util.List<GetAnIntegrationBlocks>> blocks) {
            Utils.checkNotNull(blocks, "blocks");
            this.blocks = blocks;
            return this;
        }
        
        public GetAnIntegrationWorkflows build() {
            if (installed == null) {
                installed = _SINGLETON_VALUE_Installed.value();
            }
            if (version == null) {
                version = _SINGLETON_VALUE_Version.value();
            }
            if (installedVersion == null) {
                installedVersion = _SINGLETON_VALUE_InstalledVersion.value();
            }
            if (active == null) {
                active = _SINGLETON_VALUE_Active.value();
            }
            return new GetAnIntegrationWorkflows(
                workflowId,
                name,
                installed,
                version,
                installedVersion,
                active,
                blocks);
        }

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_Installed =
                new LazySingletonValue<>(
                        "installed",
                        "true",
                        new TypeReference<Optional<? extends Boolean>>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_Version =
                new LazySingletonValue<>(
                        "version",
                        "0",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_InstalledVersion =
                new LazySingletonValue<>(
                        "installedVersion",
                        "0",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_Active =
                new LazySingletonValue<>(
                        "active",
                        "true",
                        new TypeReference<Optional<? extends Boolean>>() {});
    }
}

