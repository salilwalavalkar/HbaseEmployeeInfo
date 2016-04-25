package com.salil.bigdata.hbase.employee;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;

import com.salil.bigdata.hbase.employee.util.HBaseUtil;

public class HbaseEmployeeOperations {

	public static void main(String[] args) throws IOException, InterruptedException {
		Configuration hbaseConf = HBaseConfiguration.create();
		HBaseUtil hbaseUtil = HBaseUtil.getHelper(hbaseConf);

		String tableName = "employee";
		
		hbaseUtil.dropTable(tableName);
		hbaseUtil.createTable(tableName,"personal", "professional");
		hbaseUtil.put(tableName, "101", "personal", "name", "Steve Wozniak");
		hbaseUtil.put(tableName, "101", "personal", "city", "San Mateo");
		hbaseUtil.put(tableName, "101", "professional", "designation", "VP");
		hbaseUtil.put(tableName, "101", "professional", "salary", "5000");

		hbaseUtil.put(tableName, "102", "personal", "name", "Tim Cook");
		hbaseUtil.put(tableName, "102", "personal", "city", "Cupertino");
		hbaseUtil.put(tableName, "102", "professional", "designation", "CEO");
		hbaseUtil.put(tableName, "102", "professional", "salary", "1000");

		System.out.println("Search Parameters - None - Show complete table");
		hbaseUtil.printTableData(tableName);
		
		System.out.println("Search Parameters - Get selected data for row");
		String[] rows = {"101"};
		String[] colFamily = {"personal"};
		String[] colNames = {"name", "city"};
		hbaseUtil.printTableData(tableName, rows, colFamily, colNames);
		
		System.out.println("Search Parameters - Get all data for row");
		String[] rows2 = {"102"};
		hbaseUtil.printTableData(tableName, rows2, null, null); 
	}
}
