package defpackage;

import android.content.Context;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class o13 {
    public final /* synthetic */ h5 a;

    public o13(h5 h5Var) {
        this.a = h5Var;
    }

    public static p20 a(o13 o13Var, long j, mg5 mg5Var, long j2, long j3, Set set, xz9 xz9Var, dq4 dq4Var, String str, n11 n11Var, int i) {
        int i2 = (i & np0.m) != 0 ? 40 : 20;
        String str2 = (i & np0.n) != 0 ? "MediaLoader" : str;
        n11 n11Var2 = (i & np0.o) != 0 ? dul.g : n11Var;
        h5 h5Var = o13Var.a;
        Context context = (Context) h5Var.c(7);
        xhh xhhVar = (xhh) h5Var.c(23);
        ifh ifhVarD = h5Var.d(144);
        ifh ifhVarD2 = h5Var.d(136);
        ifh ifhVarD3 = h5Var.d(481);
        ifh ifhVarD4 = h5Var.d(132);
        int i3 = i2;
        du6 du6Var = new du6(ifhVarD, ifhVarD2, j, mg5Var, j2, j3, set);
        qg7 qg7Var = new qg7(str2 + "#" + j, 2, new vt(h5Var, 2));
        f33 f33Var = new f33(ifhVarD, h5Var.d(915), h5Var.d(205), ifhVarD2, xhhVar, j, mg5Var, set, n11Var2);
        xhe c7kVar = mg5Var.a() ? new c7k(8, f33Var) : new c30(ifhVarD, ifhVarD2, h5Var.d(146), f33Var, j, set, xz9Var);
        ifh ifhVar = new ifh(new ut(context, h5Var, 7));
        ifh ifhVar2 = new ifh(new ut(context, h5Var, 6));
        return new p20(xhhVar, (yt4) h5Var.c(48), du6Var, c7kVar, new uj6(j, qg7Var, ifhVarD, h5Var.d(620)), qg7Var, huk.a(cqk.D(dq4Var, ((n0c) xhhVar).a()), (t51) h5Var.c(116), j, mg5Var), ifhVar, ifhVar2, new d0c(ifhVar, ifhVar2, ifhVarD3, ifhVarD4, ifhVarD2, ifhVarD, h5Var.d(377)), f33Var, (pa4) h5Var.c(738), (e93) h5Var.c(20), mg5Var.a() ? 150 : i3, ((Boolean) ((e5d) h5Var.c(26)).D6.a(e5d.S6[395]).i()).booleanValue(), 16384);
    }
}
