package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class wpj {
    public final byte[] a;
    public final String b;
    public final String c;

    public wpj(byte[] bArr, String str, String str2) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wpj)) {
            return false;
        }
        wpj wpjVar = (wpj) obj;
        return cqk.d(this.a, wpjVar.a) && cqk.d(this.b, wpjVar.b) && cqk.d(this.c, wpjVar.c);
    }

    public final int hashCode() {
        byte[] bArr = this.a;
        int iHashCode = (bArr == null ? 0 : Arrays.hashCode(bArr)) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return zo5.w(qv1.q("WebAppShareFileInfo(file=", Arrays.toString(this.a), ", fileName=", this.b, ", fileMimeType="), this.c, ")");
    }
}
