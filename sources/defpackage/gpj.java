package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class gpj {
    public static final fpj Companion = new fpj();
    public final boolean a;

    public /* synthetic */ gpj(int i, boolean z) {
        if (1 == (i & 1)) {
            this.a = z;
        } else {
            shl.b(i, 1, epj.a.d());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gpj) && this.a == ((gpj) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("WebAppSetupBackButtonRequest(isVisible=", ")", this.a);
    }
}
