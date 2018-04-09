package urltest;

public class URLTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url = "http://www.ntust.edu.tw/home.php";
        System.out.println("input=" + url);
        ParseUrl parseurl = new ParseUrl(url);

    }

    static public class ParseUrl {

        public ParseUrl(String Url) {
     
            int index1 = Url.indexOf(":");
            System.out.println("protocol=" + Url.substring(0, index1));
            int index2 = index1 + 3;
            String withoutProtocol = Url.substring(index2);
            int index3 = withoutProtocol.indexOf("/");
            String host = withoutProtocol.substring(0, index3);
            System.out.println("host=" + host);
            int index4 = host.indexOf(".");
            String domain = host.substring(index4 + 1);
            System.out.println("domain= " + domain);
            String path = withoutProtocol.substring(index3);
            String tokens[] =path.split("\\.");//網路上說“.”和“|”都是轉義字符，必須得加"\\";
            String fileName= tokens[0];
            String fileType= tokens[1];
            System.out.println("fileName=" + fileName.substring(1));
            System.out.println("fileType=" + fileType);
            
            
            System.out.println("path=" + path);
        }

    }
}
