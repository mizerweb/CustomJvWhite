package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class v6d implements w6d {
    public static final v6d c = new v6d(0, new s6d(0));
    public final int a;
    public final kjl b;

    public v6d(int i, kjl kjlVar) {
        this.a = i;
        this.b = kjlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6d)) {
            return false;
        }
        v6d v6dVar = (v6d) obj;
        return this.a == v6dVar.a && this.b.equals(v6dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Voted(voteRate=" + this.a + ", avatarsInfo=" + this.b + ")";
    }
}
