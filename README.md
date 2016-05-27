Title_Validation_Test_jar.

//INSTRUCTION//
0.1 Download jar in your machine.
0.2 Using command line Execute jar using java -jar ... + "URL address|Expected Result"

//SAMPLE//
java -jar Multiple_Title_Validation-1.1-FirefoxDriver-jar-with-dependencies.jar "https://github.com|git" "https://google.com|Google" "https://facebook.com|Facebook" "https://yahoo.com|yahoo"

//RESULT//
--------------------------------------------------------------
Test Case ID: 		TC-001.01
URL: 			https://github.com
Title Expected: 	git
Title Actual: 		How people build software · GitHub
Test Case Result: 	FAILED
--------------------------------------------------------------

--------------------------------------------------------------
Test Case ID: 		TC-001.02
URL: 			https://google.com
Title Expected: 	Google
Title Actual: 		Google
Test Case Result: 	PASSED
--------------------------------------------------------------

--------------------------------------------------------------
Test Case ID: 		TC-001.03
URL: 			https://facebook.com
Title Expected: 	Facebook
Title Actual: 		Добро пожаловать на Фейсбук - заходите, регистрируйтесь и находите друзей.
Test Case Result: 	FAILED
--------------------------------------------------------------

--------------------------------------------------------------
Test Case ID: 		TC-001.04
URL: 			https://yahoo.com
Title Expected: 	yahoo
Title Actual: 		Yahoo
Test Case Result: 	FAILED
--------------------------------------------------------------

