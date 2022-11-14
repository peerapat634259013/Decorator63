
public class StreamedMilk extends CondimentDecorator {
	Beverage beverage;
	
	public StreamedMilk (Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", StreamedMilk";
	}
	public double cost() {
		return .10 + beverage.cost();
	}
}
