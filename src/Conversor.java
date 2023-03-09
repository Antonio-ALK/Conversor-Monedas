import javax.swing.*;


public class Conversor extends Moneda {
    boolean convertir = true;

    Object[] conversores = {"Coversor de Monedas", "Conversor de Temperatura"};
    Object[] opciones = {"De dolar a peso", "De euro a peso", "De yen a peso", "De libra esterlina a peso", "De won a peso", "De peso a dolar", "De peso a euro", "De peso a yen", "De peso a libra esterlina", "De peso a won"};
    Object[] temperaturas = {"De celsius a fahrenheit", "De celsius a kelvin", "De fahrenheit a celsius", "De kelvin a celsius","De fahrenheit a kelvin", "De kelvin a fahrenheit"};


    public void covertirMoneda() {

        while (convertir) {
            Object opcion = JOptionPane.showInputDialog(null, "Escoge un Conversor", "Conversor",
                    JOptionPane.INFORMATION_MESSAGE, null, conversores, conversores[0]);


            if (opcion == "Coversor de Monedas") {
                try {
                    Object opciones2 = JOptionPane.showInputDialog(null, "Escoja Opcion", "Opciones",
                            JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

                    int index = 0;
                    for (int i = 0; i <= opciones.length; i++) {
                        index += 1;
                        if (opciones[i] == opciones2) {
                            getOption(index);
                            break;
                        }
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Operacion cancelada");
                }

            } else if (opcion == "Conversor de Temperatura") {
                try {
                    Object temperaturas2 = JOptionPane.showInputDialog(null, "Escoja Opcion", "Opciones",
                            JOptionPane.INFORMATION_MESSAGE, null, temperaturas, temperaturas[0]);

                    int index2 = 0;
                    for (int i = 0; i <= temperaturas.length; i++) {
                        index2 += 1;
                        if (temperaturas[i] == temperaturas2) {
                            getTemperature(index2);

                            break;
                        }
                    }

                }catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Operacion cancelada");
                }
            }else{
                    JOptionPane.showMessageDialog(null, "Programa Terminado");
                    break;
                }

                int returnValue = JOptionPane.showConfirmDialog(null, "Desea continuar", "seguir", JOptionPane.YES_NO_OPTION);
                if (returnValue == 1) {
                    JOptionPane.showMessageDialog(null, "Programa Terminado");
                    convertir = false;
                }

            }
        }

        public void getOption(int index) {
        switch (index) {
            case 1:
                double dolares = Double.parseDouble(JOptionPane.showInputDialog("ingrese cantidad de dolares"));
                String dolaretes = String.valueOf(dolares * getDollar());
                JOptionPane.showMessageDialog(null, "la cantidad en pesos es = " + dolaretes);
                break;

            case 2:
                double euros = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad en euro"));
                String euros2 = String.valueOf(euros * getEuro());
                JOptionPane.showMessageDialog(null, "la cantidad en pesos es = " + euros2);
                break;

            case 3:
                double yenes = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad en yen"));
                String yenes2 = String.valueOf(yenes * getYen());
                JOptionPane.showMessageDialog(null, "la cantidad en pesos es = " + yenes2);
                break;

            case 4:
                double libras = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad en libra esterlina"));
                String libras2 = String.valueOf(libras * getLibra());
                JOptionPane.showMessageDialog(null, "la cantidad en pesos es = " + libras2);
                break;

            case 5:
                double wones = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad de en won"));
                String wones2 = String.valueOf(wones * getWon());
                JOptionPane.showMessageDialog(null, "la cantidad en pesos es = " + wones2);
                break;

            case 6:
                double pesoDollar = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad en pesos a dolar"));
                String pesoDolar2 = String.valueOf(pesoDollar / getDollar());
                JOptionPane.showMessageDialog(null, "la cantidad en dolar es = " + pesoDolar2);
                break;

            case 7:
                double pesoEuro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad de pesos a euro"));
                String pesoEuro2 = String.valueOf(pesoEuro / getEuro());
                JOptionPane.showMessageDialog(null, "la cantidad en euro es = " + pesoEuro2);
                break;

            case 8:
                double pesoYen = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad de pesos a yen"));
                String pesoYen2 = String.valueOf(pesoYen / getYen());
                JOptionPane.showMessageDialog(null, "la cantidad en yen es = " + pesoYen2);
                break;

            case 9:
                double pesoLibra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad de pesos a libra esterlina"));
                String pesoLibra2 = String.valueOf(pesoLibra / getLibra());
                JOptionPane.showMessageDialog(null, "la cantidad en libras esterlinas es = " + pesoLibra2);
                break;

            case 10:
                double pesoWon = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad de pesos a won"));
                String pesoWon2 = String.valueOf(pesoWon / getWon());
                JOptionPane.showMessageDialog(null, "la cantidad en won es = " + pesoWon2);
                break;

            default:
                break;
        }


    }

    public void getTemperature(int index2) {
        switch (index2){
            case 1: double celsiusF = Double.parseDouble(JOptionPane.showInputDialog("ingrese temprerura en celsius"));
                    String celiusF2 = String.valueOf(celsiusF * 9/5+32);
                    JOptionPane.showMessageDialog(null, "La cantidad de grado en fahrenheit es = " + celiusF2);
                   break;

            case 2: double celsiusK = Double.parseDouble(JOptionPane.showInputDialog("Ingrese temperatura en celsius"));
                    String celsiusK2 = String.valueOf(celsiusK + 273.15);
                    JOptionPane.showMessageDialog(null,"La cantidad de grados en kelvin es =" + celsiusK2);
                    break;

            case 3: double fahrenheitC = Double.parseDouble(JOptionPane.showInputDialog("Ingrese temperatura en fahrenheit"));
                    String fahrenheitC2 = String.valueOf((fahrenheitC - 32)*5/9 );
                    JOptionPane.showMessageDialog(null,"La cantidad de grados en celsius es =" + fahrenheitC2);
                    break;

            case 4: double kelvinC = Double.parseDouble(JOptionPane.showInputDialog("Ingrese temperatura en kelvin"));
                    String kelvinC2 = String.valueOf(kelvinC -273.15);
                    JOptionPane.showMessageDialog(null,"La cantidad de grados en celsius es =" + kelvinC2);
                    break;

            case 5: double fahrenheitK = Double.parseDouble(JOptionPane.showInputDialog("Ingrese temperatura en  fahremheit"));
                    String fahrenheitK2 = String.valueOf((fahrenheitK -32)*5/9+273.15);
                    JOptionPane.showMessageDialog(null,"La temperatura en kelvin es =" + fahrenheitK2);
                    break;

            case 6: double kelvinF = Double.parseDouble(JOptionPane.showInputDialog("Ingrese temperatura en kelvin"));
                    String kelvinF2 = String.valueOf((kelvinF - 273.15)*5/9+32);
                    JOptionPane.showMessageDialog(null,"La temperatura en fahrenheit es =" + kelvinF2);
                    break;
        }


    }

}

