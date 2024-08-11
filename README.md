# 🧑‍💼 Employee Management System

## Table of Contents
1. [Overview](#overview)
2. [Project Structure](#project-structure)
3. [API Reference](#api-reference)
4. [Prerequisites](#prerequisites)
5. [Installation](#installation)
6. [Deployment](#deployment)
7. [Demo](#demo)
8. [Documentation](#documentation)
9. [Related Projects](#related-projects)
10. [Resources](#resources)
11. [Acknowledgements](#acknowledgements)
12. [Authors](#authors)
13. [Badges](#badges)
14. [Appendix](#appendix)

## Overview

Welcome to the **Employee Management System**! This Java-based application helps you efficiently manage employee records. With this system, you can:

- **Add New Employees**
- **View Employee Details**
- **Remove Employees**
- **Update Employee Information**
- **Navigate through Login and Home Screens**

Integrated with a MySQL database, this system ensures seamless data management for all your employee-related needs.

## Project Structure

The project is organized into the following key folders:

1. **`employee.management.system`**: Contains Java classes for core functionalities:
    - **`AddEmployee`**: Interface for adding new employee records.
    - **`Home`**: Main interface displayed after login.
    - **`Login`**: User authentication screen.
    - **`RemoveEmployee`**: Functionality to remove employee records.
    - **`Splash`**: Initial splash screen.
    - **`Conn`**: Handles database connections.
    - **`UpdateEmployee`**: Interface for updating employee records.
    - **`ViewEmployee`**: Displays details of employees.

2. **`Icons`**: Includes JPG files for the application's graphical assets.

## API Reference

Leverage the following Java packages and classes for key functionalities:

- **`com.toedter.calendar.JDateChooser`**: For date selection.
- **`javax.swing`**: For GUI components.
- **`javax.swing.text.View`**: For text display in the GUI.
- **`java.awt`**: For graphics and basic event handling.
- **`java.awt.event`**: For managing user interactions.

## Prerequisites

Before you begin, ensure you have the following installed and set up:

- **Java Development Kit (JDK)**: Version 8 or higher.
- **Java IDE**: Such as IntelliJ IDEA or Eclipse.
- **MySQL Database Server**: Required for database management.

Additionally, ensure the following JAR files are available:

- **`rs2xml.jar`**: For handling and displaying data in tables.
- **`mysql-connector-java-8.0.28.jar`**: For MySQL database connectivity.
- **`jcalendar-tz-1.3.3-4.jar`**: For enhanced calendar functionality.

These components are essential for compiling, running, and fully utilizing the Employee Management System.


## Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Rishy-09/Employee-Management-System.git

### 2. Open the Project

Launch your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse) and open the cloned project directory.

### 3. Verify the 'Icons' Folder

Ensure that the `Icons` folder is in the root directory of the project, containing the necessary image assets.

### 4. Add Required JAR Files

To ensure proper functionality, integrate the following JAR files into your project’s build path:

- **`rs2xml.jar`**: For handling and displaying data in tables.
- **`mysql-connector-java-8.0.28.jar`**: For MySQL database connectivity.
- **`jcalendar-tz-1.3.3-4.jar`**: For enhanced calendar functionality.

**Steps to add JAR files:**

1. Right-click on your project in the IDE.
2. Navigate to `Build Path` > `Configure Build Path`.
3. Go to the `Libraries` tab and click `Add External JARs`.
4. Select the JAR files and apply the changes.

## Deployment

To deploy the Employee Management System:

1. **Compile and Build** the project using your Java IDE.
2. **Run the `Home` Class** to start the application and explore its features.

## Resources

The following resources are available for the Employee Management System project:

- **JAR Files**:
<br></br>
    - **`rs2xml.jar`**: For handling and displaying data in tables.
      <br></br>
    - **`mysql-connector-java-8.0.28.jar`**: For MySQL database connectivity.<br></br>
    - **`jcalendar-tz-1.3.3-4.jar`**: For enhanced calendar functionality.


- **Icons**: Image assets used in the application.


- **Database Commands**:
    - **`database.txt`**: Contains MySQL commands required to set up the database.
<br></br>

- **Project Files**:
    - Contains documentation and source code files.

You can download all these resources from the following [Google Drive folder](https://drive.google.com/drive/folders/15S8vw__vVpaZvbiXPykTD1pVRiCloaEq).

## Demo

Experience the application in action through the following YouTube playlist:

- 📹 [Employee Management System Tutorial](https://www.youtube.com/watch?v=IeQ7t1P6_0A&list=PL_6klLfS1WqEfSqteinwGhs87Xhxkgiwn)

## Documentation

For detailed documentation of the Employee Management System, including JavaDoc comments and other project-related information, please refer to the source code and documentation files included in the project directory.

- **Documentation**: Available in the project files within the [Google Drive folder](https://drive.google.com/drive/folders/15S8vw__vVpaZvbiXPykTD1pVRiCloaEq).

## Related Projects

Explore other related projects developed by the same author:

- **[Hotel Management System](https://github.com/Rishy-09/Hotel-Management-System)**: A comprehensive system for managing hotel operations.
- **[University Management System](https://github.com/Rishy-09/University-Management-System)**: A system designed for managing university operations and student information.
- **[Travel Management System](https://github.com/Rishy-09/Travel-Management-System)**: A system for handling travel bookings and hotel reservations.

These projects offer similar functionality and may provide additional insights or complementary features.

## Acknowledgements

Special thanks to the following resources that provided inspiration and guidance for this project:

- 📹 **[Employee Management System Tutorial](https://www.youtube.com/watch?v=IeQ7t1P6_0A&list=PL_6klLfS1WqEfSqteinwGhs87Xhxkgiwn)**: This YouTube playlist offers detailed tutorials and insights into developing an Employee Management System, which greatly influenced the development of this project.

Your support and contributions are greatly appreciated!

## Authors

- **[@Rishy-09](https://github.com/Rishy-09)**: Main developer of the Employee Management System project.
- Special thanks to the open-source community for their support and contributions.

Your contributions and feedback have been invaluable!

## Badges

![Java](https://img.shields.io/badge/Java-11-blue)
![MySQL](https://img.shields.io/badge/MySQL-8.0.28-blue)
![JCalendar](https://img.shields.io/badge/JCalendar-1.3.3--4-blue)

## Appendix

The **Appendix** section provides additional information and resources related to the project:

- **Project Files**: Includes the core Java files and documentation related to the Employee Management System.
- **Icons**: Contains JPEG files used for the application's graphical user interface.
- **JAR Files**: Essential libraries for project functionality:
    - `rs2xml.jar`
    - `mysql-connector-java-8.0.28.jar`
    - `jcalendar-tz-1.3.3-4.jar`
- **Database Commands**: `database.txt` contains SQL commands for setting up the MySQL database.
