# I3 Typing Master v2026

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [System Requirements](#system-requirements)
- [Installation](#installation)
- [How to Run](#how-to-run)
- [Application Screens](#application-screens)
- [User Guide](#user-guide)
- [Technical Details](#technical-details)
- [Troubleshooting](#troubleshooting)
- [Contact & Support](#contact--support)

## Overview

**I3 Typing Master v2026** is a comprehensive typing speed and accuracy testing application designed to help users improve their typing skills. Whether you're a beginner learning proper typing techniques or an advanced typist aiming for professional speed, I3 Typing Master provides the tools you need to track progress and enhance performance.

The application features a user-friendly interface with multiple difficulty levels, real-time performance metrics, and detailed test results to help users monitor their improvement over time.

## Features

✓ **User Authentication**
  - Secure login and registration system
  - Password reset functionality
  
✓ **Typing Tests**
  - Multiple difficulty levels (Easy, Medium, Hard)
  - Real-time typing speed measurement (WPM - Words Per Minute)
  - Accuracy calculation and performance rating
  
✓ **Performance Tracking**
  - Detailed test results with metrics
  - Performance ratings (Excellent, Good, Average, Keep Practicing)
  - Comprehensive statistics

✓ **User-Friendly Interface**
  - Clean menu-driven navigation
  - Simple and intuitive controls
  - Clear instructions for each feature

## System Requirements

- **Java**: JDK 11 or higher (recommended JDK 25+)
- **Operating System**: Windows, macOS, or Linux
- **Memory**: Minimum 512MB RAM
- **Storage**: Minimum 50MB disk space

## Installation

### Prerequisites
Ensure you have Java JDK installed on your system:

1. Download Java from [Oracle's website](https://www.oracle.com/java/technologies/downloads/)
2. Install JDK and note the installation path
3. Set up JAVA_HOME environment variable (optional but recommended)

### Setup Steps

1. **Clone or Download the Repository**
2. **Compile the Java Files**
   Or use your IDE (VS Code, IntelliJ, Eclipse) to compile automatically.
3. **Verify Compilation**
   Ensure all `.class` files are generated in the `/bin` folder.

## How to Run

### Using Command Line

1. Open Command Prompt or PowerShell
2. Navigate to the project directory
3. Run the application:


### Using IDE

- **VS Code**: Click the "Run" button or press Ctrl+F5
- **IntelliJ IDEA**: Right-click Speed_test_LandingPage.java → Run
- **Eclipse**: Right-click project → Run As → Java Application

## Application Screens

### 1. Welcome Menu Screen
**Main landing page with options:**
- Login to existing account
- Register new account
- View About Us information
- Exit application

### 2. User Registering Screen
**Register a new account:**
- Enter desired username
- Create password
- Confirm password
- System validates matching passwords
- Account created upon success

### 3. User Reset Password Screen
**Reset forgotten password:**
- Enter username
- Verify identity
- Set new password
- Confirm new password
- Password updated successfully

### 4. User Login Screen
**Access existing account:**
- Enter username
- Enter password
- Login validation
- Access to typing test features upon success

### 5. List of Test Results for a User
**View performance history:**
- Display all completed typing tests
- Show metrics: WPM, Accuracy, Date
- Track improvement over time
- Filter by difficulty level

### 6. User Typing Test Screen
**Core typing test feature:**
- Select difficulty level (Easy, Medium, Hard)
- View sample text
- Type the provided text
- Automatic measurement of:
  - **WPM (Words Per Minute)**: How fast you type
  - **Accuracy**: Percentage of correctly typed characters
  - **Performance Rating**: Excellent/Good/Average/Keep Practicing
- View detailed results

### 7. About Us Screen
**Application information:**
- Product name and version
- Features overview
- Mission statement
- Target audience
- Developer information
- Support contact details
- Copyright information

### 8. README.md (This Document)
**Complete documentation:**
- Installation and setup instructions
- How to use the application
- Screen descriptions
- Troubleshooting guide
- Contact information

## User Guide

### Getting Started

1. **Launch the Application**
   - Run `java Speed_test_LandingPage`
   - Welcome menu will display

2. **Create an Account (First-Time Users)**
   - Select "Register" (Option 2)
   - Enter a username
   - Create a strong password
   - Confirm password
   - Account created successfully

3. **Login**
   - Select "Login" (Option 1)
   - Enter your username
   - Enter your password
   - Access main features

### Taking a Typing Test

1. **Start Test**
   - Select "Start Typing Test" from the Typing Test Menu
   
2. **Choose Difficulty**
   - Easy: Simple, short sentence
   - Medium: Programming-related text
   - Hard: Complex, longer passages

3. **Read & Prepare**
   - Read the sample text carefully
   - Press Enter when ready

4. **Type**
   - The timer starts automatically
   - Type the text as accurately and quickly as possible
   - Press Enter when finished

5. **View Results**
   - See your typing speed (WPM)
   - Check accuracy percentage
   - Review performance rating
   - View detailed character-by-character comparison

### Understanding Your Results

**WPM (Words Per Minute)**
- Calculated as: Total Words Typed ÷ Time in Minutes
- Higher is better
- Average typing speed: 40 WPM
- Professional typing speed: 60+ WPM

**Accuracy**
- Calculated as: (Correct Characters ÷ Total Characters) × 100
- Measured as a percentage
- Target: 95% or higher

**Performance Ratings**
- **Excellent**: 60+ WPM with 95%+ accuracy
- **Good**: 40+ WPM with 90%+ accuracy
- **Average**: 20+ WPM with 80%+ accuracy
- **Keep Practicing**: Below 20 WPM or below 80% accuracy

## Technical Details

### Project Structure

### Key Classes

**Speed_test_LandingPage**
- Main class with entry point
- Menu navigation
- Login and registration logic
- Application flow control

**User_Type_Screen**
- Typing test implementation
- Speed and accuracy calculation
- Performance rating system
- Multiple difficulty levels

**About_Us_Screen**
- Application information display
- Project details and features
- Support contact information

### Algorithm Details

**WPM Calculation**

**Accuracy Calculation**

**Performance Rating Logic**
- Excellent: WPM ≥ 60 AND Accuracy ≥ 95%
- Good: WPM ≥ 40 AND Accuracy ≥ 90%
- Average: WPM ≥ 20 AND Accuracy ≥ 80%
- Keep Practicing: Below thresholds

## Troubleshooting

### Issue: "Command not recognized: java"
**Solution:** 
- Java is not installed or not in system PATH
- Install JDK from oracle.com
- Add JAVA_HOME to environment variables

### Issue: "Cannot find symbol: class User_Type_Screen"
**Solution:**
- Ensure all .java files are in the same directory
- Recompile all files: `javac *.java`
- Check for typos in class names

### Issue: "No main method found"
**Solution:**
- Make sure you're running Speed_test_LandingPage
- Verify it has `public static void main(String[] args)` method

### Issue: InputMismatchException when typing
**Solution:**
- Use Scanner to read input line by line
- Ensure you press Enter after typing
- Close and reopen application if input hangs

### Issue: Test results not calculating correctly
**Solution:**
- Make sure typing speed test runs to completion
- Verify time measurement starts after pressing Enter
- Check that sample text matches what was typed

## Contact & Support

**Project Name:** I3 Typing Master v2026

**Support Email:** support@i3typingmaster.com

**Website:** www.i3typingmaster.com

**Developers:** I3 Development Team

**Copyright:** © 2026 I3 Typing Master. All rights reserved.

### Reporting Issues
If you encounter any bugs or have feature requests:
1. Document the issue in detail
2. Include your system information
3. Provide steps to reproduce
4. Email to: support@i3typingmaster.com

### Feedback
We welcome your feedback to improve I3 Typing Master:
- Feature suggestions
- User experience improvements
- Performance recommendations
- Bug reports

---

**Thank you for using I3 Typing Master v2026!**
Keep practicing and improve your typing skills every day.

Last Updated: March 23, 2026

   

   
