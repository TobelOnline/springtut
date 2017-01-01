package com.luv2code.spring;

public class TrackCoach implements Coach {

	// field for dependency
	private FortuneService fortuneService;
	
	// Constructor for dependency
	public TrackCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}
	
	// Default constructor test
	public TrackCoach() {
		super();
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "run hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}


}
