package abilities;

import characters.Animal;
import characters.Guest;

public interface AbleToBeCaring {
    boolean isConcerned(Animal concernedSubject);

    boolean isConcerned(Guest concernedSubject);

    void concern(Guest concernedSubject);

    void save(Object obj);

}
