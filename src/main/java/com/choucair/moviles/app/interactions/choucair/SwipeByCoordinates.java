package com.choucair.moviles.app.interactions.choucair;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;

public class SwipeByCoordinates implements Interaction{

	private int inicialX;
	private int inicialY;
	private int endX;
	private int endY;
	
	public SwipeByCoordinates(int inicialX, int inicialY, int endX, int endY) {
		this.inicialX = inicialX;
		this.inicialY = inicialY;
		this.endX = endX;
		this.endY = endY;
	}

	@Override
	@SuppressWarnings("rawtypes")
	@Step("{0} swiped from (#inicialX, #inicialY) to (#endX, #endY)")
	public <T extends Actor> void performAs(T actor) {
		new TouchAction((PerformsTouchActions) GetDriver.as(actor).appiumDriver())
		.longPress(new PointOption<>().withCoordinates(inicialX, inicialY))
		.moveTo(new PointOption<>().withCoordinates(endX, endY))
		.release()
		.perform();
	}

}
