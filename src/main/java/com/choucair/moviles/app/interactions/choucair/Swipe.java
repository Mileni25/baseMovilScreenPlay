package com.choucair.moviles.app.interactions.choucair;

import com.choucair.moviles.app.interactions.choucair.builders.SwipeBuilderFrom;

import net.serenitybdd.screenplay.Actor;

public class Swipe {
	
	public static SwipeBuilderFrom as (Actor actor) {
		return new SwipeBuilderFrom(actor);
	}
}
