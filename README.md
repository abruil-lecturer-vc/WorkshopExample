# Running Motivation App

The **Running Motivation App** is a simple Android application designed to track your daily running progress and keep you motivated. It allows you to record your morning and afternoon runs, take notes, calculate the average distance, and view a detailed summary of your progress.

---

## **Features**
- **Splash Screen**: A welcoming screen with options to start the app or exit.
- **Main Screen**:
  - Input and save your morning and afternoon run distances.
  - Add notes for each entry.
  - Calculate the average running distance.
  - Navigate to a detailed summary of all recorded runs.
- **Detailed View Screen**: View a complete list of all your running data, including distances and notes.

---

## **Screenshots**
### 1. **Splash Screen**
![Splash Screen](screenshots/splash_screen.png)

### 2. **Main Screen**
![Main Screen](screenshots/main_screen.png)

### 3. **Detailed View Screen**
![Detailed View Screen](screenshots/detailed_view_screen.png)

---

## **Getting Started**

### **Prerequisites**
- Android Studio (latest version recommended).
- Basic knowledge of Android development using Kotlin.

### **Installation**
1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/RunningMotivationApp.git
   ```
2. Open the project in **Android Studio**.
3. Build the project to download dependencies and resolve issues.
4. Run the app on an emulator or a physical Android device.

---

## **Usage**
1. **Splash Screen**:
   - Press **Start** to proceed to the main screen.
   - Press **Exit** to close the app.
2. **Main Screen**:
   - Enter your morning and afternoon run distances and any notes.
   - Press **Submit** to save the data.
   - Press **Clear** to reset the input fields.
   - Press **Calculate Average** to view the average distance.
   - Press **View Details** to see a summary of all runs.
3. **Detailed View Screen**:
   - View all recorded running data in a scrollable list.
   - Press **Back to Main** to return to the main screen.

---

## **Folder Structure**
```
RunningMotivationApp/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/runningmotivationapp/
│   │   │   │   ├── SplashActivity.kt
│   │   │   │   ├── MainActivity.kt
│   │   │   │   └── DetailViewActivity.kt
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   ├── activity_splash.xml
│   │   │   │   │   ├── activity_main.xml
│   │   │   │   │   └── activity_detail_view.xml
│   │   │   │   ├── drawable/
│   │   │   │   │   └── ic_launcher_foreground.xml
│   │   │   │   └── values/
│   │   │   │       └── strings.xml
│   │   │   └── AndroidManifest.xml
```

## **Pseudocode**

#### **Splash Screen**
1. Display app name, student name, and student number.
2. Show logo.
3. Provide two buttons:
   - **Start**: Navigate to the Main Screen.
   - **Exit**: Close the app.
4. Wait for user interaction.

#### **Main Screen**
1. Display input fields:
   - Morning run distance.
   - Afternoon run distance.
   - Notes.
2. Show buttons:
   - **Submit**:
     1. Validate inputs.
     2. Save input data in arrays:
        - Morning distances array.
        - Afternoon distances array.
        - Notes array.
     3. Clear input fields.
   - **Clear**:
     - Reset input fields to empty.
   - **Calculate Average**:
     1. Loop through morning and afternoon distances arrays.
     2. Compute the total distance.
     3. Divide the total distance by the number of days to get the average.
     4. Display the average distance.
   - **View Details**:
     - Navigate to the Detailed View Screen.
3. Handle invalid inputs by displaying an error message.


#### **Detailed View Screen**
1. Retrieve and display:
   - Day-wise morning run distance.
   - Day-wise afternoon run distance.
   - Notes for each day.
2. Provide navigation:
   - **Back**: Return to the Main Screen.


#### **Data Handling**
1. Use **parallel arrays**:
   - Morning distances: `morningRuns[]`.
   - Afternoon distances: `afternoonRuns[]`.
   - Notes: `notes[]`.
2. Use **loops**:
   - To iterate through arrays and compute the weekly average distance.
   - To display detailed running data.


#### **Navigation Logic**
- **Splash Screen**:
  - If "Start" is clicked, open Main Screen.
  - If "Exit" is clicked, close the app.
- **Main Screen**:
  - If "View Details" is clicked, open Detailed View Screen.
- **Detailed View Screen**:
  - If "Back" is clicked, return to Main Screen.


#### **Error Handling**
1. For input fields:
   - If morning or afternoon distance is empty or not a number, display an error message.
2. For calculating average:
   - Ensure arrays are not empty before calculating.
3. For navigation:
   - Prevent navigation if critical data is missing.

---

## **Technologies Used**
- **Kotlin**: Programming language for Android development.
- **Android SDK**: Tools and libraries for building Android applications.
- **Android Studio**: Integrated development environment (IDE) for Android.

---

## **Contributing**
Contributions, issues, and feature requests are welcome! Feel free to fork the repository and submit a pull request.

---

## **License**
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## **Contact**
- **Author**: [Amber Bruil]
- **Email**: abruil@varsitycollege.co.za
- **GitHub**: [Your GitHub Profile](https://github.com/abruil-lecturer-vc)

---
