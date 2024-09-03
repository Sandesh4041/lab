<?php

$productName = $_POST['productName'];
$productDescription = $_POST['productDescription'];
$productPrice = $_POST['productPrice'];
$productQuantity = $_POST['productQuantity'];
$photo = $_FILES['image']['name'];
$tmpPhoto = $_FILES['image']['tmp_name'];

$server = "localhost";
$username = "root";
$password = "";
$db = "lab_db";


$con = new mysqli($server, $username, $password, $db);

if(!$con){
    die("Error".mysqli_connect_error());
}

$sql="INSERT INTO lab_tbl (productName, productDescription,
 productQuantity, productPrice, productImage) VALUES ('$productName', '$productDescription',
  '$productQuantity','$productPrice','$photo')";
//   move file to httdocs folder
move_uploaded_file($_FILES['image']['tmp_name'],"upload/".$photo);
$result=mysqli_query($con,$sql);
if($result){
    echo "<div class='message'>Data inserted sucessfully</div>";
} ;
?>
