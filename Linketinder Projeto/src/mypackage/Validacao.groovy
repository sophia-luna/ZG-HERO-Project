package mypackage

class Validacao {

    static int opcaoValida(String input){

        int opcaoMenu;
        try{
            opcaoMenu=Integer.parseInt(input);
            if (opcaoMenu>0 && opcaoMenu<=7){
                return opcaoMenu
            }
            else{
                return 0
            }
        }
        catch(NumberFormatException e) {
            return 0
        }
    }

    static boolean idadeValida(String input){

        int idade
        try{
            idade=Integer.parseInt(input)
            if(idade>0 && idade<100){
                return idade
            }
            else{
                return 0
            }
        }
        catch (NumberFormatException e){
            return 0
        }

    }

    static boolean simNaoValido(String input){
        input=input.toLowerCase()
        if(input!="s" && input!="n"){
            return false
        }
        return true
    }

}
