<?php

namespace App\Controllers\Admin;

use App\Models\ClientModel;

use App\Models\ContactModel;

use App\Controllers\BaseController;

class Client extends BaseController{

    public function listClients(){
        $ClientModel = new ClientModel();
        $data = [
            'arrayClients'=>$ClientModel->findAll()
        ];
        echo view ('admin/templates/header');
        echo view ('admin/client/listClients', $data);
        echo view ('admin/templates/footer');
    }

    public function listContacts(){
        $ContactModel = new ContactModel();
        $data = [
            'arrayClients'=>$ContactModel->findAll()
        ];
        echo view ('admin/templates/header');
        echo view ('admin/client/listContacts', $data);
        echo view ('admin/templates/footer');
    }

    public function insertClient(){
        echo view ('admin/templates/header');
        echo view ('admin/client/insertClient');
        echo view ('admin/templates/footer');
    }

    public function insertClientAction(){
        $data = [
            'name' => $this  -> request -> getVar('name'),
            'email' => $this  -> request -> getVar('email'),
            'phone' => $this  -> request -> getVar('phone'),
            'address' => $this  -> request -> getVar('address')
        ];

        $ClientModel = new ClientModel();
        $ClientModel -> insert($data);
        return redirect()->to(base_url('admin/listClients'));
    }

    public function updateClient($id){
        $ClientModel = new ClientModel();
        $data = [
            'arrayClient'=>$ClientModel->find($id)
        ];

        echo view ('admin/templates/header');
        echo view ('admin/client/updateClient', $data);
        echo view ('admin/templates/footer');
    }
    public function updateClientAction($id){
        $data = [
            'name' => $this  -> request -> getVar('name'),
            'email' => $this  -> request -> getVar('email'),
            'phone' => $this  -> request -> getVar('phone'),
            'address' => $this  -> request -> getVar('address')
        ];

        $ClientModel = new ClientModel();
        $ClientModel -> update($id, $data);
        return redirect()->to(base_url('admin/listClients'));
    }

    public function deleteClient($id){
        $ClientModel = new ClientModel();
        $ClientModel -> delete($id);
        return redirect()->to(base_url('admin/listClients'));
    }

    public function detailsClient($id){
        $ClientModel = new ClientModel();
        $data = [
            'arrayClient'=>$ClientModel->find($id)
        ];

        echo view ('admin/templates/header');
        echo view ('admin/client/detailsClient', $data);
        echo view ('admin/templates/footer');
    }
}
