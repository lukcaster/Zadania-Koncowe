Feature: Coders Guru Registration

  Scenario: User can fill registration form and successfully register to Coders Guru website as a private individual

    Given Web Browser is open with https://tester.codersguru.pl/

    When User Selects button called Załóż Konto

    And User is on the register page and selects Prywatnie button

    And User Fills Email input field

    And User Fills First Name field

    And User Fills Last Name field

    And User Fills Password field with not shorter password than five letters

    And User Fills Repeat Password field with not shorter password than five letters

    And User Fills Town Field

    And User Fills Zip-Code Field maintaining the correct format

    And User Fills Street Field

    And User Fills Number of house/apartment maintaining correct format

    And User Selects Field Which is called Zapoznałem się z Regulaminem

    And User Selects Button Zarejstruj

    Then User Should be registered and back on the main page seeing Znajdź mentora button where the register button was


