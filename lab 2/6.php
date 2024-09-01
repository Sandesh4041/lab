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
    "gender"=>"male",
    "study"=>"bachelore",
    "course"=>"BIM"
];
// print_r($items);
echo "<table>
<thead>
<tr>
<th>Name</th>
<th>Age</th>
<th>Gender</th>
<th>study</th>
<th>course</th>
</tr>
</thead>
<tbody>
<tr>";
foreach($items as $name=>$value){
    echo " <td>".$value."</td>";
}
echo "</tr>
</tbody>
</table>";
?>