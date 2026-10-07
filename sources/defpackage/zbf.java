package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zbf {
    public static final zbf c = new zbf(0, 0);
    public final long a;
    public final long b;

    public zbf(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zbf.class == obj.getClass()) {
            zbf zbfVar = (zbf) obj;
            if (this.a == zbfVar.a && this.b == zbfVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.a);
        sb.append(", position=");
        return c0a.m(this.b, "]", sb);
    }
}
