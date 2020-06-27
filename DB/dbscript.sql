-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema apidb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema apidb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `apidb` DEFAULT CHARACTER SET utf8 ;
USE `apidb` ;

-- -----------------------------------------------------
-- Table `apidb`.`evento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `apidb`.`evento` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(55) NOT NULL,
  `lugar` VARCHAR(60) NOT NULL,
  `fecha` VARCHAR(40) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `apidb`.`localidad`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `apidb`.`localidad` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `apidb`.`localidad_evento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `apidb`.`localidad_evento` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_evento` INT NULL,
  `id_localidad` INT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
