// HASH COLLISIONS: YES
// timestamp: 1.667325931E12

package rpn;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final public class Module_rpn {
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
				final double l24_num = l1__tmp.f_num;
				final double l25_num = l1__tmp.f_num;
				return Module_string.f_d2s(l25_num);
			}
			case 110/*Var*/: {
				final Struct_Var l1__tmp = (Struct_Var)l0__tmp;
				final String l26_v = l1__tmp.f_var;
				final String l27_v = l1__tmp.f_var;
				return l27_v;
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
			}
		}
	public static final Struct f_Val(Struct aexp_0, Struct avariables) {
			final Struct l1_variables = avariables;
			final Func3<Struct,Struct, Struct, Func2<Struct,Double, Double>> l0_apply_op = (Func3<Struct, Struct, Struct, Func2<Struct,Double, Double>>)(Struct al, Struct ar, Func2<Struct,Double, Double> aop) -> {
				final Struct l1_gsymswitch0 = Module_rpn.f_Val(al, l1_variables);
				Struct l2__tmp = l1_gsymswitch0;
				switch (l2__tmp.getTypeId()) {
				case 103/*Some*/: {
					final Struct_Some l3__tmp = (Struct_Some)l2__tmp;
					final Object l4_left = l3__tmp.f_value;
					final double l5_left = ((double)l3__tmp.f_value);
					final Struct l6_gsymswitch1 = Module_rpn.f_Val(ar, l1_variables);
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
				final Struct l35_gsymswitch2 = Module_rpn.f_Val(l34_e, avariables);
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
				final double l40_num = l4__tmp.f_num;
				final double l41_num = l4__tmp.f_num;
				return (new Struct_Some(l41_num));
			}
			case 110/*Var*/: {
				final Struct_Var l4__tmp = (Struct_Var)l3__tmp;
				final String l42_name = l4__tmp.f_var;
				final String l43_name = l4__tmp.f_var;
				return Module_tree.f_lookupTree(avariables, l43_name);
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l3__tmp.getTypeName());
			}
		}
	public static final Struct f_deriv(Struct aexp_0, String avar) {
			Struct l0__tmp = aexp_0;
			switch (l0__tmp.getTypeId()) {
			case 8/*Add*/: {
				final Struct_Add l1__tmp = (Struct_Add)l0__tmp;
				final Struct l2_l = l1__tmp.f_left;
				final Struct l3_r = l1__tmp.f_right;
				final Struct l4_l = l1__tmp.f_left;
				final Struct l5_r = l1__tmp.f_right;
				return (new Struct_Add(Module_rpn.f_deriv(l4_l, avar), Module_rpn.f_deriv(l5_r, avar)));
			}
			case 105/*Sub*/: {
				final Struct_Sub l1__tmp = (Struct_Sub)l0__tmp;
				final Struct l6_l = l1__tmp.f_left;
				final Struct l7_r = l1__tmp.f_right;
				final Struct l8_l = l1__tmp.f_left;
				final Struct l9_r = l1__tmp.f_right;
				return (new Struct_Sub(Module_rpn.f_deriv(l8_l, avar), Module_rpn.f_deriv(l9_r, avar)));
			}
			case 38/*Mul*/: {
				final Struct_Mul l1__tmp = (Struct_Mul)l0__tmp;
				final Struct l10_l = l1__tmp.f_left;
				final Struct l11_r = l1__tmp.f_right;
				final Struct l12_l = l1__tmp.f_left;
				final Struct l13_r = l1__tmp.f_right;
				return (new Struct_Add((new Struct_Mul(Module_rpn.f_deriv(l12_l, avar), l13_r)), (new Struct_Mul(Module_rpn.f_deriv(l13_r, avar), l12_l))));
			}
			case 16/*Div*/: {
				final Struct_Div l1__tmp = (Struct_Div)l0__tmp;
				final Struct l14_l = l1__tmp.f_left;
				final Struct l15_r = l1__tmp.f_right;
				final Struct l16_l = l1__tmp.f_left;
				final Struct l17_r = l1__tmp.f_right;
				return (new Struct_Div((new Struct_Sub((new Struct_Mul(Module_rpn.f_deriv(l16_l, avar), l17_r)), (new Struct_Mul(Module_rpn.f_deriv(l17_r, avar), l16_l)))), (new Struct_Pow(l17_r, (new Struct_Int(2.0))))));
			}
			case 94/*Pow*/: {
				final Struct_Pow l1__tmp = (Struct_Pow)l0__tmp;
				final Struct l18_l = l1__tmp.f_left;
				final Struct l19_r = l1__tmp.f_right;
				final Struct l20_l = l1__tmp.f_left;
				final Struct l21_r = l1__tmp.f_right;
				return (new Struct_Mul((new Struct_Pow(l20_l, l21_r)), (new Struct_Div((new Struct_Mul(l21_r, Module_rpn.f_deriv(l20_l, avar))), l20_l))));
			}
			case 39/*Neg*/: {
				final Struct_Neg l1__tmp = (Struct_Neg)l0__tmp;
				final Struct l22_e = l1__tmp.f_exp;
				final Struct l23_e = l1__tmp.f_exp;
				return (new Struct_Neg(Module_rpn.f_deriv(l23_e, avar)));
			}
			case 22/*Int*/: {
				final Struct_Int l1__tmp = (Struct_Int)l0__tmp;
				final double l24_value = l1__tmp.f_num;
				final double l25_value = l1__tmp.f_num;
				return (new Struct_Int(0.0));
			}
			case 110/*Var*/: {
				final Struct_Var l1__tmp = (Struct_Var)l0__tmp;
				final String l26_v = l1__tmp.f_var;
				final String l27_v = l1__tmp.f_var;
				if ((l27_v).equals(avar)) {
					return (new Struct_Int(1.0));
				} else {
					return (new Struct_Int(0.0));
				}
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
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
			return Module_driver.f_compilePegGrammar("// exp = int | sub | mul | add | div | var | pow | neg;\r\n// add = \"(\" ws exp:l ws \"+\" ws exp:r ws \")\" { Add(:l, :r) };\r\n// sub = \"(\" ws exp:l ws \"-\" ws exp:r ws \")\" { Subtract(:l, :r) };\r\n// mul = \"(\" ws exp:l ws \"*\" ws exp:r ws \")\" { Multiply(:l, :r) };\r\n// div = \"(\" ws exp:l ws \"/\" ws exp:r ws \")\" { Divide(:l, :r) };\r\n// pow = \"(\" ws exp:l ws \"^\" ws exp:r ws \")\" { Power(:l, :r) };\r\n// neg = \"(\" ws \"-\" ws exp:e ws \")\" { Negative(:e) };\r\n\r\n// var = (letter (letter | digit)*) $v { Variable($v) };\r\n// int = (\"-\"? ((digit* \".\" digit+) | digit+)) $d { Int(s2d($d)) };\r\n\r\n// letter = 'a'-'z' | 'A'-'Z' | '_';\r\n// digit = '0'-'9';\r\n// ws = ' '*; \r\n\r\n////////\r\n\r\nexp = int | sub | mul | add | div | var | pow | neg;\r\nadd = \"(\" ws exp:l ws \"+\" ws exp:r ws \")\" { Add(:l, :r) };\r\nsub = \"(\" ws exp:l ws \"-\" ws exp:r ws \")\" { Sub(:l, :r) };\r\nmul = \"(\" ws exp:l ws \"*\" ws exp:r ws \")\" { Mul(:l, :r) };\r\ndiv = \"(\" ws exp:l ws \"/\" ws exp:r ws \")\" { Div(:l, :r) };\r\npow = \"(\" ws exp:l ws \"^\" ws exp:r ws \")\" { Pow(:l, :r) };\r\nneg = \"(\" ws \"-\" ws exp:e ws \")\" { Neg(:e) };\r\n\r\nint = ('0'-'9')+$d {Int(s2d($d))};\r\nvar = ('a'-'z')+$d {Var($d)};\r\n\r\nws = (' ' | '\\r' | '\\n' | '\\t')*;");
		}
	public static final Object f_main() {
			final String l0_exp_0 = Module_url_parameter.f_getUrlParameterDef("expression", "((x + 0) * (y - 1))");
			final Struct l1_vars = Module_rpn.f_getVariables();
			final Object l2_ast = Module_parsic.f_parsic(Module_rpn.f_lingoGrammar(), l0_exp_0, Module_pegaction.g_defaultPegActions);
			Module_runtime.f_println(l2_ast);
			Module_runtime.f_println(Module_rpn.f_Str(((Struct)l2_ast)));
			Module_runtime.f_println(Module_rpn.f_Val(((Struct)l2_ast), l1_vars));
			Module_runtime.f_println(Module_rpn.f_deriv(((Struct)l2_ast), "x"));
			Module_runtime.f_println(Module_rpn.f_Str(Module_rpn.f_deriv(((Struct)l2_ast), "x")));
			Module_runtime.f_println(Module_rpn.f_Val(Module_rpn.f_deriv(((Struct)l2_ast), "x"), l1_vars));
			final Struct l3_simplified = Module_rpn.f_simplify(((Struct)l2_ast));
			Module_runtime.f_println("-------SIMPLIFY------");
			Module_runtime.f_println(l3_simplified);
			Module_runtime.f_println(Module_rpn.f_Str(l3_simplified));
			Module_runtime.f_println(Module_rpn.f_Val(l3_simplified, l1_vars));
			Module_runtime.f_println(Module_rpn.f_deriv(l3_simplified, "x"));
			Module_runtime.f_println(Module_rpn.f_Str(Module_rpn.f_deriv(l3_simplified, "x")));
			Module_runtime.f_println(Module_rpn.f_Val(Module_rpn.f_deriv(l3_simplified, "x"), l1_vars));
			return Native.quit(0);
		}
	public static final Struct f_simplify(Struct aexp_0) {
			Struct l0__tmp = aexp_0;
			switch (l0__tmp.getTypeId()) {
			case 8/*Add*/: {
				final Struct_Add l1__tmp = (Struct_Add)l0__tmp;
				final Struct l2_l = l1__tmp.f_left;
				final Struct l3_r = l1__tmp.f_right;
				final Struct l4_l = l1__tmp.f_left;
				final Struct l5_r = l1__tmp.f_right;
				final Struct l6_left = Module_rpn.f_simplify(l4_l);
				final Struct l7_right = Module_rpn.f_simplify(l5_r);
				if ((FlowRuntime.compareEqual(l6_left,(new Struct_Int(0.0)))&&FlowRuntime.compareEqual(l7_right,(new Struct_Int(0.0))))) {
					return (new Struct_Int(0.0));
				} else {
					if (FlowRuntime.compareEqual(l6_left,(new Struct_Int(0.0)))) {
						return l7_right;
					} else {
						if (FlowRuntime.compareEqual(l7_right,(new Struct_Int(0.0)))) {
							return l6_left;
						} else {
							Struct l8__tmp = l7_right;
							switch (l8__tmp.getTypeId()) {
							case 39/*Neg*/: {
								final Struct_Neg l9__tmp = (Struct_Neg)l8__tmp;
								final Struct l10_v = l9__tmp.f_exp;
								final Struct l11_v = l9__tmp.f_exp;
								return (new Struct_Sub(l6_left, l11_v));
							}
							default: {
								return (new Struct_Add(l6_left, l7_right));
							}
							}
						}
					}
				}
			}
			case 105/*Sub*/: {
				final Struct_Sub l1__tmp = (Struct_Sub)l0__tmp;
				final Struct l12_l = l1__tmp.f_left;
				final Struct l13_r = l1__tmp.f_right;
				final Struct l14_l = l1__tmp.f_left;
				final Struct l15_r = l1__tmp.f_right;
				final Struct l16_left = Module_rpn.f_simplify(l14_l);
				final Struct l17_right = Module_rpn.f_simplify(l15_r);
				if ((FlowRuntime.compareEqual(l16_left,(new Struct_Int(0.0)))&&FlowRuntime.compareEqual(l17_right,(new Struct_Int(0.0))))) {
					return (new Struct_Int(0.0));
				} else {
					if (FlowRuntime.compareEqual(l16_left,(new Struct_Int(0.0)))) {
						return (new Struct_Neg(l17_right));
					} else {
						if (FlowRuntime.compareEqual(l17_right,(new Struct_Int(0.0)))) {
							return l16_left;
						} else {
							Struct l18__tmp = l17_right;
							switch (l18__tmp.getTypeId()) {
							case 39/*Neg*/: {
								final Struct_Neg l19__tmp = (Struct_Neg)l18__tmp;
								final Struct l20_v = l19__tmp.f_exp;
								final Struct l21_v = l19__tmp.f_exp;
								return (new Struct_Add(l16_left, l21_v));
							}
							default: {
								return (new Struct_Sub(l16_left, l17_right));
							}
							}
						}
					}
				}
			}
			case 38/*Mul*/: {
				final Struct_Mul l1__tmp = (Struct_Mul)l0__tmp;
				final Struct l22_l = l1__tmp.f_left;
				final Struct l23_r = l1__tmp.f_right;
				final Struct l24_l = l1__tmp.f_left;
				final Struct l25_r = l1__tmp.f_right;
				final Struct l26_left = Module_rpn.f_simplify(l24_l);
				final Struct l27_right = Module_rpn.f_simplify(l25_r);
				if (FlowRuntime.compareEqual(l26_left,(new Struct_Int(1.0)))) {
					return l27_right;
				} else {
					if (FlowRuntime.compareEqual(l27_right,(new Struct_Int(1.0)))) {
						return l26_left;
					} else {
						if ((FlowRuntime.compareEqual(l26_left,(new Struct_Int(0.0)))||FlowRuntime.compareEqual(l27_right,(new Struct_Int(0.0))))) {
							return (new Struct_Int(0.0));
						} else {
							if (FlowRuntime.compareEqual(l27_right,l26_left)) {
								return (new Struct_Pow(l27_right, (new Struct_Int(2.0))));
							} else {
								return (new Struct_Mul(l26_left, l27_right));
							}
						}
					}
				}
			}
			case 16/*Div*/: {
				final Struct_Div l1__tmp = (Struct_Div)l0__tmp;
				final Struct l28_l = l1__tmp.f_left;
				final Struct l29_r = l1__tmp.f_right;
				final Struct l30_l = l1__tmp.f_left;
				final Struct l31_r = l1__tmp.f_right;
				final Struct l32_left = Module_rpn.f_simplify(l30_l);
				final Struct l33_right = Module_rpn.f_simplify(l31_r);
				if (FlowRuntime.compareEqual(l33_right,(new Struct_Int(0.0)))) {
					return (new Struct_Div(l32_left, l33_right));
				} else {
					if ((FlowRuntime.compareEqual(l32_left,(new Struct_Int(0.0)))&&(!FlowRuntime.compareEqual(l33_right,(new Struct_Int(0.0)))))) {
						return (new Struct_Int(0.0));
					} else {
						if (FlowRuntime.compareEqual(l33_right,(new Struct_Int(1.0)))) {
							return l32_left;
						} else {
							if (FlowRuntime.compareEqual(l33_right,l32_left)) {
								return (new Struct_Int(1.0));
							} else {
								return (new Struct_Div(l32_left, l33_right));
							}
						}
					}
				}
			}
			case 94/*Pow*/: {
				final Struct_Pow l1__tmp = (Struct_Pow)l0__tmp;
				final Struct l34_l = l1__tmp.f_left;
				final Struct l35_r = l1__tmp.f_right;
				final Struct l36_l = l1__tmp.f_left;
				final Struct l37_r = l1__tmp.f_right;
				final Struct l38_left = Module_rpn.f_simplify(l36_l);
				if (FlowRuntime.compareEqual(l37_r,(new Struct_Int(0.0)))) {
					return (new Struct_Int(1.0));
				} else {
					if ((FlowRuntime.compareEqual(l38_left,(new Struct_Int(0.0)))&&(!FlowRuntime.compareEqual(l37_r,(new Struct_Int(0.0)))))) {
						return (new Struct_Int(0.0));
					} else {
						return (new Struct_Pow(l38_left, l37_r));
					}
				}
			}
			case 39/*Neg*/: {
				final Struct_Neg l1__tmp = (Struct_Neg)l0__tmp;
				final Struct l39_e = l1__tmp.f_exp;
				final Struct l40_e = l1__tmp.f_exp;
				final Struct l41_num = Module_rpn.f_simplify(l40_e);
				Struct l42__tmp = l41_num;
				switch (l42__tmp.getTypeId()) {
				case 39/*Neg*/: {
					final Struct_Neg l43__tmp = (Struct_Neg)l42__tmp;
					final Struct l44_ex = l43__tmp.f_exp;
					final Struct l45_ex = l43__tmp.f_exp;
					return l45_ex;
				}
				default: {
					if (FlowRuntime.compareEqual(l41_num,(new Struct_Int(0.0)))) {
						return (new Struct_Int(0.0));
					} else {
						return (new Struct_Neg(l41_num));
					}
				}
				}
			}
			default: {
				return aexp_0;
			}
			}
		}
}
