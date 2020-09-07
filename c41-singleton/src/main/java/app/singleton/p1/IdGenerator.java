package app.singleton.p1;

/**
 * IdGenerator
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class IdGenerator {

    public void useDemo() {
        long id = IdGeneratorD.getInstance().getId();
    }

    public void useDemoPlus(IdGeneratorD idGenerator) {
        long id = idGenerator.getId();
    }

    // use
    //IdGeneratorD idGeneratorD = IdGeneratorD.getInstance();
    //useDemoPlus(idGeneratorD);

}
