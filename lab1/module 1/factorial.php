<?php
function factorial($number){
    if($number<0){
        echo "We cann't do the factorail of a negative number";
    }
    $result=1;
    for($i=1;$i<=$number;$i++){
        $result*=$i;
    }
    echo $result;
}
factorial(5);
?>