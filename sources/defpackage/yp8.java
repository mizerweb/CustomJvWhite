package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yp8 implements aq8 {
    public final String a;

    public yp8(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yp8) && cqk.d(this.a, ((yp8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("RestrictedError(message=", this.a, ")");
    }
}
