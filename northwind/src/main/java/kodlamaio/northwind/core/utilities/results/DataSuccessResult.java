 package kodlamaio.northwind.core.utilities.results;

public class DataSuccessResult<T> extends DataResult<T>{

	public DataSuccessResult(T data, String message) {
		super(data, true, message);
	}

	
	public DataSuccessResult(T data) {
		super(data, true);
	}
	
	public DataSuccessResult(String message) {
		super(null, true, message);
	}

	public DataSuccessResult() {
		super(null, true);
	}
}
