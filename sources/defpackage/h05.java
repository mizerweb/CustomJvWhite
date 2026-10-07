package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class h05 {
    public final String a;
    public final uxa b;

    public h05(String str, uxa uxaVar) {
        this.a = str;
        this.b = uxaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!h05.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        h05 h05Var = (h05) obj;
        return this.a.equals(h05Var.a) && this.b.equals(h05Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
