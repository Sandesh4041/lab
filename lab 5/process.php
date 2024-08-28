<?php
// $username=$_POST['username'];
// $phoneno=$_POST['number'];
// $remarks=$_POST['remarks'];

// To create a data.txt file---->
// ............................................
// $f=fopen("data.txt","w");
// fwrite($f,"$username\n$phoneno\n$remarks");
// fclose($f);
// echo "file created and data inserted in file."
// -----------------------------------------------------



// To read all file----> 
// -------------------------------------------------
// $f=fopen("data.txt","r");
// echo fread($f,filesize("data.txt"));
// ---------------------------------------------------



// feof is used for check if the end of the file has reached or not....... 

// while(!(feof($f))){
// echo fgetc($f);check for character by character word...
// echo fgets($f);check for line by line word...
// }



// To read a third line only-------> 
// --------------------------------------------
// $f=fopen("data.txt","r");
// if($f){
//     $lineNumber=0;
//     while(!(feof($f))){
//         $line=fgets($f);
//         $lineNumber++;
//         if ($lineNumber==3){
//             echo $line;
//             break;
//         }
       
//     }
//     fclose($f);
    
// }
// else{
//     echo "there is no data up to 3 lineNumber";
// }
// --------------------------------------------------------



// To append a data in data.txt file -----> 
// --------------------------------------------
$f=fopen("data.txt","a");
fwrite($f,"\nsomething is added here.... what is this??");
fclose($f);
echo "data is appended";
// -----------------------------------------------------


// To delete a file-----> 
// -------------------------------
// $f="data.txt";
// unlink($f);
// echo "file delted sucessfully";
// ----------------------------

?>