package pl.sda.model;

public enum BookType {

    SCIENCE_FICTION("Science Fiction"),
    HORROR("Horror"),
    ROMANCE("Romance"),
    SCIENCE("Science"),
    HISTORY("History"),
    FANTASY("Fantasy");

    private String text;

    BookType(String text){
        this.text = text;
    }

    public String getText(){return text;}

    public static BookType getFromInt(int choosenType){
        BookType[] values = BookType.values();
        return values[choosenType-1];
    }
}
