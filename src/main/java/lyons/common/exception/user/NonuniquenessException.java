
package lyons.common.exception.user;


public class NonuniquenessException extends UserException
{
    private static final long serialVersionUID = 1L;
    
    public NonuniquenessException(int state, String message)
    {
        super(state, message);
    }

    public NonuniquenessException(String message)
    {
        super(message);
    }

    
}
