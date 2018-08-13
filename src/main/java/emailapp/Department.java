package emailapp;

public enum Department {
    SALES("sales"), DEVELOPMENT("development"), ACCOUNTING("accounting");

    private String dep;

    Department(final String department) {
        this.dep = department;
    }

    public String getDep() {
        return dep;
    }
}
