<?php
$server = "localhost";
$username = "root";
$password = "";
$db = "lab_db";


$con = new mysqli($server, $username, $password, $db);


if ($con->connect_error) {
    die("Connection failed: " . $con->connect_error);
}

$table = "CREATE TABLE IF NOT EXISTS lab_tbl (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    productName VARCHAR(100) UNIQUE,
    productDescription VARCHAR(200),
    productQuantity INT,
    productPrice INT,
    productImage VARCHAR(100)
)";

if ($con->query($table) === TRUE) {
    echo "Table created successfully";
} else {
    echo "Error creating table: " . $con->error;
}
$con->close();
?>
