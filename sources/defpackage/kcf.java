package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kcf {
    public final long a;
    public final long b;

    public kcf(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kcf.class == obj.getClass()) {
            kcf kcfVar = (kcf) obj;
            if (this.a == kcfVar.a && this.b == kcfVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
