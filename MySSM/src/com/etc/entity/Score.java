package com.etc.entity;

/** 成绩实体类 */
public class Score {
	private Integer id;
	private String name;
	private Integer number;
	private Integer chinese;
	private Integer english;
	private Integer math;
	private Integer science;

	public Score() {
	}

	public Score(Integer id, String name, Integer number, Integer chinese, Integer english, Integer math,
			Integer science) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.chinese = chinese;
		this.english = english;
		this.math = math;
		this.science = science;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getChinese() {
		return chinese;
	}

	public void setChinese(Integer chinese) {
		this.chinese = chinese;
	}

	public Integer getEnglish() {
		return english;
	}

	public void setEnglish(Integer english) {
		this.english = english;
	}

	public Integer getMath() {
		return math;
	}

	public void setMath(Integer math) {
		this.math = math;
	}

	public Integer getScience() {
		return science;
	}

	public void setScience(Integer science) {
		this.science = science;
	}

}
