// HASH COLLISIONS: YES
// timestamp: 1.66745598E12

package rpn;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_rpn {
	public static Reference<Struct> g_lingoGrammarOp;
	public static void init() {
		g_lingoGrammarOp=((Reference<Struct>)(new Reference(SingletonStructs.str_None)));
	}
	public static final Struct f_Parse(String as) {
			return ((Struct)Module_parsic.f_parsic(Module_rpn.f_lingoGrammar(), as, Module_pegaction.g_defaultPegActions));
		}
	public static final String f_Str(Struct aexp_0) {
			Struct l0__tmp = aexp_0;
			switch (l0__tmp.getTypeId()) {
			case 8/*Add*/: {
				final Struct_Add l1__tmp = (Struct_Add)l0__tmp;
				final Struct l2_l = l1__tmp.f_left;
				final Struct l3_r = l1__tmp.f_right;
				final Struct l4_l = l1__tmp.f_left;
				final Struct l5_r = l1__tmp.f_right;
				return (((("("+Module_rpn.f_Str(l4_l))+"+")+Module_rpn.f_Str(l5_r))+")");
			}
			case 105/*Sub*/: {
				final Struct_Sub l1__tmp = (Struct_Sub)l0__tmp;
				final Struct l6_l = l1__tmp.f_left;
				final Struct l7_r = l1__tmp.f_right;
				final Struct l8_l = l1__tmp.f_left;
				final Struct l9_r = l1__tmp.f_right;
				return (((("("+Module_rpn.f_Str(l8_l))+"-")+Module_rpn.f_Str(l9_r))+")");
			}
			case 38/*Mul*/: {
				final Struct_Mul l1__tmp = (Struct_Mul)l0__tmp;
				final Struct l10_l = l1__tmp.f_left;
				final Struct l11_r = l1__tmp.f_right;
				final Struct l12_l = l1__tmp.f_left;
				final Struct l13_r = l1__tmp.f_right;
				return (((("("+Module_rpn.f_Str(l12_l))+"*")+Module_rpn.f_Str(l13_r))+")");
			}
			case 16/*Div*/: {
				final Struct_Div l1__tmp = (Struct_Div)l0__tmp;
				final Struct l14_l = l1__tmp.f_left;
				final Struct l15_r = l1__tmp.f_right;
				final Struct l16_l = l1__tmp.f_left;
				final Struct l17_r = l1__tmp.f_right;
				return (((("("+Module_rpn.f_Str(l16_l))+"/")+Module_rpn.f_Str(l17_r))+")");
			}
			case 94/*Pow*/: {
				final Struct_Pow l1__tmp = (Struct_Pow)l0__tmp;
				final Struct l18_l = l1__tmp.f_left;
				final Struct l19_r = l1__tmp.f_right;
				final Struct l20_l = l1__tmp.f_left;
				final Struct l21_r = l1__tmp.f_right;
				return (((("("+Module_rpn.f_Str(l20_l))+"^")+Module_rpn.f_Str(l21_r))+")");
			}
			case 39/*Neg*/: {
				final Struct_Neg l1__tmp = (Struct_Neg)l0__tmp;
				final Struct l22_v = l1__tmp.f_exp;
				final Struct l23_v = l1__tmp.f_exp;
				return (("(-"+Module_rpn.f_Str(l23_v))+")");
			}
			case 22/*Int*/: {
				final Struct_Int l1__tmp = (Struct_Int)l0__tmp;
				final double l24_num = l1__tmp.f_value;
				final double l25_num = l1__tmp.f_value;
				return Module_string.f_d2s(l25_num);
			}
			case 110/*Var*/: {
				final Struct_Var l1__tmp = (Struct_Var)l0__tmp;
				final String l26_v = l1__tmp.f_name;
				final String l27_v = l1__tmp.f_name;
				return l27_v;
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
			}
		}
	public static final Struct f_Val(Struct aexp_0, Struct avars) {
			final Struct l1_vars = avars;
			final Func3<Struct,Struct, Struct, Func2<Struct,Double, Double>> l0_apply_op = (Func3<Struct, Struct, Struct, Func2<Struct,Double, Double>>)(Struct al, Struct ar, Func2<Struct,Double, Double> aop) -> {
				final Struct l1_gsymswitch0 = Module_rpn.f_Val(al, l1_vars);
				Struct l2__tmp = l1_gsymswitch0;
				switch (l2__tmp.getTypeId()) {
				case 103/*Some*/: {
					final Struct_Some l3__tmp = (Struct_Some)l2__tmp;
					final Object l4_left = l3__tmp.f_value;
					final double l5_left = ((double)l3__tmp.f_value);
					final Struct l6_gsymswitch1 = Module_rpn.f_Val(ar, l1_vars);
					Struct l7__tmp = l6_gsymswitch1;
					switch (l7__tmp.getTypeId()) {
					case 103/*Some*/: {
						final Struct_Some l8__tmp = (Struct_Some)l7__tmp;
						final Object l9_right = l8__tmp.f_value;
						final double l10_right = ((double)l8__tmp.f_value);
						return aop.invoke(((Double)l5_left), ((Double)l10_right));
					}
					case 41/*None*/: {
						return ((Struct)SingletonStructs.str_None);
					}
					default:
						throw new RuntimeException("Unexpected struct in switch: "+l7__tmp.getTypeName());
					}
				}
				case 41/*None*/: {
					return ((Struct)SingletonStructs.str_None);
				}
				default:
					throw new RuntimeException("Unexpected struct in switch: "+l2__tmp.getTypeName());
				}
			};
			final Func2<Struct,Double, Double> l2_div = (Func2<Struct, Double, Double>)(Double aleft, Double aright) -> {
				if ((((double)aright)==0.0)) {
					return ((Struct)SingletonStructs.str_None);
				} else {
					return (new Struct_Some((((double)aleft)/((double)aright))));
				}
			};
			Struct l3__tmp = aexp_0;
			switch (l3__tmp.getTypeId()) {
			case 8/*Add*/: {
				final Struct_Add l4__tmp = (Struct_Add)l3__tmp;
				final Struct l5_l = l4__tmp.f_left;
				final Struct l6_r = l4__tmp.f_right;
				final Struct l7_l = l4__tmp.f_left;
				final Struct l8_r = l4__tmp.f_right;
				final Func2<Struct_Some,Double, Double> l10_$9 = (Func2<Struct_Some, Double, Double>)(Double aleft, Double aright) -> {
					return (new Struct_Some((((double)aleft)+((double)aright))));
				};
				return l0_apply_op.invoke(l7_l, l8_r, ((Func2<Struct,Double, Double>)(Func2)l10_$9));
			}
			case 105/*Sub*/: {
				final Struct_Sub l4__tmp = (Struct_Sub)l3__tmp;
				final Struct l11_l = l4__tmp.f_left;
				final Struct l12_r = l4__tmp.f_right;
				final Struct l13_l = l4__tmp.f_left;
				final Struct l14_r = l4__tmp.f_right;
				final Func2<Struct_Some,Double, Double> l16_$15 = (Func2<Struct_Some, Double, Double>)(Double aleft, Double aright) -> {
					return (new Struct_Some((((double)aleft)-((double)aright))));
				};
				return l0_apply_op.invoke(l13_l, l14_r, ((Func2<Struct,Double, Double>)(Func2)l16_$15));
			}
			case 38/*Mul*/: {
				final Struct_Mul l4__tmp = (Struct_Mul)l3__tmp;
				final Struct l17_l = l4__tmp.f_left;
				final Struct l18_r = l4__tmp.f_right;
				final Struct l19_l = l4__tmp.f_left;
				final Struct l20_r = l4__tmp.f_right;
				final Func2<Struct_Some,Double, Double> l22_$21 = (Func2<Struct_Some, Double, Double>)(Double aleft, Double aright) -> {
					return (new Struct_Some((((double)aleft)*((double)aright))));
				};
				return l0_apply_op.invoke(l19_l, l20_r, ((Func2<Struct,Double, Double>)(Func2)l22_$21));
			}
			case 16/*Div*/: {
				final Struct_Div l4__tmp = (Struct_Div)l3__tmp;
				final Struct l23_l = l4__tmp.f_left;
				final Struct l24_r = l4__tmp.f_right;
				final Struct l25_l = l4__tmp.f_left;
				final Struct l26_r = l4__tmp.f_right;
				return l0_apply_op.invoke(l25_l, l26_r, l2_div);
			}
			case 94/*Pow*/: {
				final Struct_Pow l4__tmp = (Struct_Pow)l3__tmp;
				final Struct l27_l = l4__tmp.f_left;
				final Struct l28_r = l4__tmp.f_right;
				final Struct l29_l = l4__tmp.f_left;
				final Struct l30_r = l4__tmp.f_right;
				final Func2<Struct,Double, Double> l32_$31 = (Func2<Struct, Double, Double>)(Double aleft, Double aright) -> {
					return Module_math.f_dpow2(((double)aleft), ((double)aright));
				};
				return l0_apply_op.invoke(l29_l, l30_r, l32_$31);
			}
			case 39/*Neg*/: {
				final Struct_Neg l4__tmp = (Struct_Neg)l3__tmp;
				final Struct l33_e = l4__tmp.f_exp;
				final Struct l34_e = l4__tmp.f_exp;
				final Struct l35_gsymswitch2 = Module_rpn.f_Val(l34_e, avars);
				Struct l36__tmp = l35_gsymswitch2;
				switch (l36__tmp.getTypeId()) {
				case 103/*Some*/: {
					final Struct_Some l37__tmp = (Struct_Some)l36__tmp;
					final Object l38_value = l37__tmp.f_value;
					final double l39_value = ((double)l37__tmp.f_value);
					return (new Struct_Some((-l39_value)));
				}
				case 41/*None*/: {
					return ((Struct)SingletonStructs.str_None);
				}
				default:
					throw new RuntimeException("Unexpected struct in switch: "+l36__tmp.getTypeName());
				}
			}
			case 22/*Int*/: {
				final Struct_Int l4__tmp = (Struct_Int)l3__tmp;
				final double l40_num = l4__tmp.f_value;
				final double l41_num = l4__tmp.f_value;
				return (new Struct_Some(l41_num));
			}
			case 110/*Var*/: {
				final Struct_Var l4__tmp = (Struct_Var)l3__tmp;
				final String l42_name = l4__tmp.f_name;
				final String l43_name = l4__tmp.f_name;
				return Module_tree.f_lookupTree(avars, l43_name);
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l3__tmp.getTypeName());
			}
		}
	public static final Struct f_getVariables() {
			final Object[] l0_parameters_array = Native.getAllUrlParameters();
			Module_runtime.f_println(l0_parameters_array);
			final Struct l3_$2 = Module_tree.f_makeTree();
			final Func2<Struct,Struct, Object[]> l4_$1 = (Func2<Struct, Struct, Object[]>)(Struct atree, Object[] aparameter) -> {
				return Module_tree.f_setTree(atree, ((String)(aparameter[0])), Module_math.f_s2d(((String)(aparameter[1]))));
			};
			return ((Struct)Native.fold(l0_parameters_array, l3_$2, ((Func2<Object,Object, Object>)(Func2)l4_$1)));
		}
	public static final Object[] f_lingoGrammar() {
			final Func0<Object[]> l1_$0 = (Func0<Object[]>)() -> {
				return Module_driver.f_compilePegGrammar("expr = mul | add | int | div | sub | pow | neg | var;\r\nadd = ws \"+\" ws expr:left ws expr:right ws {Add(:left, :right)};\r\nmul = ws \"*\" ws expr:left ws expr:right ws {Mul(:left, :right)};\r\nsub = ws \"-\" ws expr:left ws expr:right ws {Sub(:left, :right)};\r\ndiv = ws \"/\" ws expr:left ws expr:right ws {Div(:left, :right)};\r\npow = ws \"^\" ws expr:left ws expr:right ws {Pow(:left, :right)};\r\nneg = ws \"-\" ws expr:e ws {Neg(:e)};\r\n\r\nint = ('0'-'9')+$d {Int(s2d($d))};\r\nvar = ('a'-'z')+$d {Var($d)};\r\n\r\nws = (' ' | '\\r' | '\\n' | '\\t')*;");
			};
			return ((Object[])Module_maybe.f_onlyOnce(Module_rpn.g_lingoGrammarOp, ((Func0<Object>)(Func0)l1_$0)));
		}
	public static final Object f_main() {
			final String l0_exp_0 = Module_url_parameter.f_getUrlParameterDef("expr", "6 3 4 + 5 * + 7 -");
			final String l1_revS = Module_string.f_reverse(l0_exp_0);
			final Struct l2_variables = Module_rpn.f_getVariables();
			final Struct l3_result = Module_rpn.f_Parse(l1_revS);
			Module_runtime.f_println(l3_result);
			Module_runtime.f_println(Module_rpn.f_Str(l3_result));
			Module_runtime.f_println(Module_rpn.f_Val(l3_result, l2_variables));
			return Native.quit(0);
		}
}
