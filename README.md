# CareerOS



## Progress Log

### Day 1 — Skill Model

Today, I applied my Java and OOP knowledge to create the first building block of CareerOS: the `Skill` class.

The `Skill` class represents a skill object that stores the skill name and progress percentage. I focused on handling edge cases by adding validation to make sure the progress value cannot be less than 0 or greater than 100.

I also created a `Main` class to test the `Skill` class, compiled and ran the program, fixed basic file and compilation issues, and committed and pushed the changes to GitHub.

What I practiced today:

* Java classes and objects
* Constructors and private fields
* Basic validation
* Method naming and clean code
* Compiling and running Java files
* Git workflow: status, add, commit, and push


### Day 2 — Task Status and CareerTask Model

Today, I continued building the basic Java domain model for CareerOS by adding task-related logic.

I created a `TaskStatus` enum to define the allowed task states: `TODO`, `IN_PROGRESS`, and `DONE`. This helps prevent invalid or inconsistent task status values.

I also created a `CareerTask` class that represents a task inside CareerOS. Each task has a title and a status. New tasks start with the `TODO` status by default, and the task can move to `IN_PROGRESS` using `start()` and to `DONE` using `complete()`.

I tested the task lifecycle inside `Main.java` by moving a task through its statuses and checking whether it was completed using `isDone()`.

What I practiced today:

* Java enums
* Using enum values inside a class
* Modeling task state
* Writing methods that change object state
* Returning boolean values with `isDone()`
* Testing object behavior in `Main.java`
* Git workflow: add, commit, and push
