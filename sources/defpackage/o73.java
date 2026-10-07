package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class o73 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(o73 o73Var, gda gdaVar, nq4 nq4Var) {
        n73 n73Var;
        if (nq4Var instanceof n73) {
            n73Var = (n73) nq4Var;
            int i = n73Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                n73Var.f = i - Integer.MIN_VALUE;
            } else {
                n73Var = new n73(o73Var, nq4Var);
            }
        } else {
            n73Var = new n73(o73Var, nq4Var);
        }
        Object objK0 = n73Var.d;
        int i2 = n73Var.f;
        if (i2 == 0) {
            ch3.d0(objK0);
            xt4 xt4VarB = ((n0c) ((xhh) o73Var.b)).b();
            k23 k23Var = new k23(o73Var, gdaVar, null, 6);
            n73Var.f = 1;
            objK0 = yab.K0(xt4VarB, k23Var, n73Var);
            hu4 hu4Var = hu4.a;
            if (objK0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objK0);
        }
        return objK0;
    }

    public void b(int i, int i2) {
        Object value;
        mjg mjgVar = (mjg) this.h;
        do {
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, new m9f(i2, i, i2 != i, 1 != i)));
    }

    public void c(tja tjaVar) {
        yab.i0((dq4) this.c, null, 0, new f00(this, tjaVar.b, tjaVar, (lq4) null, 19), 3);
    }

    public void d(boolean z) {
        q73 q73Var = (q73) this.a;
        ArrayList arrayList = q73Var.f;
        if (!z) {
            int i = q73Var.d;
            if (i - 1 >= 0) {
                int i2 = i - 1;
                q73Var.d = i2;
                o73 o73Var = q73Var.g;
                if (o73Var != null) {
                    o73Var.b(i2, q73Var.k);
                }
                o73 o73Var2 = q73Var.g;
                if (o73Var2 != null) {
                    o73Var2.c((tja) arrayList.get(q73Var.d - 1));
                    return;
                }
                return;
            }
            return;
        }
        if (q73Var.d + 1 <= arrayList.size()) {
            int i3 = q73Var.d + 1;
            q73Var.d = i3;
            o73 o73Var3 = q73Var.g;
            if (o73Var3 != null) {
                o73Var3.b(i3, q73Var.k);
            }
            o73 o73Var4 = q73Var.g;
            if (o73Var4 != null) {
                o73Var4.c((tja) arrayList.get(q73Var.d - 1));
            }
            if (q73Var.d + 1 <= arrayList.size() && q73Var.g != null) {
            }
        }
        String str = q73Var.c;
        if (!q73Var.h || arrayList.size() - q73Var.d >= 5 || q73Var.j == 0 || str == null || str.length() == 0) {
            return;
        }
        gm0.n("q73", "Search for next messages");
        q73Var.h = false;
        yab.i0(q73Var.e, null, 0, new me1(q73Var, str, q73Var.j, (lq4) null), 3);
    }

    public void e() {
        Object value;
        Object value2;
        mjg mjgVar = (mjg) this.i;
        do {
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, null));
        mjg mjgVar2 = (mjg) this.h;
        do {
            value2 = mjgVar2.getValue();
        } while (!mjgVar2.h(value2, new m9f(0, 0, false, false)));
    }
}
