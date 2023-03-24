<?php

class ClientModel{

    public function listClients(){
        require_once('db/ConnectClass.php');
        $ConnectClass = new ConnectClass();
        $ConnectClass -> openConnect();
        $Connection = $ConnectClass -> getConn();

        $sql = "SELECT * FROM clients";
        return $Connection -> query($sql);
    }

    public function detailsClient($idClient){
        require_once('db/ConnectClass.php');
        $ConnectClass = new ConnectClass();
        $ConnectClass -> openConnect();
        $Connection = $ConnectClass -> getConn();

        $sql = "
            SELECT * FROM clients
            WHERE
            idClient = $idClient
        ";
        return $Connection -> query($sql);
    }

    public function insertClient ($arrayClient){
        require_once('db/ConnectClass.php');
        $ConnectClass = new ConnectClass();
        $ConnectClass -> openConnect();
        $Connection = $ConnectClass -> getConn();

        $sql = "
            INSERT INTO 
                clients (name, email, phone, address)
            VALUES
                (
                    '{$arrayClient['name']}',
                    '{$arrayClient['email']}',
                    '{$arrayClient['phone']}',
                    '{$arrayClient['address']}'
                    
                )
        ";
       
        return $Connection -> query($sql);
    }

    public function updateClient($arrayClient){
        require_once('db/ConnectClass.php');
        $ConnectClass = new ConnectClass();
        $ConnectClass -> openConnect();
        $Connection = $ConnectClass -> getConn();

        $sql = "
            UPDATE clients
                SET 
                    name = '{$arrayClient['name']}',
                    email = '{$arrayClient['email']}',
                    phone = '{$arrayClient['phone']}',
                    address = '{$arrayClient['address']}'
                WHERE
                    idClient = {$arrayClient['idClient']}
        ";
       
        return $Connection -> query($sql);
    }
}