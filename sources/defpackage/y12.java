package defpackage;

import ru.ok.tamtam.android.util.share.ShareData;

/* JADX INFO: loaded from: classes4.dex */
public final class y12 {
    public final ShareData a;
    public final t12 b;
    public final x12 c;

    public y12(ShareData shareData, t12 t12Var, x12 x12Var) {
        this.a = shareData;
        this.b = t12Var;
        this.c = x12Var;
    }

    public static y12 a(y12 y12Var, ShareData shareData, t12 t12Var, x12 x12Var, int i) {
        if ((i & 1) != 0) {
            shareData = y12Var.a;
        }
        if ((i & 2) != 0) {
            t12Var = y12Var.b;
        }
        if ((i & 4) != 0) {
            x12Var = y12Var.c;
        }
        y12Var.getClass();
        return new y12(shareData, t12Var, x12Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y12)) {
            return false;
        }
        y12 y12Var = (y12) obj;
        return cqk.d(this.a, y12Var.a) && cqk.d(this.b, y12Var.b) && this.c.equals(y12Var.c);
    }

    public final int hashCode() {
        ShareData shareData = this.a;
        int iHashCode = (shareData == null ? 0 : shareData.hashCode()) * 31;
        t12 t12Var = this.b;
        return this.c.hashCode() + ((iHashCode + (t12Var != null ? t12Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "QuoteDataUIState(shareData=" + this.a + ", data=" + this.b + ", state=" + this.c + ")";
    }
}
