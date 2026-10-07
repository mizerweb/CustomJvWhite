package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class vdj {
    public static final udj Companion = new udj();
    public static final ny8[] d = {null, null, rx8.P(2, new o0j(8))};
    public final String a;
    public final String b;
    public final n8h c;

    public /* synthetic */ vdj(int i, String str, String str2, n8h n8hVar) {
        if (7 != (i & 7)) {
            shl.b(i, 7, tdj.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = n8hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdj)) {
            return false;
        }
        vdj vdjVar = (vdj) obj;
        return cqk.d(this.a, vdjVar.a) && cqk.d(this.b, vdjVar.b) && this.c == vdjVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + zo5.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("WebAppBiometryAuthResponse(requestId=", this.a, ", token=", this.b, ", status=");
        sbQ.append(this.c);
        sbQ.append(")");
        return sbQ.toString();
    }

    public vdj(String str, String str2) {
        n8h n8hVar = n8h.f;
        this.a = str;
        this.b = str2;
        this.c = n8hVar;
    }
}
