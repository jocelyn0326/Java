package hw11_collection;
//B10509040_郭宜萱
import java.io.*;//Exception
import java.util.*;//Collection
import java.util.Arrays;//排序用
import java.util.Comparator;//排序用

public class HW11_Collection {

    static class CompareName implements Comparator< Member> {

        @Override
        public int compare(Member x, Member y) {
            return x.getName().compareTo(y.getName());
        }
    }

    static class CompareDate implements Comparator< Member> {

        @Override
        public int compare(Member x, Member y) {
            return x.getBirthday().compareTo(y.getBirthday());
        }
    }

    static class CompareDeposit implements Comparator< Member> {

        @Override
        public int compare(Member x, Member y) {
             return y.getDeposit() - x.getDeposit();
        }
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        LinkedList<Member> li_m = new LinkedList();

        FileReader fr = new FileReader("member.txt");
        BufferedReader br = new BufferedReader(fr);
        while (br.ready()) {
            String temp = br.readLine();
            String line[] = temp.split("\t");
            Member members = new Member();
            Date birthday = new Date(line[1]);

            members.setName(line[0]);
            members.setBirthday(birthday);
            members.setAddress(line[2]);
            members.setPhone(line[3]);
            members.setDeposit(line[4]);
            li_m.add(members);
        }
        System.out.println("==================================名字排序後==================================");
        CompareName com_name= new CompareName();
        li_m.sort(com_name);
        output(li_m);
         System.out.println("==================================生日排序後==================================");
        CompareDate com_birthday= new CompareDate();
        li_m.sort(com_birthday);
        output(li_m);

        System.out.println("==================================存款排序後==================================");
        CompareDeposit com_de= new CompareDeposit();
        li_m.sort(com_de);
        output(li_m);
              
        br.close();
        fr.close();
        
    }

    public static void output(LinkedList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
}
