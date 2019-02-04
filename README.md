# JAVA_EmployeeAPP
Introductory Tutorial on JAVA

## STEP 1 - Command to Compile
Type `javac` followed by the file name. This will compile the code and also check for syntax errors. 
`javac employeeApp/*.java` 

## STEP 2 - Create jar file
Type `jar cvfe` along with what you want to name your jar file (in this case `EmpApp.jar`), then call out the file (in this case `employeeApp.Main`) and then point to the class we want to use (in this case from `employeeApp/*.class`)
`jar cvfe EmpApp.jar employeeApp.Main employeeApp/*.class`

## STEP 3 - To Print Data/Execute Jar File
`java -jar EmpApp.jar`