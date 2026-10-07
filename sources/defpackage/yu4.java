package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yu4 {
    public final long a;
    public final jjd b;

    public yu4(long j, jjd jjdVar) {
        this.a = j;
        this.b = jjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yu4) {
            yu4 yu4Var = (yu4) obj;
            return this.a == yu4Var.a && this.b == yu4Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CpuState(uptime=" + this.a + ", processorInfo=" + this.b + ")";
    }
}
