package lld.solid.dip.goodcode;

public class ReportServiceMain {
    public static void main(String[] args) {
        MySQLDatabase mySQLDatabase = new MySQLDatabase();

        ReportService reportService = new ReportService(mySQLDatabase);
        reportService.generateReport("data");
    }
}
