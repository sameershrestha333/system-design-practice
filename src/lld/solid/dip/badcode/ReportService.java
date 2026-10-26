package lld.solid.dip.badcode;

class ReportService {
    private MySQLDatabase database; // ❌ High-level module depends on low-level module directly

    public ReportService() {
        this.database = new MySQLDatabase(); // ❌ hardcoded dependency
    }

    public void generateReport(String data) {
        System.out.println("Generating report...");
        database.save(data);
    }
}