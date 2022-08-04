<?php
  echo "Testando conexao <br /> <br />";
  $servername= "192.168.0.7";
  $username="phpuser";
  $password= "pass";

  //create connection
  $conn = new mysqli($servername, $username, $password);

  //Check connection
  if($conn->conect_error){
    die("Conexão falhou: " .$conn->connect_error);
  }
  echo "Conectado com Sucesso";
?>
