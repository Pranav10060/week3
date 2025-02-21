package com.springmvc.pmvc.beans;

/**
 * FacultyCourse class represents the mapping between Faculty and Course1.
 */
public class FacultyCourse {
    
    private int facultyId;
    private int courseId;

    /**
     * Constructor with parameters
     */
    public FacultyCourse(int facultyId, int courseId) {
        this.facultyId = facultyId;
        this.courseId = courseId;
    }

    /**
     * Default Constructor
     */
    public FacultyCourse() {}

    /**
     * @return the facultyId
     */
    public int getFacultyId() {
        return facultyId;
    }

    /**
     * @param facultyId the facultyId to set
     */
    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    /**
     * @return the courseId
     */
    public int getCourseId() {
        return courseId;
    }

    /**
     * @param courseId the courseId to set
     */
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "FacultyCourse [facultyId=" + facultyId + ", courseId=" + courseId + "]";
    }
}
