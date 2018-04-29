package com.krishna.lab;

import com.krishna.anno.Table;

public class Lab1 {
@SuppressWarnings({"unchecked","rawtypes"})
	public static void main(String[] args) {
		Student st=new Student();
		Class cls=st.getClass();
		boolean pre=cls.isAnnotationPresent(Table.class);
		if(pre){
			Table tb=(Table)cls.getAnnotation(Table.class);
			String tn=tb.value();
			System.out.println("Table Name is "+tn);
		}else{
			System.out.println("Table Annotation is not Present");
		}
	}

}
