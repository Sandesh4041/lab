<?php
function isdivisible($num1,$num2){
    if($num2==0){
        return "we cannot divide the number by 0";
    }
    if($num1%$num2==0){
        return "Exactly divisible by second number";
    }
    else{
        return "Exactly not divide by second number";
    }
}
 echo isdivisible(10,5);
?>