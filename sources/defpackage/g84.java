package defpackage;

import java.util.List;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class g84 implements vhf {
    public final ghe a;
    public long b;

    public g84(List list, List list2) {
        z88 z88VarL = c98.l();
        lvb.R(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            z88VarL.c(new f84((vhf) list.get(i), (List) list2.get(i)));
        }
        this.a = z88VarL.h();
        this.b = -9223372036854775807L;
    }

    @Override // defpackage.vhf
    public final long e() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            ghe gheVar = this.a;
            if (i >= gheVar.d) {
                break;
            }
            long jE = ((f84) gheVar.get(i)).a.e();
            if (jE != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jE);
            }
            i++;
        }
        if (jMin == BuildConfig.MAX_TIME_TO_UPLOAD) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // defpackage.vhf
    public final boolean i() {
        int i = 0;
        while (true) {
            ghe gheVar = this.a;
            if (i >= gheVar.d) {
                return false;
            }
            if (((f84) gheVar.get(i)).a.i()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.vhf
    public final boolean u(fa9 fa9Var) {
        boolean zU;
        boolean z = false;
        do {
            long jE = e();
            if (jE == Long.MIN_VALUE) {
                return z;
            }
            int i = 0;
            zU = false;
            while (true) {
                ghe gheVar = this.a;
                if (i >= gheVar.d) {
                    break;
                }
                long jE2 = ((f84) gheVar.get(i)).a.e();
                boolean z2 = jE2 != Long.MIN_VALUE && jE2 <= fa9Var.a;
                if (jE2 == jE || z2) {
                    zU |= ((f84) gheVar.get(i)).a.u(fa9Var);
                }
                i++;
            }
            z |= zU;
        } while (zU);
        return z;
    }

    @Override // defpackage.vhf
    public final long v() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            ghe gheVar = this.a;
            if (i >= gheVar.d) {
                break;
            }
            f84 f84Var = (f84) gheVar.get(i);
            long jV = f84Var.a.v();
            c98 c98Var = f84Var.b;
            if ((c98Var.contains(1) || c98Var.contains(2) || c98Var.contains(4)) && jV != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jV);
            }
            if (jV != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jV);
            }
            i++;
        }
        if (jMin != BuildConfig.MAX_TIME_TO_UPLOAD) {
            this.b = jMin;
            return jMin;
        }
        if (jMin2 == BuildConfig.MAX_TIME_TO_UPLOAD) {
            return Long.MIN_VALUE;
        }
        long j = this.b;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // defpackage.vhf
    public final void y(long j) {
        int i = 0;
        while (true) {
            ghe gheVar = this.a;
            if (i >= gheVar.d) {
                return;
            }
            ((f84) gheVar.get(i)).y(j);
            i++;
        }
    }
}
