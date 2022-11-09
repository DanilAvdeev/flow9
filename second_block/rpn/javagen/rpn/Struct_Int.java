// HASH COLLISIONS: YES
// timestamp: 1.667456356951E12

package rpn;

import com.area9innovation.flow.*;

public class Struct_Int extends Struct {
	public double f_value;

	public Struct_Int() {}
	public Struct_Int(double a_value) {
		f_value = a_value;
	}

	public int getTypeId() { return 22; }
	public String getTypeName() { return "Int"; }

	private static final String[] field_names = new String[] {
		"value"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.DOUBLE
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_value
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in Int");
		f_value = (Double)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 22) return 22-tmp;
		Struct_Int other = (Struct_Int)other_gen;
		if (f_value != other.f_value)
			return (f_value > other.f_value) ? 1 : -1;
		return 0;
	}
}
