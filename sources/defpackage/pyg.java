package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pyg implements ryg {
    public final dy8 a;
    public final String b;
    public final byte c;

    public pyg(dy8 dy8Var, String str, byte b) {
        this.a = dy8Var;
        this.b = str;
        this.c = b;
    }

    @Override // defpackage.ryg
    public final dy8 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pyg)) {
            return false;
        }
        pyg pygVar = (pyg) obj;
        return this.a.equals(pygVar.a) && cqk.d(this.b, pygVar.b) && this.c == pygVar.c;
    }

    public final int hashCode() {
        return Byte.hashCode(this.c) + zo5.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        String strA = e29.a(this.c);
        StringBuilder sb = new StringBuilder("Link(coordinates=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", checkResult=");
        return zo5.w(sb, strA, ")");
    }
}
