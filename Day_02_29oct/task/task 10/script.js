const addStudent = document.getElementById('addStudent');
const table = document.getElementById('tableBody');
const localData = JSON.parse(localStorage.getItem("studentData")) || [];

localData.forEach(student => studentEntry(student));

function studentEntry(studentData) {
    const studentName = studentData.name;
    const [hindiMarks, englishMarks, mathMarks, scienceMarks, ssMarks, totalMarks, average] = studentData.marks;

    const newRow = document.createElement("tr");

    newRow.innerHTML = `
        <td>${studentName}</td>
        <td>${hindiMarks}</td>
        <td>${englishMarks}</td>
        <td>${mathMarks}</td>
        <td>${scienceMarks}</td>
        <td>${ssMarks}</td>
        <td>${totalMarks}</td>
        <td>${average}</td>
    `;

    table.appendChild(newRow);
}

addStudent.addEventListener('click', () => {
    const studentName = prompt("Enter the name of student");
    if (!studentName) {
        alert("Student name cannot be empty!");
        return;
    }

    function getMarks(subject) {
        let marks = prompt(`Enter marks for ${subject} (0–100):`);
        while (marks === null || isNaN(marks) || marks < 0 || marks > 100) {
            alert("Invalid input! Please enter a number between 0 and 100.");
            marks = prompt(`Enter marks for ${subject} (0–100):`);
        }
        return Number(marks);
    }

    const hindiMarks = getMarks("Hindi");
    const englishMarks = getMarks("English");
    const mathMarks = getMarks("Math");
    const scienceMarks = getMarks("Science");
    const ssMarks = getMarks("Social Science");

    const totalMarks = hindiMarks + englishMarks + mathMarks + scienceMarks + ssMarks;
    const average = (totalMarks / 5).toFixed(2);

    const studentData = {
        name: studentName,
        marks: [hindiMarks, englishMarks, mathMarks, scienceMarks, ssMarks, totalMarks, average]
    };

    localData.push(studentData);
    localStorage.setItem("studentData", JSON.stringify(localData));

    studentEntry(studentData);
});
