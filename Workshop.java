public class Workshop{
  private String name;
  private Elf[] elves;

  public Workshop(String name){
    this.name = name;
    this.elves = new Elf[3];
  }

  public String getName(){
    return this.name;
  }

  public int elfCount(){
    int count = 0;
    for (Elf elf : elves) {
      if (elf != null){
        count++;
      }
    }
    return count;
  }

  public boolean hiring(){
    int count = elfCount();
    return (count < 3 );
  }

  public String employElf(Elf elf){
    int count = elfCount();
    elves[count] = elf;
    return elf.getName() + " is hired";
  }

}