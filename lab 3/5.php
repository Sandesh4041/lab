<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
    table{
    width: 80%;
    margin: auto;
        border: 1px solid black;
        border-collapse: collapse;
    }
    th,tr,td{
        border: 1px solid black;
    }
</style>
</head>
<body>
    <div class="form-container">
        <form method="post" action="">
            <label>enter the name</label>
            <input type="text" name="username"><br>
            <label>enter the address</label>
            <input type="text" name="address"><br>
            <label>enter the email</label>
            <input type="text" name="email"><br>
            <button>submit</button>
        </form>
    </div>
    
<?php
if($_SERVER['REQUEST_METHOD']==='POST'){
    $username=isset($_POST['username'])?$_POST['username']:"";
    $address=isset($_POST['address'])?$_POST['address']:"";
    $email=isset($_POST['email'])?$_POST['email']:"";



if(!empty($username) && !empty($address) && !empty($email)){
    echo '<table>';
    echo '<tr><th>Name</th><th>Address</th><th>Email</th></tr>';
    echo '<tr>';
    echo '<td>'.$username.'</td>';
    echo '<td>'.$address.'</td>';
    echo '<td>'.$email.'</td>';
    echo '</tr>';
    echo '</table>';
}
else{
    echo "there is a empty field";
}
}


?>
</body>
</html>
