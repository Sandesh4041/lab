<style>
    table{
        border-collapse: collapse;
    }
    table,tr,td,th{
        border: 1px solid black;
    }
</style>
<?php
$multiArray=[
    [10, 20, 30, 40],
    [50, 60, 70, 80],
    [90, 100, 110, 120],
    [130, 140, 150, 160]
];
echo "<table>
<thead>
<tr>";
for($i=0;$i<count($multiArray[1]);$i++){
    echo "<th>column".($i+1)."</th>";
}
echo "</tr>
</thead>
<tbody>";
foreach($multiArray as $row){
    echo "<tr>";
    foreach($row as $value){
        echo "<td>".$value."</td>";
    }
    echo "</tr>";
}
echo "
</tbody>
</table>";
?>