package com.pattern.bridge;

import com.pattern.bridge.bridgePattern.AdvancedRemoteControl;
import com.pattern.bridge.bridgePattern.RemoteControl;
import com.pattern.bridge.bridgePattern.SamsungTV;
import com.pattern.bridge.bridgePattern.SonyTV;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BridgeApplication {

	public static void main(String[] args) {

		var remoteControl = new RemoteControl(new SonyTV());
		var advancedRemoteControl = new AdvancedRemoteControl(new SamsungTV());

		remoteControl.turnOn();
		advancedRemoteControl.turnOn();
		advancedRemoteControl.setChannel(5);
		advancedRemoteControl.turnOff();
		remoteControl.turnOff();
	}

}
