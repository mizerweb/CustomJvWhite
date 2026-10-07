package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class sie {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;

    public sie(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
    }

    public final void a(long j, boolean z, boolean z2) {
        rt2 rt2VarV;
        qw2 qw2Var = (qw2) this.a.getValue();
        ny8 ny8Var = qw2Var.A;
        gm0.n("qw2", "removeChatInternal, chatId = " + j);
        rt2 rt2VarN = qw2Var.N(j);
        rt2 rt2Var = null;
        if (rt2VarN == null) {
            rt2VarV = null;
        } else {
            nx2 nx2Var = rt2VarN.b;
            ((hjc) qw2Var.w.get()).b(nx2Var.a);
            kx2 kx2Var = (rt2VarN.d0() || !rt2VarN.q0()) ? kx2.e : kx2.c;
            ((wzj) qw2Var.x.get()).c(new akf(j, nx2Var.k, z2));
            rt2VarV = qw2Var.v(j, false, new aw2(qw2Var, kx2Var));
        }
        if (rt2VarV != null) {
            if (z) {
                qw2Var.o.c(new wo3(Collections.singletonList(Long.valueOf(j)), true));
            }
            if (ny8Var.getValue() != null) {
                sy4 sy4Var = (sy4) ny8Var.getValue();
                long j2 = rt2VarV.b.a;
                sy4Var.getClass();
            }
            rt2Var = rt2VarV;
        }
        if (rt2Var != null) {
            ikb ikbVar = (ikb) this.c.getValue();
            h5c h5cVar = (h5c) this.b.getValue();
            ikbVar.getClass();
            ikb.a(rt2Var, h5cVar);
        }
    }
}
