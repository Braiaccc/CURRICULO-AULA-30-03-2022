<!DOCTYPE html>
<html lang="pt-br">

<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Document</title>

	<!-- bootstrap    -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

	<!-- JS e CSS -->
	<script src="assets/js/script.js"></script>
	<link rel="stylesheet" href="assets/css/style.css">
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Noto+Serif+Display:wght@400;600&display=swap" rel="stylesheet">
</head>
<body>
	<style>
		*{
			
		}
		header{
			font-family: 'Noto Serif Display', serif;
			
		}
		header h1{
			
		}
	</style>

	<header class="container-fluid bg-black p-5 text-white text-center">
		<nav>
			<h1>ThePwSite</h1>
		</nav>
	</header>
	<div class="container-fluid">
		<div class="row">
			<nav class="col-md-3 p-4">
				<h3>Menu</h3>
				<ul class="nav flex-column">
					<li class="nav-item">
						<a id="btnHome" class="nav-link" href="<?=base_url('/admin')?>">Home</a>
					</li>
				</ul>
				<h3>Clientes</h3>
				<ul class="nav flex-column">
					<li class="nav-item">
						<a id="" class="nav-link" href="<?=base_url('/admin/insertClient')?>">Cadastro</a>
					</li>
					<li class="nav-item">
						<a id="" class="nav-link" href="<?=base_url('/admin/listClients')?>">Lista de Clientes</a>
					</li>
					<li class="nav-item">
						<a id="" class="nav-link" href="<?=base_url('/admin/listContacts')?>">Lista de Contatos</a>
					</li>
				</ul>
			</nav>
			<section class="col-md-9 p-5">