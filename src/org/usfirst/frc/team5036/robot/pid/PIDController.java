package org.usfirst.frc.team5036.robot.pid;

public class PIDController {
	float pconstant,iconstant,dconstant,currentError,lastError;
	public PIDController(float p,float i,float d,float error){
		pconstant = p;
		iconstant = i;
		dconstant = d;
		lastError = error;
		currentError = error;
	}
	public float getOutput(float error){
		lastError = currentError;
		currentError = error;
		float d = currentError - lastError;
		return (pconstant*error) - (d*dconstant);
	}
}
