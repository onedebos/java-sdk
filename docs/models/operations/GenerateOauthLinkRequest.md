# GenerateOauthLinkRequest


## Fields

| Field                                                        | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `userId`                                                     | *String*                                                     | :heavy_check_mark:                                           | The id of the user to generate this link for                 |
| `app`                                                        | *Optional<? extends String>*                                 | :heavy_minus_sign:                                           | The name of the app you want the user to authorize access to |
| `credentialName`                                             | *Optional<? extends String>*                                 | :heavy_minus_sign:                                           | N/A                                                          |