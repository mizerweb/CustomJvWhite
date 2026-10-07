package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kkd implements lkd {
    public final xnh a;

    public kkd(xnh xnhVar) {
        this.a = xnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kkd) && this.a.equals(((kkd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Text(text=" + this.a + ")";
    }
}
