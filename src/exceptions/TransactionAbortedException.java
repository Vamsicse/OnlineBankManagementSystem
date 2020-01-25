package exceptions;

/**
 * @author VAMSI KRISHNA MYALAPALLI (vamsikrishna.vasu@gmail.com)
 *
 */
public class TransactionAbortedException extends Exception {

	public TransactionAbortedException(String msg) {
		super(msg);
	}

}
