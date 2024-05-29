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
import org.openapis.openapi.utils.SpeakeasyMetadata;
import org.openapis.openapi.utils.Utils;

public class UpgradeWorkflowRequest {

    /**
     * Id of the parent workflow in which you are upgrading for the end user
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workflowId")
    private String workflowId;

    /**
     * Id of the end user you wish to upgrade the workflow for
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=userId")
    private String userId;

    @JsonCreator
    public UpgradeWorkflowRequest(
            String workflowId,
            String userId) {
        Utils.checkNotNull(workflowId, "workflowId");
        Utils.checkNotNull(userId, "userId");
        this.workflowId = workflowId;
        this.userId = userId;
    }

    /**
     * Id of the parent workflow in which you are upgrading for the end user
     */
    @JsonIgnore
    public String workflowId() {
        return workflowId;
    }

    /**
     * Id of the end user you wish to upgrade the workflow for
     */
    @JsonIgnore
    public String userId() {
        return userId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Id of the parent workflow in which you are upgrading for the end user
     */
    public UpgradeWorkflowRequest withWorkflowId(String workflowId) {
        Utils.checkNotNull(workflowId, "workflowId");
        this.workflowId = workflowId;
        return this;
    }

    /**
     * Id of the end user you wish to upgrade the workflow for
     */
    public UpgradeWorkflowRequest withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
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
        UpgradeWorkflowRequest other = (UpgradeWorkflowRequest) o;
        return 
            java.util.Objects.deepEquals(this.workflowId, other.workflowId) &&
            java.util.Objects.deepEquals(this.userId, other.userId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            workflowId,
            userId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpgradeWorkflowRequest.class,
                "workflowId", workflowId,
                "userId", userId);
    }
    
    public final static class Builder {
 
        private String workflowId;
 
        private String userId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Id of the parent workflow in which you are upgrading for the end user
         */
        public Builder workflowId(String workflowId) {
            Utils.checkNotNull(workflowId, "workflowId");
            this.workflowId = workflowId;
            return this;
        }

        /**
         * Id of the end user you wish to upgrade the workflow for
         */
        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }
        
        public UpgradeWorkflowRequest build() {
            return new UpgradeWorkflowRequest(
                workflowId,
                userId);
        }
    }
}

