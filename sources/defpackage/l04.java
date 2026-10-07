package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l04 {
    public final tnh a;
    public final rnh b;
    public final int c;

    public l04(tnh tnhVar, rnh rnhVar, int i) {
        this.a = tnhVar;
        this.b = rnhVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l04)) {
            return false;
        }
        l04 l04Var = (l04) obj;
        return this.a.equals(l04Var.a) && this.b.equals(l04Var.b) && this.c == l04Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (Integer.hashCode(this.a.c) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommentsBlackListToolbarInfo(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", count=");
        return zo5.t(sb, this.c, ")");
    }
}
