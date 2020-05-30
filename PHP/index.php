<?php
require_once('car.php');
require_once('uberX.php');
require_once('account.php');

$uberX = new UberX("AWS-123", new Account("Gabriel Villegas","Passport"), "Chevrolet", "Spark");
$uberX->printDataCar();
?>