package com.tobi.Nxt;

import lejos.nxt.*;
import java.io.*;
import lejos.nxt.comm.*;

public class USBReceive {
	private static USSTurnServo sUSS;
	public static void main(String [] args) throws Exception{
//		LCD.drawString("waiting", 0, 0);
//		
//		USBConnection conn = USB.waitForConnection();
//		DataOutputStream dOut = conn.openDataOutputStream();
//		DataInputStream dIn = conn.openDataInputStream();
		
		
		sUSS = new USSTurnServo();
		sUSS.start();
		while(!Button.ESCAPE.isPressed()){
			
		}
		System.exit(0);

//			int b;
//			try{
//				b = dIn.readInt();
//			}
//			catch (EOFException e){
//				break;
//			}
//			
//			dOut.writeInt(-b*3);
//			dOut.flush();
//			LCD.drawInt((int)b,8,0,1);
	}
}