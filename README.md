# 📘 Student Grade Calculator – Java

A simple command-line Java application that helps students calculate their **total marks**, **average percentage**, and **grade** based on inputted subject marks.

---

## 📌 Features

* Takes marks input for multiple subjects
* Validates each input to ensure it’s between `0` and `100`
* Calculates:

  * Total Marks
  * Average Percentage
  * Final Grade
* Grades are assigned based on average percentage:

  | Percentage Range | Grade |
  | ---------------- | ----- |
  | 90 – 100         | O     |
  | 80 – 89.99       | E     |
  | 70 – 79.99       | A     |
  | 60 – 69.99       | B     |
  | 50 – 59.99       | C     |
  | Below 50         | D     |

---

## 💪 Technologies Used

* **Java** – Standard Java syntax and logic
* **Scanner Class** – For user input

---

## 🚀 How to Run

1. **Compile the Program**
   Open terminal and run:

   ```bash
   javac StudentGradeCalculator.java
   ```

2. **Run the Program**

   ```bash
   java StudentGradeCalculator
   ```

3. **Input Marks**

   * Enter the number of subjects
   * Enter marks (0–100) for each subject when prompted

---

## 📌 Sample Output

```
Enter the number of subjects: 3
Enter marks for subject 1 (out of 100): 85
Enter marks for subject 2 (out of 100): 92
Enter marks for subject 3 (out of 100): 78

<------- Result ------->
Total Marks: 255 / 300
Average Percentage: 85.00%
Grade: E
```

---

## 📋 Validations

* Ensures input marks are within the valid range (0–100)
* Prompts again if invalid input is provided

---

## 📁 File Structure

```
📂 StudentGradeCalculator/
🔹 StudentGradeCalculator.java
🔹 README.md
```

---

## ✍️ Author

**Aman Mishra**
Feel free to connect on [LinkedIn](https://www.linkedin.com/) or reach out for improvements or collaborations!
