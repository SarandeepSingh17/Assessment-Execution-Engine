package main.java.com.example.evaluation_service.strategy;

public class CodingEvaluation implements EvaluationStrategy {
    public int evaluate(String output, String expected) {
        return output.equals(expected) ? 100 : 0;
    }
}