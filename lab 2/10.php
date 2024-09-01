<?php
$array1=[1,2,3,4];
$array2=[5,6,7,8];
$array3=[9,10,11,12];

$mergeArray=array_merge($array1,$array2,$array3);

echo "merged array :";
print_r($mergeArray);

$total=count($mergeArray);
echo "the total no. in merged array is $total"."<br>";

$rearrangeMergedArray=array_slice($mergeArray,3,6);
echo "rearrange of merged array is:";
print_r($rearrangeMergedArray);

?>