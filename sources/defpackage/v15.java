package defpackage;

import java.io.IOException;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes4.dex */
public final class v15 implements w99 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ v15(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(y99 y99Var, long j, long j2, boolean z) {
    }

    @Override // defpackage.w99
    public final void d(y99 y99Var, long j, long j2, boolean z) {
        switch (this.a) {
            case 0:
                ((w15) this.b).y((rmc) y99Var, j, j2);
                break;
        }
    }

    @Override // defpackage.w99
    public final void h(y99 y99Var, long j, long j2) {
        boolean z;
        switch (this.a) {
            case 0:
                rmc rmcVar = (rmc) y99Var;
                w15 w15Var = (w15) this.b;
                long j3 = rmcVar.a;
                a35 a35Var = rmcVar.b;
                lkg lkgVar = rmcVar.d;
                t99 t99Var = new t99(a35Var, lkgVar.c, lkgVar.d, j, j2, lkgVar.b);
                w15Var.m.getClass();
                w15Var.q.O(t99Var, rmcVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                w15Var.K = ((Long) rmcVar.f).longValue() - j;
                w15Var.A(true);
                return;
            default:
                ft0 ft0Var = (ft0) this.b;
                synchronized (gpk.b) {
                    z = gpk.c;
                    break;
                }
                if (z) {
                    ft0Var.z();
                    return;
                } else {
                    ((w15) ft0Var.a).z(new IOException(new ConcurrentModificationException()));
                    return;
                }
        }
    }

    @Override // defpackage.w99
    public final dc1 x(y99 y99Var, long j, long j2, IOException iOException, int i) {
        int i2 = this.a;
        dc1 dc1Var = dc9.f;
        Object obj = this.b;
        switch (i2) {
            case 0:
                rmc rmcVar = (rmc) y99Var;
                w15 w15Var = (w15) obj;
                ed7 ed7Var = w15Var.q;
                long j3 = rmcVar.a;
                a35 a35Var = rmcVar.b;
                lkg lkgVar = rmcVar.d;
                ed7Var.Q(new t99(a35Var, lkgVar.c, lkgVar.d, j, j2, lkgVar.b), rmcVar.c, iOException, true);
                w15Var.m.getClass();
                w15Var.z(iOException);
                break;
            default:
                ((w15) ((ft0) obj).a).z(iOException);
                break;
        }
        return dc1Var;
    }
}
