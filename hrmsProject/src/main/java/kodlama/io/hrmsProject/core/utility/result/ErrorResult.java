package kodlama.io.hrmsProject.core.utility.result;

public class ErrorResult extends Result{

	public ErrorResult(String message) {
		super(false, message);
		// TODO Auto-generated constructor stub
	}
	
	public ErrorResult() {
		super(false);
	}

}
