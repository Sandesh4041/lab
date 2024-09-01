<?php
$students=[
    'student 1'=>[40,50,70,80,40],
    'student 2'=>[60,60,80,80,40],
    'student 3'=>[30,50,70,30,40],
    'student 4'=>[40,40,70,50,40],
    'student 5'=>[40,70,70,40,40],
    'student 6'=>[30,90,90,80,40]
];
function calculation($marks){
$total=array_sum($marks);
$percentage=($total/(5*100))*100;
$division='';

if($percentage>=80){
    $division= "Distinction";
}
else if($percentage>=60){
    $division= "first division";
}
else if($percentage>=45){
    $division= "second division";
}
else{
    $division= "fail";
}
return [$total, $percentage, $division];
}
?>
<style>
      table {
            width: 100%;
            border-collapse: collapse;
        }
        table, th, td {
            border: 1px solid black;
        }
        th, td {
            padding: 8px;
            text-align: center;
        }
</style>
<body>
    <h1>Data of students</h1>
    <table>
        <thead>
        <tr>
            <th>Name</th>
            <th>subject 1</th>
            <th>subject 2</th>
            <th>subject 3</th>
            <th>subject 4</th>
            <th>subject 5</th>
            <th>Total</th>
            <th>Percentage</th>
            <th>Division</th>
        </tr>
        </thead>
       <tbody>
        <?php foreach($students as $name=>$marks):?>
        <?php list($total,$percentage,$division)= calculation($marks); ?>
        <tr>
            <td><?php echo $name ?> </td>
            <?php foreach($marks as $mark): ?>
            <td><?php echo $mark ?></td>
            <?php endforeach; ?>
            <td><?php echo $total ?></td>
            <td><?php echo $percentage ?></td>
            <td><?php echo $division ?></td>
        </tr>
        <?php endforeach; ?>

       </tbody>
     
    </table>
</body>