package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yc5 implements oj7 {
    public static final yc5 a;
    private static final fif descriptor;

    static {
        yc5 yc5Var = new yc5();
        a = yc5Var;
        t4d t4dVar = new t4d("ru.ok.tamtam.models.pms.DefaultReactionsSettings", yc5Var, 4);
        t4dVar.k("isActive", true);
        t4dVar.k("count", true);
        t4dVar.k("included", true);
        t4dVar.k("reactionIds", true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        ad5 ad5Var = (ad5) obj;
        List list = ad5Var.d;
        boolean z = ad5Var.c;
        int i = ad5Var.b;
        boolean z2 = ad5Var.a;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        ny8[] ny8VarArr = ad5.e;
        if (x74VarA.B() || !z2) {
            x74VarA.h(fifVar, 0, z2);
        }
        if (x74VarA.B() || i != 8) {
            x74VarA.y(1, i, fifVar);
        }
        if (x74VarA.B() || z) {
            x74VarA.h(fifVar, 2, z);
        }
        if (x74VarA.B() || !cqk.d(list, r66.a)) {
            x74VarA.i(fifVar, 3, (aw8) ny8VarArr[3].getValue(), list);
        }
        x74VarA.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oj7
    public final aw8[] b() {
        ny8[] ny8VarArr = ad5.e;
        b01 b01Var = b01.a;
        return new aw8[]{b01Var, ij8.a, b01Var, ny8VarArr[3].getValue()};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        ny8[] ny8VarArr = ad5.e;
        boolean z = true;
        int i = 0;
        boolean zC = false;
        int iL = 0;
        boolean zC2 = false;
        List list = null;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                zC = v74VarA.C(fifVar, 0);
                i |= 1;
            } else if (iV == 1) {
                iL = v74VarA.l(fifVar, 1);
                i |= 2;
            } else if (iV == 2) {
                zC2 = v74VarA.C(fifVar, 2);
                i |= 4;
            } else {
                if (iV != 3) {
                    qr7.e(iV);
                    return null;
                }
                list = (List) v74VarA.x(fifVar, 3, (aw8) ny8VarArr[3].getValue(), list);
                i |= 8;
            }
        }
        v74VarA.j(fifVar);
        return new ad5(i, zC, iL, zC2, list);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
