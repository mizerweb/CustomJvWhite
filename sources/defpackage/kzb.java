package defpackage;

import java.util.Collections;
import java.util.List;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class kzb implements hw7 {
    public static final List f = Collections.singletonList(new ex2(BuildConfig.MAX_TIME_TO_UPLOAD, BuildConfig.MAX_TIME_TO_UPLOAD));
    public final long b;
    public final ny8 c;
    public final ny8 d;
    public volatile boolean e;

    public kzb(ny8 ny8Var, ny8 ny8Var2, long j) {
        this.b = j;
        this.c = ny8Var;
        this.d = ny8Var2;
    }

    @Override // defpackage.hw7
    public final boolean b() {
        return false;
    }

    @Override // defpackage.hw7
    public final long d() {
        if (!m()) {
            return 0L;
        }
        ose oseVar = (ose) ((sua) this.d.getValue()).a;
        toa toaVar = (toa) oseVar.h();
        gga ggaVar = (gga) ww3.t1((List) ch3.G(toaVar.a, true, false, new xna(this.b, toaVar, wja.DELETED, 0)));
        sfa sfaVarB = ggaVar != null ? oseVar.b(ggaVar) : null;
        if (sfaVarB == null) {
            return 0L;
        }
        return sfaVarB.a;
    }

    @Override // defpackage.hw7
    public final long e() {
        return 0L;
    }

    @Override // defpackage.hw7
    public final boolean f() {
        return true;
    }

    @Override // defpackage.hw7
    public final long k() {
        if (!m()) {
            return 0L;
        }
        ose oseVar = (ose) ((sua) this.d.getValue()).a;
        gga ggaVar = (gga) ww3.t1(wna.a(oseVar.h(), this.b));
        sfa sfaVarB = ggaVar != null ? oseVar.b(ggaVar) : null;
        if (sfaVarB == null) {
            return 0L;
        }
        return sfaVarB.a;
    }

    @Override // defpackage.hw7
    public final List l() {
        if (!m()) {
            return f;
        }
        return ((rt2) yab.A0(k66.a, new ur8(this, null, 16))).b.n.e(mg5.DELAYED);
    }

    public final boolean m() {
        if (this.e) {
            return true;
        }
        nx2 nx2Var = ((rt2) yab.A0(k66.a, new ur8(this, null, 16))).b;
        boolean z = nx2Var.o0 >= nx2Var.n0;
        if (z) {
            this.e = true;
        }
        return z;
    }
}
