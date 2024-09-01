<?php
$data=[
    [
        "name"=>"hari",
        "gender"=>"male",
        "age"=>20,
        "course"=>"web"
    ],
    
    [
        "name"=>"shyam",
        "gender"=>"male",
        "age"=>30,
        "course"=>"android"
    ]

    ];
    echo '<table border="1px" cellpadding="10">';
    echo '<tr>';
echo '<th>name</th><th>gender</th><th>age</th><th>course</th>';
echo '</tr>';
foreach($data as $row){
    echo '<tr>';
    echo '<td>'.$row['name'].'</td>';
    echo '<td>'.$row['gender'].'</td>';
    echo '<td>'.$row['age'].'</td>';
    echo '<td>'.$row['course'].'</td>';
    echo '</tr>';
}
echo '</table>';

?>

