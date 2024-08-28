<?php
$a=10;
$b=5;

function div(){
    global $a;
    global $b;
    $c=$a/$b;
    echo "the result of a/b is :$c";
}
div();
?>