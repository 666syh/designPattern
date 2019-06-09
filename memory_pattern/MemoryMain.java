package memory_pattern;
public class MemoryMain {
    public static void main(String[] args) {
        GameRole role = new GameRole();
        role.getInitState();
        role.showState();

        GameRole backup = new GameRole();
        backup.setVit(role.getVit());
        backup.setAtk(role.getAtk());
        backup.setDef(role.getDef());

        role.fight();
        role.showState();
        
        role.setVit(backup.getVit());
        role.setAtk(backup.getAtk());
        role.setDef(backup.getDef());

        role.showState();
    }
}