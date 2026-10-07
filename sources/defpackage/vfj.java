package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class vfj {
    public static final ufj Companion = new ufj();
    public final String a;
    public final String b;

    public /* synthetic */ vfj(int i, String str, String str2) {
        if (3 != (i & 3)) {
            shl.b(i, 3, tfj.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfj)) {
            return false;
        }
        vfj vfjVar = (vfj) obj;
        return cqk.d(this.a, vfjVar.a) && cqk.d(this.b, vfjVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return nbh.w("WebAppBiometryOpenSettingsRequest(queryId=", this.a, ", requestId=", this.b, ")");
    }
}
