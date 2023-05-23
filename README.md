# Aula 15 de Estrutura de Dados I — validação de delimitadores

Programa de console que verifica se parênteses `()`, colchetes `[]` e chaves `{}` aparecem em pares e na ordem correta. Cada abertura é empilhada. Cada fechamento consulta e remove a última abertura para conferir se os tipos correspondem.

- [`Program.java`](atividade1/src/application/Program.java) lê uma linha e apresenta o resultado.
- [`Calc.java`](atividade1/src/util/Calc.java) verifica os delimitadores.
- [`PilhaDinamica.java`](atividade1/src/pilhaDinamica/PilhaDinamica.java) e [`CelulaPilha.java`](atividade1/src/pilhaDinamica/CelulaPilha.java) implementam a pilha encadeada.

## Como executar

Use o JDK 17 ou posterior. Na raiz do repositório, rode no PowerShell.

```powershell
javac --release 17 -encoding UTF-8 -d build (Get-ChildItem -Path atividade1/src -Recurse -Filter *.java -File).FullName
java -cp build application.Program
```

Digite `{1 + [2 * (3)]}` para ver `Delimitadores balanceados.` ou `([)]` para ver `Delimitadores desbalanceados.`. A verificação ignora números, operadores e outros caracteres. Ela avalia o balanceamento dos delimitadores, sem analisar a sintaxe matemática.
