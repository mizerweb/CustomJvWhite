package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hhf {
    public final Long a;

    public hhf(Long l) {
        this.a = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hhf) && cqk.d(this.a, ((hhf) obj).a);
    }

    public final int hashCode() {
        Long l = this.a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        return iic.m(this.a, "VerificationKey(accentSourceId=", ")");
    }
}
