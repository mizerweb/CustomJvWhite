package defpackage;

import android.media.MediaCodec;
import android.media.metrics.LogSessionId;
import android.view.Surface;
import androidx.media3.transformer.ExportException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class bf6 extends af6 {
    public final kr6 E;
    public final int F;
    public final ArrayList G;
    public final LogSessionId H;
    public int I;

    public bf6(kr6 kr6Var, int i, gj2 gj2Var, dy dyVar, LogSessionId logSessionId) {
        super(2, gj2Var, dyVar);
        this.E = kr6Var;
        this.F = i;
        this.H = logSessionId;
        this.G = new ArrayList();
        this.I = -1;
    }

    @Override // defpackage.af6
    public final boolean H() throws ExportException {
        if (this.u.e()) {
            this.t.f();
            this.v = true;
            return false;
        }
        i95 i95Var = this.u;
        MediaCodec.BufferInfo bufferInfo = i95Var.g(false) ? i95Var.a : null;
        if (bufferInfo != null) {
            long j = bufferInfo.presentationTimeUs;
            long j2 = j - this.s;
            if (j2 >= 0) {
                ArrayList arrayList = this.G;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (((Long) arrayList.get(i)).longValue() == j) {
                        arrayList.remove(i);
                    }
                }
                if (this.t.d() != this.I && this.t.g(j2)) {
                    this.u.k(j2, true);
                    return true;
                }
            }
            this.u.j();
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.af6
    public final void I(b87 b87Var) {
        boolean z;
        this.t.getClass();
        if (ex3.h(b87Var.D)) {
            z = this.F == 1;
        }
        Surface inputSurface = this.t.getInputSurface();
        inputSurface.getClass();
        i95 i95VarB = this.E.b(b87Var, inputSurface, z, this.H);
        this.u = i95VarB;
        this.I = i95VarB.f;
    }

    @Override // defpackage.af6
    public final void J(u55 u55Var) {
        long j = u55Var.f;
        if (j < this.l) {
            this.G.add(Long.valueOf(j));
        }
    }

    @Override // defpackage.af6
    public final void K(b87 b87Var) {
    }

    @Override // defpackage.af6
    public final b87 L(b87 b87Var) {
        if (this.F != 3 || !ex3.h(b87Var.D)) {
            return b87Var;
        }
        a87 a87VarA = b87Var.a();
        a87VarA.C = ex3.h;
        return new b87(a87VarA);
    }

    @Override // defpackage.af6
    public final b87 M(b87 b87Var) {
        ex3 ex3Var = b87Var.D;
        if (ex3Var == null || !ex3Var.f()) {
            ex3Var = ex3.h;
        }
        if (this.F == 1 && ex3.h(ex3Var)) {
            ex3Var = ex3.h;
        }
        a87 a87VarA = b87Var.a();
        a87VarA.C = ex3Var;
        return new b87(a87VarA);
    }

    @Override // defpackage.af6
    public final boolean P(u55 u55Var) {
        if (!u55Var.d(4)) {
            u55Var.d.getClass();
            if (this.u == null) {
                u55Var.f -= this.s;
            }
        }
        return false;
    }

    @Override // defpackage.ks0
    public final long f(long j, long j2) {
        if (this.h == 1) {
            return 1000000L;
        }
        int i = this.I;
        if (i == -1) {
            return 10000L;
        }
        return ((long) i) * 2000;
    }

    @Override // defpackage.ks0
    public final String h() {
        return "ExoAssetLoaderVideoRenderer";
    }
}
