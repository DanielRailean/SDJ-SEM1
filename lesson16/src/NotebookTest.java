public class NotebookTest
{
  public static void main(String[] args)
  {
    Notebook nb = new Notebook(10);

    nb.addNote("Java lessons today");
    nb.addNote("Read the chapter about arrays");
    nb.addHighPriorityNote("No Java midterm exam this semester :-(");
    nb.addNote("Wash your hands");
    nb.addHighPriorityNote("Check Facebook during class");

    Note n1 = new Note("Lunch break starts at 11:50");
    nb.addNote(n1);

    System.out.println("Number of notes: " + nb.getNumberOfNotes());
    System.out.println("Number of high priority notes: " + nb.getNumberOfHighPriorityNotes());
    System.out.println("\nNotebook:\n" + nb);

    nb.removeNote(4);
    System.out.println();

    System.out.println("Number of notes: " + nb.getNumberOfNotes());
    System.out.println("Number of high priority notes: " + nb.getNumberOfHighPriorityNotes());
    System.out.println("\nNotebook:\n" + nb);
  }
}