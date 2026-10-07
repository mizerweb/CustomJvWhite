package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h6d {
    public final ynh a;
    public final CharSequence b;

    public h6d(ynh ynhVar, CharSequence charSequence) {
        this.a = ynhVar;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6d)) {
            return false;
        }
        h6d h6dVar = (h6d) obj;
        return cqk.d(this.a, h6dVar.a) && this.b.equals(h6dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ToolbarState(title=" + this.a + ", subtitle=" + ((Object) this.b) + ")";
    }
}
