import java.io.Serializable;

public class PMDRule implements Serializable {

    private final String rule, ruleset, description;
    private final char group;
    private final int priority;

    public PMDRule(String ruleset, String rule, String description, int priority, char group) {
        this.ruleset = ruleset;
        this.description = description;
        this.priority = priority;
        this.rule = rule;
        this.group = group;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public String getRule() {
        return rule;
    }

    public String getRuleset() {
        return ruleset;
    }

    public char getGroup() {return group;}
}
