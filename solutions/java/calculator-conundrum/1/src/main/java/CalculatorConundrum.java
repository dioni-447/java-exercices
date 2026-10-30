class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        int resultado=0;
        try{
            if(operation==null){
                throw new IllegalArgumentException("Operation cannot be null");
            }
            if(operation.isEmpty()){
                throw new IllegalArgumentException("Operation cannot be empty");
            }
            if(operation!="+"&& operation!="*"&& operation!="/"){
                throw new IllegalOperationException("Operation '"+operation+"' does not exist");
            }
                if(operation =="+"){
                    resultado=operand1+operand2;
                }
                if(operation == "*"){
                    resultado=operand1*operand2;
                }
                if(operation == "/"){
                    resultado=operand1/operand2;
                }
        }
        catch(ArithmeticException e){
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }
        return operand1+" "+operation+" "+operand2+ " = "+resultado;
    }
}
