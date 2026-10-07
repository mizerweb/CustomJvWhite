package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class vhj {
    public static final uhj Companion = new uhj();
    public final String a;
    public final String b;

    public /* synthetic */ vhj(int i, String str, String str2) {
        if (3 != (i & 3)) {
            shl.b(i, 3, thj.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhj)) {
            return false;
        }
        vhj vhjVar = (vhj) obj;
        return cqk.d(this.a, vhjVar.a) && cqk.d(this.b, vhjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nbh.w("WebAppDownloadFileResponse(requestId=", this.a, ", status=", this.b, ")");
    }

    public vhj(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
