<?php
$server = "localhost";
$username = "root";
$password = "";
$db = "lab_db";


$con = new mysqli($server, $username, $password, $db);

if(!$con){
    die("Error".mysqli_connect_error());
}

 ?>