<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <style>
h1{
  font-size: 50px;
  color: #ffffff;
  text-transform: uppercase;
  font-weight: 300;
  text-align: center;
  margin-bottom: 15px;
}
table{
  width:100%;
  table-layout: fixed;
}
.tbl-header{
  background-color: rgba(255,255,255,0.3);
 }
.tbl-content{
  height:300px;
  overflow-x:auto;
  margin-top: 0px;
  border: 1px solid rgba(255,255,255,0.3);
}
th{
  padding: 20px 15px;
  text-align: left;
  font-weight: 500;
  font-size: 12px;
  color: #fff;
  text-transform: uppercase;
}
td{
  padding: 15px;
  text-align: left;
  vertical-align:middle;
  font-weight: 300;
  font-size: 12px;
  color: #fff;
  border-bottom: solid 1px rgba(255,255,255,0.1);
}

.btn-block {
      margin-top: 10px;
      text-align: center;
      }
.button {
      width: 150px;
      padding: 10px;
      border: none;
      border-radius: 5px; 
      background: ##3399ff;
      font-size: 16px;
      color: ##00264d;
      cursor: pointer;
      }
.button:hover {
      background: #ffbf00;
      }
      
      
/* demo styles */

@import url(https://fonts.googleapis.com/css?family=Roboto:400,500,300,700);
body{
  background: -webkit-linear-gradient(left, #0099ff, #5c5cd6);
  background: linear-gradient(to right, #0099ff, #5c5cd6);
  font-family: 'Roboto', sans-serif;
}
section{
  margin: 50px;
}


/* follow me template */
.made-with-love {
  margin-top: 40px;
  padding: 10px;
  clear: left;
  text-align: center;
  font-size: 10px;
  font-family: arial;
  color: #fff;
}
.made-with-love i {
  font-style: normal;
  color: #F50057;
  font-size: 14px;
  position: relative;
  top: 2px;
}
.made-with-love a {
  color: #fff;
  text-decoration: none;
}
.made-with-love a:hover {
  text-decoration: underline;
}

.banner {
      position: relative;
      height: 300px;
      background-image: url("assets/img/gallery/17d.jpg");  
      background-size: cover;
      display: flex;
      justify-content: center;
      align-items: center;
      text-align: center;
      }
      .banner::after {
      content: "";
      background-color: rgba(0, 0, 0, 0.2); 
      position: absolute;
      width: 100%;
      height: 100%;
      }


/* for custom scrollbar for webkit browser*/

::-webkit-scrollbar {
    width: 6px;
} 
::-webkit-scrollbar-track {
    -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3); 
} 
::-webkit-scrollbar-thumb {
    -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3); 
}
</style>
 
</head>
<body>
		<h1 class="banner">Update the Sent Message</h1>
		
		
        <form action="update" method="post">
    <table>
        <tr>
            <td>Enter Name </td>
            <td><input type="text" name="NameS" ></td>
        </tr>

        <tr>
            <td>Enter Email </td>
            <td><input type="text" name="EmailS" ></td>
        </tr>            
 
        <tr>
            <td>Enter Subject</td>
            <td><input type="text" name="SubjectS" ></td>
        </tr>

        <tr>
            <td>Enter Message</td>
            <td><input type="text" name="MessageS" ></td>
        </tr>
 
    </table>
    <br>
   
    <center><input class="button" type="submit" value="Update " > </center> <br><br>
   
    </form>
	
	<br><br>


</body>
</html>