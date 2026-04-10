package Inheritance.Library;

    public class Author extends Book{
        String authorName;
        String bio;
        public Author(String title , int publicationYear,String authorName,String bio){
            super(title,publicationYear);
            this.authorName=authorName;
            this.bio=bio;
        }

        @Override
        public void displayDetail() {
            super.displayDetail();
            System.out.println("AuthorName :"+authorName);
            System.out.println("Bio :"+bio);

        }
    }

