CREATE TABLE IF NOT EXISTS MENU(

name varchar(200),
price int,
description varchar(500)
);

CREATE TABLE IF NOT EXISTS ORDERS(

name varchar(20),
apartment varchar(50),
houseNo varchar(15),
contact long,
specifications varchar(100),
orderPlaced JSON,
orderDate varchar(10),
status varchar(15)
);
