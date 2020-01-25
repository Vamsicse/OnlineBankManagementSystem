package exceptions;

/**
 * @author VAMSI KRISHNA MYALAPALLI (vamsikrishna.vasu@gmail.com)
 *
 */
public class OverDraftLimitExceededException extends ExceedLimitException {

	public OverDraftLimitExceededException(String msg) {
		super(msg);
	}
}
