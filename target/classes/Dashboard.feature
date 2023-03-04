Feature: MyAccount
  I want to test the MyAccount of payback website
  
  Scenario: MyProfile
   Given User logged into Payback Accountt
   When User click on the My Profile
   Then I should see my details
  
  Scenario: MyCards
   Given User logged into Paybackk Account
   When User click on the My Cards
   And User should see my payback card and payback points
   And User click on the view Transactions
   Then User should be navigate to view Transactions Page
  
  Scenario: MyTransactions
   Given User loggedd into payback
   When User click on the My Transactions
   And User should see my payback point details and Transaction details
   And User click on Redeem-Catalogue 
   Then User should be navigate to Redeem-Catalogue page
  
  Scenario: MyOrder
   Given User  logged intoo payback
   Then User click on the My order
  
  
  Scenario: Logout
   Given Userr  logged into payback
   When User click on the Logout
   Then User Logout from payback Account
   
  