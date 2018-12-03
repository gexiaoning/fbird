
package lyons.common.controller.goods;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class OrderController
{
    
    @RequestMapping("order")
    public String order()
    {
        return "/order/order";
    }
/*    
    @RequestMapping(value="/order/order", method = RequestMethod.POST,
        produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String queryOrder()
    {
        
    }*/
    
}
