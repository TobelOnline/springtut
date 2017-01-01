package com.luv2code.spring;

public class BaseballCoach implements Coach {

	//define private field for dependency
	private FortuneService fortuneService;
	
	//define a constructor for depedency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30min on batting";
	}

	@Override
	public String getDailyFortune() {
		
		// use my fortuneService to get fortune
		return fortuneService.getFortune();
	}
	
	
}
