package pl.sdac.model;

public enum BookType {

    SCIENCE_FICTION("Science Fiction"),
    HORROR("HORROR"),
    ROMANCE("ROMANCE"),
    SCIENCE("SCIENCE"),
    HISTORY("HISTORY"),
    FANTASY("FANTASY");

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
