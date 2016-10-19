package org.it.bsa.mx.jasper;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import org.it.bsa.mx.domain.CallDetailRecord;
import org.springframework.messaging.Message;
import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import net.sf.dynamicreports.report.builder.DynamicReports;
import net.sf.dynamicreports.report.builder.column.Columns;
import net.sf.dynamicreports.report.builder.component.Components;
import net.sf.dynamicreports.report.builder.datatype.DataTypes;
import net.sf.dynamicreports.report.constant.HorizontalTextAlignment;
import net.sf.dynamicreports.report.exception.DRException;

public class CallDetailReportGenerator {
	
	public void runReport(Message<?> message) throws IOException {
		System.out.println("*********[CallDetailReportGenerator] message = " + message);
		List<CallDetailRecord> dataSourceList = new ArrayList<CallDetailRecord>();
		dataSourceList.add((CallDetailRecord) message.getPayload());
		JasperReportBuilder report = DynamicReports.report();
		report.columns(
				Columns.column("Phone Number", "phoneNumber", DataTypes.integerType())
						.setHorizontalTextAlignment(HorizontalTextAlignment.LEFT),
				Columns.column("Data", "data", DataTypes.stringType())
						.setHorizontalTextAlignment(HorizontalTextAlignment.LEFT))
				.title(Components.text("Test Report Generated " 
						+ new java.util.Date()).setHorizontalTextAlignment(HorizontalTextAlignment.CENTER))
				.pageFooter(Components.pageXofY())// show page number on the page footer
				.setDataSource(dataSourceList);

		FileOutputStream fis = null;
		try {
			
			report.show();
			fis = new FileOutputStream("/tmp/report.pdf");
			report.toPdf(fis);
			
			
		} catch (DRException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {fis.close();}
	}
}