<!-- Start SDK Example Usage [usage] -->
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