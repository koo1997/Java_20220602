package com.javateam.car.modules;
import com.javateam.car.*;

public class Body {
	
	String bodyName;
	public Body(String bodyName){
		this.bodyName=bodyName;
	}
public void combine() {
		System.out.println(bodyName+"차체결합");
	}

}
