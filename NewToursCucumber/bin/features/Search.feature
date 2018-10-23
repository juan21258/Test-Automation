#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Busqueda
Yo como usuario deseo realizar una busqueda en google esperando un resultado

  ##@tag1
  ##Scenario: Realizar una busqueda
  ##  Given que lanzo el navegador Chrome
  ##  When abro la página de Google
  ##  Then busco "el tiempo de mañana" en Google
    
  @tagfinal
  Scenario: Login en la App
  When abro la aplicacion en el Navegador Firefox
  