<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<form method="post" action="">
<label for="num1">Num1</label>
<input type="number" name="num1" id="num1"><br><br>

<label for="operation">operation</label>
<select name="operation" id="operation">
<option value="add">add</option>
<option value="sub">sub</option>
<option value="mul">mul</option>
<option value="div">div</option>
</select><br><br>

<label for="num2">num2</label>
<input type="number" name="num2" id="num2"><br><br>

<button>calculate</button>
</form>
<?php
if($_SERVER['REQUEST_METHOD']==='POST'){
    $num1=$_POST['num1'];
    $num2=$_POST['num2'];
    $operation=$_POST['operation'];

$result=null;
    $error=null;

    switch($operation){
        case 'add':
            $result=$num1+$num2;
            break;
        case 'sub':
            $result=$num1-$num2;
            break;
        case 'mul':
            $result=$num1*$num2;
            break;
        case 'div':
            if($num2==0){
                $error="cannot divide by 0";
            }
            else{
                $result=$num1/$num2;
            }
            break;
            default:{
                $error="Invalid operation";
            }
    }
    if($error){
        echo "<p style='color:red;'>error:$error</p>";
    }
    else{
        echo "<p style='color:green;'>Result:$result</p>";
    }
}
?>
</body>
</html>