package com.tobi.Nxt;

import java.io.*;
import java.util.Arrays;
import lejos.nxt.*;
import lejos.nxt.comm.*;


public class USSTurnServo extends Thread{
	
	USBConnection conn = null;
	DataOutputStream dOut = null;
	DataInputStream dIn = null;
	
	NXTRegulatedMotor mA = null;
	UltrasonicSensor sonic = null;
	
	public USSTurnServo(){
		conn = USB.waitForConnection();
		dOut = conn.openDataOutputStream();
		dIn = conn.openDataInputStream();
		
		sonic = new UltrasonicSensor(SensorPort.S1);
		mA = Motor.A;
		mA.setSpeed(300);
	}
	
	public void run(){
		int[] readings = new int[11];
		while(true){
		
			mA.rotate(30);
			readings[0] = sonic.getDistance();
			mA.rotate(30);
			readings[1] = sonic.getDistance();
			mA.rotate(30);
			readings[2] = sonic.getDistance();
			mA.rotate(30);
			readings[3] = sonic.getDistance();
			mA.rotate(30);
			readings[4] = sonic.getDistance();
			mA.rotate(30);
			readings[5] = sonic.getDistance();
			mA.rotate(-30);
			readings[6] = sonic.getDistance();
			mA.rotate(-30);
			readings[7] = sonic.getDistance();
			mA.rotate(-30);
			readings[8] = sonic.getDistance();
			mA.rotate(-30);
			readings[9] = sonic.getDistance();
			mA.rotate(-30);
			readings[10] = sonic.getDistance();
			
			sendSensor(readings);
			mA.rotate(-30);
		}
	}
	
	public void sendSensor(int[] sen){
		try {
			dOut.writeBytes(Arrays.toString(sen)+"\n");
			dOut.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LCD.drawString(Arrays.toString(sen), 0, 0);
	}
}