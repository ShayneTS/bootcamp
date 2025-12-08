import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class MSWord {
  // Current character
  private List<Character> characters;
  // Deque
  private Deque<Character> undoStack;
  private Deque<Character> redoStack;

  public MSWord() {
    this.characters = new LinkedList<>();
  }

  public void write (char c) {
    this.characters.add(c);
  }

  public void undo() {

  }

  public void redo() {

  }
}
