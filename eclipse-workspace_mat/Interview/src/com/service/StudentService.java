package com.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.exception.StudentException;
import com.model.Student;

public class StudentService {

	public Map<Integer, Student> studentDetails(Student student, int num) {

		Map<Integer, Student> maps = new HashMap<>();
		maps.put(num, student);
		return maps;
	}

	public Map<Integer, Student> updateDetails(Map<Integer, Student> edit, String password, String names)
			throws StudentException {
		for (Entry<Integer, Student> entry : edit.entrySet()) {
			Integer key = entry.getKey();
			Student val = entry.getValue();

			if (val.getPassword().equals(names)) {

				if (password.length() > 3) {
					edit.put(key, new Student(key, val.getStuName(), password, val.getGender(), val.getMark()));
				}
			}

		}
		return edit;

//					Student student = new Student(val.getStuName(), password, val.getGender(), val.getMark());
//		
	}

	public boolean checkDetails(Map<Integer, Student> maps, String passwo) throws StudentException {
		boolean bool = false;
		for (Entry<Integer, Student> entry : maps.entrySet()) {
			Integer key = entry.getKey();
			Student val = entry.getValue();
			if (val.getPassword().equals(passwo)) {
				bool = true;
			}
			else {
				throw new StudentException("Invalid");
			}
		}
		return bool;
		

	}
}
