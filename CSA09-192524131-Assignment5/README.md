# CSA09-192524131-Assignment5
**Course:** Programming in Java (CSA09) | SIMATS Engineering  
**Course Outcome:** CO5: Java I/O Streams & JDBC  
**Assignment:** Assignment 5 – Data Persistence Engineering  
**Student Name:** ABISHEK J  
**Registration Number:** 192524131  
**Java Version:** OpenJDK 21 LTS (Hotspot 21.0.13)  
**Submission Repository Link:** https://github.com/ABISHEK192524131/CSA09-192524131-Assignment5  

---

## Repository Structure & Task Folders

Each task is maintained in an independent folder containing the Java source code, input configuration files, terminal execution logs, and output screenshots:

```
CSA09-192524131-Assignment5/
│
├── README.md                           <- Repository documentation & build guide
├── TaskA1/
│   ├── BusPassFileStore.java               <- Executable Java implementation
│   ├── output.txt                      <- Terminal standard output log
│   └── output_screenshot.png           <- High-resolution terminal execution screenshot
├── TaskA2/
│   ├── BufferedLineCounter.java               <- Executable Java implementation
│   ├── output.txt                      <- Terminal standard output log
│   └── output_screenshot.png           <- High-resolution terminal execution screenshot
├── TaskA3/
│   ├── BusPassDaoDemo.java               <- Executable Java implementation
│   ├── output.txt                      <- Terminal standard output log
│   └── output_screenshot.png           <- High-resolution terminal execution screenshot
├── TaskA4/
│   ├── SerializablePassDemo.java               <- Executable Java implementation
│   ├── output.txt                      <- Terminal standard output log
│   └── output_screenshot.png           <- High-resolution terminal execution screenshot
├── TaskA5/
│   ├── SecurityAuditDemo.java               <- Executable Java implementation
│   ├── output.txt                      <- Terminal standard output log
│   └── output_screenshot.png           <- High-resolution terminal execution screenshot
├── TaskB1/
│   ├── PassStore.java               <- Executable Java implementation
│   ├── output.txt                      <- Terminal standard output log
│   └── output_screenshot.png           <- High-resolution terminal execution screenshot
├── TaskB2/
│   ├── AdversarialTestHarness.java               <- Executable Java implementation
│   ├── output.txt                      <- Terminal standard output log
│   └── output_screenshot.png           <- High-resolution terminal execution screenshot
├── TaskB3/
│   ├── PassLoader.java               <- Executable Java implementation
│   ├── output.txt                      <- Terminal standard output log
│   └── output_screenshot.png           <- High-resolution terminal execution screenshot
├── TaskB4/
│   ├── MultiCampusMigration.java               <- Executable Java implementation
│   ├── output.txt                      <- Terminal standard output log
│   └── output_screenshot.png           <- High-resolution terminal execution screenshot
```

---

## Progressive Commit History

In accordance with university examination guidelines, all tasks were executed and committed progressively:

| Commit # | Task Folder | Commit Message | Verified Status |
|:---:|:---|:---|:---:|
| 1 | `TaskA1` | `feat(TaskA1): Implement File Format Design` | PASSED |
| 2 | `TaskA2` | `feat(TaskA2): Implement Buffered I/O Optimization` | PASSED |
| 3 | `TaskA3` | `feat(TaskA3): Implement DAO Pattern` | PASSED |
| 4 | `TaskA4` | `feat(TaskA4): Implement Serialization & Transient` | PASSED |
| 5 | `TaskA5` | `feat(TaskA5): Implement SQL Injection Security` | PASSED |
| 6 | `TaskB1` | `feat(TaskB1): Implement Instrumented File Store` | PASSED |
| 7 | `TaskB2` | `feat(TaskB2): Implement Adversarial Input Engineering` | PASSED |
| 8 | `TaskB3` | `feat(TaskB3): Implement JDBC Batching & Rollback` | PASSED |
| 9 | `TaskB4` | `feat(TaskB4): Implement 12-Campus Production Decision` | PASSED |

---

## Compilation and Execution Guide

### Prerequisites
- JDK 17+ or OpenJDK 21 LTS installed and added to `PATH`.

### Steps to Compile and Run
Navigate into any task directory and compile using `javac`:
```bash
cd <TaskFolder>
javac <SourceFile>.java
java <MainClass>
```

---
*Verified and submitted by ABISHEK J (Reg No: 192524131).*
