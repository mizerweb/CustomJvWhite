package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fe8 {
    public final byte a;

    public fe8(byte b) {
        this.a = b;
    }

    public final byte a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return getClass().equals(obj != null ? obj.getClass() : null) && this.a == ((fe8) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }
}
