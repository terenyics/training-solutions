package classstructuremethods;

public class NoteMain {

    public static void main(String[] args) {

        Note note = new Note();

        note.setName("Móka Miki");
        note.setTopic("Gyakorlat");
        note.setText("Ezzel gyakoroljuk a metódusok használatát");

        System.out.println(note.getNoteText());

    }
}
