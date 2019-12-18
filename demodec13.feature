Feature: Refund a product

   Background: 
   Given Online store is open
   
   
   @RegressionTest
   Scenario Outline: refund a microwave
    
    Given sara purchased a <price>microwave
    And she has a recipt
    When sara returns damaged micriwave
    Then sara should get<price> refund
    Examples: 
    |price|
    |100|
    |50|
    
    
    @Data
    Scenario: Datatable data
    Given Mike provides customerdetails
    |mike|john|bdc|india|
    |mary|jane|hdc|india|
    |peter|parker|Pdc|India|
    
    
@FunctionalTest @RegressionTest
Scenario: Refund a gift vocher
Given mike purchasesd a gift vocher



@Credentials
Scenario: Login with valid credentials
Given Navigate to home page
When user enters username and password
Then user loggrd in Successfully