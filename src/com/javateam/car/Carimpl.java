package com.javateam.car;
//import com.javateam.car.modules.*;
import com.javateam.car.modules.Engine;
import com.javateam.car.modules.Body;
import com.javateam.car.modules.Wheel;
public class Carimpl implements Car{
	Engine eng;
	Body body;
	Wheel wheel;
	
	public Carimpl(Body body,Engine eng,Wheel wheel){
		this.body=body;
		this.eng=eng;
		this.wheel=wheel;
		
	}
	@Override
	public void combineEngine() {
		// TODO Auto-generated method stub
		eng.combine();
		
	}

	@Override
	public void combineBody() {
		// TODO Auto-generated method stub
		body.combine();
	}

	@Override
	public void combineWheel() {
		// TODO Auto-generated method stub
		wheel.combine();
	}

	@Override
	public void completeCar() {
		// TODO Auto-generated method stub
		this.combineBody();
		this.combineEngine();
		this.combineWheel();
		System.out.println("차량 제작을 완성하였습니다");
	}

}
