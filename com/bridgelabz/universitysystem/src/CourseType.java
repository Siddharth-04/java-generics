package com.bridgelabz.universitysystem.src;

abstract class CourseType {
    private String evaluationMethod;

    public CourseType(String evaluationMethod) {
        this.evaluationMethod = evaluationMethod;
    }

    public String getEvaluationMethod() {
        return evaluationMethod;
    }

    @Override
    public String toString() {
        return evaluationMethod;
    }
}
