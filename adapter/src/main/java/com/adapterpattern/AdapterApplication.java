package com.adapterpattern;

import com.adapterpattern.adapter.CaramelAdapter;
import com.adapterpattern.adapter.Image;
import com.adapterpattern.adapter.ImageView;
import com.adapterpattern.adapter.VividFilter;
import com.adapterpattern.adapter.filters.Caramel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdapterApplication {
	public static void main(String[] args) {

		// See README to understand the scenario's.

		// Scenario 1
		var imageView = new ImageView(new Image());
		imageView.apply(new VividFilter());

		// Scenario 2
		var imageView2 = new ImageView(new Image());
		imageView2.apply(new CaramelAdapter(new Caramel()));
	}
}
