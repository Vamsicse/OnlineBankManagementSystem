package exceptions;

/**
 * @author VAMSI KRISHNA MYALAPALLI (vamsikrishna.vasu@gmail.com)
 *
 */
public class ExceedLimitException extends TransactionAbortedException {

	public ExceedLimitException(String msg) {
		super(msg);
	}
}
