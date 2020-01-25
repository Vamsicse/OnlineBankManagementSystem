package exceptions;

/**
 * @author VAMSI KRISHNA MYALAPALLI (vamsikrishna.vasu@gmail.com)
 *
 */
public class BelowMinimumBalanceException extends ExceedLimitException {

	public BelowMinimumBalanceException(String msg) {
		super(msg);
	}
}
