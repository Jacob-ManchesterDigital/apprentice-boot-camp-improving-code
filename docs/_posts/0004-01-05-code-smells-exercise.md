## Recap

+ Uncommunicative Name
+ Duplicate Code
+ Magic Number

Notes: Don’t worry… all on the cards

--

## Coverage

+ Proper refactoring shouldn’t break code, but…
+ Important to ensure we haven’t broken anything
+ Good news—we’ve covered the code with single exhaustive test
+ Test uses ‘Golden Master’ technique
    + Checks the output of 10k predictable runs of the game
    + Similar to [Visual Regression Testing](https://www.softwaretestinghelp.com/visual-validation-testing/) techniques you may use back at the office
+ But… if more tests help you, feel free to add them

---

## Exercise: Fix these smells (90 mins)

* One smell at a time and run test after each change
* Commit if green with useful message (don’t push!)
* Revert if red (you shouldn’t get a failure with refactoring)

| Smell | Refactorings |
| ----- | ------------ |
| Uncommunicative Name | Rename Variable, [Rename Method](https://refactoring.guru/rename-method), Rename Class |
| [Duplicate Code](https://refactoring.guru/smells/duplicate-code) | [Extract Variable](https://refactoring.guru/extract-variable) / [Extract Method](https://refactoring.guru/extract-method) / [Extract Class](https://refactoring.guru/extract-class) |
| [Magic Number](https://refactoring.guru/replace-magic-number-with-symbolic-constant) | [Replace Magic Number with Symbolic Constant](https://refactoring.guru/replace-magic-number-with-symbolic-constant) |
<!-- .element: style="font-size: 80%" -->

Notes: If working in small chunks reverting not a big deal  
    Remember you can have tests running automatically in IntelliJ  
    C# people have [`dotnet watch test`](https://docs.microsoft.com/en-us/aspnet/core/tutorials/dotnet-watch?view=aspnetcore-3.1)  
    Run *all* of the tests  
    We will discuss what you did—you should be able to tell from your `git log`  

--

## Exercise Discussion

+ How many commits?
+ How did you improve the code?
+ Did the tests fail?

Notes: Might want to look at the code people refer to  
    Have conversation about whether it is correct to change the tests, given we have no requirements  
    Smells covered: uncommunicative names, duplication, magic numbers