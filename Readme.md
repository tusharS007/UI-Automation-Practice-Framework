# UI Automation Framework (Selenium + TestNG)

## Project Overview

This project is a **UI Automation Framework** built using:

* **Java**
* **Selenium WebDriver**
* **TestNG**
* **Maven**

It follows industry best practices like:

* Page Object Model (POM)
* Data-driven testing (CSV, Excel, JSON)
* Retry mechanism for flaky tests
* Logging & reporting

---

## 🏗️ Project Structure

```
├── config/              → Environment & config files
├── logs/                → Execution logs
├── screenshots/         → Failure screenshots
├── src/
│   ├── main/            → (Reserved for future use)
│   └── test/
│       ├── java/
│       │   ├── constant/    → Enums (Browser, Env)
│       │   ├── ui/
│       │   │   ├── pages/   → Page classes (POM)
│       │   │   ├── tests/   → Test classes
│       │   │   ├── dataprovider/ → Test data providers
│       │   │   ├── listeners/ → TestNG listeners
│       │   │   ├── pojo/    → Data models
│       │   └── utility/     → Reusable utilities
│       └── resources/       → log4j2 config
├── testData/            → CSV, Excel, JSON test data
├── testng.xml           → Test suite configuration
├── pom.xml              → Maven dependencies
```

---

## ⚙️ Features

✅ Page Object Model (POM)
✅ Data-driven testing (CSV, Excel, JSON)
✅ Retry mechanism for failed tests
✅ Logging using Log4j2
✅ Screenshot capture on failure
✅ Extent Reports integration
✅ Environment-based configuration

---

## 🔧 Prerequisites

Make sure you have installed:

* Java (JDK 11 or above)
* Maven
* Eclipse / IntelliJ
* Chrome Browser

---

## ▶️ How to Run Tests

### 🔹 Using Maven

```bash
mvn clean test
mvn clean test -Dbrowser="chrome" -DisLmabdaTest="false" -DisHeadless=true
```

### 🔹 Using TestNG XML

* Right-click `testng.xml`
* Run as → TestNG Suite

---

## 🌐 Configuration

### config.json

Contains:

* Base URL
* Browser type
* Environment details

### QA.properties

Used for environment-specific configurations.

---

## 📊 Test Data

Located in `/testData`:

* `loginData.csv`
* `LoginData.xlsx`
* `LoginData.json`

Used for **data-driven testing**.

---

## 📸 Reports & Logs

| Type          | Location              |
| ------------- | --------------------- |
| Extent Report | `report.html`         |
| TestNG Report | `test-output/`        |
| Logs          | `logs/automation.log` |
| Screenshots   | `screenshots/`        |

---

## 🔁 Retry Mechanism

Implemented using:

* `MyRetryAnalyser.java`

Automatically retries failed test cases.

---

## 🧪 Test Design

* Follows **Page Object Model**
* Separation of:

  * Test logic
  * Page actions
  * Test data

---

## 🧹 Git Ignore

The following are excluded:

```
/target/
/test-output/
/logs/
/screenshots/
*.log
*.class
```

---

## 🚀 Future Enhancements

* CI/CD integration (GitHub Actions / Jenkins)
* Docker support
* Cross-browser execution (Grid / Cloud)

---

## 👨‍💻 Author

Tushar
