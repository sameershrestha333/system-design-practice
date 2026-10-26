package lld.solid.dip.goodcode;

class ReportService {
    private Database database;

    public ReportService(Database database) {
        this.database = database;
    }

    public void generateReport(String data) {
        System.out.println("Generating report...");
        database.save(data);
    }
}