package com.krishna.lab;

import java.lang.reflect.Field;

import com.krishna.anno.Column;

public class Lab2 {
@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Faculty fal=new Faculty();
		Class cls=fal.getClass();
		Field[] field=cls.getDeclaredFields();
for (Field fields : field) {
	boolean pre=fields.isAnnotationPresent(Column.class);
	if(pre){
		Column cl=fields.getAnnotation(Column.class);
		String nm=cl.value();
		boolean cty=cl.charType();
		System.out.println(fields.getName()+"\t"+nm+"\t"+cty);
	}else{
		System.out.println("For field "+fields.getName()+" Column Annotation is not Present");
	}
}
	}

}
