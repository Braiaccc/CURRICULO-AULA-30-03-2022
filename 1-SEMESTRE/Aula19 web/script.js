$(document).ready(function () {

    $('#mostrar').click(function () {
        $('#paragrafo').show()
    })

    $('#ocultar').click(function () {
        $('#paragrafo').hide()
    })
    $('#calcular').click(function () {

        var resultado = 2 * $('#valor').val()
        $('.resultado').html('O resultado é:' + resultado)
    })



})

$(document).ready(function (){
    $('#mostrar').click(function(){
        $('#paragrafo').show()
    })

    $('ocultar').click(function(){
        $('#paragrafo').hide()
    })
    $('#calcular').click(function(){

        var resultado = 2 * $('#valor').val()
        $('.resultado').html('o resultado sera ' + resultado)
    })

})