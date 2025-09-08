package br.com.mariojp.solid.isp;

public class OfficeService {
    private final Printer printer;
    private final Scanner scanner;

    public OfficeService(Printer printer) {
        this.printer = printer;
        this.scanner = null;
    }

    public OfficeService(Printer printer, Scanner scanner) {
        this.printer = printer;
        this.scanner = scanner;
    }

    public OfficeService(Scanner scanner) {
        this.printer = null;
        this.scanner = scanner;
    }

    public void printReport(String content){
        if (printer != null) printer.print(content);
    }
}
