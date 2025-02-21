/**
 * 
 */
package com.springmvc.pmvc.beans;

/**
 * 
 */
public class Course1 {
	/**
	 * @param id
	 * @param name
	 * @param duration
	 */
	public Course1(int id, String name, String duration) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
	}
	int id;
	String name;
	String duration;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the duration
	 */
	public String getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course1 [id=" + id + ", name=" + name + ", duration=" + duration + "]";
	}

}
