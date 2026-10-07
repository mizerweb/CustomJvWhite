package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class gy7 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public gy7(String str, int i, int i2, String str2, String str3, String str4) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gy7.class == obj.getClass()) {
            gy7 gy7Var = (gy7) obj;
            if (this.a == gy7Var.a && this.b == gy7Var.b && TextUtils.equals(this.c, gy7Var.c) && TextUtils.equals(this.d, gy7Var.d) && TextUtils.equals(this.e, gy7Var.e) && TextUtils.equals(this.f, gy7Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        String str = this.c;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
