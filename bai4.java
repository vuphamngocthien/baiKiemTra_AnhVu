import java.util.ArrayList;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int k;
        ArrayList list = new ArrayList<>();
      
        System.out.println("nhap so luong phan tu trong mang: ");
        n = input.nextInt();

        System.out.println("nhap phan tu trong mang: ");
        for(int i = 0; i<n;i++ )
        {
                k = input.nextInt();
                list.add(k);
            
        }
          ArrayList list2 = list;
        for(int i= 0; i< list.size();i++)
        {

            for(int j= 0; j< list.size();j++)
                {
                   
                if(i == j)
                {
                    continue;
                }
                else if(list.get(i) == list.get(j))
                {
                    Object a = list.get(i);
                    list2.remove(list.get(i));
                    list2.remove(a);
                
                  continue;
                 
                }

              
                }

        }
         System.out.println("phan tu chi xuat hien 1");
        for(int i = 0;i<list2.size();i++)
        {
            System.out.println(list2.get(i));
        }

    }
}
