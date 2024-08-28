<?php
function largest($a,$b,$c){
if($a>$b && $a>$c){
    echo "the largest number between three number is a: $a";
}
else if($b>$a && $b>$c){
    echo "the largest number is b: $b";
}
else{
    echo "the largest number is c:$c";
}
}
largest(20,30,15);
?>