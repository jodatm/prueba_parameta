CREATE SCHEMA `parameta` ;

CREATE DATABASE `parameta`;

CREATE TABLE `parameta`.`empleado` (
  `Tipo de Documento` VARCHAR(10) NOT NULL,
  `Número de Documento` VARCHAR(15) NOT NULL,
  `Nombres` VARCHAR(100) NULL,
  `Apellidos` VARCHAR(45) NULL,
  `Fecha de Nacimiento` DATE NULL,
  `Fecha de Vinculación a la Compañia` DATE NULL,
  `Cargo` VARCHAR(20) NULL,
  `Salario` DOUBLE NULL,
  PRIMARY KEY (`Tipo de Documento`, `Número de Documento`));