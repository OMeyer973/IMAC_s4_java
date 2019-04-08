
import java.util.Objects;

enum AppleKind {
    Golden, PinkLady, GrannySmith;
  }

public class Apple extends Fruit{

	private final int weight;
	private final AppleKind kind;
	
	public Apple(int w, AppleKind kind) {
		this.weight = Objects.requireNonNull(w);
		this.kind = kind;
		this.setQuantity(1);
	}
	
	public int price() {
		return this.weight / 2;
	}
	
	private String getName() {
		String name = null;
		switch (kind) {
		case Golden:
			name = "Golden";
			break;
		case PinkLady:
			name = "Pink Lady";
			break;
		case GrannySmith:
			name = "Granny Smith";
			break;
		}
		return name;
	}

	@Override
	public String toString() {
		return "a " + weight + " grams " getName() + "apple";
	}

	@Override
	public int hashCode() {
		int prime = 47;
		int result = 1;
		result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
		result = prime * result + weight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apple other = (Apple) obj;
		if (getName() == null) {
			if (other.getName() != null)
				return false;
		} else if (!getName().equals(other.getName()))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}
}
