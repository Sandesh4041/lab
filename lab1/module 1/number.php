<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="" method="post">
    <label>Enter the number</label>
    <input type="number" name="number" id="number">
    <button>Submit</button>
    </form>
</body>
</html>

<?php
if($_SERVER["REQUEST_METHOD"]=="POST"){
    if(isset($_POST['number'])){
        $number=$_POST['number'];
  
    if ($number === ''){
        echo "please input some number";
    }
    else{
        if($number>0){
            echo "$number is positive number";
        }
        
        elseif($number==0){
            echo "$number is zero";
           
        }
        else{
            echo "$number is negative number";
        }
    }
        
    
    }
}
?>
