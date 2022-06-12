@WelcomePage
Feature: Welcome Page

  @Check
  Scenario Outline: Check Welcome Page Components
    Given burak is opened LcWaikiki App
    Then should see "<title>" title
    Then should see "<desc>"  description
    When should see skip button
    Examples:
      |    title      |        desc        |
      |PRATİK ALT MENÜ| Yenilenen alt menü |


  @Click
  Scenario: Click Button
    Given burak is opened LcWaikiki App
    When click Skip button
    Then should see Home Page
    When click Profil button

  @Write
  Scenario: Write Profile
    Given burak is opened LcWaikiki App
    When click Skip button
    Then should see Home Page
    When click Profil button
    When Write for e-mail address: "burak@lcw.com"
    When Write for password : "123abc"
    When Click show password button
    When Click Login button
    Then Check Message
    When Print Message





