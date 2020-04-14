public class Notebook
{
private int numberOfNotes;
private Note[] notes;

  public Notebook(int MaxNumberOfNotes)
  {
    numberOfNotes = MaxNumberOfNotes;
    notes = new Note[MaxNumberOfNotes];
  }

  public int getNumberOfNotes()
  {
    return numberOfNotes;
  }

  public Note getNote(int index){
    return notes[index];
  }
  public String getMessage(int index){
    return notes[index].toString();
  }
  public void addNote(Note note){
    boolean noteAdded = false;
    int pos = 0;
    while(!noteAdded){
      if(notes[pos]==null){
        notes[pos] = note;
        noteAdded=true;
      }else{
        pos++;
      }
    }
  }
  public void addNote(String note){
    boolean noteAdded = false;
    int pos = 0;
    while(!noteAdded){
      if(notes[pos]==null){
        notes[pos] = new Note(note);
        noteAdded=true;
      }else{
        pos++;
      }
    }
  }
  public void addHighPriorityNote(String note){
    boolean noteAdded = false;
    int pos = 0;
    while(!noteAdded){
      if(notes[pos]==null){
        notes[pos] = new Note(note,true);
        noteAdded=true;
      }else{
        pos++;
      }
    }
  }
  public void removeNote(int index){
    notes[index] = null;
  }
  public Note[] getAllNotes(){
    return notes;
  }
  public int getNumberOfHighPriorityNotes(){
    int highPriorityNotes =0;
    for(int i=0;i<numberOfNotes;i++){
      if(notes[i].isHighPriority()){
        highPriorityNotes++;
      }
    }
    return highPriorityNotes;
  }
  public Note[] getAllHighPriorityNotes(){
    Notebook highPriorityNotes = new Notebook(getNumberOfHighPriorityNotes());
    for(int i=0;i<numberOfNotes;i++){
      if(notes[i].isHighPriority()){
        highPriorityNotes.addHighPriorityNote(notes[i].getMessage());
      }
    }
    return highPriorityNotes.getAllNotes();
  }

  @Override public String toString()
  {
    String response="";
    for(int i=0;i<numberOfNotes;i++){
      if(notes[i]!=null){
        response+=notes[i].toString()+"\n";
      }
    }
    return response;
  }

  public static void main(String[] args)
  {
    Notebook biologie = new Notebook(20);
    biologie.addHighPriorityNote("Tema pe acasa:");
    biologie.addNote("Ex 5 pag 128"
        + "si ex 10 pag 29");
    System.out.println(biologie);
    biologie.removeNote(0);
    System.out.println(biologie);
    biologie.addNote("prima pozitie");
    System.out.println(biologie);

  }
}
