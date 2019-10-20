Write a class with the name Person. The class needs three fields (instance variables)
with the names firstName, lastName of type String and age of type int.

Write the following methods (instance methods):

*Method named getFirstName without any parameters, it needs to return the value of the firstName field.
*Method named getLastName without any parameters, it needs to return the value of the lastName field.
*Method named getAge without any parameters, it needs to return the value of the age field.
*Method named setFirstName with one parameter of type String, it needs to set the value of the firstName field.
*Method named setLastName with one parameter of type String, it needs to set the value of the lastName field.
*Method named setAge with one parameter of type int, it needs to set the value of the age field. If the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
*Method named isTeen without any parameters, it needs to return true if the value of the age field is greater than 12 and less than 20, otherwise, return false.
*Method named getFullName without any parameters, it needs to return the full name of the person.
    *In case both firstName and lastName fields are empty, Strings return an empty String.
    *In case lastName is an empty String, return firstName.
    *In case firstName is an empty String, return lastName.

To check if s String is empty, use the method isEmpty from the String class. For example, firstName.isEmpty() returns true if the String is empty or in other words, when the String does not contain any characters.


OUTPUT

fullName=
teen= false
fullName= John
teen= true
fullName= John Smith



SIMPLE CALCULATOR:

Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with names firstNumber and secondNumber both of type double.

Write the following methods (instance methods):

*Method named getFirstNumber without any parameters, it needs to return the value of firstNumber field.
*Method named getSecondNumber without any parameters, it needs to return the value of secondNumber field.
*Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
*Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumberfield.
*Method named getAdditionResult without any parameters, it needs to return the result of adding the field values of firstNumber and secondNumber.
*Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the field values of secondNumber from the firstNumber.
*Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying the field values of firstNumber and secondNumber.
*Method named getDivisionResult without any parameters it needs to return the result of dividing the field values of firstNumber by the secondNumber. In case the value of secondNumber is 0 then return 0.

OUTPUT:
add= 9.0
subtract= 1.0
multiply= 0.0
divide= Infinity
