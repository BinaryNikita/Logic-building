public class _163DomainNameExtracter {
   public static void main(String[] args) {
    //Extract the domain name from the email address "example@example.com".
       String email = "example@example.com";
       String domainName = "";
       int ind = 0;
       for(int i = 0; i < email.length(); i++){
        char ch = email.charAt(i);
        if(ch == '@'){
            ind = i;
        }      
       }

       for(int i = 0; i < email.length(); i++){
        char ch = email.charAt(i);
        if(i > ind){
            domainName += ch;
        }
       }
       System.out.println(domainName);
   } 
}
