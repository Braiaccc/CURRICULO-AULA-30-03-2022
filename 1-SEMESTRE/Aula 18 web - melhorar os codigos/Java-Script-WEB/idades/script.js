function encontrarIdades(){
    event.preventDefault();

    let idades = document.getElementById("idades").value;
    let arrIdades = idades.split(",").map(Number);
    let idadesFinal = document.getElementById("idades-final");
    var [maior, menor] = [0,0];

    console.log(maior);
    console.log(menor);

    for(let i = 0; i < arrIdades.length; i++){
        if(arrIdades[i] < 18){
            menor++;
        }
        else{
            maior++;
        }
    }

    idadesFinal.value = `\nMenor de idade = ${menor} pessoas\n\nMaior de idade = ${maior} pessoas`;
}