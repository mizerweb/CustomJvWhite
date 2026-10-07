package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cf implements ef {
    public final String a;

    public cf(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cf) && cqk.d(this.a, ((cf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("Custom(config=", this.a, ")");
    }
}
