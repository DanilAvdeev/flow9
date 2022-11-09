// HASH COLLISIONS: YES
// timestamp: 1.667456405079E12

package ast;

import com.area9innovation.flow.*;

public class Struct_Neg extends Struct {
	public Struct f_exp;

	public Struct_Neg() {}
	public Struct_Neg(Struct a_exp) {
		f_exp = a_exp;
	}

	public int getTypeId() { return 39; }
	public String getTypeName() { return "Neg"; }

	private static final String[] field_names = new String[] {
		"exp"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_exp
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in Neg");
		f_exp = (Struct)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 39) return 39-tmp;
		Struct_Neg other = (Struct_Neg)other_gen;
		tmp = f_exp.compareTo(other.f_exp);
		return tmp;
	}
}
