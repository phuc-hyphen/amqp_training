# Template for Maven based exercises

Build CI:
[![workflow](https://github.com/phuc-hyphen/ampq_training/actions/workflows/build.yml/badge.svg)](https://github.com/phuc-hyphen/ampq_training/actions/workflows/build.yml)

Code coverage:
[![codecov](https://codecov.io/gh/phuc-hyphen/ampq_training/branch/main/graph/badge.svg)](https://codecov.io/gh/phuc-hyphen/ampq_training)


## Build the project

The project requires a JDK 17 (recommended distribution is Temurin from [Adoptium](https://adoptium.net/)).

From there, simply use the Maven wrapper to launch all tests (unit tests & integration tests).

`./mvnw verify`
