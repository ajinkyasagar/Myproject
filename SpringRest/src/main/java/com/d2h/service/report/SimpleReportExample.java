package com.d2h.service.report;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;

import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import net.sf.dynamicreports.report.builder.DynamicReports;
import net.sf.dynamicreports.report.builder.column.Columns;
import net.sf.dynamicreports.report.builder.component.Components;
import net.sf.dynamicreports.report.builder.datatype.DataTypes;
import net.sf.dynamicreports.report.constant.HorizontalAlignment;
import net.sf.dynamicreports.report.exception.DRException;

import org.apache.ibatis.session.SqlSession;

import com.d2h.service.util.ConnectionFactory;

/**
 * SQL 
 * 

CREATE TABLE `customers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=latin1$$
 
 	INSERT INTO `test`.`customers` (`first_name`, `last_name`, `date`) VALUES ('Ricardo', 'Mariaca', CURRENT_DATE);
	INSERT INTO `test`.`customers` (`first_name`, `last_name`, `date`) VALUES ('YONG', 'MOOK KIM', CURRENT_DATE);

 */
public class SimpleReportExample {

	public static void main(String[] args) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		Connection connection = sqlSession.getConnection();
		/*try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "");
		} catch (SQLException e) {
			e.printStackTrace();
			return;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return;
		}*/

		JasperReportBuilder report = DynamicReports.report();//a new report
		report
		  .columns(
		  	Columns.column("Order Id", "orderId", DataTypes.stringType())
		  		.setHorizontalAlignment(HorizontalAlignment.LEFT),
		  	Columns.column("Order Description", "orderDesc", DataTypes.stringType()),
		  	Columns.column("Product Id", "productId", DataTypes.stringType()),
		  	Columns.column("orderQty", "orderQty", DataTypes.stringType())
		  		.setHorizontalAlignment(HorizontalAlignment.LEFT)
		  	)
		  .title(//title of the report
		  	Components.text("SimpleReportExample")
		  		.setHorizontalAlignment(HorizontalAlignment.CENTER))
		  .pageFooter(Components.pageXofY())//show page number on the page footer
		  .setDataSource("SELECT orderId, orderDesc, productDesc, productId, orderQty FROM custorder", connection);

		try {
			report.show();//show the report
			report.toPdf(new FileOutputStream("D:/POC/SpringRest/report.pdf"));//export the report to a pdf file
		} catch (DRException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
