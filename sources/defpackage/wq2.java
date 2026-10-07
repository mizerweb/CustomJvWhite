package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class wq2 extends a8j {
    public final long c;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final String d = wq2.class.getName();
    public final ic6 i = new ic6(null);
    public final ic6 j = new ic6(null);

    public wq2(long j, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.c = j;
        this.e = ny8Var;
        this.f = ny8Var2;
        this.g = ny8Var3;
        this.h = ny8Var4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object B(wq2 wq2Var, dg3 dg3Var, boolean z, nq4 nq4Var) {
        vq2 vq2Var;
        if (nq4Var instanceof vq2) {
            vq2Var = (vq2) nq4Var;
            int i = vq2Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                vq2Var.f = i - Integer.MIN_VALUE;
            } else {
                vq2Var = new vq2(wq2Var, nq4Var);
            }
        } else {
            vq2Var = new vq2(wq2Var, nq4Var);
        }
        Object obj = vq2Var.d;
        hu4 hu4Var = hu4.a;
        int i2 = vq2Var.f;
        lq4 lq4Var = null;
        if (i2 == 0) {
            ch3.d0(obj);
            String str = wq2Var.d;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.e;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, zo5.q("Success change owner, chat exist: ", ", leaveChat:", dg3Var.c != null, z), null);
                }
            }
            ic6 ic6Var = wq2Var.j;
            if (z) {
                a8j.x(ic6Var, new sq2(new tnh(R.string.profile_change_owner_and_leave_snackbar_title), new Integer(R.drawable.icon_check_round_fill)));
                xt4 xt4VarB = ((n0c) ((xhh) wq2Var.g.getValue())).b();
                jhc jhcVar = new jhc(wq2Var, lq4Var, 16);
                vq2Var.f = 1;
                if (yab.K0(xt4VarB, jhcVar, vq2Var) == hu4Var) {
                    return hu4Var;
                }
            } else {
                a8j.x(ic6Var, new sq2(new tnh(R.string.profile_change_owner_snackbar_title), new Integer(R.drawable.icon_check_round_fill)));
                a8j.x(wq2Var.i, new hsd(wq2Var.c, kmd.LOCAL_CHAT));
            }
            return sbi.a;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        a8j.x(wq2Var.i, ksd.b);
        return sbi.a;
    }
}
