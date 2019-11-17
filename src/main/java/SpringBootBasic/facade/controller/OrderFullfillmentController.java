package SpringBootBasic.facade.controller;

import SpringBootBasic.facade.servicefacade.OrderServiceFacade;

public class OrderFullfillmentController
{
    OrderServiceFacade facade;
    
    boolean orderFullfilled = false;
    
    public void orderProduct(int productId)
    {
        orderFullfilled = facade.placeOrder(productId);
        System.out.println("OrderFullfillmentController : Order fullfillment completed. ");
    }
}
