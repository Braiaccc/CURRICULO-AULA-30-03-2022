// $(document).ready(function(){
//     // function encontrarIdades()
//     $('#executar').click(function(){
//         event.preventDefault();

//         let idades = parseFloat($('#idades').val()) 
        

//         console.log(maior);
//         console.log(menor);

//         for(let i = 0; i < arrIdades.length; i++){
//             if(arrIdades[i] < 18){
//                 menor++;
//             }
//             else{
//                 maior++;
//             }
//         }

//         // idadesFinal.value = `\nMenor de idade = ${menor} pessoas\n\nMaior de idade = ${maior} pessoas`; 
//         $('#idadesFinal').html(`o maior sera:` + maior + `e o menor sera o:` + menor)
//     })
// })

//maior que 18
//menor que 18

$(document).ready(function () {
    $('#executar').click(function () {
            var numeros = $('#idades').val()
            numeros = numeros.split(',')
            var maior = 0
            var menor = 0
            
            for (var i = 0; i < numeros.length; i++) {
                // var valorAtual = parseFloat(numeros[i])
                if (numeros[i] < 18) {
                    menor++
                }else {
                    maior++
                }
            }

            $('#mostrarIdades').html('Menor de idade:\n ' + menor + ` \nMaior de idade: ` + maior)
    })
})

