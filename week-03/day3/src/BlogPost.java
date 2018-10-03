public class BlogPost {
    String authorName;
    String title;
    String text;
    String publicationDate;

    public static void main(String[] args) {
        BlogPost lorem = new BlogPost();
        lorem.authorName = "John Doe";
        lorem.title = "Lorem Ipsum";
        lorem.text = "Lorem ipsum dolor sit amet.";
        lorem.publicationDate = "2000.05.04.";

        BlogPost wait = new BlogPost();
        lorem.authorName = "Tim Urban";
        lorem.title = "Wait but why";
        lorem.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        lorem.publicationDate = "2010.10.10.";

        BlogPost engineer = new BlogPost();
        lorem.authorName = "William Turton";
        lorem.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        lorem.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. " +
                "When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t " +
                "really into the whole organizer profile thing.";
        lorem.publicationDate = "2017.03.28.";


    }
}

