# GetWorkflowErrorsRequest


## Fields

| Field                                                                               | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `workflowId`                                                                        | *String*                                                                            | :heavy_check_mark:                                                                  | The Id of the workflow you want to find errors for                                  |
| `userId`                                                                            | *Optional<? extends String>*                                                        | :heavy_minus_sign:                                                                  | The Id of the user you want delete logs for. Returned from the Create User endpoint |