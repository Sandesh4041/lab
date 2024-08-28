<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form</title>
</head>
<body>
    <div class="formContainer">
    <form action="process.php" method="post">
        <label for="username">Enter the name</label>
        <input type="text" name="username"><br>

        <label for="number">phone no.</label>
        <input type="number" name="number"><br>

        <label for="remarks">Remarks</label>
        <textarea name="remarks"></textarea><br>

        <button>Submit</button>
    </form>
    </div>
    
</body>
</html>