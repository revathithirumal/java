public class price{
    public static void main(String[]args){
        String[]product={"pen","pencil","eraser","note","scale"};
        int[]price={10,5,5,45,5};
        System.out.println("Product details:");
        for (int i=0;i<5;i++) {
            System.out.println(product[i]+":"+price[i]);
        }
    }
}
