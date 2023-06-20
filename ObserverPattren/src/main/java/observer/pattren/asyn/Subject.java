package observer.pattren.asyn;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObserversAsync();
}
