package memory_pattern;
public class MemoryMain {
    public static void main(String[] args) {
        GameRole role = new GameRole();
        role.getInitState();
        role.showState();
        
        //通过管理者来管理备份
        RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
        stateAdmin.setMemento(role.saveState());

        role.fight();
        role.showState();
        
        role.RecoveryState(stateAdmin.getMemento());

        role.showState();
    }
}