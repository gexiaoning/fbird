
package lyons.common.exception.user;


public class RepeatException extends UserException
{

    private static final long serialVersionUID = 1L;

    public RepeatException(int state, String message)
    {
        super(state, message);
    }
    
    public RepeatException(String message)
    {
        super(message);
    }

    
}
