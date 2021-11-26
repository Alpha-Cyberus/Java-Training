package TheCompleteJavaDeveloperCourseOReilly;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

/*
--==## Additional Course Notes ##==--

--== Primitive vs Reference types ==--
Primitive: Hold the value of interest directly.
name    size
------------
byte    1b
short   2b
int     4b
long    8b
float   4b
double  8b
char    2b
boolean 1b

Reference: Hold the memory address of the object of interest.

Conversion methods:
float myVal = (float)3.14; <- Have to do this for variable conversion.
float myVal = 3.14f; <- Easier way with literal constants.

Constants: Variables which can't be changed, made with the keyword "final" in the beginning of the declaration.


--== Arithmetic Operators ==--
Simple operators
+   add
_   subtract
*   multiply
/   divide  (integer division doesn't return decimal)
%   modulus (return remainder of division

Compound operators
+=  a = a+b
-=  a = a-b
*=  a = a*b
/=  a = a/b
%=  a = a%b

Increment operators
++  a+1
--  a-1


--== Relationship Operators ==--
Relational operators - Must be used on numeric values
>   greater than
>=  greater than or equal to
<   less than
<=  less than or equal to

Equality operators - can compare reference types but will compare the memory address not the value
==  is equal to
!=  is not equal to

To compare strings:
strVar1.equals(strVal2)


--== Logical Operators ==--
&& - AND
A B     A && B
T T     T
T F     F
F T     F
F F     F

|| - OR
A B     A || B
T T     T
T F     T
F T     T
F F     F

! - NOT
A       !A
T       F
F       T

 */