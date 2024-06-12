package com.visitorPattern;

import com.visitorPattern.visitor.AnchorNode;
import com.visitorPattern.visitor.HeadingNode;
import com.visitorPattern.visitor.HighlightOperation;
import com.visitorPattern.visitor.HtmlDocument;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VisitorPatternApplication {

	public static void main(String[] args) {

		var document = new HtmlDocument();

		document.add(new HeadingNode());
		document.add(new AnchorNode());

		document.execute(new HighlightOperation());
	}

}
