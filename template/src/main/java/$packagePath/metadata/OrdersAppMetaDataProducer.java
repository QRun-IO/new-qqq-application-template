package $packageName.metadata;


import $packageName.model.Customer;
import $packageName.model.Order;
import $packageName.model.OrderLine;
import $packageName.model.Product;
import com.kingsrook.qqq.backend.core.model.metadata.QInstance;
import com.kingsrook.qqq.backend.core.model.metadata.MetaDataProducerInterface;
import com.kingsrook.qqq.backend.core.model.metadata.layout.QIcon;
import com.kingsrook.qqq.backend.core.model.metadata.layout.QAppMetaData;
import com.kingsrook.qqq.backend.core.model.metadata.layout.QAppSection;
import java.util.List;


public class OrdersAppMetaDataProducer implements MetaDataProducerInterface<QAppMetaData>
{
   @Override
   public QAppMetaData produce(QInstance qInstance)
   {
      QAppSection mainSection = new QAppSection()
         .withName("orders-section")
         .withLabel("Orders");

      return new QAppMetaData()
         .withName("ordersApp")
         .withLabel("Orders")
         .withIcon(new QIcon().withName("shopping_cart"))
         .withSectionOfChildren(
            mainSection,
            List.of(
               qInstance.getTable(Customer.TABLE_NAME),
               qInstance.getTable(Product.TABLE_NAME),
               qInstance.getTable(Order.TABLE_NAME),
               qInstance.getTable(OrderLine.TABLE_NAME)
            )
         );
   }
}

