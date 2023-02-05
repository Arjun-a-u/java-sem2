class Static1
{
    static int a = 10;
    static void display()
    {
        System.out.println("This is a static function");
    }
    public static void main(String[] args) 
    {
        Static1 obj = new Static1();
        Static1.display();
        System.out.println(Static1.a);
        System.out.println(obj.a);
        Static1.a = 20;
        System.out.println(Static1.a);
        System.out.println(obj.a);
    }
}
