/**
 * 
 */
package com.d2h.service.report;

/**
 * @author Hemanta
 *
 */
import static net.sf.dynamicreports.report.builder.DynamicReports.*;

import java.math.BigDecimal;
import java.sql.Connection;
import java.util.Calendar;
import java.util.Date;

import org.apache.ibatis.session.SqlSession;

import com.d2h.service.util.ConnectionFactory;

import net.sf.dynamicreports.report.base.expression.AbstractSimpleExpression;
import net.sf.dynamicreports.report.builder.column.TextColumnBuilder;
import net.sf.dynamicreports.report.builder.group.CustomGroupBuilder;
import net.sf.dynamicreports.report.constant.Calculation;
import net.sf.dynamicreports.report.datasource.DRDataSource;
import net.sf.dynamicreports.report.definition.ReportParameters;
import net.sf.dynamicreports.report.exception.DRException;
import net.sf.jasperreports.engine.JRDataSource;
/**
042
 * @author Ricardo Mariaca (r.mariaca@dynamicreports.org)
043
 */
public class GroupHeaderWithSubtotalReport {
   public GroupHeaderWithSubtotalReport() {
      build();
   }
 
   private void build() {
	   SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		Connection connection = sqlSession.getConnection();
      TextColumnBuilder<String> yearColumn = col.column("Order year", exp.text(""));
      TextColumnBuilder<Date> orderDateColumn = col.column("Order date", "orderdate", type.dateType());
      TextColumnBuilder<String> itemColumn = col.column("Item", "item", type.stringType());
      TextColumnBuilder<Integer> quantityColumn = col.column("Quantity", "quantity", type.integerType());
      TextColumnBuilder<BigDecimal> unitPriceColumn = col.column("Unit price", "unitprice", type.bigDecimalType());
      CustomGroupBuilder yearGroup = grp.group(new YearExpression())
         .groupByDataType()
         .headerWithSubtotal();
      try {
         report()
            .setTemplate(Templates.reportTemplate)
            .setSubtotalStyle(stl.style(Templates.boldStyle))
            .fields(
               field("orderdate", type.dateYearType()))
            .columns(
               yearColumn, orderDateColumn, itemColumn, quantityColumn, unitPriceColumn)
            .groupBy(yearGroup)
            .subtotalsAtGroupHeader(yearGroup,
               sbt.sum(quantityColumn), sbt.sum(unitPriceColumn))
            .subtotalsAtSummary(
               sbt.aggregate(exp.text("Total"), yearColumn, Calculation.NOTHING), sbt.sum(quantityColumn), sbt.sum(unitPriceColumn))
            .title(Templates.createTitleComponent("Hemanta Kumar Patasani"))
            .pageFooter(Templates.footerComponent)
            .setDataSource(createDataSource())
            .show();
      } catch (DRException e) {
         e.printStackTrace();
      }
   }
   private class YearExpression extends AbstractSimpleExpression<String> {
      private static final long serialVersionUID = 1L;
      public String evaluate(ReportParameters reportParameters) {
         return type.dateYearType().valueToString("orderdate", reportParameters);
      }
   }
 
   private JRDataSource createDataSource() {
      DRDataSource dataSource = new DRDataSource("orderdate", "item", "quantity", "unitprice");
      dataSource.add(toDate(2015, 11, 1), "Rice", 5, new BigDecimal(250));
      dataSource.add(toDate(2015, 11, 1), "Wheat", 3, new BigDecimal(480));
      dataSource.add(toDate(2015, 12, 1), "Sugar", 1, new BigDecimal(280));
      dataSource.add(toDate(2015, 12, 1), "Rice", 1, new BigDecimal(190));
      dataSource.add(toDate(2015, 1, 1), "Rice", 4, new BigDecimal(230));
      dataSource.add(toDate(2015, 1, 1), "Wheat", 2, new BigDecimal(650));
      dataSource.add(toDate(2015, 2, 1), "Wheat", 3, new BigDecimal(550));
      dataSource.add(toDate(2015, 2, 1), "Sugar", 5, new BigDecimal(210));
      return dataSource;
   }
   
 
   private Date toDate(int year, int month, int day) {
      Calendar c = Calendar.getInstance();
      c.set(Calendar.YEAR, year);
      c.set(Calendar.MONTH, month - 1);
      c.set(Calendar.DAY_OF_MONTH, day);
      return c.getTime();
   }
   public static void main(String[] args) {
      new GroupHeaderWithSubtotalReport();
   }
}
