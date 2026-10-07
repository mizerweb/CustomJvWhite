package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public final class kc7 {
    public final Bitmap a;
    public final int b;
    public final int c;

    public kc7(int i, int i2, Bitmap bitmap) {
        this.a = bitmap;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kc7)) {
            return false;
        }
        kc7 kc7Var = (kc7) obj;
        return cqk.d(this.a, kc7Var.a) && this.b == kc7Var.b && this.c == kc7Var.c;
    }

    public final int hashCode() {
        Bitmap bitmap = this.a;
        return Integer.hashCode(this.c) + zo5.c(this.b, (bitmap == null ? 0 : bitmap.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultFrame(bitmap=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return zo5.t(sb, this.c, ")");
    }
}
