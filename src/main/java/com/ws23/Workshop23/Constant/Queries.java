package com.ws23.Workshop23.Constant;

public class Queries {
    //
    public static String getFullTable="""
                select o.id,o.order_date,o.customer_id,od.quantity,od.unit_price,od.discount,p.standard_cost
                    from products as p
                    join order_details as od
                    on p.id =od.product_id
                    join orders as o
                    on od.order_id=o.id;
            """;
    public static String getFullTableByOrderID="""
                select o.id,o.order_date,o.customer_id,od.quantity,od.unit_price,od.discount,p.standard_cost
                    from products as p
                    join order_details as od
                    on p.id =od.product_id
                    join orders as o
                    on od.order_id=o.id
                    where od.order_id= ?;
            """;
    
    public static String getProcessedTable="""
                select o.id,o.order_date,o.customer_id,(od.quantity*od.unit_price-od.discount) as total, (od.quantity*p.standard_cost) as cost_price
                    from products as p
                    join order_details as od
                    on p.id =od.product_id
                    join orders as o
                    on od.order_id=o.id;
            """;
    public static String getProcessedTableByOrderId="""
                select o.id,o.order_date,o.customer_id,(od.quantity*od.unit_price-od.discount) as total, (od.quantity*p.standard_cost) as cost_price
                    from products as p
                    join order_details as od
                    on p.id =od.product_id
                    join orders as o
                    on od.order_id=o.id
                    where od.order_id= ?;
            """;
    
}
