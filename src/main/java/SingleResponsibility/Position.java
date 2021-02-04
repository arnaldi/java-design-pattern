package SingleResponsibility;

public enum Position {
    SENIOR_DEVELOPER(new TwentyTwoAndAHalfPercentRule()),
    JUNIOR_DEVELOPER(new ElevenPercentRule());

    private CalculationRule rule;

    Position(CalculationRule rule){
        this.rule = rule;
    }

    public CalculationRule getRule() {
        return rule;
    }
}
