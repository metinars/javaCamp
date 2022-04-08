package kodlamaio.northwind.core.utilities.results;

public class DataErrorResult<T> extends DataResult<T>{

	public DataErrorResult(T data, String message) {
		super(data, false, message);
	}

	
	public DataErrorResult(T data) {
		super(data, false);
	}
	
	public DataErrorResult(String message) {
		super(null, false, message);
	}

	public DataErrorResult() {
		super(null, false);
	}
}
