package SpringBootBasic.facade.servicefacade;

import SpringBootBasic.facade.domain.Product;
import SpringBootBasic.facade.subcomponents.InventoryService;
import SpringBootBasic.facade.subcomponents.PaymentService;
import SpringBootBasic.facade.subcomponents.ShippingService;

public class OrderServiceFacadeImpl implements OrderServiceFacade
{
    
    @Override
    public boolean placeOrder(int pId)
    {
        boolean orderFullfilled = false;
        Product product = new Product();
        product.productId = pId;
        
        if (InventoryService.isAvailable(product))
        {
            System.out.println("Product with ID : " + product.productId + " is available.");
            
            boolean paymentConfirmed = PaymentService.makePayment();
            if (paymentConfirmed)
            {
                System.out.println("Payment confirmed...");
                ShippingService.shipProduct(product);
                System.out.println("Product shipped...");
                orderFullfilled = true;
            }
        }
        
        return orderFullfilled;
    }
    
}
