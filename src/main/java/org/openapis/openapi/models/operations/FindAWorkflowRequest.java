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

public class FindAWorkflowRequest {

    /**
     * The Id of the user you want to lookup. Returned from the Create User endpoint. Note: you can also use the Embedded user's `username` in this field.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=userId")
    private String userId;

    /**
     * The Id of the workflow to find
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workflowId")
    private String workflowId;

    @JsonCreator
    public FindAWorkflowRequest(
            String userId,
            String workflowId) {
        Utils.checkNotNull(userId, "userId");
        Utils.checkNotNull(workflowId, "workflowId");
        this.userId = userId;
        this.workflowId = workflowId;
    }

    /**
     * The Id of the user you want to lookup. Returned from the Create User endpoint. Note: you can also use the Embedded user's `username` in this field.
     */
    @JsonIgnore
    public String userId() {
        return userId;
    }

    /**
     * The Id of the workflow to find
     */
    @JsonIgnore
    public String workflowId() {
        return workflowId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The Id of the user you want to lookup. Returned from the Create User endpoint. Note: you can also use the Embedded user's `username` in this field.
     */
    public FindAWorkflowRequest withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    /**
     * The Id of the workflow to find
     */
    public FindAWorkflowRequest withWorkflowId(String workflowId) {
        Utils.checkNotNull(workflowId, "workflowId");
        this.workflowId = workflowId;
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
        FindAWorkflowRequest other = (FindAWorkflowRequest) o;
        return 
            java.util.Objects.deepEquals(this.userId, other.userId) &&
            java.util.Objects.deepEquals(this.workflowId, other.workflowId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            userId,
            workflowId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FindAWorkflowRequest.class,
                "userId", userId,
                "workflowId", workflowId);
    }
    
    public final static class Builder {
 
        private String userId;
 
        private String workflowId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The Id of the user you want to lookup. Returned from the Create User endpoint. Note: you can also use the Embedded user's `username` in this field.
         */
        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }

        /**
         * The Id of the workflow to find
         */
        public Builder workflowId(String workflowId) {
            Utils.checkNotNull(workflowId, "workflowId");
            this.workflowId = workflowId;
            return this;
        }
        
        public FindAWorkflowRequest build() {
            return new FindAWorkflowRequest(
                userId,
                workflowId);
        }
    }
}

