package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tk7 {
    public final ny8 a;
    public final ny8 b;

    public tk7(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, nq4 nq4Var) {
        sk7 sk7Var;
        pj4 pj4Var;
        if (nq4Var instanceof sk7) {
            sk7Var = (sk7) nq4Var;
            int i = sk7Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                sk7Var.g = i - Integer.MIN_VALUE;
            } else {
                sk7Var = new sk7(this, nq4Var);
            }
        } else {
            sk7Var = new sk7(this, nq4Var);
        }
        Object objG = sk7Var.e;
        int i2 = sk7Var.g;
        hu4 hu4Var = hu4.a;
        if (i2 != 0) {
            if (i2 == 1) {
                ch3.d0(objG);
            } else {
                if (i2 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pj4Var = sk7Var.d;
                ch3.d0(objG);
            }
            return new Long(pj4Var.a);
        }
        ch3.d0(objG);
        rzb rzbVar = (rzb) this.b.getValue();
        sk7Var.g = 1;
        sih sihVar = (sih) rzbVar.a.getValue();
        wy2 wy2Var = new wy2(kfc.Z, 19);
        wy2Var.h("phone", str);
        objG = sihVar.a.g(wy2Var, sk7Var);
        if (objG != hu4Var) {
        }
        return hu4Var;
        pj4 pj4Var2 = ((qj4) objG).c;
        if (pj4Var2 == null) {
            gm0.Y(tk7.class.getName(), "Early return in execute cuz of contactInfoByPhone is null");
            return null;
        }
        no4 no4Var = (no4) this.a.getValue();
        long[] jArr = {pj4Var2.a};
        List listSingletonList = Collections.singletonList(pj4Var2);
        sk7Var.d = pj4Var2;
        sk7Var.g = 2;
        no4Var.a.m(listSingletonList, jArr);
        if (sbi.a != hu4Var) {
            pj4Var = pj4Var2;
            return new Long(pj4Var.a);
        }
        return hu4Var;
    }
}
