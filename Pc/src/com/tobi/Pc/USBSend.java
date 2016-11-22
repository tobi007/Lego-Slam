package com.tobi.Pc;

import java.io.*;

import lejos.pc.comm.NXTConnector;

public class USBSend {
	public static void main(String[] args) {
		NXTConnector conn = new NXTConnector();
		if (!conn.connectTo("usb://")){
			System.err.println("No NXT find using USB");
			System.exit(1);
		}
		InputStream inDat = conn.getInputStream();
		OutputStream outDat = conn.getOutputStream();
		
		DataOutputStream dOut = new DataOutputStream(outDat);
		DataInputStream dIn = new DataInputStream(inDat);
		
		String x = "";
		for(int i=0;i<100;i++){
			try {
				dOut.writeInt(i);
				dOut.flush();
				x = dIn.readLine();
			} catch (IOException ioe) {
				System.err.println("IO	Exception writing bytes");
			}
			System.out.println(" Received " + x);
		}
		try {
			inDat.close();
			outDat.close();
			System.out.println("Closed data streams");
		} catch (IOException ioe) {
			System.err.println("IO Exception connection");
		}
		try {
			conn.close();
			System.out.println("Closed connection");
		} catch (IOException ioe) {
			System.err.println("IO Exception connection");
		}
	}
}