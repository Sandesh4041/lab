<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
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
</head>
<body>
    <div class="form-container">
        <form method="post" action="">
        <label>Gender:</label>
            <input type="radio" id="male" name="gender" value="Male">
            <label for="male">Male</label>
            <input type="radio" id="female" name="gender" value="Female">
            <label for="female">Female</label><br><br>
  
    <label for="course">Course:</label>
            <select id="course" name="course">
                <option value="Computer Science">Computer Science</option>
                <option value="Mathematics">Mathematics</option>
                <option value="Physics">Physics</option>
            </select><br><br>

            <label for="comments">Comments:</label><br>
            <textarea id="comments" name="comments" rows="2" cols="30"></textarea><br><br>

            <button type="submit">Submit Data</button>
        </form>
    </div>
    <?php
    if($_SERVER['REQUEST_METHOD']==='POST'){
        $gender=$_POST['gender'];
        $course=$_POST['course'];
        $comments=$_POST['comments'];
        try{
            if(!empty( $gender)&& !empty($course) && !empty( $comments)){
                echo '<table>';
                echo '<tr><th>Gender</th><th>course</th><th>comments</th></tr>';
                echo '<tr>';
                echo '<td>'.$gender.'</td>';
                echo '<td>'.$course.'</td>';
                echo '<td>'.$comments.'</td>';
                echo '</tr>';
                echo '</table>';
            }
    
            else{
                echo "there is no data ";
            }
        }
        catch(Exception $e){
            echo "error:".$e->getMessage();
        }

       
    }
    ?>
</body>
</html>