package defpackage;

import android.hardware.camera2.CaptureResult;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n17 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n17(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        p17 p17Var;
        Integer num;
        int i = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                i64 i64Var = (i64) obj4;
                xf5 xf5Var = (xf5) obj3;
                o17 o17Var = (o17) obj2;
                Throwable th = (Throwable) obj;
                if (th != null) {
                    if (tvj.f(5, "CXCP")) {
                        Log.w("CXCP", "propagateToFocusMeteringResultDeferred: completed exceptionally!", th);
                    }
                    i64Var.j0(th);
                } else {
                    toe toeVar = (toe) xf5Var.l();
                    if (tvj.f(3, "CXCP")) {
                        Log.d("CXCP", "propagateToFocusMeteringResultDeferred: result3A = " + toeVar);
                    }
                    int i2 = toeVar.a;
                    if (i2 == 4) {
                        bc1.p("Camera is not active.", i64Var);
                    } else {
                        boolean z = false;
                        if (i2 == 2) {
                            i64Var.Q(new p17(false));
                        } else {
                            o17Var.getClass();
                            int i3 = toeVar.a;
                            xg xgVar = toeVar.b;
                            if (i3 == 0) {
                                if (xgVar != null) {
                                    num = (Integer) xgVar.a.get(CaptureResult.CONTROL_AF_STATE);
                                } else {
                                    num = null;
                                }
                                if (this.b) {
                                    List list = pe.b;
                                    ArrayList arrayList = o17Var.m;
                                    if (!(arrayList == null ? false : arrayList.contains(new pe(1))) || (xgVar != null && (num == null || num.intValue() == 4))) {
                                        z = true;
                                    }
                                }
                                p17Var = new p17(z);
                            } else {
                                p17Var = new p17(false);
                            }
                            i64Var.Q(p17Var);
                        }
                    }
                }
                return sbi.a;
            default:
                return ((npa) obj4).a((rt2) obj3, (fda) obj2, null, false, this.b);
        }
    }
}
