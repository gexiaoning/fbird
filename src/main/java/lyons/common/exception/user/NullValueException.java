
package lyons.common.exception.user;


public class NullValueException extends UserException
{
    private static final long serialVersionUID = 1L;
    
    public NullValueException(int state, String message)
    {
        super(state, message);
    }

    public NullValueException(String message)
    {
        super(message);
    }
    
}
