public class Ques9 {
    public static void main(String []args)
    {
        WoodenChair wc=new WoodenChair();
        wc.fireTest();
        wc.stressTest();
        WoodenTable wt= new WoodenTable();
        wt.fireTest();
        wt.stressTest();
        MetallicChair mec=new MetallicChair();
        mec.fireTest();
        mec.stressTest();
        MetallicTable mt=new MetallicTable();
        mt.fireTest();
        mt.stressTest();
    }
}
