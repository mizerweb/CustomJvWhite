package defpackage;

import java.math.BigInteger;
import org.msgpack.core.MessageIntegerOverflowException;

/* JADX INFO: loaded from: classes.dex */
public final class e98 extends q1 implements y88 {
    public final long a;

    public e98(long j) {
        this.a = j;
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
        if (obj instanceof gri) {
            gri griVar = (gri) obj;
            if (((q1) griVar).a() == 3) {
                y88 y88VarC = griVar.c();
                if (y88VarC.f() && this.a == y88VarC.i()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.y88
    public final boolean f() {
        return true;
    }

    @Override // defpackage.q1, defpackage.y98
    /* JADX INFO: renamed from: g */
    public final y88 c() {
        return this;
    }

    public final int hashCode() {
        long j = this.a;
        return (-2147483648L > j || j > 2147483647L) ? (int) ((j >>> 32) ^ j) : (int) j;
    }

    @Override // defpackage.mpb
    public final long i() {
        return this.a;
    }

    @Override // defpackage.y88
    public final int j() {
        long j = this.a;
        if (-2147483648L > j || j > 2147483647L) {
            throw new MessageIntegerOverflowException(j);
        }
        return (int) j;
    }

    @Override // defpackage.mpb
    public final BigInteger l() {
        return BigInteger.valueOf(this.a);
    }

    @Override // defpackage.y88
    public final long m() {
        return this.a;
    }

    @Override // defpackage.gri
    public final String toJson() {
        return Long.toString(this.a);
    }

    public final String toString() {
        return Long.toString(this.a);
    }
}
