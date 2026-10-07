package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class jcf extends hcf {
    public final xtj j;
    public final xtj k;
    public final long l;

    public jcf(l4e l4eVar, long j, long j2, long j3, long j4, long j5, List list, long j6, xtj xtjVar, xtj xtjVar2, long j7, long j8) {
        super(l4eVar, j, j2, j3, j5, list, j6, j7, j8);
        this.j = xtjVar;
        this.k = xtjVar2;
        this.l = j4;
    }

    @Override // defpackage.mcf
    public final l4e a(ble bleVar) {
        xtj xtjVar = this.j;
        if (xtjVar == null) {
            return this.a;
        }
        b87 b87Var = bleVar.a;
        return new l4e(xtjVar.q(b87Var.j, 0L, 0L, b87Var.a), 0L, -1L);
    }

    @Override // defpackage.hcf
    public final long d(long j) {
        List list = this.f;
        if (list != null) {
            return list.size();
        }
        long j2 = this.l;
        if (j2 != -1) {
            return (j2 - this.d) + 1;
        }
        if (j == -9223372036854775807L) {
            return -1L;
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.b));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i = fw0.a;
        return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // defpackage.hcf
    public final l4e h(zke zkeVar, long j) {
        List list = this.f;
        long j2 = this.d;
        long j3 = list != null ? ((kcf) list.get((int) (j - j2))).a : (j - j2) * this.e;
        b87 b87Var = zkeVar.a;
        return new l4e(this.k.q(b87Var.j, j, j3, b87Var.a), 0L, -1L);
    }
}
