package defpackage;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
public final class tf3 {
    public final String a;
    public final String b;
    public final RectF c;

    public tf3(String str, String str2, RectF rectF) {
        this.a = str;
        this.b = str2;
        this.c = rectF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf3)) {
            return false;
        }
        tf3 tf3Var = (tf3) obj;
        return cqk.d(this.a, tf3Var.a) && cqk.d(this.b, tf3Var.b) && cqk.d(this.c, tf3Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        RectF rectF = this.c;
        return iHashCode2 + (rectF != null ? rectF.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("ChatTitleIconState(newIconPath=", this.a, ", croppedIconPath=", this.b, ", relativeCrop=");
        sbQ.append(this.c);
        sbQ.append(")");
        return sbQ.toString();
    }
}
