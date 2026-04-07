# Problem_Solving_With_Java

A collection of small Java example programs and exercises demonstrating basic Java concepts (I/O, control flow, classes, exceptions, collections, date/time, and simple algorithms).

All source files are in the `src/` directory and are single-class Java programs intended to be compiled and run individually.

## Prerequisites

- Java Development Kit (JDK) 8 or later installed and `javac`/`java` available on PATH.

## Build

Compile all source files into the `out/` directory (recommended):

```bash
mkdir -p out
javac -d out src/*.java
```

This compiles every `.java` file in `src/` and places `.class` files under `out/`.

## Run

To run a compiled program, set the classpath to `out` and run the class by name. Example:

```bash
java -cp out Palindrome
```

Alternatively compile & run a single file in-place (quick, but puts class files next to sources):

```bash
javac src/Palindrome.java && java -cp src Palindrome
```

## Programs (in `src/`)

- `BankTransactionSystem.java` — Simple bank menu: deposit, withdraw, and balance check (console input).
- `CubeStaticMethod.java` — Static method example to compute the cube of a number.
- `DateTimeFormatterExample.java` — Parse and reformat a date/time string using `java.time`.
- `DistanceBetweenTwoPoints.java` — Compute Euclidean distance for pairs of points.
- `GivenSquareMatrix.java` — Read a square matrix, print it and compute its trace.
- `InsufficientBalanceExceptionDemo.java` — Custom exception example for insufficient balance.
- `LibraryBookManagement.java` — Abstract class example and fine calculation for textbooks and reference books.
- `Palindrome.java` — Check whether a string is a palindrome (prints `Yes` or `No`).
- `SixSidedDiceRoll.java` — Roll two dice repeatedly until the sum is 7; counts tries.
- `StarsNumbersPattern.java` — Print simple star/number patterns.
- `StringCharacterstics.java` — Count lowercase, uppercase, digits and special characters in a string.
- `StringConcatenation.java` — Basic string operations: lengths, concatenation, uppercase.
- `StringMatching.java` — Check string equality against a fixed word (`Dhoni`).

## Examples

Palindrome (sample run):

```bash
# compile once
mkdir -p out
javac -d out src/Palindrome.java
# run and provide input "racecar"
echo "racecar" | java -cp out Palindrome
# Expected output:
# Yes
```

BankTransactionSystem (quick run):

```bash
# compile
javac -d out src/BankTransactionSystem.java
# run and interact (example inputs shown as lines):
# Enter initial balance
# 100
# 1    (choice: deposit)
# 50   (deposit amount)
# Expected printed updated balance: Updated Balance: 150.0
java -cp out BankTransactionSystem
```

Note: these programs read from standard input; you can pipe input or type interactively.

## Contributing

Contributions are welcome. Simple guidelines:

- Keep each example small and focused.
- Add tests or sample inputs where useful.
- Create a branch and open a pull request describing the change.

## License

This repository is provided under the MIT License. See `LICENSE` (or add one) for full terms.

---

If you prefer a different license (Apache-2.0, GPL-3.0, etc.) or want additional examples in the README, tell me and I will update it.
