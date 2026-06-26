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



### Day 3 — CareerProject Model

Today, I added the `CareerProject` class, which connects multiple tasks together under one project.

The main idea was to move from simple individual objects to a more realistic structure where a project can contain a list of tasks. I used `List<CareerTask>` to store the tasks inside the project, and added methods to add new tasks, count all tasks, count completed tasks, and calculate the project progress automatically.

I also tested the class inside `Main.java` by creating a CareerOS project, adding three tasks to it, completing two of them, and printing a project summary. The progress was calculated based on the completed tasks, not written manually.

What I practiced today:

* Using `ArrayList` and `List`
* Storing objects inside another object
* Looping through a list of tasks
* Counting completed tasks
* Calculating progress from project data
* Testing class behavior in `Main.java`
* Git workflow: add, commit, and push



### Day 4 — UserProfile Model

Today, I added the `UserProfile` class to represent the user inside CareerOS.

The goal of this step was to connect the previous parts of the system together. A user now has a name, a career goal, a list of skills, and a list of career projects. This made the project structure feel more complete because CareerOS can now represent a real user with their learning progress and projects.

I also practiced the `List` concept again by using `List<Skill>` and `List<CareerProject>`. This helped reinforce the idea that one object can contain a collection of other objects.

I tested the class inside `Main.java` by creating a user profile, adding a skill, adding a project, and printing a simple user summary.

What I practiced today:

* Creating a user profile model
* Using `List<Skill>`
* Using `List<CareerProject>`
* Adding objects into lists
* Connecting multiple classes together
* Testing the full structure in `Main.java`
* Git workflow: add, commit, and push





### Day 5 — CareerDashboard

Today, I added the first simple dashboard for CareerOS.

Before creating the dashboard, I improved the `UserProfile` class so it can calculate useful summary data across all projects, such as total tasks, completed tasks, and overall progress. This made the user profile more meaningful because it can now summarize the user's learning progress instead of only storing skills and projects.

I also created the `CareerDashboard` class, which takes a `UserProfile` and displays a clean dashboard summary. This helped separate the idea of storing data from the idea of presenting it.

I tested everything inside `Main.java` by creating a user profile, adding a skill and a project, then printing the dashboard.

What I practiced today:

* Aggregating data from multiple objects
* Looping through a list of projects
* Calculating total tasks across projects
* Calculating completed tasks across projects
* Calculating overall progress
* Separating data/model logic from display/dashboard logic
* Testing the dashboard in `Main.java`
* Git workflow: add, commit, and push
