use fil_db1;
CREATE TABLE Faculty(
    id INT PRIMARY KEY,
    name TEXT,
    email VARCHAR(50),
    pass VARCHAR(20),
    mobile VARCHAR(10)
);

CREATE TABLE Course1(
    id INT PRIMARY KEY,
    name TEXT,
    duration VARCHAR(10)
);

CREATE TABLE Faculty_Courses(
    faculty_id INT,
    course_id INT,
    PRIMARY KEY (faculty_id, course_id),
    FOREIGN KEY (faculty_id) REFERENCES Faculty(id) ON DELETE CASCADE,
    FOREIGN KEY (course_id) REFERENCES Course1(id) ON DELETE CASCADE
);

