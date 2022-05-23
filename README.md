# FizzBuzz Kata
Kata taken from: http://codingdojo.org/kata/FizzBuzz

## Problem Description

Imagine the scene. You are eleven years old, and in the five minutes before the end of the lesson, your Maths teacher decides he should make his class more “fun” by introducing a “game”.

He explains that he is going to point at each pupil in turn and ask them to say the next number in sequence, starting from one.

The “fun” part is that if the number is divisible by three, you instead say “io.ale.fizzbuzz.rule.Fizz” and if it is divisible by five you say “io.ale.fizzbuzz.rule.Buzz”. So now your maths teacher is pointing at all of your classmates in turn, and they happily shout “one!”, “two!”, “io.ale.fizzbuzz.rule.Fizz!”, “four!”, “io.ale.fizzbuzz.rule.Buzz!” ... until he very deliberately points at you, fixing you with a steely gaze ... time stands still, your mouth dries up, your palms become sweatier and sweatier until you finally manage to croak “io.ale.fizzbuzz.rule.Fizz!”.

Doom is avoided, and the pointing finger moves on.

So of course in order to avoid embarrassment in front of your whole class, you have to get the full list printed out so you know what to say. Your class has about 33 pupils and he might go round three times before the bell rings for break-time. Next maths lesson is on Thursday. Get coding!

Write a program that prints the numbers from **1** to **100**. But for **multiples of three** print **"io.ale.fizzbuzz.rule.Fizz"** instead of the number and for the **multiples of five** print **"io.ale.fizzbuzz.rule.Buzz"**. For numbers which are **multiples of both three and five** print **"FizzBuzz"**.


## Sample output:
```
1
2
io.ale.fizzbuzz.rule.Fizz
4
io.ale.fizzbuzz.rule.Buzz
io.ale.fizzbuzz.rule.Fizz
7
8
io.ale.fizzbuzz.rule.Fizz
io.ale.fizzbuzz.rule.Buzz
11
io.ale.fizzbuzz.rule.Fizz
13
14
FizzBuzz
16
17
io.ale.fizzbuzz.rule.Fizz
19
io.ale.fizzbuzz.rule.Buzz
... etc up to 100
```

## Stage 2 - new requirements

- A number is fizz if it is divisible by 3 or if it has a 3 in it
- A number is buzz if it is divisible by 5 or if it has a 5 in it