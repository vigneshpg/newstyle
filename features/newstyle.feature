#Author: your.email@your.domain.com
@vignesh
Feature: NewStyle
  

   
  @vignesh
  Scenario Outline: Create data in new style
    Given user launches centric application 
    And user enter the login credential to login
    When user click on setup icon
     And user create the style type "<styletypeA>"
    When user fill the style attribute fields
   
    Examples: 
      | styletypeA |
      |  vignesh1 |
      
