package com.example;

public class TrafficMediator {
    private final TrafficLight trafficLight;
    private final PedestrianCrossingLight pedestrianCrossingLight;

    public TrafficMediator(TrafficLight trafficLight, PedestrianCrossingLight pedestrianCrossingLight){
        this.trafficLight=trafficLight;
        this.pedestrianCrossingLight=pedestrianCrossingLight;
    }
    public void changeTrafficLightToRed(){
        trafficLight.changeToRed();
        pedestrianCrossingLight.changeToGreen();
    }

    public void changeTrafficLightToAmber(){
        trafficLight.changeToAmber();
    }
    public void changeTrafficLightToGreen(){
        trafficLight.changeToGreen();
        pedestrianCrossingLight.changeToRed();
    }
}
