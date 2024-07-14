package com.pattern.strategy;

import com.pattern.strategy.strategyPattern.BlackAndWhiteFilter;
import com.pattern.strategy.strategyPattern.ImageStorage;
import com.pattern.strategy.strategyPattern.JpegCompressor;
import com.pattern.strategy.strategyPattern.PngCompressor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyApplication {

	public static void main(String[] args) {
		var jpegImageStorage = new ImageStorage(new JpegCompressor(), new BlackAndWhiteFilter());
		jpegImageStorage.store("file_A");

		var pngImageStorage = new ImageStorage(new PngCompressor(), new BlackAndWhiteFilter());
		pngImageStorage.store("file_B");
	}

}
