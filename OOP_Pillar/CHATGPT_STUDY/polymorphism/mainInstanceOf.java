package OOP_Pillar.CHATGPT_STUDY.polymorphism;

public class mainInstanceOf {

    for (animal a: animals) {
        a.makeSound();

        if (a instanceof dog) {
            ((dog)a).fetch();
        } else if (a instanceof cat) {
            ((cat)a).scratch();
        } else if (a instanceof bird) {
            ((bird)a).fly();
        }
    }

}
