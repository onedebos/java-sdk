# openapi

<div align="left">
    <a href="https://speakeasyapi.dev/"><img src="https://custom-icon-badges.demolab.com/badge/-Built%20By%20Speakeasy-212015?style=for-the-badge&logoColor=FBE331&logo=speakeasy&labelColor=545454" /></a>
    <a href="https://opensource.org/licenses/MIT">
        <img src="https://img.shields.io/badge/License-MIT-blue.svg" style="width: 100px; height: 28px;" />
    </a>
</div>


## 🏗 **Welcome to your new SDK!** 🏗

It has been generated successfully based on your OpenAPI spec. However, it is not yet ready for production use. Here are some next steps:
- [ ] 🛠 Make your SDK feel handcrafted by [customizing it](https://www.speakeasyapi.dev/docs/customize-sdks)
- [ ] ♻️ Refine your SDK quickly by iterating locally with the [Speakeasy CLI](https://github.com/speakeasy-api/speakeasy)
- [ ] 🎁 Publish your SDK to package managers by [configuring automatic publishing](https://www.speakeasyapi.dev/docs/advanced-setup/publish-sdks)
- [ ] ✨ When ready to productionize, delete this section from the README

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'org.openapis.openapi:openapi:0.0.5'
```

Maven:
```xml
<dependency>
    <groupId>org.openapis.openapi</groupId>
    <artifactId>openapi</artifactId>
    <version>0.0.5</version>
</dependency>
```

### How to build
After cloning the git repository to your file system you can build the SDK artifact from source to the `build` directory by running `./gradlew build` on *nix systems or `gradlew.bat` on Windows systems.

If you wish to build from source and publish the SDK artifact to your local Maven repository (on your filesystem) then use the following command (after cloning the git repo locally):

On *nix:
```bash
./gradlew publishToMavenLocal -Pskip.signing
```
On Windows:
```bash
gradlew.bat publishToMavenLocal -Pskip.signing
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

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
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

### [AlloySDK](docs/sdks/alloysdk/README.md)

* [updateAUser](docs/sdks/alloysdk/README.md#updateauser) - Update a user
* [getAUser](docs/sdks/alloysdk/README.md#getauser) - Retrieve a single user
* [deleteAUser](docs/sdks/alloysdk/README.md#deleteauser) - Delete a user
* [createAUser](docs/sdks/alloysdk/README.md#createauser) - Create a user
* [listAllUsers](docs/sdks/alloysdk/README.md#listallusers) - Retrieve a list of all users
* [createACredential](docs/sdks/alloysdk/README.md#createacredential) - Create Credential
* [getCredentialMetadata](docs/sdks/alloysdk/README.md#getcredentialmetadata) - Retrieve all credential structures
* [generateJwtToken](docs/sdks/alloysdk/README.md#generatejwttoken) - Generate a new JWT for a user
* [listUserCredentials](docs/sdks/alloysdk/README.md#listusercredentials) - Retrieve all credentials for a user
* [listWorkflows](docs/sdks/alloysdk/README.md#listworkflows) - Retrieve a list of workflows
* [deactivateAWorkflow](docs/sdks/alloysdk/README.md#deactivateaworkflow) - Deactivate a workflow
* [activateAWorkflow](docs/sdks/alloysdk/README.md#activateaworkflow) - Activate a workflow
* [getWorkflowAnalytics](docs/sdks/alloysdk/README.md#getworkflowanalytics) - Retrieve usage metrics for a workflow
* [disableAllWorkflowsForAUser](docs/sdks/alloysdk/README.md#disableallworkflowsforauser) - Deactivate workflows for a user
* [getWorkflowLogs](docs/sdks/alloysdk/README.md#getworkflowlogs) - Retrieve all execution logs for a workflow
* [getWorkflowErrors](docs/sdks/alloysdk/README.md#getworkflowerrors) - Retrieve all error logs for a workflow
* [deleteLogsForAUser](docs/sdks/alloysdk/README.md#deletelogsforauser) - Delete all logs for a user
* [deleteACredential](docs/sdks/alloysdk/README.md#deleteacredential) - Delete a Credential for a user
* [runEvent](docs/sdks/alloysdk/README.md#runevent) - Trigger an event for a user
* [rerunWorkfow](docs/sdks/alloysdk/README.md#rerunworkfow) - Rerun a single workflow execution
* [runWorkflow](docs/sdks/alloysdk/README.md#runworkflow) - Run Workflow
* [listApps](docs/sdks/alloysdk/README.md#listapps) - Retrieve all supported apps
* [listIntegrations](docs/sdks/alloysdk/README.md#listintegrations) - Retrieve a list of all integrations
* [listEvents](docs/sdks/alloysdk/README.md#listevents) - Retrieve a list of custom events
* [generateAlloyLink](docs/sdks/alloysdk/README.md#generatealloylink) - Create an Embedded link for an integration
* [generateOauthLink](docs/sdks/alloysdk/README.md#generateoauthlink) - Create OAuth Link
* [deleteWorkflow](docs/sdks/alloysdk/README.md#deleteworkflow) - Delete a workflow
* [findAWorkflow](docs/sdks/alloysdk/README.md#findaworkflow) - Retrieve a single workflow
* [getAnIntegration](docs/sdks/alloysdk/README.md#getanintegration) - Retrieve a single integration
* [listUsersByWorkflowid](docs/sdks/alloysdk/README.md#listusersbyworkflowid) - List Users by workflowId
* [upgradeWorkflow](docs/sdks/alloysdk/README.md#upgradeworkflow) - Upgrade a workflow
* [listVersions](docs/sdks/alloysdk/README.md#listversions) - Retrieve a list of workflow versions
* [credentialMedataByApp](docs/sdks/alloysdk/README.md#credentialmedatabyapp) - Retrieve credential structure for an app
* [startInstallation](docs/sdks/alloysdk/README.md#startinstallation) - Start Installation
* [completeInstallation](docs/sdks/alloysdk/README.md#completeinstallation) - Complete Installation
<!-- End Available Resources and Operations [operations] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations.  All operations return a response object or raise an error.  If Error objects are specified in your OpenAPI Spec, the SDK will throw the appropriate Exception type.

| Error Object                          | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/UpdateAUserResponseBody | 401                                   | application/json                      |
| models/errors/SDKError                | 4xx-5xx                               | */*                                   |

### Example

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
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Index

You can override the default server globally by passing a server index to the `serverIndex` builder method when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| # | Server | Variables |
| - | ------ | --------- |
| 0 | `https://embedded.runalloy.com/2024-03/` | None |

#### Example

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
                .serverIndex(0)
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


### Override Server URL Per-Client

The default server can also be overridden globally by passing a URL to the `serverURL` builder method when initializing the SDK client instance. For example:
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
                .serverURL("https://embedded.runalloy.com/2024-03/")
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
<!-- End Server Selection [server] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security scheme globally:

| Name     | Type     | Scheme   |
| -------- | -------- | -------- |
| `apiKey` | apiKey   | API key  |

To authenticate with the API the `apiKey` parameter must be set when initializing the SDK client instance. For example:
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
<!-- End Authentication [security] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->

# Development

## Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

## Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release!

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
