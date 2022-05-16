package kodlama.io.hrmsProject.core.utility.result;

public class SuccesResult extends Result{

	public SuccesResult(boolean succes) {
		super(true);
		// TODO Auto-generated constructor stub
	}
	
	public SuccesResult(String message) {
		super(true, message);
	}
	
	public SuccesResult() {
		super(true);
	}

}
