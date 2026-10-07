package defpackage;

import androidx.media3.common.ParserException;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class qcj implements pcj {
    public final lj6 a;
    public final kyh b;
    public final c70 c;
    public final b87 d;
    public final int e;
    public long f;
    public int g;
    public long h;

    public qcj(lj6 lj6Var, kyh kyhVar, c70 c70Var, String str, int i) throws ParserException {
        this.a = lj6Var;
        this.b = kyhVar;
        this.c = c70Var;
        int i2 = c70Var.a;
        int i3 = c70Var.b;
        int i4 = (c70Var.d * i2) / 8;
        int i5 = c70Var.c;
        if (i5 != i4) {
            throw ParserException.a(null, "Expected block size: " + i4 + "; got: " + i5);
        }
        int i6 = i3 * i4;
        int i7 = i6 * 8;
        int iMax = Math.max(i4, i6 / 10);
        this.e = iMax;
        a87 a87Var = new a87();
        a87Var.l = uya.n("audio/wav");
        a87Var.m = uya.n(str);
        a87Var.h = i7;
        a87Var.i = i7;
        a87Var.n = iMax;
        a87Var.E = i2;
        a87Var.F = i3;
        a87Var.G = i;
        this.d = new b87(a87Var);
    }

    @Override // defpackage.pcj
    public final void a(int i, long j) {
        scj scjVar = new scj(this.c, 1, i, j);
        this.a.r(scjVar);
        b87 b87Var = this.d;
        kyh kyhVar = this.b;
        kyhVar.g(b87Var);
        kyhVar.e(scjVar.e);
    }

    @Override // defpackage.pcj
    public final void b(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }

    @Override // defpackage.pcj
    public final boolean c(kj6 kj6Var, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
            int iC = this.b.c(kj6Var, (int) Math.min(i2 - i, j2), true);
            if (iC == -1) {
                j2 = 0;
            } else {
                this.g += iC;
                j2 -= (long) iC;
            }
        }
        c70 c70Var = this.c;
        int i3 = c70Var.c;
        int i4 = this.g / i3;
        if (i4 > 0) {
            long j3 = this.f;
            long j4 = this.h;
            long j5 = c70Var.b;
            String str = vqi.a;
            long jI0 = j3 + vqi.i0(j4, 1000000L, j5, RoundingMode.DOWN);
            int i5 = i4 * i3;
            int i6 = this.g - i5;
            this.b.a(jI0, 1, i5, i6, null);
            this.h += (long) i4;
            this.g = i6;
        }
        return j2 <= 0;
    }
}
