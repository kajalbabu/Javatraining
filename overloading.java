
    class overloading{
        public int divide(int a, int b) throws ArithmeticException{
            return a/b;
    }
        public double divide(double a, double b){
            return a/b;
    }
    public static void main(String[] args){
        overloading obj= new overloading();
        try{
        System.out. println(obj.divide(8.7,6.3));
        System.out. println(obj.divide(5,0));
        }
        catch(ArithmeticException e){
            System.out.println("Exception occure:"+e);
        }
    }
    }
    
