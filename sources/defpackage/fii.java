package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fii extends x0m {
    public final String a;

    public fii(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fii) && this.a.equals(((fii) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("Story(token=", this.a, ")");
    }
}
