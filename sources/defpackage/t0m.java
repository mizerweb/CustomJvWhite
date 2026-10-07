package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t0m {
    public static vfi a(chi chiVar) {
        ahi ahiVar;
        zii ziiVar;
        int i = vfi.l;
        ufi ufiVar = new ufi();
        String str = chiVar.b;
        bhi bhiVar = chiVar.a;
        aji ajiVar = null;
        if (bhiVar == null) {
            ahiVar = null;
        } else {
            ahiVar = new ahi(bhiVar.a, bhiVar.b, bhiVar.c, str);
        }
        ufiVar.a = ahiVar;
        c01 c01Var = chiVar.i;
        if (c01Var == null) {
            ziiVar = null;
        } else {
            bo boVar = new bo();
            boVar.a = c01Var.a;
            boVar.b = c01Var.c;
            boVar.c = c01Var.b;
            ziiVar = new zii(boVar);
        }
        ufiVar.h = ziiVar;
        bji bjiVar = chiVar.j;
        if (bjiVar != null) {
            int i2 = bjiVar.a;
            if (i2 == 0) {
                i2 = 1;
            }
            ajiVar = new aji(i2);
        }
        ufiVar.i = ajiVar;
        ufiVar.g = chiVar.h;
        ufiVar.b = chiVar.c;
        ufiVar.c = chiVar.d;
        ufiVar.d = chiVar.e;
        ufiVar.f = chiVar.g;
        ufiVar.e = chiVar.f;
        ufiVar.j = chiVar.k;
        ufiVar.k = chiVar.l;
        return new vfi(ufiVar);
    }

    public static final int b(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == 1544) {
            return !str.equals("08") ? 4 : 1;
        }
        if (iHashCode != 1567) {
            return (iHashCode == 1569 && str.equals("12")) ? 3 : 4;
        }
        return !str.equals("10") ? 4 : 2;
    }
}
