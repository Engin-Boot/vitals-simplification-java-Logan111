# Check Vitals

This program detects when any of the body vitals go out of limits.
The purpose is to treat without delay.

## Issues

- The code here has high complexity in a single function.
- The tests are not complete - they do not cover all conditions

## Tasks

1. Reduce the cyclomatic complexity.
1. Complete the tests - cover all conditions.
1. Currently, the vitals check returns a simple `boolean`.
For prompt treatment, we need to know the abnormal vital and the breach -
whether high or low. Add this capability.
1. The abnormal vital needs to be reported. Add the ability to plug-in different reporters to this code.

Use an interface to decouple the vitals logic from the specific reporter.

Example interface:
```java
interface IReporter {
    //Send the alert.
    //vitalName is the name of the vital. E.g., "spo2"
    //message is the observation. E.g., "too low"
    void alert(String vitalName, String message);
}
```
