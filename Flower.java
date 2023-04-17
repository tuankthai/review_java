package review_java;

// import java.rmi.server.RemoteRef;
import java.util.Objects;

public class Flower {
    String kind;

    public Flower(String kind) {
        this.kind = kind;
    }

    public String toString() {
        return kind;
    }

    @Override                                   //REMEMBER
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass()) { //REMEMBER
            return false;
        }
        Flower flower = (Flower) obj;
        return this.kind.equals(flower.kind);   //REMEMBER

    }
    
    @Override                               //REMEMBER
    public int hashCode() {
        return Objects.hash(kind);        //REMEMBER
    }
    
}
