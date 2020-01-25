package exceptions;

/**
 * @author VAMSI KRISHNA MYALAPALLI (vamsikrishna.vasu@gmail.com)
 *
 */
public class NotEnoughtCashInBalanceException extends
		TransactionAbortedException {
	public NotEnoughtCashInBalanceException(String msg) {
		super(msg);
	}
}
