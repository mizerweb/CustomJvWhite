package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class eci implements fci {
    public final ynh a;
    public final int b;
    public final g9c c;

    public eci(ynh ynhVar, int i, g9c g9cVar) {
        this.a = ynhVar;
        this.b = i;
        this.c = g9cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eci)) {
            return false;
        }
        eci eciVar = (eci) obj;
        return this.a.equals(eciVar.a) && this.b == eciVar.b && this.c == eciVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + zo5.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ShowSnackbar(title=" + this.a + ", icon=" + this.b + ", style=" + this.c + ")";
    }
}
