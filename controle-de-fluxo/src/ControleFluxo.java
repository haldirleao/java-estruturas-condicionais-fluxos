public class ControleFluxo {
    public static void main(String[] args) throws Exception {

        // 📓 Controle de fluxo. São estruturas com capacidade de direcionar o fluxo de
        // execução do código.
        // Tipos:
        // de decisão: if, if-else, if-else-if, switch, operador ternario
        // de repetição: for, while, do while
        // de interrupção: break, continue, return

        // Nessa aula foram apresentados somente as estruturas de decisão.

        // Sintaxes if-else:
        // if: if (condição) {bloco se verdadeiro}

        // if-else: if (condição) {bloco se verdadeiro} else {bloco se falso}

        // if-else-if: if (condição) {bloco se verdadeiro} else if {condição} {bloco se
        // verdadeiro} else {bloco se falso}

        if (2 == 2) {
            System.out.println("2 é igual a 2");
        }

        if (true) {
            System.out.println("True = verdadeiro");
        }

        if (1 < 2) {
            System.out.println("V");
        } else {
            System.out.println("F");
        }

        // 📓 LEMBRE-SE DAS BOAS PRÁTICAS
        // Switch é usado para valores inteiros (teste com uma variável).
        // If para expressões booleanas (teste com 2 ou mais variáveis, em expressões
        // que retornam true ou false).
        // Evitar usar o case default do switch para "cases genéricos"
        // Evite muitos if aninhados

        // ✍🏽EXERCÍCIO
        // Criar um projeto. Criar as variáveis e expressões para usar nas estruturas if
        // & switch.
        // Usando if, exiba o nome do mês do ano de acordo com o seu número. Evite o
        // efeito "flecha".
        // Faça também outro if que verifique se o mês é Julho, Dezembro ou Janeiro. Cas
        // seja, exiba o texto FÉRIAS.

        // Usando switch use String para, a partir do dia da semana, exibir seu número.
        // Ainda no switch, faça outro exemplo onde, se uma variável inteira for entre 1
        // e 3, exibir o texto CERTO. Se 4, ERRADO e se 5, TALVEZ. Para demais valores
        // exibir INDEFINIDO.

        ifFlecha();
        ifSemFlecha();
        ifFerias();
        ifMenor();

        switchSemana();
        switchNumero();
        switchFerias();

    }

    // ⚠️Código com muitos if aninhadas, geralmente, estão mal projetados!
    private static void ifFlecha() {

        int mes = 2;

        if (mes == 1) {
            System.out.println("Janeiro");
        } else {
            if (mes == 2) {
                System.out.println("Fevereiro");
            } else {
                if (mes == 3) {
                    System.out.println("Março");
                } else {
                    if (mes == 4) {
                        System.out.println("Abril");
                    } else {
                        if (mes == 5) {
                            System.out.println("Maio");
                        } else {
                            if (mes == 6) {
                                System.out.println("Junho");
                            } else {
                                if (mes == 7) {
                                    System.out.println("Julho");
                                } else {
                                    if (mes == 8) {
                                        System.out.println("Agosto");
                                    } else {
                                        if (mes == 9) {
                                            System.out.println("Setembro");
                                        } else {
                                            if (mes == 10) {
                                                System.out.println("Outubro");
                                            } else {
                                                if (mes == 11) {
                                                    System.out.println("Novembro");
                                                } else {
                                                    if (mes == 12) {
                                                        System.out.println("Dezembro");
                                                    } else {
                                                        System.out.println("Mês indefinido");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    // NOTE que esta solução fica melhor que a anterior (Sem efeito flecha).
    private static void ifSemFlecha() {

        int mes = 13;

        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        } else {
            System.out.println("Mês indefinido");
        }
    }

    // ⚠️Resolve o problema, mas não da melhor maneira.
    private static void ifFerias() {

        String mes = "janeiro";

        if (mes == "julho" || mes == "dezembro" || mes == "janeiro") {
            System.out.println("FÉRIAS");
        }

    }

    // Criando variáveis intermediárias para que o código fique mais legível e
    // elegante.
    private static void ifMenor() {

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        // 🚫Não faça assim!
        if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)) {
            System.out.println("Funcionário deve receber auxílio.");
        }

        // ✅Prefira assim!
        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        if (recebeAuxilio) {
            System.out.println("Funcionário deve receber auxílio.");
        } else {
            System.out.println("Funcionário não deve receber auxílio.");
        }
    }

    private static void switchSemana() {

        String dia = "Domingo";

        switch (dia) {
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sábado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(1);
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    }

    private static void switchNumero() {

        int numero = 5;
        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor Indefinido");
                break;
        }
    }

    private static void switchFerias() {

        String mes = "dezembro";
        switch (mes) {
            case "dezembro":
            case "julho":
            case "janeiro":
                System.out.println("Férias");
                break;
            default:
                System.out.println("Mês Indefinido");
                break;
        }
    }

}
