package com.bridgelabz.universitysystem.src;

public class UniversitySystem {
    public static void main(String[] args) {
        Course<ExamCourse> math = new Course<>("Mathematics", new ExamCourse());
        Course<AssignmentCourse> literature = new Course<>("Literature", new AssignmentCourse());
        Course<ResearchCourse> physics = new Course<>("Physics Research", new ResearchCourse());

        CourseCatalog catalog = new CourseCatalog();
        catalog.addCourse(math);
        catalog.addCourse(literature);
        catalog.addCourse(physics);

        System.out.println("Available Courses:");
        catalog.displayCourses();
    }
}
//Available Courses:
//Course{name='Mathematics', type=Exam-Based}
//Course{name='Literature', type=Assignment-Based}
//Course{name='Physics Research', type=Research-Based}

