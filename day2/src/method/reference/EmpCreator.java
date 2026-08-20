package method.reference;

@FunctionalInterface
public interface EmpCreator {
Employee create(int id, String name, double salary);
}
