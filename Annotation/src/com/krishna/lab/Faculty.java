package com.krishna.lab;

import com.krishna.anno.Column;

public class Faculty {
	@Column(value="facultyId",charType=true)
int id;
	@Column("facultyName")
String name;
long phone;
}
