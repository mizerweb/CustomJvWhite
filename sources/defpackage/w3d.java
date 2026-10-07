package defpackage;

import android.os.Handler;
import androidx.media3.common.ParserException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class w3d implements kyh {
    public final wye a;
    public final v2a b = new v2a(28, false);
    public final rwa c = new rwa(1);
    public long d = -9223372036854775807L;
    public final /* synthetic */ x3d e;

    public w3d(x3d x3dVar, qf qfVar) {
        this.e = x3dVar;
        this.a = new wye(qfVar, null, null);
    }

    @Override // defpackage.kyh
    public final void a(long j, int i, int i2, int i3, jyh jyhVar) {
        long jI;
        long jA0;
        this.a.a(j, i, i2, i3, jyhVar);
        while (this.a.x(false)) {
            rwa rwaVar = this.c;
            rwaVar.q();
            if (this.a.C(this.b, rwaVar, 0, false) == -4) {
                rwaVar.t();
            } else {
                rwaVar = null;
            }
            if (rwaVar != null) {
                long j2 = rwaVar.f;
                lwa lwaVarA = this.e.c.a(rwaVar);
                if (lwaVarA != null) {
                    tc6 tc6Var = (tc6) lwaVarA.a[0];
                    String str = tc6Var.a;
                    String str2 = tc6Var.b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            jA0 = vqi.a0(vqi.s(tc6Var.e));
                        } catch (ParserException unused) {
                            jA0 = -9223372036854775807L;
                        }
                        if (jA0 != -9223372036854775807L) {
                            v3d v3dVar = new v3d(j2, jA0);
                            Handler handler = this.e.d;
                            handler.sendMessage(handler.obtainMessage(1, v3dVar));
                        }
                    }
                }
            }
        }
        wye wyeVar = this.a;
        sye syeVar = wyeVar.a;
        synchronized (wyeVar) {
            int i4 = wyeVar.s;
            jI = i4 == 0 ? -1L : wyeVar.i(i4);
        }
        syeVar.a(jI);
    }

    @Override // defpackage.kyh
    public final void b(nmc nmcVar, int i, int i2) {
        this.a.b(nmcVar, i, 0);
    }

    @Override // defpackage.kyh
    public final int d(q25 q25Var, int i, boolean z) {
        return this.a.c(q25Var, i, z);
    }

    @Override // defpackage.kyh
    public final void g(b87 b87Var) {
        this.a.g(b87Var);
    }

    public final boolean h(long j) {
        boolean z;
        x3d x3dVar = this.e;
        k15 k15Var = x3dVar.f;
        rj5 rj5Var = x3dVar.b;
        if (!k15Var.d) {
            return false;
        }
        if (x3dVar.h) {
            return true;
        }
        Map.Entry entryCeilingEntry = x3dVar.e.ceilingEntry(Long.valueOf(k15Var.h));
        if (entryCeilingEntry == null || ((Long) entryCeilingEntry.getValue()).longValue() >= j) {
            z = false;
        } else {
            long jLongValue = ((Long) entryCeilingEntry.getKey()).longValue();
            w15 w15Var = (w15) rj5Var.b;
            long j2 = w15Var.M;
            if (j2 == -9223372036854775807L || j2 < jLongValue) {
                w15Var.M = jLongValue;
            }
            z = true;
        }
        if (z && x3dVar.g) {
            x3dVar.h = true;
            x3dVar.g = false;
            w15 w15Var2 = (w15) rj5Var.b;
            w15Var2.D.removeCallbacks(w15Var2.w);
            w15Var2.C();
        }
        return z;
    }

    public final boolean i(uq3 uq3Var) {
        long j = this.d;
        boolean z = j != -9223372036854775807L && j < uq3Var.g;
        x3d x3dVar = this.e;
        if (x3dVar.f.d) {
            if (!x3dVar.h) {
                if (z) {
                    if (x3dVar.g) {
                        x3dVar.h = true;
                        x3dVar.g = false;
                        w15 w15Var = (w15) x3dVar.b.b;
                        w15Var.D.removeCallbacks(w15Var.w);
                        w15Var.C();
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
