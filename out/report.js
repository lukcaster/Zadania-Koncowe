$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("coders-guru-registration.feature");
formatter.feature({
  "line": 1,
  "name": "Coders Guru Registration",
  "description": "",
  "id": "coders-guru-registration",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User can fill registration form and successfully register to Coders Guru website as a private individual",
  "description": "",
  "id": "coders-guru-registration;user-can-fill-registration-form-and-successfully-register-to-coders-guru-website-as-a-private-individual",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Web Browser is open with https://tester.codersguru.pl/",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User Selects button called Załóż Konto",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User is on the register page and selects Prywatnie button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User Fills Email input field",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User Fills First Name field",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User Fills Last Name field",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User Fills Password field with not shorter password than five letters",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User Fills Repeat Password field with not shorter password than five letters",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User Fills Town Field",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User Fills Zip-Code Field maintaining the correct format",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User Fills Street Field",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User Fills Number of house/apartment maintaining correct format",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User Selects Field Which is called Zapoznałem się z Regulaminem",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User Selects Button Zarejstruj",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User Should be registered and back on the main page seeing Znajdź mentora button where the register button was",
  "keyword": "Then "
});
formatter.match({
  "location": "CodersGuruRegistration.webBrowserIsOpenWithHttpsTesterCodersguruPl()"
});
formatter.result({
  "duration": 4532607000,
  "status": "passed"
});
formatter.match({
  "location": "CodersGuruRegistration.userSelectsButtonCalledZałóżKonto()"
});
formatter.result({
  "duration": 278769500,
  "status": "passed"
});
formatter.match({
  "location": "CodersGuruRegistration.userIsOnTheRegisterPageAndSelectsPrywatnieButton()"
});
formatter.result({
  "duration": 58901000,
  "status": "passed"
});
formatter.match({
  "location": "CodersGuruRegistration.userFillsEmailInputField()"
});
formatter.result({
  "duration": 158007500,
  "status": "passed"
});
formatter.match({
  "location": "CodersGuruRegistration.userFillsFirstNameField()"
});
formatter.result({
  "duration": 79025200,
  "status": "passed"
});
formatter.match({
  "location": "CodersGuruRegistration.userFillsLastNameField()"
});
formatter.result({
  "duration": 67154900,
  "status": "passed"
});
formatter.match({
  "location": "CodersGuruRegistration.userFillsPasswordFieldWithNotShorterPasswordThanFiveLetters()"
});
formatter.result({
  "duration": 70177900,
  "status": "passed"
});
formatter.match({
  "location": "CodersGuruRegistration.userFillsRepeatPasswordFieldWithNotShorterPasswordThanFiveLetters()"
});
formatter.result({
  "duration": 57627900,
  "status": "passed"
});
formatter.match({
  "location": "CodersGuruRegistration.userFillsTownField()"
});
formatter.result({
  "duration": 61569300,
  "status": "passed"
});
formatter.match({
  "location": "CodersGuruRegistration.userFillsZipCodeFieldMaintainingTheCorrectFormat()"
});
formatter.result({
  "duration": 74626000,
  "status": "passed"
});
formatter.match({
  "location": "CodersGuruRegistration.userFillsStreetField()"
});
formatter.result({
  "duration": 81575000,
  "status": "passed"
});
formatter.match({
  "location": "CodersGuruRegistration.userFillsNumberOfHouseApartmentMaintainingCorrectFormat()"
});
formatter.result({
  "duration": 72199900,
  "status": "passed"
});
formatter.match({
  "location": "CodersGuruRegistration.userSelectsFieldWhichIsCalledZapoznałemSięZRegulaminem()"
});
formatter.result({
  "duration": 96387600,
  "status": "passed"
});
formatter.match({
  "location": "CodersGuruRegistration.userSelectsButtonZarejstruj()"
});
formatter.result({
  "duration": 870131900,
  "status": "passed"
});
formatter.match({
  "location": "CodersGuruRegistration.userShouldBeRegisteredAndBackOnTheMainPageSeeingZnajdźMentoraButtonWhereTheRegisterButtonWas()"
});
formatter.result({
  "duration": 51263100,
  "status": "passed"
});
});