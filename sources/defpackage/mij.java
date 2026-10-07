package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class mij {
    public static final lij Companion = new lij();
    public final String a;
    public final String b;

    public /* synthetic */ mij(int i, String str, String str2) {
        if (3 != (i & 3)) {
            shl.b(i, 3, kij.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mij)) {
            return false;
        }
        mij mijVar = (mij) obj;
        return cqk.d(this.a, mijVar.a) && cqk.d(this.b, mijVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nbh.w("WebAppGetLaunchContextResponse(requestId=", this.a, ", entryPoint=", this.b, ")");
    }

    public mij(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
