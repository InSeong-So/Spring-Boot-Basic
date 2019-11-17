package SpringBootBasic.facade.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import SpringBootBasic.facade.servicefacade.OrderServiceFacadeImpl;

class OrderFullfillmentControllerTest
{
    
    @Test
    public void testOrderProduct() throws Exception
    {
        OrderFullfillmentController controller = new OrderFullfillmentController();
        controller.facade = new OrderServiceFacadeImpl();
        controller.orderProduct(9);
        boolean result = controller.orderFullfilled;
        assertTrue(result);
    }
    
}
