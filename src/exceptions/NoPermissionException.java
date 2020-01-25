package exceptions;

/**
 * @author VAMSI KRISHNA MYALAPALLI (vamsikrishna.vasu@gmail.com)
 *
 */
public class NoPermissionException extends TransactionAbortedException {
	public NoPermissionException(String msg) {
		super(msg);
	}

}
