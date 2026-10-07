package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class k12 {
    public final ynh a;

    public k12(xnh xnhVar) {
        this.a = xnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k12) && cqk.d(this.a, ((k12) obj).a);
    }

    public final int hashCode() {
        ynh ynhVar = this.a;
        return (ynhVar == null ? 0 : ynhVar.hashCode()) * 31;
    }

    public final String toString() {
        return "QuoteContent(body=" + this.a + ", imageUri=null)";
    }
}
