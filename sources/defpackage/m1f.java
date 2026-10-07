package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class m1f extends o1f {
    public final String a;

    public m1f(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m1f) && this.a.equals(((m1f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("Success(text=", this.a, ")");
    }
}
