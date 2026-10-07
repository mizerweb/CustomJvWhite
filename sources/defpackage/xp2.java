package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xp2 extends cq2 {
    public final xnh a;

    public xp2(xnh xnhVar) {
        this.a = xnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xp2) && this.a.equals(((xp2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ErrorWithLocalizedMessage(text=" + this.a + ")";
    }
}
