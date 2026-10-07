package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jnj implements ynj {
    public final boolean a;

    public jnj(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jnj) && this.a == ((jnj) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("OpenQrScanner(fileSelect=", ")", this.a);
    }
}
