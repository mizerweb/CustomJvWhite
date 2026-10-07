package defpackage;

import java.math.BigInteger;
import org.msgpack.core.MessageIntegerOverflowException;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class m88 extends q1 implements y88 {
    public static final BigInteger b;
    public static final BigInteger c;
    public static final BigInteger d;
    public static final BigInteger e;
    public final BigInteger a;

    static {
        BigInteger.valueOf(-128L);
        BigInteger.valueOf(127L);
        BigInteger.valueOf(-32768L);
        BigInteger.valueOf(32767L);
        b = BigInteger.valueOf(-2147483648L);
        c = BigInteger.valueOf(2147483647L);
        d = BigInteger.valueOf(Long.MIN_VALUE);
        e = BigInteger.valueOf(BuildConfig.MAX_TIME_TO_UPLOAD);
    }

    public m88(BigInteger bigInteger) {
        this.a = bigInteger;
    }

    @Override // defpackage.gri
    public final int a() {
        return 3;
    }

    @Override // defpackage.q1, defpackage.gri
    public final y88 c() {
        return this;
    }

    @Override // defpackage.gri
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gri)) {
            return false;
        }
        gri griVar = (gri) obj;
        if (((q1) griVar).a() != 3) {
            return false;
        }
        return this.a.equals(griVar.c().l());
    }

    @Override // defpackage.y88
    public final boolean f() {
        BigInteger bigInteger = d;
        BigInteger bigInteger2 = this.a;
        return bigInteger2.compareTo(bigInteger) >= 0 && bigInteger2.compareTo(e) <= 0;
    }

    @Override // defpackage.q1, defpackage.y98
    /* JADX INFO: renamed from: g */
    public final y88 c() {
        return this;
    }

    public final int hashCode() {
        long jLongValue;
        BigInteger bigInteger = b;
        BigInteger bigInteger2 = this.a;
        if (bigInteger.compareTo(bigInteger2) <= 0 && bigInteger2.compareTo(c) <= 0) {
            jLongValue = bigInteger2.longValue();
        } else {
            if (d.compareTo(bigInteger2) > 0 || bigInteger2.compareTo(e) > 0) {
                return bigInteger2.hashCode();
            }
            long jLongValue2 = bigInteger2.longValue();
            jLongValue = jLongValue2 ^ (jLongValue2 >>> 32);
        }
        return (int) jLongValue;
    }

    @Override // defpackage.mpb
    public final long i() {
        return this.a.longValue();
    }

    @Override // defpackage.y88
    public final int j() {
        BigInteger bigInteger = b;
        BigInteger bigInteger2 = this.a;
        if (bigInteger2.compareTo(bigInteger) < 0 || bigInteger2.compareTo(c) > 0) {
            throw new MessageIntegerOverflowException(bigInteger2);
        }
        return bigInteger2.intValue();
    }

    @Override // defpackage.mpb
    public final BigInteger l() {
        return this.a;
    }

    @Override // defpackage.y88
    public final long m() {
        boolean zF = f();
        BigInteger bigInteger = this.a;
        if (zF) {
            return bigInteger.longValue();
        }
        throw new MessageIntegerOverflowException(bigInteger);
    }

    @Override // defpackage.gri
    public final String toJson() {
        return this.a.toString();
    }

    public final String toString() {
        return this.a.toString();
    }
}
