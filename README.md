# Getting started

provides ATM info such as cash withdrawals and deposits

## How to Build

The generated code uses a few Gradle dependencies e.g., Jackson, Volley,
and Apache HttpClient. The reference to these dependencies is already
added in the build.gradle file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Android Studio click on ``` Open an Existing Android Project ```.

![Importing SDK into Android Studio - Step 1](https://apidocs.io/illustration/android?step=import1&workspaceFolder=BankATM&workspaceName=BankATM&projectName=BankATMLib&rootNamespace=com.swaggerhub.virtserver)

* Browse to locate the folder containing the source code. Select the location of the BankATM gradle project and click ``` Ok ```.

![Importing SDK into Android Studio - Step 2](https://apidocs.io/illustration/android?step=import2&workspaceFolder=BankATM&workspaceName=BankATM&projectName=BankATMLib&rootNamespace=com.swaggerhub.virtserver)

* Upon successful import, the project can be built by clicking on ``` Build > Make Project ``` or  pressing ``` Ctrl + F9 ```.

![Importing SDK into Android Studio - Step 3](https://apidocs.io/illustration/android?step=import3&workspaceFolder=BankATM&workspaceName=BankATM&projectName=BankATMLib&rootNamespace=com.swaggerhub.virtserver)

## How to Use

The following section explains how to use the BankATM library in a new project.

### 1. Starting a new project 

For starting a new project, click on ``` Create New Android Studio Project ```.

![Add a new project in Android Studio - Step 1](https://apidocs.io/illustration/android?step=createNewProject0&workspaceFolder=BankATM&workspaceName=BankATM&projectName=BankATMLib&rootNamespace=com.swaggerhub.virtserver)

Here, configure the new project by adding the name, domain and location of the sample application followed by clicking ``` Next ```.

![Create a new Android Studio Project - Step 2](https://apidocs.io/illustration/android?step=createNewProject1&workspaceFolder=BankATM&workspaceName=BankATM&projectName=BankATMLib&rootNamespace=com.swaggerhub.virtserver)

Following this, select the `Phone and Tablet` option as shown in the illustration below and click `Next`.

![Create a new Android Studio Project - Step 3](https://apidocs.io/illustration/android?step=createNewProject2&workspaceFolder=BankATM&workspaceName=BankATM&projectName=BankATMLib&rootNamespace=com.swaggerhub.virtserver)

In the following step, choose ``` Empty Activity ``` as the activity type and click ``` Next ```.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject3&workspaceFolder=BankATM&workspaceName=BankATM&projectName=BankATMLib&rootNamespace=com.swaggerhub.virtserver)

In this step, provide an ``` Activity Name ``` and ``` Layout Name ``` and click ``` Finish ```.  This would take you to the newly created project.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject4&workspaceFolder=BankATM&workspaceName=BankATM&projectName=BankATMLib&rootNamespace=com.swaggerhub.virtserver)

### 2. Add reference of the library project

In order to add a dependency to this sample application, click on the android button shown in the project explorer on the left side as shown in the picture. Click on ``` Project ``` in the drop down that emerges.  

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/android?step=testProject0&workspaceFolder=BankATM&workspaceName=BankATM&projectName=BankATMLib&rootNamespace=com.swaggerhub.virtserver)

Right click the sample application in the project explorer and click on ``` New > Module ```  as shown in the picture.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/android?step=testProject1&workspaceFolder=BankATM&workspaceName=BankATM&projectName=BankATMLib&rootNamespace=com.swaggerhub.virtserver)

Choose ``` Import Gradle Project ``` and click ``` Next ```.

![Adding dependency to the client library - Step 3](https://apidocs.io/illustration/android?step=testProject2&workspaceFolder=BankATM&workspaceName=BankATM&projectName=BankATMLib&rootNamespace=com.swaggerhub.virtserver)

Click on ``` Finish ``` which would take you back to the sample application with the refernced SDK. 

![Adding dependency to the client library - Step 4](https://apidocs.io/illustration/android?step=testProject3&workspaceFolder=BankATM&workspaceName=BankATM&projectName=BankATMLib&rootNamespace=com.swaggerhub.virtserver)

In the following step first navigate to the ``` SampleApplication > settings.gradle ``` file and add the line
```include ':BankATMLib'```

Then navigate to the ``` SampleApplication >  app > build.gradle ``` file and add the following line 
```implementation project(path: ':BankATMLib')```
to the dependencies section as shown in the illustration below. Also add the following packagingOptions.

packagingOptions
    exclude 'META-INF/LICENSE'
    exclude 'META-INF/NOTICE'
    exclude 'META-INF/DEPENDENCIES'
}

![Adding dependency to the client library - Step 5](https://apidocs.io/illustration/android?step=testProject4&workspaceFolder=BankATM&workspaceName=BankATM&projectName=BankATMLib&rootNamespace=com.swaggerhub.virtserver)

Finally, press ``` Sync Now ``` in the warning visible as shown in the picture below.

![Adding dependency to the client library - Step 6](https://apidocs.io/illustration/android?step=testProject5&workspaceFolder=BankATM&workspaceName=BankATM&projectName=BankATMLib&rootNamespace=com.swaggerhub.virtserver)

### 3. Write sample code

Once the ``` SampleApplication ``` is created, a file named ``` SampleApplication > app > src > main > java > MainActivity ``` will be visible in the *Project Explorer* with an ``` onCreate ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Android Studio, for running the tests do the following:

1. Right click on *SampleApplication > BankATMLib > androidTest > java)* from the project explorer.
2. Select "Run All Tests" or use "Ctrl + Shift + F10" to run the Tests.

## Initialization

### 

API client can be initialized as following. The `appContext` being passed is the Android application [`Context`](https://developer.android.com/reference/android/content/Context.html).

```java

com.swaggerhub.virtserver.Configuration.initialize(appContext);
BankATMClient client = new BankATMClient();
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [APIController](#api_controller)

## <a name="api_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.swaggerhub.virtserver.controllers.APIController") APIController

### Get singleton instance

The singleton instance of the ``` APIController ``` class can be accessed from the API Client.

```java
APIController client = client.getClient();
```

### <a name="get_returns_customer_account_information_async"></a>![Method: ](https://apidocs.io/img/method.png "com.swaggerhub.virtserver.controllers.APIController.getReturnsCustomerAccountInformationAsync") getReturnsCustomerAccountInformationAsync

> Returns customer account information


```java
void getReturnsCustomerAccountInformationAsync(
        final int pin,
        final APICallBack<InlineResponse200> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| pin |  ``` Required ```  | The pin of customers account |


#### Example Usage

```java
int pin = 117;
// Invoking the API call with sample inputs
client.getReturnsCustomerAccountInformationAsync(pin, new APICallBack<InlineResponse200>() {
    public void onSuccess(HttpContext context, InlineResponse200 response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | The specified pin is invalid (e.g. not a number). |
| 404 | An account with the specified pin was not found. |
| 0 | Unexpected error |



### <a name="create_returns_customer_account_information_async"></a>![Method: ](https://apidocs.io/img/method.png "com.swaggerhub.virtserver.controllers.APIController.createReturnsCustomerAccountInformationAsync") createReturnsCustomerAccountInformationAsync

> Returns customer account information


```java
void createReturnsCustomerAccountInformationAsync(
        final int pin,
        final APICallBack<InlineResponse2001> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| pin |  ``` Required ```  | The pin of customers account |


#### Example Usage

```java
int pin = 117;
// Invoking the API call with sample inputs
client.createReturnsCustomerAccountInformationAsync(pin, new APICallBack<InlineResponse2001>() {
    public void onSuccess(HttpContext context, InlineResponse2001 response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | The specified pin is invalid (e.g. not a number). |
| 404 | An account with the specified pin was not found. |
| 0 | Unexpected error |



### <a name="update_returns_customer_account_information_async"></a>![Method: ](https://apidocs.io/img/method.png "com.swaggerhub.virtserver.controllers.APIController.updateReturnsCustomerAccountInformationAsync") updateReturnsCustomerAccountInformationAsync

> Returns customer account information


```java
void updateReturnsCustomerAccountInformationAsync(
        final int pin,
        final APICallBack<InlineResponse2002> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| pin |  ``` Required ```  | The pin of customers account |


#### Example Usage

```java
int pin = 117;
// Invoking the API call with sample inputs
client.updateReturnsCustomerAccountInformationAsync(pin, new APICallBack<InlineResponse2002>() {
    public void onSuccess(HttpContext context, InlineResponse2002 response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | The specified pin is invalid (e.g. not a number). |
| 404 | An account with the specified pin was not found. |
| 0 | Unexpected error w |



[Back to List of Controllers](#list_of_controllers)



