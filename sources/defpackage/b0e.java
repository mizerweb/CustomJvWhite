package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b0e {
    public final long a;

    public b0e(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b0e) && getClass() == obj.getClass()) {
            return this.a == ((b0e) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a) + (zfe.a(getClass()).hashCode() * 31);
    }
}
