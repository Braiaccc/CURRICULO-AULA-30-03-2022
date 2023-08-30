valores = [
    [[1,1],[-1,-1], 1],
    [[1,0],[-1,-1], 1],
    [[0,1],[-1,-1], 0],
    [[0,0], [-1,-1], 0]
    ]

def somas():
    s = (entrada[0] * peso[0]) + (entrada[1] * peso[1])
    return s

def rampa(entrada, peso):
    s = somas()
    if s <= 0: return 0
    else: return 1

def sinaptico(peso, entrada, saidas_desejadas, _yo): 
    w1 = peso[0] + 1 * (saidas_desejadas - _yo)*entrada[0]
    w2 = peso[1] + 1 * (saidas_desejadas - _yo)*entrada[1]
    return w1, w2

for i in range(len(valores)):
    saidas_desejadas = valores[i][2]
    peso = valores[i][1]
    entrada = valores[i][0]

    ajustes = 1
    count = 0
    while ajustes != 0:
        ajustes = 0
        valor_rampa = rampa(entrada, peso)
        if valor_rampa != saidas_desejadas:
            ajustes += 1
            peso = sinaptico(peso, entrada, saidas_desejadas, valor_rampa)
        count += 1

    print(f'Retorno saída = {valor_rampa} \nNumeros repetidos {count} ')