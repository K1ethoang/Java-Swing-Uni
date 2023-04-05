package JTextField.model;

public class MiniCalculatorModel {
    private double firstValue;
    private double secondValue;
    private double answer;

    public MiniCalculatorModel() {
        this.firstValue = 0;
        this.secondValue = 0;
        this.answer = 0;
    }

    public double getFirstValue() {
        return firstValue;
    }

    public double getSecondValue() {
        return secondValue;
    }

    public double getAnswer() {
        return answer;
    }

    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }

    public void setSecondValue(double secondValue) {
        this.secondValue = secondValue;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }

    public void plus() {
        this.answer = this.firstValue + this.secondValue;
    }

    public void minus() {
        this.answer = this.firstValue - this.secondValue;
    }

    public void multiply() {
        this.answer = this.firstValue * this.secondValue;
    }

    public void divide() {
        this.answer = this.firstValue / this.secondValue;
    }

    public void power() {
        this.answer = Math.pow(this.firstValue, this.secondValue);
    }

    public void mod() {
        this.answer = this.firstValue % this.secondValue;
    }
}