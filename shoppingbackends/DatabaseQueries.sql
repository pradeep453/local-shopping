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

3>

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

4>

CREATE TABLE `localshopping`.`address` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_id` INT NULL,
  `address_line_one` VARCHAR(100) NULL,
  `address_line_two` VARCHAR(100) NULL,
  `city` VARCHAR(20) NULL,
  `state` VARCHAR(20) NULL,
  `country` VARCHAR(20) NULL,
  `postal_code` VARCHAR(10) NULL,
  `is_billing` TINYINT(4) NULL,
  `is_shipping` TINYINT(4) NULL,
  PRIMARY KEY (`id`),
  INDEX `user_id_idx` (`user_id` ASC),
  CONSTRAINT `user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `localshopping`.`user_detail` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
    );
    
5>   
    CREATE TABLE `localshopping`.`cart` (
  `id` INT NOT NULL,
  `user_id` INT NULL,
  `grand_total` DECIMAL(10,2) NULL,
  `cart_lines` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `user_id_idx` (`user_id` ASC),
  CONSTRAINT `user_id_cart`
    FOREIGN KEY (`user_id`)
    REFERENCES `localshopping`.`user_detail` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
    
    
    
