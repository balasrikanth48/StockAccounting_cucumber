Feature: validating login functionality test


Scenario Outline: Login Functionality with valid data

When Open Browser
When Open Application
When Wait For Username
When Enter Username
When Wait For Password
When Enter Password
When Wait For Login
When Click On Login
When Wait for Supplier
When Click On Supplier
When Wait for Add
When Click on add
When wait for suppliernumber
Then Capturedata
When wait for suppliername
When enter Supeliername in "<SupplierName>" with "id" and "x_Supplier_Name"
When enter Supeliername in "<address>" with "id" and "x_Address"
When enter Supeliername in "<city>" with "id" and "x_City"
When enter Supeliername in "<country>" with "id" and "x_Country"
When enter Supeliername in "<cperson>" with "id" and "x_Contact_Person"
When enter Supeliername in "<pnumber>" with "id" and "x_Phone_Number"
When enter Supeliername in "<mail>" with "id" and "x__Email"
When enter Supeliername in "<mnumber>" with "id" and "x_Mobile_Number"
When enter Supeliername in "<note>" with "id" and "x_Notes"
When Wait for Add button
When Click  on Add button afternotes
When Wait For Ok Button
When Click on OK button
When Wait For 2nd OK button
When clickAction
Then Table Validation
When wait For Logout
When Click On Logout
When Wait For OK 
When Click On Ok
When CloseBrowser






Examples:
|SupplierName|address|city|country|cperson|pnumber|mail|mnumber|note|
|Srikanth|srnagar1|Hyderabad1|India|Rangapappasani1|1234567|test@gmail.com|8765432|iam purchasing mobile1|
|Srikanth1|srnagar1|Hyderabad1|India|Rangapappasani1|1234567|test1@gmail.com|8765432|iam purchasing mobile1|