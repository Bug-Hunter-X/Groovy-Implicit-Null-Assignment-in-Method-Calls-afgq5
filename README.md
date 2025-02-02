# Groovy Implicit Null Assignment Bug

This example demonstrates a potential issue in Groovy related to implicit null assignment when calling methods with fewer arguments than defined.  Groovy's dynamic typing, while flexible, can lead to unexpected behavior if not handled carefully.  The bug occurs because Groovy does not throw an exception if a method is called with too few arguments, instead it assigns null to the missing parameters.

## How to reproduce

1.  Clone this repository
2.  Run `groovy bug.groovy`

The output will show that the second call to `myMethod` doesn't throw an error but instead concatenates `1` and `null`. This can be a difficult bug to spot, particularly in complex applications, as the error is not immediately apparent.

## Solution

The `bugSolution.groovy` file provides a solution which uses optional parameters, named parameters, or input validation to handle this type of situation robustly.