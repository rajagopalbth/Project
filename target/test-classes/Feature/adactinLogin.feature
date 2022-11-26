Feature:
      To validate The order Number to Adactin Application
Scenario:
      To Validate Order Number using valid details   
      
      Given User is in Adactin login Page
      When user enter The valid Username and valid password   
      And User click The login button
      And User Select The Location
      And User Select The Hotel Type
      And User Select The Room Type
      And User Select The Number Of Rooms
      And User Select The Adults per Room
      And User Select The Children per Room 
      And user Click The Search button
      And User Click The Select The Radio Button
      And User Click The Continue button
      And User Enter The First Name
      And User Enter The Last Name
      And User enter The Address
      And User Enter The Credit Card No
      And User Enter The Credit Card Type
      And User Enter The Expiry Date
      And User Enter The CVV Number
      And User Click The book Now button
      And User Wait For Five min 
      Then User Get The Order Number 
      
      
       
      