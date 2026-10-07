package defpackage;

/* JADX INFO: loaded from: classes.dex */
@mif
public final class x51 {
    public static final w51 Companion = new w51();
    public final boolean a;
    public final long b;

    public /* synthetic */ x51(int i, long j, boolean z) {
        this.a = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.b = 5000L;
        } else {
            this.b = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x51)) {
            return false;
        }
        x51 x51Var = (x51) obj;
        return this.a == x51Var.a && this.b == x51Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BusinessStatusConfig(isEnabled=" + this.a + ", durationMs=" + this.b + ")";
    }

    public x51() {
        this.a = false;
        this.b = 5000L;
    }
}
