#Autor Daniel Garcia Perea
@stories
Feature: Academy Choucair
    As a user, I want to learn how automate in screamplay at the Choucair Academy with the automation course
    @scenario1
    Scenario: Search for automation course
        Given than brandon wants to learn at the academy Choucair
          | strUser  | strPassword  |
          | 1019124361| Choucair2021*|
        When he search for the course  on the choucair academy platform
          | strCourse|
          | Recursos Automatizacion Bancolombia |
        Then he finds the course called resource
          | strCourse|
          | Recursos Automatizacion Bancolombia |