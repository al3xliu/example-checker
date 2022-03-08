# Template for a checker built on the Checker Framework

This is a template for a pluggable type-checker built on the Checker Framework.

### How to use this template to build your own typechecker

The example commands are for a
checker to verify character encoding, such as UTF-8.

0. Copy this repository's contents by clicking the
   "Use this template" green button on its Github page.  Don't make a fork.

1. Choose a name for your type system (e.g., "Character Encoding Checker"),
and change every occurrence of "Example Encoding" to "Character Encoding".
This command does so:

```
find . -name .git -prune -o -type f -exec sed -i -e 's/Example Encoding/Character Encoding/g' {} \;
```

2. Choose a name for the implementation class (e.g., "CharEncoding"), and
change every occurrence of "ExampleEncoding" to "CharEncoding".
This includes in file names (rename several files including
`src/main/java/org/checkerframework/checker/exampleencoding/ExampleEncodingChecker.java`).
These commands make the changes:

```
find . -name .git -prune -o -type f -exec sed -i -e 's/ExampleEncoding/CharEncoding/g' {} \;
find . -name '*ExampleEncoding*' -exec bash -c 'mv $0 ${0/ExampleEncoding/CharEncoding}' {} \;
```

3. Choose a directory/package name (e.g., "charencoding"), and
Change every occurrence of "exampleencoding" to "charencoding".
  This includes in file names (for example, rename directories
  `src/main/java/org/checkerframework/checker/exampleencoding/` and `tests/exampleencoding/`).
These commands make the changes:

```
find . -name .git -prune -o -type f -exec sed -i -e 's/exampleencoding/charencoding/g' {} \;
for file in $(find . -name '*exampleencoding*'); do mv $file ${file/exampleencoding/charencoding}; done
```

4. Change the groupId of the `publishing` block in the `build.gradle` file
  to an organization you belong to that can publish to Maven
  Central. Change the name of the package containing the source (currently
  `org.checkerframework.checker.exampleencoding`) so that it reflects your
  organization's naming standards. Replace all instances of
  `org.checkerframework.checker.exampleencoding` and
  `org/checkerframework/checker/exampleencoding` with whatever name you have chosen.
  These commands make the changes within files but do not rename directories:

```
find . -type f -exec sed -i -e 's/org\.checkerframework\.checker\.exampleencoding/my.organization.exampleencoding/g' {} \;
find . -type f -exec sed -i -e 's:org/checkerframework/checker/exampleencoding:my/organization/exampleencoding:g' {} \;
```


5. Change the copyright info in the `LICENSE` file.  You may change the license as well, if you wish.

6. Follow the ["How to create a new checker"
  instructions](https://checkerframework.org/manual/#creating-a-checker)
  in the Checker Framework Manual.
  While following the instructions, you should change all occurrences of TODO
  (and probably all occurrences of "Bottom") throughout the repository, and
  modified this `README.md` file so that it describes your checker.

7. Remove all text from the top of this `README.md` file, through this line.


# Example Encoding Checker

A common problem when programming is TODO.
This results in a run-time exception.

The Example Encoding Checker guarantees, at compile time, that your code will
not suffer that run-time exception.


## How to run the checker

First, publish the checker to your local Maven repository by running
`./gradlew publishToMavenLocal` in this repository.

Then, if you use Gradle, add the following to the `build.gradle` file in
the project you wish to type-check (using Maven is similar):

```
repositories {
    mavenLocal()
    mavenCentral()
}
dependencies {
    annotationProcessor 'org.checkerframework:exampleencoding-checker:0.1-SNAPSHOT'
}
```

Now, when you build your project, the Example Encoding Checker will also run,
informing you of any potential errors related to TODO.


## How to specify your code

At compile time, the Example EncodingChecker estimates what values the program
may compute at run time.  It issues a warning if the program may TODO.
It works via a technique called pluggable typechecking.

You need to specify the contracts of methods and fields in your code --
that is, their requirements and their guarantees.  The Example EncodingChecker
ensures that your code is consistent with the contracts, and that the
contracts guarantee that TODO.

You specify your code by writing *qualifiers* such as `@ExampleEncodingBottom`
on types, to indicate more precisely what values the type represents.
Here are the type qualifiers that are supported by the Example EncodingChecker:

`@ExampleEncodingUnknown`:
The value might or might not be TODO. It is not safe to use for TODO.
This is the default type, so programmers usually do not need to write it.

`@ExampleEncodingBottom`:
The value is definitely TODO. It is safe to use for TODO.


## How to build the checker

Run these commands from the top-level directory.

`./gradlew build`: build the checker

`./gradlew publishToMavenLocal`: publish the checker to your local Maven repository.
This is useful for testing before you publish it elsewhere, such as to Maven Central.


## More information

The Example Encoding Checker is built upon the Checker Framework.  Please see
the [Checker Framework Manual](https://checkerframework.org/manual/) for
more information about using pluggable type-checkers, including this one.
