package org.usfirst.frc.team5036.robot.pid;

public class DevilPID {
	public double pconstant,iconstant,dconstant,currentError,lastError;
	public DevilPID(double p,double i,double d,double error){
		pconstant = p;
		iconstant = i;
		dconstant = d;
		lastError = error;
		currentError = error;
	}
	public double getOutput(double error){
		lastError = currentError;
		currentError = error;
		double d = currentError - lastError;
		return (pconstant*error) - (d*dconstant);
	}
}
