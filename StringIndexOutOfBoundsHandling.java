// Example for StringIndexOutOfBoundaryHandling
class StringIndexOutOfBoundsHandling{
    public static void main(String[] args){
        String s="basha";
        try{
        System.out.print(s.length());
        System.out.print(s.charAt(6));
    }
    catch(Exception e){
        System.out.println(e);
    }
     System.out.println("Given string is:"+s);
    }
}