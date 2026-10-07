package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class w55 {
    public final String a;
    public final b87 b;
    public final b87 c;
    public final int d;
    public final int e;

    public w55(String str, b87 b87Var, b87 b87Var2, int i, int i2) {
        lvb.R(i == 0 || i2 == 0);
        lvb.R(true ^ TextUtils.isEmpty(str));
        this.a = str;
        b87Var.getClass();
        this.b = b87Var;
        b87Var2.getClass();
        this.c = b87Var2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w55.class == obj.getClass()) {
            w55 w55Var = (w55) obj;
            if (this.d == w55Var.d && this.e == w55Var.e && this.a.equals(w55Var.a) && this.b.equals(w55Var.b) && this.c.equals(w55Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + zo5.d((((527 + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
