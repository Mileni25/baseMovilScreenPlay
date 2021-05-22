package com.choucair.moviles.app.interactions.choucair;

import org.openqa.selenium.Dimension;

import net.serenitybdd.screenplay.Actor;

public class DeviceScreen {

	private Dimension dim;
	
	public DeviceScreen(Actor actor) {
		this.dim = GetDriver.as(actor).appiumDriver().manage().window().getSize();
	}
	
	public static DeviceScreen as(Actor actor) {
		return new DeviceScreen(actor);
	}
	
	public int getWidth() {
		return dim.getWidth();
	}
	
	public int getHeight() {
		return dim.getHeight();
	}
	
	public int getMiddleHeight() {
		return dim.getHeight() / 2;
	}
	
	public int getMiddleWidth() {
		return dim.getWidth() / 2;
	}
}
