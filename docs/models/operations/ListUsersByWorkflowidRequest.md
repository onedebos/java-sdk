# ListUsersByWorkflowidRequest


## Fields

| Field                                                           | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `workflowId`                                                    | *String*                                                        | :heavy_check_mark:                                              | The Id of the parent workflow you would like to list users for. |
| `userId`                                                        | *Optional<? extends String>*                                    | :heavy_minus_sign:                                              | The Id of the user you would like to query.                     |