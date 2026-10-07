package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class pli extends mdh implements cf7 {
    public int e;
    public int f;
    public final /* synthetic */ uli g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pli(uli uliVar, int i, lq4 lq4Var) {
        super(1, lq4Var);
        this.g = uliVar;
        this.h = i;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        return new pli(this.g, this.h, lq4Var);
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        return ((pli) create((lq4) obj)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i;
        i64 i64VarB;
        int i2 = this.f;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "UseCaseCameraRequestControlImpl#setTorchOffAsync");
                }
                uli uliVar = this.g;
                int i3 = this.h;
                ze2 ze2VarA = uliVar.c.a();
                this.e = i3;
                this.f = 1;
                obj = ze2VarA.g(this);
                hu4 hu4Var = hu4.a;
                if (obj == hu4Var) {
                    return hu4Var;
                }
                i = i3;
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.e;
                ch3.d0(obj);
            }
            AutoCloseable autoCloseable = (AutoCloseable) obj;
            try {
                cf2 cf2Var = (cf2) autoCloseable;
                oe oeVar = new oe(i);
                if (cf2Var.a.a()) {
                    c.p(cf2Var, " after close.", "Cannot call setTorchOff on ");
                    i64VarB = null;
                } else {
                    ar4 ar4Var = cf2Var.c;
                    ar4Var.getClass();
                    i64VarB = ar4.b(ar4Var, oeVar, null, null, new jx6(0), null, null, null, 118);
                }
                p90.f(autoCloseable, null);
                return i64VarB;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p90.f(autoCloseable, th);
                    throw th2;
                }
            }
        } catch (CancellationException e) {
            if (tvj.f(3, "CXCP")) {
                Log.d("CXCP", "Cannot acquire the CameraGraph.Session", e);
            }
            return uli.l;
        }
    }
}
