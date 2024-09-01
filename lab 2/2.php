<?php
$array1=[1,2,3,4,5];
$array2=[6,7,8,9,10];
$array3=[1,3,2,5,4];

echo "array1:";
for($i=0;$i<5;$i++){
    echo $array1[$i]." ";
}
echo "<br>";
echo "array2:";
foreach($array2 as $array){
    echo $array." ";
}
?>