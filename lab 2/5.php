<style>
    table{
        border-collapse: collapse;
    }
    table,tr,td,th{
        border: 1px solid black;
    }
</style>
<?php
$items=[
    "Name"=>"Ram",
    "Age"=>20,
    "gender"=>"male"
];
echo "<div style='background-color: green;text-align:center;'>Data</div>";
echo "<br>";
echo "<table>
<thead>
<tr>
<th>key</th>
<th>value</th>
</tr>
</thead>
<tbody>
<tr>
<td>Name</td>
<td>".($items['Name'])."</td>
</tr>
<tr>
<td>Age</td>
<td>".$items['Age']."</td>
</tr>
<tr>
<td>Gender</td>
<td>".$items['gender']."</td>
</tr>
</table>";
?>