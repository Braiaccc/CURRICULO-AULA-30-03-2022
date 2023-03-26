// pegar o número
// extrair cada algarismo para uma posição pra dentro do array
// usar função split('')
// percorrer o vetor ao contrário
// aplicar fórmula (a*bp) e cada resultado ir somando. 

// para transformar um número em um array e cada algarismo atribuir a uma posição do array use o número como string. Ex. 

function binary(){
var num=document.getElementById("number").value;
var sum=0;
var i=0;
while(num){
    sum=sum+Math.pow(2,i)*(num%10);
    i++;
    num=parseInt(num/10);
}
alert(sum);
}