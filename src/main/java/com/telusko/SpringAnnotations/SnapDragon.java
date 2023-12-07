package com.telusko.SpringAnnotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class SnapDragon implements MobileProcessor {

	@Override
	public void processor() {
		System.out.println("World Best CPU !");

	}

}
