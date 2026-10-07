package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class sg0 {
    public final int a;
    public final double b;
    public final long c;
    public final Throwable d;

    static {
        Collections.unmodifiableSet(new HashSet(Arrays.asList(2, 3, 4)));
    }

    public sg0(int i, double d, long j, Throwable th) {
        this.a = i;
        this.b = d;
        this.c = j;
        this.d = th;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sg0) {
            sg0 sg0Var = (sg0) obj;
            if (this.a == sg0Var.a && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(sg0Var.b) && this.c == sg0Var.c) {
                Throwable th = sg0Var.d;
                Throwable th2 = this.d;
                if (th2 != null ? th2.equals(th) : th == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        double d = this.b;
        int iDoubleToLongBits = (i ^ ((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32)))) * 1000003;
        long j = this.c;
        int i2 = (iDoubleToLongBits ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Throwable th = this.d;
        return (th == null ? 0 : th.hashCode()) ^ i2;
    }

    public final String toString() {
        return "AudioStats{audioState=" + this.a + ", audioAmplitudeInternal=" + this.b + ", audioBytesRecorded=" + this.c + ", errorCause=" + this.d + "}";
    }
}
