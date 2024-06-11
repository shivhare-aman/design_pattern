package com.observer_impl;

import com.observer_impl.exercise1.StatusBar;
import com.observer_impl.exercise1.StockListView;
import com.observer_impl.observer.Chart;
import com.observer_impl.observer.SpreadSheet;
import com.observer_impl.observer_pull.Chart1;
import com.observer_impl.observer_pull.SpreadSheet1;

import com.observer_impl.observer_push.Chart2;
import com.observer_impl.observer_push.SpreadSheet2;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverApplication {

	public static void main(String[] args) {

// 		-----> Observer
		System.out.println("-------- Observer Pattern --------");

		var dataSource = new com.observer_impl.observer.DataSource();
		var sheet_1 = new SpreadSheet();
		var sheet_2 = new SpreadSheet();
		var chart = new Chart();

		dataSource.addObserver(sheet_1);
		dataSource.addObserver(sheet_2);
		dataSource.addObserver(chart);

		dataSource.setValue(0);


// 		-----> Pull Style Observer
		System.out.println("-------- Pull Style Observer --------");

		var dataSource1 = new com.observer_impl.observer_pull.DataSource();
		var pull_sheet_1 = new SpreadSheet1(dataSource1);
		var pull_sheet_2 = new SpreadSheet1(dataSource1);
		var pull_chart = new Chart1(dataSource1);

		dataSource1.addObserver(pull_sheet_1);
		dataSource1.addObserver(pull_sheet_2);
		dataSource1.addObserver(pull_chart);

		dataSource1.setValue(1);


// 		-----> Push Style Observer
		System.out.println("-------- Push Style Observer --------");

		var dataSource2 = new com.observer_impl.observer_push.DataSource();
		var push_sheet_1 = new SpreadSheet2();
		var push_sheet_2 = new SpreadSheet2();
		var push_chart = new Chart2();

		dataSource2.addObserver(push_sheet_1);
		dataSource2.addObserver(push_sheet_2);
		dataSource2.addObserver(push_chart);

		dataSource2.setValue(2);


// 		-----> Exercise 1 --> Based on Pull Style
		System.out.println("-------- Exercise 1 --------");

		var datasource = new com.observer_impl.exercise1.DataSource();
		var statusBar = new StatusBar(datasource);
		var stockView = new StockListView(datasource);

		datasource.addObserver(statusBar);
		datasource.addObserver(stockView);

		datasource.setInnoStock(1000);
		datasource.setVenaIndStock(500);

	}

}
