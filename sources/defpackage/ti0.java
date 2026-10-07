package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ti0 {
    public final long a;
    public final long b;
    public final Set c;

    public ti0(long j, long j2, Set set) {
        this.a = j;
        this.b = j2;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ti0) {
            ti0 ti0Var = (ti0) obj;
            if (this.a == ti0Var.a && this.b == ti0Var.b && this.c.equals(ti0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.b;
        return this.c.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.a + ", maxAllowedDelay=" + this.b + ", flags=" + this.c + "}";
    }
}
