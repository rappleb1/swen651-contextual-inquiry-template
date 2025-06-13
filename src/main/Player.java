package main;

public class Player {
public enum PlayerRace {
    Human,Elf,Orc,Dwarf,Dragonborn
}
private String charName;
private int age;
private PlayerRace race;

public String getCharName() {
    return charName;
}
public void setCharName(String name) {
    this.charName = name;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public PlayerRace getRace() {
    return race;
}
public void setRace(PlayerRace race) {
    this.race = race;
}

}
