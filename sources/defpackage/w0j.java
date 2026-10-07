package defpackage;

import android.util.Size;

/* JADX INFO: loaded from: classes3.dex */
public final class w0j {
    public final Size a;
    public final String b;
    public final String c;

    public w0j(Size size, String str, String str2) {
        this.a = size;
        this.b = str;
        this.c = str2;
    }

    public static w0j a(w0j w0jVar, Size size, String str, String str2, int i) {
        if ((i & 1) != 0) {
            size = w0jVar.a;
        }
        if ((i & 2) != 0) {
            str = w0jVar.b;
        }
        if ((i & 4) != 0) {
            str2 = w0jVar.c;
        }
        w0jVar.getClass();
        return new w0j(size, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0j)) {
            return false;
        }
        w0j w0jVar = (w0j) obj;
        return this.a.equals(w0jVar.a) && cqk.d(this.b, w0jVar.b) && cqk.d(this.c, w0jVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Config(previewSize=");
        sb.append(this.a);
        sb.append(", previewBase64=");
        sb.append(this.b);
        sb.append(", placeholderUri=");
        return zo5.w(sb, this.c, ")");
    }
}
