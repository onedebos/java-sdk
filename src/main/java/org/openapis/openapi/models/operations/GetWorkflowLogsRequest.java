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
import org.openapis.openapi.utils.SpeakeasyMetadata;
import org.openapis.openapi.utils.Utils;

public class GetWorkflowLogsRequest {

    /**
     * The Id of the workflow you want to find logs for
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workflowId")
    private String workflowId;

    /**
     * The Id of the user you want delete logs for. Returned from the Create User endpoint
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=userId")
    private Optional<? extends String> userId;

    /**
     * page of results
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page")
    private Optional<? extends Integer> page;

    /**
     * Number of results per page (max 30, default 10)
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    private Optional<? extends Integer> limit;

    /**
     * asc or desc for ascending/descending (default desc)
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=order")
    private Optional<? extends String> order;

    @JsonCreator
    public GetWorkflowLogsRequest(
            String workflowId,
            Optional<? extends String> userId,
            Optional<? extends Integer> page,
            Optional<? extends Integer> limit,
            Optional<? extends String> order) {
        Utils.checkNotNull(workflowId, "workflowId");
        Utils.checkNotNull(userId, "userId");
        Utils.checkNotNull(page, "page");
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(order, "order");
        this.workflowId = workflowId;
        this.userId = userId;
        this.page = page;
        this.limit = limit;
        this.order = order;
    }
    
    public GetWorkflowLogsRequest(
            String workflowId) {
        this(workflowId, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The Id of the workflow you want to find logs for
     */
    @JsonIgnore
    public String workflowId() {
        return workflowId;
    }

    /**
     * The Id of the user you want delete logs for. Returned from the Create User endpoint
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> userId() {
        return (Optional<String>) userId;
    }

    /**
     * page of results
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Integer> page() {
        return (Optional<Integer>) page;
    }

    /**
     * Number of results per page (max 30, default 10)
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Integer> limit() {
        return (Optional<Integer>) limit;
    }

    /**
     * asc or desc for ascending/descending (default desc)
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> order() {
        return (Optional<String>) order;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The Id of the workflow you want to find logs for
     */
    public GetWorkflowLogsRequest withWorkflowId(String workflowId) {
        Utils.checkNotNull(workflowId, "workflowId");
        this.workflowId = workflowId;
        return this;
    }

    /**
     * The Id of the user you want delete logs for. Returned from the Create User endpoint
     */
    public GetWorkflowLogsRequest withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = Optional.ofNullable(userId);
        return this;
    }

    /**
     * The Id of the user you want delete logs for. Returned from the Create User endpoint
     */
    public GetWorkflowLogsRequest withUserId(Optional<? extends String> userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    /**
     * page of results
     */
    public GetWorkflowLogsRequest withPage(int page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.ofNullable(page);
        return this;
    }

    /**
     * page of results
     */
    public GetWorkflowLogsRequest withPage(Optional<? extends Integer> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }

    /**
     * Number of results per page (max 30, default 10)
     */
    public GetWorkflowLogsRequest withLimit(int limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.ofNullable(limit);
        return this;
    }

    /**
     * Number of results per page (max 30, default 10)
     */
    public GetWorkflowLogsRequest withLimit(Optional<? extends Integer> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    /**
     * asc or desc for ascending/descending (default desc)
     */
    public GetWorkflowLogsRequest withOrder(String order) {
        Utils.checkNotNull(order, "order");
        this.order = Optional.ofNullable(order);
        return this;
    }

    /**
     * asc or desc for ascending/descending (default desc)
     */
    public GetWorkflowLogsRequest withOrder(Optional<? extends String> order) {
        Utils.checkNotNull(order, "order");
        this.order = order;
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
        GetWorkflowLogsRequest other = (GetWorkflowLogsRequest) o;
        return 
            java.util.Objects.deepEquals(this.workflowId, other.workflowId) &&
            java.util.Objects.deepEquals(this.userId, other.userId) &&
            java.util.Objects.deepEquals(this.page, other.page) &&
            java.util.Objects.deepEquals(this.limit, other.limit) &&
            java.util.Objects.deepEquals(this.order, other.order);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            workflowId,
            userId,
            page,
            limit,
            order);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetWorkflowLogsRequest.class,
                "workflowId", workflowId,
                "userId", userId,
                "page", page,
                "limit", limit,
                "order", order);
    }
    
    public final static class Builder {
 
        private String workflowId;
 
        private Optional<? extends String> userId = Optional.empty();
 
        private Optional<? extends Integer> page = Optional.empty();
 
        private Optional<? extends Integer> limit = Optional.empty();
 
        private Optional<? extends String> order = Optional.empty();  
        
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
         * The Id of the user you want delete logs for. Returned from the Create User endpoint
         */
        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = Optional.ofNullable(userId);
            return this;
        }

        /**
         * The Id of the user you want delete logs for. Returned from the Create User endpoint
         */
        public Builder userId(Optional<? extends String> userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }

        /**
         * page of results
         */
        public Builder page(int page) {
            Utils.checkNotNull(page, "page");
            this.page = Optional.ofNullable(page);
            return this;
        }

        /**
         * page of results
         */
        public Builder page(Optional<? extends Integer> page) {
            Utils.checkNotNull(page, "page");
            this.page = page;
            return this;
        }

        /**
         * Number of results per page (max 30, default 10)
         */
        public Builder limit(int limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = Optional.ofNullable(limit);
            return this;
        }

        /**
         * Number of results per page (max 30, default 10)
         */
        public Builder limit(Optional<? extends Integer> limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = limit;
            return this;
        }

        /**
         * asc or desc for ascending/descending (default desc)
         */
        public Builder order(String order) {
            Utils.checkNotNull(order, "order");
            this.order = Optional.ofNullable(order);
            return this;
        }

        /**
         * asc or desc for ascending/descending (default desc)
         */
        public Builder order(Optional<? extends String> order) {
            Utils.checkNotNull(order, "order");
            this.order = order;
            return this;
        }
        
        public GetWorkflowLogsRequest build() {
            return new GetWorkflowLogsRequest(
                workflowId,
                userId,
                page,
                limit,
                order);
        }
    }
}

