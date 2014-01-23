package com.event.view;

import processing.core.PApplet;

import com.event.controller.IPassCode;

public class FourPinState implements IPassCode{

	KeyPad keypad;
	PApplet applet;
	public FourPinState(KeyPad keypad,PApplet applet){
		this.keypad = keypad;
		this.applet = applet;
	}
	@Override
	public void pressedNumber(String input) {
		/**
		 * On Number Press the Validity of Pin is Checked
		 * Done @ by Ashwini
		 
		*/ 
		// TODO Auto-generated method stub
		System.out.println("In four pin state pass is:: "+KeyPad.getPassword());
		if(!(KeyPad.getPassword().equals("1234"))){
			System.out.println("Inside icorrect");
			applet.image(applet.loadImage("/password_icon - white.png"), 205,170);
			applet.image(applet.loadImage("/password_icon - white.png"), 135,170);
			applet.image(applet.loadImage("/password_icon - white.png"), 60,170);
			applet.fill(255,0,0);			
			applet.text("Incorrect Pin, Please enter a valid Pin",40,40);
			KeyPad.setPassword("");
			keypad.setState(keypad.getNoPinState());
			
			
		}
	}

	@Override
	public void backspace() {
		/**
		 * On Backspace update the password and Change State to Previous State
		 * Done @ by Ashwini
		 
		*/ 
		keypad.updatePassword("");
		keypad.setState(keypad.getThreePinState());
		/*applet.image(applet.loadImage("/password_icon - white.png"), 220,170);
		applet.image(applet.loadImage("/password_icon - white.png"), 205,170);
		applet.image(applet.loadImage("/password_icon - white.png"), 135,170);
		applet.image(applet.loadImage("/password_icon - white.png"), 60,170);*/
	}

	@Override
	public String getState() {
		/**
		 * Get the Current state value
		 * Done @ by Ashwini
		 
		*/ 
		return "FourPinState";
	}

	

}
