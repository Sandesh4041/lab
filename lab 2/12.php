<style>
    table{
    width: 80%;
    margin: auto;
        border: 1px solid black;
        border-collapse: collapse;
    }
    th,tr,td{
        border: 1px solid black;
    }
</style>
<?php
$items=[
    [
        "Title of goods"=>"book",
        "price"=>600,
        "quantity"=>16
    ],
    [
        "Title of goods"=>"copy",
        "price"=>450,
        "quantity"=>20
    ],
    [
        "Title of goods"=>"pen",
        "price"=>300,
        "quantity"=>32
    ]
    ];
    echo "<table>";
    echo '<tr><th>Title of goods</th><th>price</th><th>quantity</th><th>total</th></tr>';
    $sum=0;
    foreach($items as $row){
        echo '<tr>';
        echo '<td>'.$row['Title of goods'].'</td>';
        echo '<td>'.$row['price'].'</td>';
        echo '<td>'.$row['quantity'].'</td>';
         $total=$row['price']*$row['quantity'];
         echo '<td>'.$total.'</td>';
         $sum+=$total;
        echo '</tr>';
    }
    echo '<tr><td colspan="3" style="text-align:center">Sum total</td>';
echo '<td>'.$sum.'</td>';
echo '</tr>';
    echo '</table>';

?>