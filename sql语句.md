#用户表：
CREATE TABLE user (
user_id INT UNSIGNED AUTO_INCREMENT,
user_phone VARCHAR(50) NOT NULL,
user_loginpwd varchar(100) NOT NULL,
user_paypwd VARCHAR(10),
user_address VARCHAR(200),
PRIMARY KEY ( user_id )
);

#手机验证码表：
CREATE TABLE phonecode (
phonecode_id INT UNSIGNED AUTO_INCREMENT,
phonecode_phone VARCHAR(20) NOT NULL,
phonecode_code VARCHAR(20) NOT NULL,
phonecode_time BIGINT UNSIGNED NOT NULL,
PRIMARY KEY ( phonecode_id )
);

#商品表：
CREATE TABLE product (
product_id INT UNSIGNED AUTO_INCREMENT,
product_name VARCHAR(20) NOT NULL,
product_price FLOAT UNSIGNED NOT NULL,
product_describe VARCHAR(100) NOT NULL,
product_color VARCHAR(50) NOT NULL,
product_capicity INT UNSIGNED NOT NULL,
product_brand VARCHAR(50) NOT NULL,
product_type VARCHAR(20) NOT NULL,
product_time BIGINT UNSIGNED NOT NULL,
product_sale INT UNSIGNED NOT NULL,
product_picurl TEXT,
PRIMARY KEY ( product_id )
);

insert into product(product_name,product_price,product_describe,product_color,product_capicity,product_brand,product_type,product_time,product_sale) 
        values("小金条",300.00,"小金条浆果红","#18",30,"ysl","口红",1554220800000,3000);
insert into product(product_name,product_price,product_describe,product_color,product_capicity,product_brand,product_type,product_time,product_sale)
		values("海蓝之谜",1000.00,"海蓝之谜面霜","#20",300,"la mar","面霜",1554307200000,5000);
insert into product(product_name,product_price,product_describe,product_color,product_capicity,product_brand,product_type,product_time,product_sale)
		values("小金瓶",200.00,"小金瓶防晒霜","#50",500,"安耐晒","防晒霜",1554393600000,2000);

#品牌表：
CREATE TABLE brand (
brand_id INT UNSIGNED AUTO_INCREMENT,
brand_name VARCHAR(50) NOT NULL,
brand_sale BIGINT UNSIGNED NOT NULL,
brand_picurl TEXT,
PRIMARY KEY ( brand_id )
);

insert into brand(brand_name,brand_sale)
		values("dior",3000);
insert into brand(brand_name,brand_sale)
		values("chanel",5000);
insert into brand(brand_name,brand_sale)
		values("ysl",1000);

#订单表：
CREATE TABLE orders (
order_id INT UNSIGNED AUTO_INCREMENT,
order_userphone VARCHAR(50) NOT NULL,
order_name VARCHAR(20) NOT NULL,
order_address TEXT NOT NULL,
order_detail TEXT NOT NULL,
order_total FLOAT NOT NULL,
order_time BIGINT UNSIGNED NOT NULL,
order_status VARCHAR(20) NOT NULL,
PRIMARY KEY ( order_id )
);

insert into orders(order_userphone,order_name,order_address,order_detail,order_total,order_time,order_status)
		values("18819257754","CJ","广东","购物清单JSON数组",350.00,1554393600000,"待发货");