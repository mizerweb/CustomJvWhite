package defpackage;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class qp2 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;

    public qp2(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object a(long j, nq4 nq4Var, String str) {
        pp2 pp2Var;
        long j2 = j;
        String str2 = str;
        if (nq4Var instanceof pp2) {
            pp2Var = (pp2) nq4Var;
            int i = pp2Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                pp2Var.h = i - Integer.MIN_VALUE;
            } else {
                pp2Var = new pp2(this, nq4Var);
            }
        } else {
            pp2Var = new pp2(this, nq4Var);
        }
        Object objD = pp2Var.f;
        int i2 = pp2Var.h;
        int i3 = 1;
        lq4 lq4Var = null;
        if (i2 == 0) {
            ch3.d0(objD);
            gm0.n(qp2.class.getName(), "changeChatTitle, chatId = " + j2);
            ny8 ny8Var = this.c;
            ((xn3) ny8Var.getValue()).j().r(j2, uw2.a);
            xn3 xn3Var = (xn3) ny8Var.getValue();
            ml0 ml0Var = new ml0(i3, lq4Var, str2);
            pp2Var.e = str2;
            pp2Var.d = j2;
            pp2Var.h = 1;
            objD = xn3Var.d(j2, ml0Var, pp2Var);
            hu4 hu4Var = hu4.a;
            if (objD == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = pp2Var.d;
            str2 = pp2Var.e;
            ch3.d0(objD);
        }
        long j3 = j2;
        String str3 = str2;
        rt2 rt2Var = (rt2) objD;
        if (rt2Var == null) {
            return new Long(0L);
        }
        ((t51) this.b.getValue()).c(new wo3((Collection) c0a.s(j3), false, false, (mg5) null, (cid) null, (Set) null, 124));
        return new Long(((pvb) this.a.getValue()).i(j3, rt2Var.A(), str3, null, null));
    }
}
