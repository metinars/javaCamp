package kodlama.io.hrmsProject.core.utility.result;

public class Result {
	
	private boolean succes;
	private String message;
	
	public Result(boolean succes) {
		this.succes = succes;
	}
	
	public Result(boolean succes, String message) {
		this.succes = succes;
		this.message = message;
	}
	
	public boolean isSucces(){
		return this.succes;
	}
	
	public String isMessage() {
		return this.message;
	}
}
