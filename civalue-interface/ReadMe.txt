#Execute below database script in MySql

CREATE TABLE `product` (
  `productid` varchar(255) NOT NULL,
  `category` varchar(255) DEFAULT NULL,
  `brand` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`productid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `shopper` (
  `shopper_id` varchar(255) NOT NULL,
  PRIMARY KEY (`shopper_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `shelf` (
  `id` bigint NOT NULL,
  `product_id` varchar(255) DEFAULT NULL,
  `relevancy_score` double DEFAULT NULL,
  `fk_shopper_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK7osyg7wpe521evhm8mink9ywc` (`fk_shopper_id`),
  CONSTRAINT `FK7osyg7wpe521evhm8mink9ywc` FOREIGN KEY (`fk_shopper_id`) REFERENCES `shopper` (`shopper_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;