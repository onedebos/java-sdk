/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
import org.openapis.openapi.utils.LazySingletonValue;
import org.openapis.openapi.utils.SpeakeasyMetadata;
import org.openapis.openapi.utils.Utils;

public class GenerateOauthLinkRequest {

    /**
     * The id of the user to generate this link for
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=userId")
    private String userId;

    /**
     * The name of the app you want the user to authorize access to
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=app")
    private Optional<? extends String> app;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=credentialName")
    private Optional<? extends String> credentialName;

    @JsonCreator
    public GenerateOauthLinkRequest(
            String userId,
            Optional<? extends String> app,
            Optional<? extends String> credentialName) {
        Utils.checkNotNull(userId, "userId");
        Utils.checkNotNull(app, "app");
        Utils.checkNotNull(credentialName, "credentialName");
        this.userId = userId;
        this.app = app;
        this.credentialName = credentialName;
    }
    
    public GenerateOauthLinkRequest(
            String userId) {
        this(userId, Optional.empty(), Optional.empty());
    }

    /**
     * The id of the user to generate this link for
     */
    @JsonIgnore
    public String userId() {
        return userId;
    }

    /**
     * The name of the app you want the user to authorize access to
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> app() {
        return (Optional<String>) app;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> credentialName() {
        return (Optional<String>) credentialName;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The id of the user to generate this link for
     */
    public GenerateOauthLinkRequest withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    /**
     * The name of the app you want the user to authorize access to
     */
    public GenerateOauthLinkRequest withApp(String app) {
        Utils.checkNotNull(app, "app");
        this.app = Optional.ofNullable(app);
        return this;
    }

    /**
     * The name of the app you want the user to authorize access to
     */
    public GenerateOauthLinkRequest withApp(Optional<? extends String> app) {
        Utils.checkNotNull(app, "app");
        this.app = app;
        return this;
    }

    public GenerateOauthLinkRequest withCredentialName(String credentialName) {
        Utils.checkNotNull(credentialName, "credentialName");
        this.credentialName = Optional.ofNullable(credentialName);
        return this;
    }

    public GenerateOauthLinkRequest withCredentialName(Optional<? extends String> credentialName) {
        Utils.checkNotNull(credentialName, "credentialName");
        this.credentialName = credentialName;
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
        GenerateOauthLinkRequest other = (GenerateOauthLinkRequest) o;
        return 
            java.util.Objects.deepEquals(this.userId, other.userId) &&
            java.util.Objects.deepEquals(this.app, other.app) &&
            java.util.Objects.deepEquals(this.credentialName, other.credentialName);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            userId,
            app,
            credentialName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GenerateOauthLinkRequest.class,
                "userId", userId,
                "app", app,
                "credentialName", credentialName);
    }
    
    public final static class Builder {
 
        private String userId;
 
        private Optional<? extends String> app = Optional.empty();
 
        private Optional<? extends String> credentialName;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The id of the user to generate this link for
         */
        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }

        /**
         * The name of the app you want the user to authorize access to
         */
        public Builder app(String app) {
            Utils.checkNotNull(app, "app");
            this.app = Optional.ofNullable(app);
            return this;
        }

        /**
         * The name of the app you want the user to authorize access to
         */
        public Builder app(Optional<? extends String> app) {
            Utils.checkNotNull(app, "app");
            this.app = app;
            return this;
        }

        public Builder credentialName(String credentialName) {
            Utils.checkNotNull(credentialName, "credentialName");
            this.credentialName = Optional.ofNullable(credentialName);
            return this;
        }

        public Builder credentialName(Optional<? extends String> credentialName) {
            Utils.checkNotNull(credentialName, "credentialName");
            this.credentialName = credentialName;
            return this;
        }
        
        public GenerateOauthLinkRequest build() {
            if (credentialName == null) {
                credentialName = _SINGLETON_VALUE_CredentialName.value();
            }
            return new GenerateOauthLinkRequest(
                userId,
                app,
                credentialName);
        }

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_CredentialName =
                new LazySingletonValue<>(
                        "credentialName",
                        "\"the credentialName\"",
                        new TypeReference<Optional<? extends String>>() {});
    }
}

