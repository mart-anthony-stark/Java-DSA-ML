package machinelearning;


import java.util.Random;
enum GradientDescentChoice {
	STOCHASTIC, BATCH
}
public class LinearRegressionBasic {
	private double m;
	private double c;
	// It can be optimised using hyper parameter
	// optimization
	private double learningRate = 0.001d;
	// I have kept it as 50 but it can user supplied as well.
	private int epoch = 1000;
	// This contains actual output at trainingSet[0][0] and x value trainingSet[0][1]
	private double[][] trainingSet;
	private GradientDescentChoice gradientChoice;
	// private static final String choice = "Stochastic";
	
	public LinearRegressionBasic(double[][] set, int epoch, GradientDescentChoice gradientChoice) {
		this.trainingSet = set;
		this.epoch = epoch > 0 ? epoch : this.epoch;
		this.gradientChoice = gradientChoice;
		trainModel();
	}
	
	private final void trainModel() {
		stochasticGradientDescent();
	}
	
	private void stochasticGradientDescent() {
		for (int i = 0; i < epoch * 100; i++) {
			Random random = new Random();
			int randomIndex = random.nextInt(trainingSet.length);
			double slopeGradient = derivativeWithRespectToSlope(trainingSet[randomIndex][0],
					trainingSet[randomIndex][1], m, c);
			double interceptGradient = derivativeWithRespectToIntercept(trainingSet[randomIndex][0],
					trainingSet[randomIndex][1], m, c);
			this.m = m - learningRate * slopeGradient;
			this.c = c - learningRate * interceptGradient;
		}
	}
	private double derivativeWithRespectToSlope(Double actual, Double x, Double slope, Double intercept) {
		double derivative = x * (slope * x + intercept - actual);
		return derivative;
	}
	private double derivativeWithRespectToIntercept(Double actual, Double x, Double slope, Double intercept) {
		double derivative = (slope * x + intercept - actual);
		return derivative;
	}
	public double predict(double predictForValue) {
		return c + (m * predictForValue);
	}
}