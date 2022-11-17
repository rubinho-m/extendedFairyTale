package enums;

public enum DayTime {
    BREAKFAST("завтрак"), LUNCH("обед"), DINNER("ужин");

    private final String translation;

    public String getTranslation() {
        return translation;
    }

    DayTime(String translation) {
        this.translation = translation;
    }


}
