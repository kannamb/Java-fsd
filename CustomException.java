package Exceptionhandling;
public class CustomException extends Exception {
	private String msg;
  public CustomException(String msg) {
	this.msg = msg;
		}
  @Override
	public String toString() {
		return "AgeNotValidExecption [message=" + msg + "]";
}
}
