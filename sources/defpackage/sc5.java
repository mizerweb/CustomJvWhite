package defpackage;

import androidx.work.WorkRequest;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class sc5 implements xbf {
    public final /* synthetic */ tc5 a;

    public sc5(tc5 tc5Var) {
        this.a = tc5Var;
    }

    @Override // defpackage.xbf
    public final wbf d(long j) {
        tc5 tc5Var = this.a;
        long j2 = (((long) tc5Var.d.i) * j) / 1000000;
        long j3 = tc5Var.b;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j2);
        long j4 = tc5Var.c;
        zbf zbfVar = new zbf(j, vqi.k((bigIntegerValueOf.multiply(BigInteger.valueOf(j4 - j3)).divide(BigInteger.valueOf(tc5Var.f)).longValue() + j3) - WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, tc5Var.b, j4 - 1));
        return new wbf(zbfVar, zbfVar);
    }

    @Override // defpackage.xbf
    public final boolean f() {
        return true;
    }

    @Override // defpackage.xbf
    public final long h() {
        tc5 tc5Var = this.a;
        return (tc5Var.f * 1000000) / ((long) tc5Var.d.i);
    }
}
