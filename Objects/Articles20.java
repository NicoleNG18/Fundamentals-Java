package Objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        List<Article> ar=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String [] input=scanner.nextLine().split(", ");
            Article current=new Article(input[0],input[1],input[2]);
            ar.add(current);
        }
        String command= scanner.nextLine();
        if(command.equals("title")){
          // ar.stream().sorted((ar1,ar2)->ar1.getTitle().compareTo(ar2.getTitle())).forEach(System.out::println);
            for (Article art:ar) {
                System.out.println(art.toString());
            }
        }
        else if(command.equals("content")){
         // ar.stream().sorted((ar1,ar2)->ar1.getContent().compareTo(ar2.getContent())).forEach(System.out::println);
            for (Article art:ar) {
                System.out.println(art.toString());
            }
        }
        else if(command.equals("author")){
           // ar.stream().sorted((ar1,ar2)->ar1.getAuthor().compareTo(ar2.getAuthor())).forEach(System.out::println);
            for (Article art:ar) {
                System.out.println(art.toString());
            }
        }

    }
    static class Article{
        String title;
        String content;
        String author;
        Article(String title,String content,String author){
            this.title=title;
            this.content=content;
            this.author=author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        @Override
      public String toString(){
         return String.format("%s - %s: %s",this.title,this.content,this.author);
      }

    }
}
