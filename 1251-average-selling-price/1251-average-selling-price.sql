select p.product_id, case when sum(u.units) is null then 0 else ROUND(
    SUM(p.price * u.units) / SUM(u.units),
    2
) end AS average_price from Prices as p left join UnitsSold as u on p.product_id=u.product_id and u.purchase_date between p.start_date and p.end_date group by product_id ;