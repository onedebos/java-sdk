import org.openapis.openapi.AlloySDK;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            AlloySDK sdk = AlloySDK.builder().apiKey("Bearer giqj1f5DPONce6gnmDhkP").build();

            UpdateAUserResponse res = sdk.updateAUser()
                    .userId("6622b0d34268110c7caabd62")
                    .requestBody(UpdateAUserRequestBody.builder()
                            .build())
                    .call();

            if (res.object().isPresent()) {
                System.out.println(res.object());
            }
        } catch (org.openapis.openapi.models.errors.UpdateAUserResponseBody e) {
            System.out.println(e);
            throw e;
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            System.out.println(e);
            throw e;
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
    }
}