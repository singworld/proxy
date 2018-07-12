public class test {
    public static void main(String[] args) {
        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.setName("李娇");
        Proxy daili = new Proxy(jiaojiao);
        daili.GiveDolls();
        daili.GiveFlowers();
        daili.GiveChocolate();
    }
}
