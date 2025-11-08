# Java 
## Repo Overview

Ei repo-te apnar semester-er shob Java program thakbe. Prottek program alada folder-e thakbe ebong folder-naming e subject ba topic onujayi thakbe.

## Directory Structure (ตัวอย่าง)
- semester-1/
    - oop/
    - basic-syntax/
    - file-io/
- semester-2/
    - data-structures/
    - algorithms/
- common-libs/ (utility classes)

## Naming & Conventions
- Prottek Java source file `.java` extension-e thakbe.
- Package use korle folder structure package-onujayi maintain korun (e.g., `com/yourname/subject`).
- Class name file name-er shathe mile thakbe (e.g., `HelloWorld.java` => `public class HelloWorld`).

## Compile & Run (command examples)
- Compile single file:
```
javac path/to/YourProgram.java
```
- Run compiled class (package na thakle):
```
java YourProgram
```
- Run class inside package:
```
java com.yourname.package.MainClass
```
- Compile whole folder:
```
find . -name "*.java" > sources.txt
javac @sources.txt
```

## Build Tools
- Maven/Gradle use korle respective `pom.xml` or `build.gradle` add korun.
- Simple projects-er jonno raw `javac`/`java` chale.

## How to add a new program
1. Notun folder create korun (subject/assignment name).
2. `.java` file add korun, README korte brief description diben.
3. Git e commit message-e subject/assignment mention korun.

## Running tests / sample inputs
- Prottek program-er sathe sample input/output file thakle `inputs/` folder e rakhun.
- Example:
```
java Main < inputs/sample1.txt
```

## Notes
- JDK 17+ recommend kora hoy (project-specific requirement README-te bole din).
- Konvension follow korle repo organized thakbe ebong semester-er shob programs shohoje khuja pawa jabe.

If you want, ami ekta template README for each subject generate kore dite pari.

