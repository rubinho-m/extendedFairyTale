package items;

public class Issue {
    private boolean difficulty;
    private boolean clearness;
    private boolean preparedness;

    public Issue(boolean difficulty, boolean clearness, boolean preparedness) {
        this.difficulty = difficulty;
        this.clearness = clearness;
        this.preparedness = preparedness;
    }

    public boolean isClearness() {
        return clearness;
    }

    public void setClearness(boolean clearness) {
        this.clearness = clearness;
    }

    public boolean isPreparedness() {
        return preparedness;
    }

    public void setPreparedness(boolean preparedness) {
        this.preparedness = preparedness;
    }

    public boolean isDifficulty() {
        return difficulty;
    }

    public void setDifficulty(boolean difficulty) {
        this.difficulty = difficulty;
    }
}
