$(document).ready(() => {

    $('section').load('assets/pages/home.html')
    $('#menuHome').addClass('disabled');

    $('#noticias').click(() => {
        $('section').load('assets/pages/noticias.html')
    })

    function removeClassMenu(){
        $('#menuHome').removeClass('disabled');
        $('#menuSobre').removeClass('disabled');
        $('#menuProdutos').removeClass('disabled');
        $('#menuContato').removeClass('disabled');
    }

    $('#menuHome').click(() => {
        $('section').load('assets/pages/home.html')
        removeClassMenu()
        $('#menuHome').addClass('disabled');
    })

    $('#menuSobre').click(() => {
        removeClassMenu()
        $('section').load('assets/pages/sobre.html')
        $('#menuSobre').addClass('disabled');

    })

    $('#menuProdutos').click(() => {
        removeClassMenu()
        $('section').load('assets/pages/produtos.html')
        $('#menuProdutos').addClass('disabled');
    })

    $('#menuContato').click(() => {
        removeClassMenu()
        $('section').load('assets/pages/contato.html')
        $('#menuContato').addClass('disabled')
    })
})
