package androidx.media3.exoplayer.hls;

import defpackage.ab5;
import defpackage.db5;
import defpackage.dul;
import defpackage.ev5;
import defpackage.kr6;
import defpackage.kzi;
import defpackage.l6m;
import defpackage.lhb;
import defpackage.lvb;
import defpackage.o75;
import defpackage.ou7;
import defpackage.ry9;
import defpackage.s25;
import defpackage.tx7;
import defpackage.uik;
import defpackage.w4a;
import defpackage.zx7;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class HlsMediaSource$Factory implements w4a {
    public final uik a;
    public ab5 b;
    public lhb c;
    public kr6 h = new kr6(7, false);
    public zx7 e = new dul(22);
    public final o75 f = db5.o;
    public final l6m i = new l6m(22);
    public final ou7 g = new ou7(22);
    public final int k = 1;
    public final long l = -9223372036854775807L;
    public final boolean j = true;
    public boolean d = true;

    public HlsMediaSource$Factory(s25 s25Var) {
        this.a = new uik(10, s25Var);
    }

    @Override // defpackage.w4a
    public final void b(lhb lhbVar) {
        this.c = lhbVar;
    }

    @Override // defpackage.w4a
    public final void c() {
    }

    @Override // defpackage.w4a
    public final void d(boolean z) {
        this.d = z;
    }

    @Override // defpackage.w4a
    public final w4a e(kr6 kr6Var) {
        lvb.W(kr6Var, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.h = kr6Var;
        return this;
    }

    @Override // defpackage.w4a
    /* JADX INFO: renamed from: f */
    public final tx7 a(ry9 ry9Var) {
        ry9Var.b.getClass();
        if (this.b == null) {
            ab5 ab5Var = new ab5();
            ab5Var.a = new lhb(16);
            this.b = ab5Var;
        }
        lhb lhbVar = this.c;
        if (lhbVar != null) {
            this.b.a = lhbVar;
        }
        ab5 ab5Var2 = this.b;
        ab5Var2.b = this.d;
        ab5Var2.getClass();
        zx7 kziVar = this.e;
        List list = ry9Var.b.e;
        if (!list.isEmpty()) {
            kziVar = new kzi(kziVar, list, false);
        }
        ev5 ev5VarD = this.h.D(ry9Var);
        this.f.getClass();
        uik uikVar = this.a;
        l6m l6mVar = this.i;
        return new tx7(ry9Var, uikVar, ab5Var2, this.g, ev5VarD, l6mVar, new db5(uikVar, l6mVar, kziVar), this.l, this.j, this.k);
    }
}
