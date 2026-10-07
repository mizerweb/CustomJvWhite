package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wp8 implements aq8 {
    public final String a;

    public wp8(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wp8) && cqk.d(this.a, ((wp8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("CommonError(message=", this.a, ")");
    }
}
