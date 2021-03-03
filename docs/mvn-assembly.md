# mvn assmebly

```
https://stackoverflow.com/questions/1082580/how-to-build-jars-from-intellij-properly
```
```
[WARNING] Cannot include project artifact: com.my.newpkg.project1:jar:0.0.3.0; it doesn't have an associated file or directory.
```
Executing mvn package assembly:single is including the jar, but if we run them as separate commands, then the same warning is shown, and the jar doesn't get included.

`https://stackoverflow.com/questions/14276453/maven-assembly-include-the-current-project-jar-in-the-final-zip-tar`

Solved by running command of `mvn package assembly:single` in `Execute Maven Goal` in Maven manual with icon of m