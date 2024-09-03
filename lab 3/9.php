<?php
$productName=$_POST['productName'];
$productDescription=$_POST['productDescription'];
$productPrice=$_POST['productPrice'];
$productQuantity=$_POST['productQuantity'];
$photo=$_FILES['image']['name'];

if(!empty($productName)&&!empty($productDescription)&& is_numeric($productPrice) && is_numeric($productQuantity)){
if(move_uploaded_file($_FILES['image']['tmp_name'],"images/".$photo)){
    echo '<div style="color:red">The image file has been uploded sucessfully,
    Product Data Entered Sucessfully.</div>';
    echo '<hr>';
    include "9.html";
};


}
?>