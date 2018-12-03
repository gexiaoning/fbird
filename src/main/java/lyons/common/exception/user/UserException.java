
package lyons.common.exception.user;


public class UserException extends Exception
{
    private static final long serialVersionUID = 1L;
    
    public UserException(String message)
    {
        super(message);
    }
    
    public UserException(int state,String message)
    {
        super(message);
    }
    
}
