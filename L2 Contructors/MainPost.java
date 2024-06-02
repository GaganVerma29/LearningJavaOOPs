class Post {
    int postId;
    String caption;
    String url;

    public Post() {
        System.out.println("Default Constructor");
    }

    public Post(String caption, String url) {
        this.caption = caption;
        this.url = url;
    }

    public Post(int postId, String caption, String url) {
        this.postId = postId;
        this.caption = caption;
        this.url = url;
    }

    public void printPostData() {
        System.out.println(this.postId + " " + this.caption + " " + this.url);
    }
}

class MainPost {
    public static void main(String[] args) {
        // Post post1 = new Post();
        Post post1 = new Post(101, "Dubai is beautiful.", "https://gaganverma.com/dubai/101");
        post1.printPostData();
    }
}