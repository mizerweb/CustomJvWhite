package androidx.media3.exoplayer.dash;

import androidx.work.WorkRequest;
import defpackage.d15;
import defpackage.ed7;
import defpackage.fik;
import defpackage.kr6;
import defpackage.l6m;
import defpackage.lhb;
import defpackage.lvb;
import defpackage.ou7;
import defpackage.p15;
import defpackage.qmc;
import defpackage.ry9;
import defpackage.s25;
import defpackage.w15;
import defpackage.w4a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class DashMediaSource$Factory implements w4a {
    public final d15 a;
    public final s25 b;
    public kr6 c;
    public final ou7 d;
    public l6m e;
    public final long f;
    public final long g;
    public qmc h;

    public DashMediaSource$Factory(d15 d15Var, s25 s25Var) {
        this.a = d15Var;
        this.b = s25Var;
        this.c = new kr6(7, false);
        this.e = new l6m(22);
        this.f = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
        this.g = 5000000L;
        this.d = new ou7(22);
        d15Var.d(true);
    }

    @Override // defpackage.w4a
    public final void b(lhb lhbVar) {
        this.a.b(lhbVar);
    }

    @Override // defpackage.w4a
    public final void c() {
        this.a.c();
    }

    @Override // defpackage.w4a
    public final void d(boolean z) {
        this.a.d(z);
    }

    @Override // defpackage.w4a
    public final w4a e(kr6 kr6Var) {
        lvb.W(kr6Var, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.c = kr6Var;
        return this;
    }

    @Override // defpackage.w4a
    /* JADX INFO: renamed from: f */
    public final w15 a(ry9 ry9Var) {
        ry9Var.b.getClass();
        qmc p15Var = this.h;
        if (p15Var == null) {
            p15Var = new p15();
        }
        List list = ry9Var.b.e;
        return new w15(ry9Var, this.b, !list.isEmpty() ? new fik(p15Var, 17, list) : p15Var, this.a, this.d, this.c.D(ry9Var), this.e, this.f, this.g);
    }

    public DashMediaSource$Factory(s25 s25Var) {
        this(new ed7(s25Var), s25Var);
    }
}
