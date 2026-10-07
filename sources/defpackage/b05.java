package defpackage;

import ru.ok.android.api.json.JsonSyntaxException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b05 {
    public static final String[] a = {"standard", "accelerate", "decelerate", "linear"};

    public static final Object a(y8e y8eVar, rjj rjjVar) {
        ek2 ek2Var = new ek2(1, p90.B(rjjVar));
        ek2Var.u();
        ek2Var.w(new ssb(y8eVar, 1));
        y8eVar.e(new o3j(ek2Var));
        return ek2Var.s();
    }

    public static void b(ut8 ut8Var) throws JsonSyntaxException {
        int iK0 = ut8Var.k0();
        if (iK0 != 34 && iK0 != 49) {
            boolean z = true;
            if (iK0 == 91) {
                ut8Var.W();
                while (ut8Var.k0() != 93) {
                    if (!z) {
                        ut8Var.A(44);
                        ut8Var.W();
                    }
                    b(ut8Var);
                    z = false;
                }
                ut8Var.W();
                return;
            }
            if (iK0 != 98 && iK0 != 110) {
                if (iK0 != 123) {
                    throw JsonSyntaxException.b(ut8Var.d, ut8Var.I(), ut8Var.k0());
                }
                ut8Var.W();
                while (ut8Var.k0() != 125) {
                    if (!z) {
                        ut8Var.A(44);
                        ut8Var.W();
                    }
                    ut8Var.A(34);
                    ut8Var.W();
                    ut8Var.A(58);
                    ut8Var.W();
                    b(ut8Var);
                    z = false;
                }
                ut8Var.W();
                return;
            }
        }
        ut8Var.W();
    }

    public static void c(ut8 ut8Var, Appendable appendable) throws JsonSyntaxException {
        int iK0 = ut8Var.k0();
        if (iK0 != 34 && iK0 != 49) {
            boolean z = true;
            if (iK0 == 91) {
                ut8Var.l(appendable);
                while (ut8Var.k0() != 93) {
                    if (!z) {
                        ut8Var.A(44);
                        ut8Var.l(appendable);
                    }
                    c(ut8Var, appendable);
                    z = false;
                }
                ut8Var.l(appendable);
                return;
            }
            if (iK0 != 98 && iK0 != 110) {
                if (iK0 != 123) {
                    throw JsonSyntaxException.b(ut8Var.d, ut8Var.I(), ut8Var.k0());
                }
                ut8Var.l(appendable);
                while (ut8Var.k0() != 125) {
                    if (!z) {
                        ut8Var.A(44);
                        ut8Var.l(appendable);
                    }
                    ut8Var.A(34);
                    ut8Var.l(appendable);
                    ut8Var.A(58);
                    ut8Var.l(appendable);
                    c(ut8Var, appendable);
                    z = false;
                }
                ut8Var.l(appendable);
                return;
            }
        }
        ut8Var.l(appendable);
    }
}
