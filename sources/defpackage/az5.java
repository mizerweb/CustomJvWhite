package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class az5 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final Uri f;

    public /* synthetic */ az5(boolean z, int i) {
        this((i & 1) != 0 ? false : z, false, false, false, false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az5)) {
            return false;
        }
        az5 az5Var = (az5) obj;
        return this.a == az5Var.a && this.b == az5Var.b && this.c == az5Var.c && this.d == az5Var.d && this.e == az5Var.e && cqk.d(this.f, az5Var.f);
    }

    public final int hashCode() {
        int iN = nbh.n(nbh.n(nbh.n(nbh.n(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        Uri uri = this.f;
        return iN + (uri == null ? 0 : uri.hashCode());
    }

    public final String toString() {
        StringBuilder sbB = zo5.B("UiState(isLoadingVisible=", this.a, ", isContentVisible=", this.b, ", isDownloadIconVisible=");
        qt4.B(", isActionRowVisible=", ", isInputCheckIconVisible=", sbB, this.c, this.d);
        sbB.append(this.e);
        sbB.append(", previewUri=");
        sbB.append(this.f);
        sbB.append(")");
        return sbB.toString();
    }

    public az5(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Uri uri) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = uri;
    }
}
