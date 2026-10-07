package defpackage;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class nt3 extends r0k {
    public final long l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final ArrayList r;
    public final tsh s;
    public mt3 t;
    public ClippingMediaSource$IllegalClippingException u;
    public long v;
    public long w;

    public nt3(lt3 lt3Var) {
        super(lt3Var.a);
        this.l = lt3Var.b;
        this.m = lt3Var.c;
        this.n = lt3Var.d;
        this.o = lt3Var.e;
        this.p = lt3Var.f;
        this.q = lt3Var.g;
        this.r = new ArrayList();
        this.s = new tsh();
    }

    @Override // defpackage.r0k
    public final void D(ush ushVar) {
        if (this.u != null) {
            return;
        }
        F(ushVar);
    }

    public final void F(ush ushVar) {
        long j;
        long j2;
        long j3;
        tsh tshVar = this.s;
        ushVar.n(0, tshVar);
        long j4 = tshVar.o;
        mt3 mt3Var = this.t;
        long j5 = this.m;
        ArrayList arrayList = this.r;
        if (mt3Var == null || arrayList.isEmpty() || this.o) {
            boolean z = this.p;
            j = this.l;
            if (z) {
                long j6 = tshVar.k;
                j += j6;
                j2 = j6 + j5;
            } else {
                j2 = j5;
            }
            this.v = j4 + j;
            this.w = j5 != Long.MIN_VALUE ? j4 + j2 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                kt3 kt3Var = (kt3) arrayList.get(i);
                long j7 = this.v;
                long j8 = this.w;
                kt3Var.f = j7;
                kt3Var.g = j8;
            }
            j3 = j2;
        } else {
            j = this.v - j4;
            j3 = j5 != Long.MIN_VALUE ? this.w - j4 : Long.MIN_VALUE;
        }
        try {
            mt3 mt3Var2 = new mt3(ushVar, j, j3, this.q);
            this.t = mt3Var2;
            p(mt3Var2);
        } catch (ClippingMediaSource$IllegalClippingException e) {
            this.u = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((kt3) arrayList.get(i2)).h = this.u;
            }
        }
    }

    @Override // defpackage.ur0
    public final boolean c(ry9 ry9Var) {
        ur0 ur0Var = this.k;
        return ur0Var.k().e.equals(ry9Var.e) && ur0Var.c(ry9Var);
    }

    @Override // defpackage.ur0
    public final u0a e(x4a x4aVar, qf qfVar, long j) {
        kt3 kt3Var = new kt3(this.k.e(x4aVar, qfVar, j), this.n, this.v, this.w);
        this.r.add(kt3Var);
        return kt3Var;
    }

    @Override // defpackage.e84, defpackage.ur0
    public final void m() throws ClippingMediaSource$IllegalClippingException {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.u;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        super.m();
    }

    @Override // defpackage.ur0
    public final void q(u0a u0aVar) {
        ArrayList arrayList = this.r;
        lvb.b0(arrayList.remove(u0aVar));
        this.k.q(((kt3) u0aVar).a);
        if (!arrayList.isEmpty() || this.o) {
            return;
        }
        mt3 mt3Var = this.t;
        mt3Var.getClass();
        F(mt3Var.e);
    }

    @Override // defpackage.e84, defpackage.ur0
    public final void s() {
        super.s();
        this.u = null;
        this.t = null;
    }
}
