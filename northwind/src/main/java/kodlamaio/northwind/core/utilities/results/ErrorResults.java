package kodlamaio.northwind.core.utilities.results;

public class ErrorResults extends Result{
	public ErrorResults() {
		super(false);
	}
	
	public ErrorResults(String message) {
			super(false,message);
		}
}
