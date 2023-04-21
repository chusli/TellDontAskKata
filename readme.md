# Deadfish

Write a simple parser that will parse and run Deadfish.

Deadfish has 4 commands, each 1 character long:

 - ``i`` increments the value (initially 0)

- ``d`` decrements the value

- ``s`` squares the value

- ``o`` outputs the value into the return array

Invalid characters should be ignored.

``Deadfish.parse("iiisdoso") =- new int[] {8, 64};``


# Valid Braces

Write a function that takes a string of braces, and determines if the order of the braces is valid. It should return true if the string is valid, and false if it's invalid.

This Kata is similar to the Valid Parentheses Kata, but introduces new characters: brackets ``[]``, and curly braces ``{}``. <br>
Thanks to @arnedag for the idea!

All input strings will be nonempty, and will only consist of parentheses, brackets and curly braces: ``()[]{}``.

What is considered Valid?
A string of braces is considered valid if all braces are matched with the correct brace.

Examples

```
"(){}[]"   =>  True
"([{}])"   =>  True
"(}"       =>  False
"[(])"     =>  False
"[({})](]" =>  False
```