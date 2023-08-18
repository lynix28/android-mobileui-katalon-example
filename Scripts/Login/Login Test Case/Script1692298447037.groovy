import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

CucumberKW.GLUE = ["app", "login"]
CucumberKW.runFeatureFile("Include/features/Login.feature")