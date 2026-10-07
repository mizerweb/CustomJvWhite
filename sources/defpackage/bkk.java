package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bkk {
    public final byte a;

    public /* synthetic */ bkk(byte b) {
        this.a = b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bkk) {
            return this.a == ((bkk) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.a);
    }

    public final String toString() {
        return wk8.b("2ade776e3d03bf5e1b04f6") + wk8.b("fac0d74d2faeb49f70") + ((int) this.a) + ')';
    }
}
