package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dnl {
    public static Long a(Long l) {
        if (l == null || l.longValue() < 0) {
            return null;
        }
        return l;
    }

    public static final jy3 b(uy3 uy3Var) {
        jy3 jy3Var = new jy3(uy3Var.b);
        jy3Var.K = uy3Var.w;
        jy3Var.y = uy3Var.x;
        jy3Var.x = uy3Var.v;
        jy3Var.a = uy3Var.a;
        jy3Var.b = uy3Var.c;
        jy3Var.c = uy3Var.d;
        jy3Var.d = uy3Var.e;
        jy3Var.e = uy3Var.f;
        jy3Var.f = uy3Var.g;
        String str = uy3Var.h;
        jy3Var.g = str != null ? str.intern() : null;
        jy3Var.i = uy3Var.i;
        jy3Var.j = uy3Var.j;
        jy3Var.k = uy3Var.l;
        jy3Var.l = uy3Var.m;
        jy3Var.m = uy3Var.n;
        jy3Var.n = uy3Var.o;
        jy3Var.I = uy3Var.q;
        jy3Var.o = uy3Var.s;
        jy3Var.u = uy3Var.r;
        jy3Var.B = uy3Var.y;
        jy3Var.b(uy3Var.z);
        kja kjaVar = uy3Var.A;
        long j = uy3Var.B;
        jy3Var.E = kjaVar;
        jy3Var.G = j;
        return jy3Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final dz3 c(gda gdaVar, lja ljaVar, q24 q24Var, long j, boolean z, wja wjaVar) {
        int i;
        long j2 = gdaVar.a;
        long j3 = gdaVar.b;
        long j4 = gdaVar.c;
        long j5 = gdaVar.d;
        long j6 = gdaVar.f;
        String str = gdaVar.g;
        String string = str != null ? r5h.y1(str).toString() : null;
        wja wjaVarN = wjaVar == 0 ? pm9.n((xja) wjaVar) : wjaVar;
        ArrayList arrayListR = pm9.r(gdaVar.p);
        hja hjaVar = gdaVar.r;
        kja kjaVarY = hjaVar != null ? pm9.y(hjaVar, ljaVar) : null;
        int iK = pm9.k(gdaVar.j);
        dia diaVar = gdaVar.i;
        int i2 = diaVar != null ? diaVar.a : 0;
        if (i2 == 0) {
            i = 0;
        } else {
            int iD = qt4.D(i2);
            int i3 = 1;
            if (iD != 1) {
                i3 = 2;
                if (iD != 2) {
                    i = 0;
                }
            }
            i = i3;
        }
        return new dz3(0L, j2, j3, q24Var, j4, j5, j6, string, arrayListR, kjaVarY, iK, i, j, z, wjaVarN, gdaVar.m);
    }
}
