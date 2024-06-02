class Post {
    int postId;
    String caption;
    String url;

    public void printPostData(String str) {
        String newCaption = str + this.caption;
        System.out.println(this.postId + " " + newCaption + " " + this.url);
    }
}

public class PostMain {
    public static void main(String[] args) {

        Post post1 = new Post();
        post1.postId = 101;
        post1.caption = "Chilling...";
        post1.url = "http://innoskrit.in/images/gaganverma/post101";
        post1.printPostData("Hey");

        Post post2 = new Post();
        post2.postId = 102;
        post2.caption = "Chilling More...";
        post2.url = "http://innoskrit.in/images/gaganverma/post102";
        post2.printPostData("Hello");
    }
}