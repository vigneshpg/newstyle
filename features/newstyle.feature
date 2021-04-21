#Author: your.email@your.domain.com
@vignesh
Feature: NewStyle
  

   
  @vignesh
  Scenario Outline: Create data in new style
    Given user launches centric application 
    And user enter the login credential to login
    When user click on setup icon
    And user create the style type "<styletypeA>"
    And user fill the style attribute fields
    
    
    Examples: 
      | styletypeA |
      |  vignesh1 |
     #_______________________________________________________________________________________________________________
      
 Scenario: Create data in style
    Given user launches centric application 
    And user go to home page
    When user create the new season 
    And user creates new brand
    When user creates new department
    And user creates new collection
    When user create new style
    
    
 