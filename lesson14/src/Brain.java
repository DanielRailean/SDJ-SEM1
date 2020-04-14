public class Brain
{
  private String[] memory;

  public Brain(int size)
  {
    if(size<3){
      size =3;
    }
    memory = new String[size];
    for(int i=0;i<size;i++){
      memory[i] ="";
    }
  }

  public int getIQ()
  {
    int len1 = memory[0].length();
    int len2 = memory[1].length();
    int len3 = memory[2].length();
    if (len1 > 20)
    {
      if (len2 > 10 && len3 > 10)
      {
        return 130;
      }
    }
    else if (len2 > 20)
    {
      if (len1 > 10 && len3 > 10)
      {
        return 130;
      }
    }
    else if (len3 > 20)
    {
      if (len2 > 10 && len1 > 10)
      {
        return 130;
      }
    }
    else if (len1 > 10 && len2 > 10 && len3 > 10)
    {
      return 100;
    }
    return 70;
  }

  public boolean isBrainDamaged()
  {
    return (memory[0] == null || memory[1] == null
        || memory[2] == null);
  }

  public void remember(String info)
  {
    memory[2] = memory[1];
    memory[1] = memory[0];
    memory[0] = info;

  }

  public void refreshMemory(String info)
  {
    if (memory[1].equals(info))
    {
      memory[1] = memory[0];
      memory[0] = info;

    }
    if (memory[2].equals(info))
    {
      memory[2] = memory[0];
      memory[0] = info;

    }
  }

  public boolean recall(String info)
  {
    return (memory[0].equals(info) || memory[2].equals(info)
        || memory[1].equals(info));
  }

  public String recall()
  {
    return memory[0];
  }

  @Override public String toString()
  {
    return "Active memory: " + memory[0] + "\nPassive memory level one: "
        + memory[1] + "\nPassive memory level two: "
        + memory[2] + "\n";
  }

}
