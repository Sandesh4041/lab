<?php
$array=[1,2,3,4,5];

echo "Original array:\n";
print_r($array);

array_unshift($array,"A",9);
echo"adding two element at front"."<br>";
print_r($array);

array_push($array,"B",10);
echo"adding two element at end"."<br>";
print_r($array);

array_pop($array);
echo"removing the last element"."<br>";
print_r($array);


?>