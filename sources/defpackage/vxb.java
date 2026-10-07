package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class vxb implements a31 {
    public final Context a;
    public final ny8 b;
    public final wme c = new wme(new iua(9, this));

    public vxb(pa4 pa4Var, Context context, ny8 ny8Var) {
        this.a = context;
        this.b = ny8Var;
        pa4Var.a(pa4.d | pa4.e, new ql1(3, this));
    }

    public final int d(boolean z, boolean z2) {
        if (!z2 || z) {
            return z ? gm0.K(20.0f * yl5.d().getDisplayMetrics().density) : c0a.d(10.0f, yl5.d().getDisplayMetrics().density, 2);
        }
        return 0;
    }

    public final int e(int i) {
        int iF = r5a.f(10.0f, yl5.d().getDisplayMetrics().density, 2, ((Number) this.c.getValue()).intValue());
        int iB = 0;
        int iK = (i & 1) != 0 ? gm0.K(38.0f * yl5.d().getDisplayMetrics().density) : 0;
        if ((i & 2) != 0) {
            iB = zo5.b(6.0f, yl5.d().getDisplayMetrics().density, zo5.b(12.0f, yl5.d().getDisplayMetrics().density, gm0.K(44.0f * yl5.d().getDisplayMetrics().density)));
        } else {
            iK = zo5.b(88.0f, yl5.d().getDisplayMetrics().density, iK);
        }
        return Math.min(gm0.K(560.0f * yl5.d().getDisplayMetrics().density), ((-iK) + iF) - iB);
    }

    public final int f() {
        return ((xac) pq3.j.e(this.a).m().f().a).b.a;
    }

    public final int g(boolean z) {
        return f55.g(pq3.j.e(this.a).m().f(), z).b.d;
    }

    public final float h() {
        return vl5.c(q9i.z.h().k((bx5) ((o1c) this.b.getValue()).a.getValue()), this.a);
    }
}
