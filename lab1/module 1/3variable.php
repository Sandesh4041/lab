<?php
$globalVariable="I am hero you can get me from anywhere..";

function test(){
    $localVariable="I am local variable , i can be called inside the function only ....";
    static $statVariable=0;

    global $globalVariable;

    echo "Global variable:$globalVariable<br>";
    echo "Local Variable:$localVariable<br>";
    echo "static Variable:$statVariable<br>";
    $statVariable++;
}
test();

echo "<br>After first call to the function.";
test();
?>