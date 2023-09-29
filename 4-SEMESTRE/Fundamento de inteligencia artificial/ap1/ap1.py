from collections import deque

# Inicialize a lista como um deque vazio
meu_deque = deque()

while True:
    print("\nMenu:")
    print("1- Adicionar no Início")
    print("2- Adicionar no Final")
    print("3- Exibir Primeiro")
    print("4- Exibir Último")
    print("5- Remover Primeiro")
    print("6- Remover Último")
    print("0- Sair")

    escolha = input("Escolha uma opção: ")

    if escolha == "1":
        item = input("Digite o item a ser adicionado no início: ")
        meu_deque.appendleft(item)
        print(f"'{item}' foi adicionado no início.")

    elif escolha == "2":
        item = input("Digite o item a ser adicionado no final: ")
        meu_deque.append(item)
        print(f"'{item}' foi adicionado no final.")

    elif escolha == "3":
        if meu_deque:
            print(f"Primeiro item: {meu_deque[0]}")
        else:
            print("O deque está vazio.")

    elif escolha == "4":
        if meu_deque:
            print(f"Último item: {meu_deque[-1]}")
        else:
            print("O deque está vazio.")

    elif escolha == "5":
        if meu_deque:
            item_removido = meu_deque.popleft()1
            print(f"'{item_removido}' foi removido do início.")
        else:
            print("O deque está vazio.")

    elif escolha == "6":
        if meu_deque:
            item_removido = meu_deque.pop()
            print(f"'{item_removido}' foi removido do final.")
        else:
            print("O deque está vazio.")

    elif escolha == "0":
        print("Saindo do programa.")
        break

    else:
        print("Opção inválida. Por favor, escolha uma opção válida.")