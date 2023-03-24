$(document).ready(function () {
    $('#verificaMaior').click(function () {
            var numeros = $('#numeros').val()
            numeros = numeros.split(',')
            var maior = 0
            for (var i = 0; i < numeros.length; i++) {
                var valorAtual = parseFloat(numeros[i])
                if (valorAtual > maior) {
                    maior = numeros[i]
                }
            }
            $('#maiorNumero').html('O maior numero é ' + maior)
    })
})