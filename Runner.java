class Runner{
  public static void main(String[] args) {
    Workshop workshop = new Workshop("Santa's Workshop");
    String name = workshop.getName();

    if (workshop.hiring() == true)
      System.out.println(name + " is hiring!");
    else
      System.out.println(name + " is full!");
   
    Elf elf1 = new Elf("John");
    Elf elf2 = new Elf("Jarrod");
    Elf elf3 = new Elf("Steven");
    System.out.println(workshop.employElf(elf1));
    System.out.println(workshop.employElf(elf2));
    System.out.println(workshop.employElf(elf3));
    int employees = workshop.elfCount();
    System.out.println("Staff:" + employees);

    if (workshop.hiring() == true)
      System.out.println(name + " is hiring!");
    else
      System.out.println(name + " is full!");
  }
}