package com.krishna.lab;

import com.krishna.anno.KCloneable;

@KCloneable
class Emp {

int eid;
String ename;
public Emp(int eid, String ename) {
	this.eid = eid;
	this.ename = ename;
}
@Override
public String toString() {
	return eid + "\t" + ename;
}
@SuppressWarnings({"rawtypes","unchecked"})
public Emp getClonedObject()throws CloneNotSupportedException{
	Class cls=this.getClass();
	boolean b1=cls.isAnnotationPresent(KCloneable.class);
	if(b1){
		return new Emp(this.eid,this.ename);
	}else{
		throw new CloneNotSupportedException("Emp Class is not Using KCloneable");
	}
}
}
