import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {

    private List<Colleague> colleagueList;

    public ConcreteMediator() {
        this.colleagueList = new ArrayList<>();
    }

    public ConcreteMediator(List<Colleague> colleagueList) {
        this.colleagueList = colleagueList;
    }

    @Override
    public void addColleague(Colleague colleague) {
        this.colleagueList.add(colleague);
    }

    @Override
    public void mediate(Colleague colleague) {
        for (Colleague receiveColleague : colleagueList) {
            System.out.printf("\t[Mediating " + colleague.getName() + " to " + receiveColleague.getName() + "] ");
            receiveColleague.receive(colleague);
        }
    }
}
