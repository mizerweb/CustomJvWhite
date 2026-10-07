package defpackage;

import android.util.Log;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public final class dqg implements fli {
    public final ix6 a;
    public final omi b;
    public kli d;
    public final l9b c = new l9b();
    public final LinkedList e = new LinkedList();

    public dqg(ix6 ix6Var, omi omiVar) {
        this.a = ix6Var;
        this.b = omiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(dqg dqgVar, bqg bqgVar, kli kliVar, nq4 nq4Var) {
        cqg cqgVar;
        dqgVar.getClass();
        if (nq4Var instanceof cqg) {
            cqgVar = (cqg) nq4Var;
            int i = cqgVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                cqgVar.h = i - Integer.MIN_VALUE;
            } else {
                cqgVar = new cqg(dqgVar, nq4Var);
            }
        } else {
            cqgVar = new cqg(dqgVar, nq4Var);
        }
        Object objC = cqgVar.f;
        int i2 = cqgVar.h;
        if (i2 == 0) {
            ch3.d0(objC);
            if (tvj.f(3, "CXCP")) {
                Log.d("CXCP", "StillCaptureRequestControl: submitting " + bqgVar + " at " + kliVar);
            }
            ix6 ix6Var = dqgVar.a;
            cqgVar.d = bqgVar;
            cqgVar.e = kliVar;
            cqgVar.h = 1;
            objC = ix6Var.c(cqgVar);
            hu4 hu4Var = hu4.a;
            if (objC == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kliVar = cqgVar.e;
            bqgVar = cqgVar.d;
            ch3.d0(objC);
        }
        int iIntValue = ((Number) objC).intValue();
        if (tvj.f(3, "CXCP")) {
            Log.d("CXCP", "StillCaptureRequestControl: Issuing single capture");
        }
        return yab.h(dqgVar.b.f, null, 0, new ryf(kliVar.c(bqgVar.a, bqgVar.b, bqgVar.c, iIntValue), bqgVar, null, 10), 3);
    }

    @Override // defpackage.fli
    public final void b(kli kliVar) {
        this.d = kliVar;
        yab.i0(this.b.f, null, 0, new hki(this, null), 3);
    }

    @Override // defpackage.fli
    public final void reset() {
        yab.i0(this.b.f, null, 0, new p7g(this, (lq4) null, 7), 3);
    }
}
