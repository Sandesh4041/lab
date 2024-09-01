<?php
function fibonaciSeries($term)
{
    $fibonaci = [];
    $fibonaci[0] = 0;
    $fibonaci[1] = 1;
    for ($i = 2; $i < $term; $i++) {
        $fibonaci[$i] = $fibonaci[$i - 1] + $fibonaci[$i - 2];
    }
    return $fibonaci;
}
$fibo=fibonaciSeries(10);
// print_r($fibo);
foreach($fibo as $num){
    echo $num." ";
}
?>