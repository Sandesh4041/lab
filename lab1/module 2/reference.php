<?php
$a=10;
$b=&$a;

echo"before modification<br>";
echo "A is $a<br>";
echo "b is $b<br>";

$b=20;
echo "after modification<br>";
echo "A is $a<br>";
echo "b is $b";
?>