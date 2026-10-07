package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class roj {
    public final long a;
    public final boolean b;

    public roj(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof roj)) {
            return false;
        }
        roj rojVar = (roj) obj;
        return this.a == rojVar.a && this.b == rojVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbU = qt4.u(this.a, "BiometryPermissionUpdated(botId=", ", isEnabled=", this.b);
        sbU.append(")");
        return sbU.toString();
    }
}
