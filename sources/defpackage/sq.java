package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sq implements oj7 {
    public static final sq a;
    private static final fif descriptor;

    static {
        sq sqVar = new sq();
        a = sqVar;
        t4d t4dVar = new t4d("ru.ok.tamtam.models.AppClockDump", sqVar, 6);
        t4dVar.k("sr", true);
        t4dVar.k("su", true);
        t4dVar.k("lr", true);
        t4dVar.k("lu", true);
        t4dVar.k("v", true);
        t4dVar.k("isfg", true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        uq uqVar = (uq) obj;
        i8b i8bVar = uqVar.e;
        long j = uqVar.b;
        long j2 = uqVar.a;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        if (x74VarA.B() || j2 != 0) {
            x74VarA.e(fifVar, 0, j2);
        }
        if (x74VarA.B() || j != 0) {
            x74VarA.e(fifVar, 1, j);
        }
        if (x74VarA.B() || uqVar.c != 0) {
            x74VarA.e(fifVar, 2, uqVar.c);
        }
        if (x74VarA.B() || uqVar.d != 0) {
            x74VarA.e(fifVar, 3, uqVar.d);
        }
        if (x74VarA.B() || !cqk.d(i8bVar, new i8b())) {
            x74VarA.i(fifVar, 4, j8b.a, i8bVar);
        }
        if (x74VarA.B() || !uqVar.f) {
            x74VarA.h(fifVar, 5, uqVar.f);
        }
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        ti9 ti9Var = ti9.a;
        return new aw8[]{ti9Var, ti9Var, ti9Var, ti9Var, j8b.a, b01.a};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        Object obj = null;
        int i = 0;
        boolean zC = false;
        long jQ = 0;
        long jQ2 = 0;
        long jQ3 = 0;
        long jQ4 = 0;
        i8b i8bVar = null;
        boolean z = true;
        while (z) {
            int iV = v74VarA.v(fifVar);
            switch (iV) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    jQ = v74VarA.q(fifVar, 0);
                    i |= 1;
                    break;
                case 1:
                    jQ2 = v74VarA.q(fifVar, 1);
                    i |= 2;
                    break;
                case 2:
                    jQ3 = v74VarA.q(fifVar, 2);
                    i |= 4;
                    break;
                case 3:
                    jQ4 = v74VarA.q(fifVar, 3);
                    i |= 8;
                    break;
                case 4:
                    i8bVar = (i8b) v74VarA.x(fifVar, 4, j8b.a, i8bVar);
                    i |= 16;
                    break;
                case 5:
                    zC = v74VarA.C(fifVar, 5);
                    i |= 32;
                    continue;
                default:
                    qr7.e(iV);
                    return obj;
            }
            obj = null;
        }
        v74VarA.j(fifVar);
        return new uq(i, jQ, jQ2, jQ3, jQ4, i8bVar, zC);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}
