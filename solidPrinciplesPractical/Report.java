package solidPrinciplesPractical;
//S - Single Responsibility Principle
class Report {
    public String generate() {
        return "Generated Report Content";
    }
}

class ReportSaver {
    public void save(String content) {
        // Save content to file
    }
}

class ReportPrinter {
    public void print(String content) {
        // Print content
    }
}
