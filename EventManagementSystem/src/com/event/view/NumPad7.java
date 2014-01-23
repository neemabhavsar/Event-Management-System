package com.event.view;

import processing.core.PApplet;

import com.event.controller.INumPad;

public class NumPad7 implements INumPad {

	PApplet applet;
	
	public NumPad7(PApplet applet){
		/**
		 * Setup the Constructor
		 * Done @ by Pawan
		 
		*/ 
		this.applet = applet;
	}

	public void NumDisplay() {
		/**
		 * Implementation of the Composite Pattern for the KeyPad
		 * Done @ by Pawan 
		*/ 
		applet.image(applet.loadImage("/7.png"),22,500);
		// TODO Auto-generated method stub

	}

	@Override
	public void addDisplay(INumPad c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeDisplay(INumPad c) {
		// TODO Auto-generated method stub

	}

	@Override
	public INumPad getDisplayNum(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
