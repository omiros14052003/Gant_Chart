[comment]: <> (This file is part of the Software Development Course in the Faculty of Computer Science and Engineering, Ioannina, Greece.)
[comment]: <> (It is licensed under the Academic Free License version 3.0.)
[comment]: <> (http://www.gnu.org/licenses/)
[comment]: <> (Copyright (C) 2022-2023, University of Ioannina.)

# Software Development Course

This project contains the source code of the Software Development Course in the Faculty of Computer Science and Engineering, Ioannina, Greece.

## What is this repository for?

This project is a Gantt Chart application. The project is configured to use the Java Swing library for the GUI. The project is also configured to use the [JUnit](https://junit.org/junit4/) library for unit testing.

### Prerequisites

- [Java-SE 1.8](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)
- [JUnit 4](https://junit.org/junit4/)

### Who do I talk to?

- [Charilaos Chatzidimitriou](mailto: cs05387@uoi.gr)
- [Omiros Chatziiordanis](mailto: cs05388@uoi.gr)
- [Georgios Dimoudis](mailto: cs05212@uoi.gr)

### License

This project is licensed under the Academic Free License version 3.0. See the [LICENSE](LICENSE) file for details.

### Supervisor

- [Dr. Panagiotis Vasileiadis](mailto: pvassil@cs.uoi.gr)

## Project Structure

The project is structured as follows:

- `src`: Contains the source code of the project
- `test`: Contains the unit tests of the project
- `bin`: Contains the compiled classes of the project
- `lib`: Contains the libraries of the project
- `doc`: Contains the documentation of the project
- `LICENSE`: Contains the license of the project
- `README.md`: Contains the description of the project

## Project Description

The project is a Simple Gantt Chart application. The application is able to read a Gantt Chart from a file and display it. The application is also able to save a Gantt Chart to a file. 

The project can take files through the GUI in any folder possible, but it contains some example files in the resources folders.

The application is able to display, save and read the following information:

- The name of the project
- The start date of the project
- The end date of the project
- The duration of the project
- The tasks of the project
- The start date of each task
- The end date of each task
- The duration of each task
- The dependencies of each task

The application is able to create a report in the following formats:

- HTML
- MD
- TEXT