
    class overloading{
        public int square(int a, int b){
            return a*b;
    }
        public double square(double a, double b){
            return a*b;
    }
    public static void main(String[] args){
        overloading obj= new overloading();
        System.out. println(obj.square(2,5));
        System.out. println(obj.square(4.7,6.3));
    }
    }
    
