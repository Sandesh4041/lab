<?php
$data=[
    [
        'id' => 1,
        'name' => 'John',
        'email' => 'john@example.com'
    ],
    [
    'id' => 4,
        'name' => 'don',
        'email' => 'don@example.com'
    ],
    [
        'id' => 3,
        'name' => 'son',
        'email' => 'son@example.com'
    ]
    
    ];
    function display($data){
        echo '<table border="1" cellpadding="10">';
    echo '<tr><th>ID</th><th>Name</th><th>Email</th></tr>';
    
    foreach ($data as $row) {
        echo '<tr>';
        echo '<td>' . htmlspecialchars($row['id']) . '</td>';
        echo '<td>' . htmlspecialchars($row['name']) . '</td>';
        echo '<td>' . htmlspecialchars($row['email']) . '</td>';
        echo '</tr>';
    }
    
    echo '</table><br>';
    }
    echo "Before sort";
    display($data);
    usort($data,function($a,$b){
        return $b['id']<=>$a['id'];
    });
    echo "After sort";
    display($data);
    ?>