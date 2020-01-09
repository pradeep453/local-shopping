1> CREATE TABLE localshopping.category (
  id int(11) NOT NULL AUTO_INCREMENT,
  is_active bit(1) DEFAULT NULL,
  description varchar(255) DEFAULT NULL,
  image_url varchar(255) DEFAULT NULL,
  name varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ;

2>
CREATE TABLE localshopping.product (
  id int(11) NOT NULL AUTO_INCREMENT,
  is_active bit(1) DEFAULT NULL,
  brand varchar(255) DEFAULT NULL,
  category_id int(11) DEFAULT NULL,
  code varchar(255) DEFAULT NULL,
  description varchar(255) DEFAULT NULL,
  name varchar(255) DEFAULT NULL,
  purchases int(11) NOT NULL DEFAULT 0,
  quantity int(11) NOT NULL,
  supplier_id int(11) DEFAULT NULL,
  unit_price double DEFAULT NULL,
  views int(11) NOT NULL DEFAULT 0,
  PRIMARY KEY (id)
) ;


CREATE TABLE localshopping.user_detail (
  id int(11) NOT NULL AUTO_INCREMENT,
  first_name varchar(50) DEFAULT NULL,
  last_name varchar(50) DEFAULT NULL,
  role varchar(50) DEFAULT NULL,
  enabled tinyint(4) DEFAULT NULL,
  password varchar(60) DEFAULT NULL,
  email varchar(100) DEFAULT NULL,
  contact_number varchar(15) DEFAULT NULL,
  PRIMARY KEY (id)
);