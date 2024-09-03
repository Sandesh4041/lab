
    <?php
    function validation($username,$email,$password){
        $validUser="admin";
        $validEmail="admin@gmail.com";
        $validPassword=md5("admin123");

        $submitedPassword=md5($password);

        if($validUser===$username && $validEmail===$email && $validPassword===$submitedPassword){
            echo "<script>
            window.open('welcome.html', '_blank');
            window.location.href = 'login.html';
          </script>";
        }
        else{
            return false;
        }
    }

    if($_SERVER["REQUEST_METHOD"]==="POST"){
        $username=$_POST['username'];
        $email=$_POST['email'];
        $password=$_POST['password'];

        if(preg_match("/^[A-Za-z]+$/",$username) && filter_var($email,FILTER_VALIDATE_EMAIL)){
            if(validation($username,$email,$password)){
                echo "<script>
                    window.open('welcome.html', '_blank');
                    window.location.href = 'login.html';
                  </script>";
            }
            else{
                echo "<p style='color:red;'>Invalid username,password and email</p>";
            }
        }
        else{
            echo "<p style='color:red;'>Invalid username or email</p>";
        }
    }
    ?>
