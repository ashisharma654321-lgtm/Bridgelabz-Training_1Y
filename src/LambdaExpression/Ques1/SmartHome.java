package LambdaExpression.Ques1;

public interface SmartHome {
    @FunctionalInterface
    interface LightAction{
        void execute();
    }
}
