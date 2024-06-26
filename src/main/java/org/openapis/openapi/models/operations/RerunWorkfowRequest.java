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

public class RerunWorkfowRequest {

    /**
     * The Id of the workflow you want to find logs for
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workflowId")
    private String workflowId;

    /**
     * The Id of the execution to rerun. This can be retrieved from the GET Workflow Logs endpoint
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=executionId")
    private String executionId;

    /**
     * The Id of the user you want delete logs for. Returned from the Create User endpoint
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=userId")
    private String userId;

    @JsonCreator
    public RerunWorkfowRequest(
            String workflowId,
            String executionId,
            String userId) {
        Utils.checkNotNull(workflowId, "workflowId");
        Utils.checkNotNull(executionId, "executionId");
        Utils.checkNotNull(userId, "userId");
        this.workflowId = workflowId;
        this.executionId = executionId;
        this.userId = userId;
    }

    /**
     * The Id of the workflow you want to find logs for
     */
    @JsonIgnore
    public String workflowId() {
        return workflowId;
    }

    /**
     * The Id of the execution to rerun. This can be retrieved from the GET Workflow Logs endpoint
     */
    @JsonIgnore
    public String executionId() {
        return executionId;
    }

    /**
     * The Id of the user you want delete logs for. Returned from the Create User endpoint
     */
    @JsonIgnore
    public String userId() {
        return userId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The Id of the workflow you want to find logs for
     */
    public RerunWorkfowRequest withWorkflowId(String workflowId) {
        Utils.checkNotNull(workflowId, "workflowId");
        this.workflowId = workflowId;
        return this;
    }

    /**
     * The Id of the execution to rerun. This can be retrieved from the GET Workflow Logs endpoint
     */
    public RerunWorkfowRequest withExecutionId(String executionId) {
        Utils.checkNotNull(executionId, "executionId");
        this.executionId = executionId;
        return this;
    }

    /**
     * The Id of the user you want delete logs for. Returned from the Create User endpoint
     */
    public RerunWorkfowRequest withUserId(String userId) {
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
        RerunWorkfowRequest other = (RerunWorkfowRequest) o;
        return 
            java.util.Objects.deepEquals(this.workflowId, other.workflowId) &&
            java.util.Objects.deepEquals(this.executionId, other.executionId) &&
            java.util.Objects.deepEquals(this.userId, other.userId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            workflowId,
            executionId,
            userId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RerunWorkfowRequest.class,
                "workflowId", workflowId,
                "executionId", executionId,
                "userId", userId);
    }
    
    public final static class Builder {
 
        private String workflowId;
 
        private String executionId;
 
        private String userId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The Id of the workflow you want to find logs for
         */
        public Builder workflowId(String workflowId) {
            Utils.checkNotNull(workflowId, "workflowId");
            this.workflowId = workflowId;
            return this;
        }

        /**
         * The Id of the execution to rerun. This can be retrieved from the GET Workflow Logs endpoint
         */
        public Builder executionId(String executionId) {
            Utils.checkNotNull(executionId, "executionId");
            this.executionId = executionId;
            return this;
        }

        /**
         * The Id of the user you want delete logs for. Returned from the Create User endpoint
         */
        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }
        
        public RerunWorkfowRequest build() {
            return new RerunWorkfowRequest(
                workflowId,
                executionId,
                userId);
        }
    }
}

