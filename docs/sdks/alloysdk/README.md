# AlloySDK


## Overview

### Available Operations

* [updateAUser](#updateauser) - Update a user
* [getAUser](#getauser) - Retrieve a single user
* [deleteAUser](#deleteauser) - Delete a user
* [createAUser](#createauser) - Create a user
* [listAllUsers](#listallusers) - Retrieve a list of all users
* [createACredential](#createacredential) - Create Credential
* [getCredentialMetadata](#getcredentialmetadata) - Retrieve all credential structures
* [generateJwtToken](#generatejwttoken) - Generate a new JWT for a user
* [listUserCredentials](#listusercredentials) - Retrieve all credentials for a user
* [listWorkflows](#listworkflows) - Retrieve a list of workflows
* [deactivateAWorkflow](#deactivateaworkflow) - Deactivate a workflow
* [activateAWorkflow](#activateaworkflow) - Activate a workflow
* [getWorkflowAnalytics](#getworkflowanalytics) - Retrieve usage metrics for a workflow
* [disableAllWorkflowsForAUser](#disableallworkflowsforauser) - Deactivate workflows for a user
* [getWorkflowLogs](#getworkflowlogs) - Retrieve all execution logs for a workflow
* [getWorkflowErrors](#getworkflowerrors) - Retrieve all error logs for a workflow
* [deleteLogsForAUser](#deletelogsforauser) - Delete all logs for a user
* [deleteACredential](#deleteacredential) - Delete a Credential for a user
* [runEvent](#runevent) - Trigger an event for a user
* [rerunWorkfow](#rerunworkfow) - Rerun a single workflow execution
* [runWorkflow](#runworkflow) - Run Workflow
* [listApps](#listapps) - Retrieve all supported apps
* [listIntegrations](#listintegrations) - Retrieve a list of all integrations
* [listEvents](#listevents) - Retrieve a list of custom events
* [generateAlloyLink](#generatealloylink) - Create an Embedded link for an integration
* [generateOauthLink](#generateoauthlink) - Create OAuth Link
* [deleteWorkflow](#deleteworkflow) - Delete a workflow
* [findAWorkflow](#findaworkflow) - Retrieve a single workflow
* [getAnIntegration](#getanintegration) - Retrieve a single integration
* [listUsersByWorkflowid](#listusersbyworkflowid) - List Users by workflowId
* [upgradeWorkflow](#upgradeworkflow) - Upgrade a workflow
* [listVersions](#listversions) - Retrieve a list of workflow versions
* [credentialMedataByApp](#credentialmedatabyapp) - Retrieve credential structure for an app
* [startInstallation](#startinstallation) - Start Installation
* [completeInstallation](#completeinstallation) - Complete Installation

## updateAUser

Updates a user given a specified userId. This endpoint allows you to update a username or fullName and returns the updated user object.

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            UpdateAUserResponse res = sdk.updateAUser()
                .userId("<value>")
                .requestBody(UpdateAUserRequestBody.builder()
                    .build())
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.UpdateAUserResponseBody e) {
            // handle exception
            throw e;
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                           | Type                                                                                                                                                | Required                                                                                                                                            | Description                                                                                                                                         |
| --------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------- |
| `userId`                                                                                                                                            | *String*                                                                                                                                            | :heavy_check_mark:                                                                                                                                  | The Id of the user you want to lookup. Returned from the Create User endpoint. Note: you can also use the Embedded user's `username` in this field. |
| `requestBody`                                                                                                                                       | [Optional<? extends org.openapis.openapi.models.operations.UpdateAUserRequestBody>](../../models/operations/UpdateAUserRequestBody.md)              | :heavy_minus_sign:                                                                                                                                  | N/A                                                                                                                                                 |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.UpdateAUserResponse>](../../models/operations/UpdateAUserResponse.md)**
### Errors

| Error Object                          | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/UpdateAUserResponseBody | 401                                   | application/json                      |
| models/errors/SDKError                | 4xx-5xx                               | */*                                   |

## getAUser

Returns a specific user given a userId and any active workflows associated with the user.

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            GetAUserResponse res = sdk.getAUser()
                .userId("<value>")
                .call();

            // handle response
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                           | Type                                                                                                                                                | Required                                                                                                                                            | Description                                                                                                                                         |
| --------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------- |
| `userId`                                                                                                                                            | *String*                                                                                                                                            | :heavy_check_mark:                                                                                                                                  | The Id of the user you want to lookup. Returned from the Create User endpoint. Note: you can also use the Embedded user's `username` in this field. |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.GetAUserResponse>](../../models/operations/GetAUserResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteAUser

This endpoint deletes a user account. It is most commonly used when a user stops being a customer of your platform or in conjunction with a GDPR compliance request. Note that this endpoint only deletes the user's account – not any corresponding workflow logs or other data. To remove that data as part of a compliance request, see our 'Delete User Logs' endpoint

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            DeleteAUserResponse res = sdk.deleteAUser()
                .userId("<value>")
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.DeleteAUserResponseBody e) {
            // handle exception
            throw e;
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                           | Type                                                                                                                                                | Required                                                                                                                                            | Description                                                                                                                                         |
| --------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------- |
| `userId`                                                                                                                                            | *String*                                                                                                                                            | :heavy_check_mark:                                                                                                                                  | The Id of the user you want to lookup. Returned from the Create User endpoint. Note: you can also use the Embedded user's `username` in this field. |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.DeleteAUserResponse>](../../models/operations/DeleteAUserResponse.md)**
### Errors

| Error Object                          | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/DeleteAUserResponseBody | 401                                   | application/json                      |
| models/errors/SDKError                | 4xx-5xx                               | */*                                   |

## createAUser

Creates a new user in your Embedded account. The user record acts like a "container" to store all the integrations, workflows, and credentials for any given user. Returns a user identifier.

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            CreateAUserRequestBody req = CreateAUserRequestBody.builder()
                .username("<value>")
                .build();

            CreateAUserResponse res = sdk.createAUser()
                .request(req)
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.CreateAUserResponseBody e) {
            // handle exception
            throw e;
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [org.openapis.openapi.models.operations.CreateAUserRequestBody](../../models/operations/CreateAUserRequestBody.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.CreateAUserResponse>](../../models/operations/CreateAUserResponse.md)**
### Errors

| Error Object                          | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/CreateAUserResponseBody | 401                                   | application/json                      |
| models/errors/SDKError                | 4xx-5xx                               | */*                                   |

## listAllUsers

Returns a list of all users created in your Embedded account.

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            ListAllUsersResponse res = sdk.listAllUsers()
                .parentWorkflowId("<value>")
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.ListAllUsersResponseBody e) {
            // handle exception
            throw e;
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `parentWorkflowId`                                                                 | *Optional<? extends String>*                                                       | :heavy_minus_sign:                                                                 | You can pass a parentWorkflowId if you wish to list users for a specific workflow. |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.ListAllUsersResponse>](../../models/operations/ListAllUsersResponse.md)**
### Errors

| Error Object                           | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ListAllUsersResponseBody | 401                                    | application/json                       |
| models/errors/SDKError                 | 4xx-5xx                                | */*                                    |

## createACredential

Use this endpoint to add a credential programmatically via the API. This endpoint should be used primarily for non-OAuth blocks. If you are using Secrets Manager with an OAuth block and you have the OAuth tokens already, you can add them to Alloy with this endpoint. Please reference [this](https://docs.runalloy.com/docs/headless) section of our docs for a complete tutorial on when and how to use this endpoint.

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            CreateACredentialRequestBody req = CreateACredentialRequestBody.builder()
                .credential("{key: 12038, key1: null, key2: \"<value>\"}")
                .userId("<value>")
                .build();

            CreateACredentialResponse res = sdk.createACredential()
                .request(req)
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [org.openapis.openapi.models.operations.CreateACredentialRequestBody](../../models/operations/CreateACredentialRequestBody.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.CreateACredentialResponse>](../../models/operations/CreateACredentialResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getCredentialMetadata

This endpoint returns a basic structure of what data must be inputted when adding a credential manually. This should be used when creating a credential using the POST credential endpoint.

This endpoint returns the structure of every supported block on Alloy Embedded. It returns a boolean flag called `isOauth` which indicates if the credential uses OAuth or an API key.

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            GetCredentialMetadataResponse res = sdk.getCredentialMetadata()
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```


### Response

**[Optional<? extends org.openapis.openapi.models.operations.GetCredentialMetadataResponse>](../../models/operations/GetCredentialMetadataResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## generateJwtToken

This endpoint is used to generate a new user token in the form of a JSON Web Token (JWT) which is required to securely render the Embedded Modal in your application. Once retrieved, you'll want to pass this token to your frontend.

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            GenerateJwtTokenResponse res = sdk.generateJwtToken()
                .userId("<value>")
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                           | Type                                                                                                                                                | Required                                                                                                                                            | Description                                                                                                                                         |
| --------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------- |
| `userId`                                                                                                                                            | *String*                                                                                                                                            | :heavy_check_mark:                                                                                                                                  | The Id of the user you want to lookup. Returned from the Create User endpoint. Note: you can also use the Embedded user's `username` in this field. |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.GenerateJwtTokenResponse>](../../models/operations/GenerateJwtTokenResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listUserCredentials

Returns a list of all credentials created for a specified user.

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            ListUserCredentialsResponse res = sdk.listUserCredentials()
                .userId("<value>")
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                              | Type                                   | Required                               | Description                            |
| -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- |
| `userId`                               | *String*                               | :heavy_check_mark:                     | The id of the currently logged in user |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.ListUserCredentialsResponse>](../../models/operations/ListUserCredentialsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listWorkflows

Returns a list of all active **parent** workflows associated with your Alloy Embedded account. Note this endpoint does _not_ return a list of workflows that the user has installed, but rather a list of all _available_ workflows. The `installed` flag indicates if the user has installed a copy of the workflow but does not  indicate if the user has a given workflow "active".

For each workflow, this endpoint returns the individual apps that are required as part of the workflow. Commonly used to populate data on an integrations page.

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            ListWorkflowsResponse res = sdk.listWorkflows()
                .integration("<value>")
                .userId("<value>")
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.ListWorkflowsResponseBody e) {
            // handle exception
            throw e;
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                          | Type                                                                                                                                                                               | Required                                                                                                                                                                           | Description                                                                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `integration`                                                                                                                                                                      | *Optional<? extends String>*                                                                                                                                                       | :heavy_minus_sign:                                                                                                                                                                 | This parameter allows you to filter workflows based on the name of the integration you're looking for. For example, if you were looking for a Shopify integration, specify shopify |
| `userId`                                                                                                                                                                           | *String*                                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                                 | The Id of the user you want to lookup. Returned from the Create User endpoint. Note: you can also use the Embedded user's `username` in this field.                                |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.ListWorkflowsResponse>](../../models/operations/ListWorkflowsResponse.md)**
### Errors

| Error Object                            | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| models/errors/ListWorkflowsResponseBody | 400                                     | application/json                        |
| models/errors/SDKError                  | 4xx-5xx                                 | */*                                     |

## deactivateAWorkflow

Disables all future invocations and runs for a given workflow. 

By deactivating a workflow, this endpoint will turn off any events or webhooks a workflow is subscribed to. May be reactivated by the Reactivate workflow endpoint.

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            DeactivateAWorkflowRequestBody req = DeactivateAWorkflowRequestBody.builder()
                .userId("<value>")
                .build();

            DeactivateAWorkflowResponse res = sdk.deactivateAWorkflow()
                .request(req)
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [org.openapis.openapi.models.operations.DeactivateAWorkflowRequestBody](../../models/operations/DeactivateAWorkflowRequestBody.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.DeactivateAWorkflowResponse>](../../models/operations/DeactivateAWorkflowResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## activateAWorkflow

Reactivates a workflow that was previously disabled by the Disable Workflow endpoint. This endpoint requires a specified WorkflowId and returns a success/failure.

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            ActivateAWorkflowRequestBody req = ActivateAWorkflowRequestBody.builder()
                .userId("<value>")
                .build();

            ActivateAWorkflowResponse res = sdk.activateAWorkflow()
                .request(req)
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [org.openapis.openapi.models.operations.ActivateAWorkflowRequestBody](../../models/operations/ActivateAWorkflowRequestBody.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.ActivateAWorkflowResponse>](../../models/operations/ActivateAWorkflowResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getWorkflowAnalytics

This endpoint returns the `totalAppActions` (the number of times each block inside the workflow has been executed over the course of the workflow's lifetime), the `totalWorkflowRuns` (which represents the number of times the workflow has been invoked) and the `totalErrors` (the number of times the workflow has had an error).

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            GetWorkflowAnalyticsResponse res = sdk.getWorkflowAnalytics()
                .workflowId("<value>")
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                          | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `workflowId`                                       | *String*                                           | :heavy_check_mark:                                 | The Id of the workflow you want to find errors for |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.GetWorkflowAnalyticsResponse>](../../models/operations/GetWorkflowAnalyticsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## disableAllWorkflowsForAUser

Deactivates all active workflows for a user in bulk. 

This endpoint may be used to perform a bulk operation such as temporarily disabling a user's account in lieu of deleting the user account if the user wants to "pause" their account.

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            DisableAllWorkflowsForAUserResponse res = sdk.disableAllWorkflowsForAUser()
                .userId("<value>")
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `userId`                                                                      | *String*                                                                      | :heavy_check_mark:                                                            | The Id of the user you want to lookup. Returned from the Create User endpoint |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.DisableAllWorkflowsForAUserResponse>](../../models/operations/DisableAllWorkflowsForAUserResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getWorkflowLogs

Retrieves log data for a given workflow over time. Logs are stored for a maximum of 60 days before being purged.

Each log includes the `executionId` (which can be used to rerun an execution), the `startedAt` and `stoppedAt` date stamps, and the JSON output of the execution.

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            GetWorkflowLogsRequest req = GetWorkflowLogsRequest.builder()
                .workflowId("<value>")
                .build();

            GetWorkflowLogsResponse res = sdk.getWorkflowLogs()
                .request(req)
                .call();

            // handle response
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [org.openapis.openapi.models.operations.GetWorkflowLogsRequest](../../models/operations/GetWorkflowLogsRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.GetWorkflowLogsResponse>](../../models/operations/GetWorkflowLogsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getWorkflowErrors

This endpoint fetches an array of errors for a specific workflow.

It returns the error message, and the date stamp when the error was thrown, the block that caused the error, and the `workflowId` . Commonly used to debug workflows when they error and identify historical errors; this endpoint may be used in conjunction with the route error messages feature.

If there are no errors for the specified workflow, this endpoint will return an empty array.

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            GetWorkflowErrorsResponse res = sdk.getWorkflowErrors()
                .workflowId("<value>")
                .userId("<value>")
                .call();

            // handle response
        } catch (org.openapis.openapi.models.errors.GetWorkflowErrorsResponseBody e) {
            // handle exception
            throw e;
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `workflowId`                                                                        | *String*                                                                            | :heavy_check_mark:                                                                  | The Id of the workflow you want to find errors for                                  |
| `userId`                                                                            | *Optional<? extends String>*                                                        | :heavy_minus_sign:                                                                  | The Id of the user you want delete logs for. Returned from the Create User endpoint |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.GetWorkflowErrorsResponse>](../../models/operations/GetWorkflowErrorsResponse.md)**
### Errors

| Error Object                                | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/GetWorkflowErrorsResponseBody | 400                                         | application/json                            |
| models/errors/SDKError                      | 4xx-5xx                                     | */*                                         |

## deleteLogsForAUser

This endpoint deletes all historical logs associated with a user and is most commonly used in conjunction with a compliance request such as GDPR. This endpoint requires a userId. 

Note that this action cannot be undone.

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            DeleteLogsForAUserResponse res = sdk.deleteLogsForAUser()
                .userId("<value>")
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `userId`                                                                            | *String*                                                                            | :heavy_check_mark:                                                                  | The Id of the user you want delete logs for. Returned from the Create User endpoint |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.DeleteLogsForAUserResponse>](../../models/operations/DeleteLogsForAUserResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteACredential

To delete a credential via the API, you need to invoke the below endpoint.

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            DeleteACredentialResponse res = sdk.deleteACredential()
                .credentialId("<value>")
                .userId("<value>")
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                          | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `credentialId`                                     | *String*                                           | :heavy_check_mark:                                 | The credential you're looking to delete            |
| `userId`                                           | *String*                                           | :heavy_check_mark:                                 | The Id of the user associated with this credential |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.DeleteACredentialResponse>](../../models/operations/DeleteACredentialResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## runEvent

This endpoint runs a workflow that uses a **Custom Event **. Note that this endpoint cannot be used to invoke a workflow that has a Custom Webhook Trigger.

If you have defined a custom JSON body for the Custom Event, it should be passed into the `data` body parameter.

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            RunEventRequestBody req = RunEventRequestBody.builder()
                .event("<value>")
                .userId("<value>")
                .data("{key: 61661, key1: null, key2: \"<value>\"}")
                .build();

            RunEventResponse res = sdk.runEvent()
                .request(req)
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [org.openapis.openapi.models.operations.RunEventRequestBody](../../models/operations/RunEventRequestBody.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RunEventResponse>](../../models/operations/RunEventResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## rerunWorkfow

Retrieves log data for a given workflow over time. Logs are stored for a maximum of 60 days before being purged.

Each log includes the `executionId` (which can be used to rerun an execution), the `startedAt` and `stoppedAt` date stamps, and the JSON output of the execution.

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            RerunWorkfowResponse res = sdk.rerunWorkfow()
                .workflowId("<value>")
                .executionId("<value>")
                .userId("<value>")
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `workflowId`                                                                                | *String*                                                                                    | :heavy_check_mark:                                                                          | The Id of the workflow you want to find logs for                                            |
| `executionId`                                                                               | *String*                                                                                    | :heavy_check_mark:                                                                          | The Id of the execution to rerun. This can be retrieved from the GET Workflow Logs endpoint |
| `userId`                                                                                    | *String*                                                                                    | :heavy_check_mark:                                                                          | The Id of the user you want delete logs for. Returned from the Create User endpoint         |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RerunWorkfowResponse>](../../models/operations/RerunWorkfowResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## runWorkflow

This endpoint runs a workflow that uses a **Webhook Trigger.** Note that this endpoint should not be used to invoke a workflow that has a Custom Event. If you have defined a custom JSON body for the webhook trigger, it should be passed into the `data` body parameter.

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            RunWorkflowRequestBody req = RunWorkflowRequestBody.builder()
                .userId("<value>")
                .data("{key: 25693, key1: null, key2: \"<value>\"}")
                .build();

            RunWorkflowResponse res = sdk.runWorkflow()
                .request(req)
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [org.openapis.openapi.models.operations.RunWorkflowRequestBody](../../models/operations/RunWorkflowRequestBody.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RunWorkflowResponse>](../../models/operations/RunWorkflowResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listApps

Returns all the available apps currently supported by Alloy Embedded

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            ListAppsResponse res = sdk.listApps()
                .call();

            // handle response
        } catch (org.openapis.openapi.models.errors.ListAppsResponseBody e) {
            // handle exception
            throw e;
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```


### Response

**[Optional<? extends org.openapis.openapi.models.operations.ListAppsResponse>](../../models/operations/ListAppsResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/ListAppsResponseBody | 400                                | application/json                   |
| models/errors/SDKError             | 4xx-5xx                            | */*                                |

## listIntegrations

Returns all the available integrations in your Alloy Embedded Account. Includes integrations/apps you've created an "integration" for, their workflows and statuses. If `installed` equals `true`, the `installedVersion` key will show the currently installed version.

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            ListIntegrationsResponse res = sdk.listIntegrations()
                .userId("<value>")
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.ListIntegrationsResponseBody e) {
            // handle exception
            throw e;
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `userId`                                                                                               | *String*                                                                                               | :heavy_check_mark:                                                                                     | The Id used to identify the user. Note: you can also use the Embedded user's `username` in this field. |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.ListIntegrationsResponse>](../../models/operations/ListIntegrationsResponse.md)**
### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| models/errors/ListIntegrationsResponseBody | 400                                        | application/json                           |
| models/errors/SDKError                     | 4xx-5xx                                    | */*                                        |

## listEvents

Returns a list of all Custom Events you have enabled in Alloy Embedded.

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            ListEventsResponse res = sdk.listEvents()
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.ListEventsResponseBody e) {
            // handle exception
            throw e;
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```


### Response

**[Optional<? extends org.openapis.openapi.models.operations.ListEventsResponse>](../../models/operations/ListEventsResponse.md)**
### Errors

| Error Object                         | Status Code                          | Content Type                         |
| ------------------------------------ | ------------------------------------ | ------------------------------------ |
| models/errors/ListEventsResponseBody | 400                                  | application/json                     |
| models/errors/SDKError               | 4xx-5xx                              | */*                                  |

## generateAlloyLink

This endpoint generates an alloy Link. For more details on Embedded Link, please [read](https://docs.runalloy.com/docs/alloy-link) this tutorial.

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            GenerateAlloyLinkResponse res = sdk.generateAlloyLink()
                .userId("<value>")
                .integrationId("<value>")
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `userId`                                                             | *String*                                                             | :heavy_check_mark:                                                   | The user to generate the Embedded Link for                           |
| `integrationId`                                                      | *String*                                                             | :heavy_check_mark:                                                   | The Id of the integration you want to generate the Embedded Link for |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.GenerateAlloyLinkResponse>](../../models/operations/GenerateAlloyLinkResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## generateOauthLink

This endpoint can be used to generate an OAuth link if you want to completely white label your authentication experience. You can use this endpoint to generate a link which your users can click to redirect to the specified application without rendering the Alloy Embedded Modal.

Note: this endpoint **only** works with OAuth enabled integrations. To add a credential manually, please use the [POST Create Credential API](https://docs.runalloy.com/v2.1/reference/create-a-credential).

This endpoint takes a `userId`, `integrationId`, and `credentialName` as inputs. It should be used in conjunction with the [GET Credential Metadata API](https://docs.runalloy.com/v2.1/reference/get-credential-metadata). `credentialName` represents the name of the integration you want to call.

If the credential metadata endpoint returns any `properties,` you must pass them as query string parameters at the end of this call.

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            GenerateOauthLinkResponse res = sdk.generateOauthLink()
                .userId("<value>")
                .app("<value>")
                .credentialName("the credentialName")
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `userId`                                                     | *String*                                                     | :heavy_check_mark:                                           | The id of the user to generate this link for                 |
| `app`                                                        | *Optional<? extends String>*                                 | :heavy_minus_sign:                                           | The name of the app you want the user to authorize access to |
| `credentialName`                                             | *Optional<? extends String>*                                 | :heavy_minus_sign:                                           | N/A                                                          |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.GenerateOauthLinkResponse>](../../models/operations/GenerateOauthLinkResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteWorkflow

Deletes a workflow for a specific user. This endpoint does not delete a workflow for all users.

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            DeleteWorkflowResponse res = sdk.deleteWorkflow()
                .userId("<value>")
                .workflowId("<value>")
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                           | Type                                                                                                                                                | Required                                                                                                                                            | Description                                                                                                                                         |
| --------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------- |
| `userId`                                                                                                                                            | *String*                                                                                                                                            | :heavy_check_mark:                                                                                                                                  | The Id of the user you want to lookup. Returned from the Create User endpoint. Note: you can also use the Embedded user's `username` in this field. |
| `workflowId`                                                                                                                                        | *String*                                                                                                                                            | :heavy_check_mark:                                                                                                                                  | The Id of the workflow to delete                                                                                                                    |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.DeleteWorkflowResponse>](../../models/operations/DeleteWorkflowResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## findAWorkflow

Find a workflow given a workflowId

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            FindAWorkflowResponse res = sdk.findAWorkflow()
                .userId("<value>")
                .workflowId("<value>")
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                           | Type                                                                                                                                                | Required                                                                                                                                            | Description                                                                                                                                         |
| --------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------- |
| `userId`                                                                                                                                            | *String*                                                                                                                                            | :heavy_check_mark:                                                                                                                                  | The Id of the user you want to lookup. Returned from the Create User endpoint. Note: you can also use the Embedded user's `username` in this field. |
| `workflowId`                                                                                                                                        | *String*                                                                                                                                            | :heavy_check_mark:                                                                                                                                  | The Id of the workflow to find                                                                                                                      |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.FindAWorkflowResponse>](../../models/operations/FindAWorkflowResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getAnIntegration

Finds a specific integration for a user

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            GetAnIntegrationResponse res = sdk.getAnIntegration()
                .integrationId("<value>")
                .userId("<value>")
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.GetAnIntegrationResponseBody e) {
            // handle exception
            throw e;
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        | Type                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             | Required                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `integrationId`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | *String*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | This API parameter allows you to filter results based on the integrationId or the integrationName (also referred to as 'app'). The integration name (app) is a custom name that you have set for your integration. When using the integration name (app), provide the name of the integration you want to filter for (e.g. 'shopify order sync' or 'magento product creation'). You can obtain the integration name (app) from the List Integrations endpoint under the 'app' parameter, or by checking your UI. Either integrationId or integrationName must be provided but it cannot be both. |
| `userId`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | *String*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | The Id used to identify the user. Note: you can also use the Embedded user's `username` in this field.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.GetAnIntegrationResponse>](../../models/operations/GetAnIntegrationResponse.md)**
### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| models/errors/GetAnIntegrationResponseBody | 400                                        | application/json                           |
| models/errors/SDKError                     | 4xx-5xx                                    | */*                                        |

## listUsersByWorkflowid

List Users by workflowId

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            ListUsersByWorkflowidResponse res = sdk.listUsersByWorkflowid()
                .workflowId("<value>")
                .userId("<value>")
                .call();

            // handle response
        } catch (org.openapis.openapi.models.errors.ListUsersByWorkflowidResponseBody e) {
            // handle exception
            throw e;
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `workflowId`                                                    | *String*                                                        | :heavy_check_mark:                                              | The Id of the parent workflow you would like to list users for. |
| `userId`                                                        | *Optional<? extends String>*                                    | :heavy_minus_sign:                                              | The Id of the user you would like to query.                     |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.ListUsersByWorkflowidResponse>](../../models/operations/ListUsersByWorkflowidResponse.md)**
### Errors

| Error Object                                    | Status Code                                     | Content Type                                    |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| models/errors/ListUsersByWorkflowidResponseBody | 400                                             | application/json                                |
| models/errors/SDKError                          | 4xx-5xx                                         | */*                                             |

## upgradeWorkflow

This endpoint allows you as the ISV to upgrade the workflow for a specified end user.  <br /> <br />In order to upgrade a workflow via this endpoint, the new workflow must have the same configurable fields as the original. If any new configurable fields were added, you will not be able to upgrade the workflow programmatically and instead would need to reinstall the workflow for the end user.

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            UpgradeWorkflowResponse res = sdk.upgradeWorkflow()
                .workflowId("<value>")
                .userId("<value>")
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.UpgradeWorkflowResponseBody e) {
            // handle exception
            throw e;
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `workflowId`                                                          | *String*                                                              | :heavy_check_mark:                                                    | Id of the parent workflow in which you are upgrading for the end user |
| `userId`                                                              | *String*                                                              | :heavy_check_mark:                                                    | Id of the end user you wish to upgrade the workflow for               |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.UpgradeWorkflowResponse>](../../models/operations/UpgradeWorkflowResponse.md)**
### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/UpgradeWorkflowResponseBody | 400                                       | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | */*                                       |

## listVersions

Returns a list of all versions available for a given workflow

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            ListVersionsResponse res = sdk.listVersions()
                .userId("<value>")
                .workflowId("<value>")
                .call();

            // handle response
        } catch (org.openapis.openapi.models.errors.ListVersionsResponseBody e) {
            // handle exception
            throw e;
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                           | Type                                                                                                                                                | Required                                                                                                                                            | Description                                                                                                                                         |
| --------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------- |
| `userId`                                                                                                                                            | *String*                                                                                                                                            | :heavy_check_mark:                                                                                                                                  | The Id of the user you want to lookup. Returned from the Create User endpoint. Note: you can also use the Embedded user's `username` in this field. |
| `workflowId`                                                                                                                                        | *String*                                                                                                                                            | :heavy_check_mark:                                                                                                                                  | The Id of the workflow you want to retrieve versions for                                                                                            |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.ListVersionsResponse>](../../models/operations/ListVersionsResponse.md)**
### Errors

| Error Object                           | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ListVersionsResponseBody | 400                                    | application/json                       |
| models/errors/SDKError                 | 4xx-5xx                                | */*                                    |

## credentialMedataByApp

Retrieve credential structure for an app

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            CredentialMedataByAppResponse res = sdk.credentialMedataByApp()
                .app("<value>")
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.CredentialMedataByAppResponseBody e) {
            // handle exception
            throw e;
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `app`                                                           | *String*                                                        | :heavy_check_mark:                                              | Name of App (camelCased, can be found in App Metadata response) |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.CredentialMedataByAppResponse>](../../models/operations/CredentialMedataByAppResponse.md)**
### Errors

| Error Object                                    | Status Code                                     | Content Type                                    |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| models/errors/CredentialMedataByAppResponseBody | 400                                             | application/json                                |
| models/errors/SDKError                          | 4xx-5xx                                         | */*                                             |

## startInstallation

This endpoint will create an installation record and return the information required to create a form for your user to fill out.

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            StartInstallationRequestBody req = StartInstallationRequestBody.builder()
                .userId("<value>")
                .integrationId("<value>")
                .build();

            StartInstallationResponse res = sdk.startInstallation()
                .request(req)
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.StartInstallationResponseBody e) {
            // handle exception
            throw e;
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [org.openapis.openapi.models.operations.StartInstallationRequestBody](../../models/operations/StartInstallationRequestBody.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.StartInstallationResponse>](../../models/operations/StartInstallationResponse.md)**
### Errors

| Error Object                                | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/StartInstallationResponseBody | 400                                         | application/json                            |
| models/errors/SDKError                      | 4xx-5xx                                     | */*                                         |

## completeInstallation

Complete Installation

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.components.Security;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            CompleteInstallationRequestBody req = CompleteInstallationRequestBody.builder()
                .installationId("<value>")
                .data(java.util.List.of(
                        Data.builder()
                            .workflowId("<value>")
                            .blockId("<value>")
                            .build()))
                .build();

            CompleteInstallationResponse res = sdk.completeInstallation()
                .request(req)
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.CompleteInstallationResponseBody e) {
            // handle exception
            throw e;
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [org.openapis.openapi.models.operations.CompleteInstallationRequestBody](../../models/operations/CompleteInstallationRequestBody.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.CompleteInstallationResponse>](../../models/operations/CompleteInstallationResponse.md)**
### Errors

| Error Object                                   | Status Code                                    | Content Type                                   |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| models/errors/CompleteInstallationResponseBody | 400                                            | application/json                               |
| models/errors/SDKError                         | 4xx-5xx                                        | */*                                            |
