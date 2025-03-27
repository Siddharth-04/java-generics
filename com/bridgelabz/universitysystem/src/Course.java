package com.bridgelabz.universitysystem.src;

class Course<T extends CourseType> {
    private String name;
    private T courseType;

    public Course(String name, T courseType) {
        this.name = name;
        this.courseType = courseType;
    }

    public String getName() { return name; }
    public T getCourseType() { return courseType; }

    @Override
    public String toString() {
        return "Course{" + "name='" + name + '\'' + ", type=" + courseType + '}';
    }
}

