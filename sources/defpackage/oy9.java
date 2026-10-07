package defpackage;

import android.net.Uri;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class oy9 {
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public final Uri a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;

    static {
        String str = vqi.a;
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
        m = Integer.toString(5, 36);
        n = Integer.toString(6, 36);
    }

    public oy9(ny9 ny9Var) {
        this.a = ny9Var.a;
        this.b = ny9Var.b;
        this.c = ny9Var.c;
        this.d = ny9Var.d;
        this.e = ny9Var.e;
        this.f = ny9Var.f;
        this.g = ny9Var.g;
    }

    public final ny9 a() {
        ny9 ny9Var = new ny9();
        ny9Var.a = this.a;
        ny9Var.b = this.b;
        ny9Var.c = this.c;
        ny9Var.d = this.d;
        ny9Var.e = this.e;
        ny9Var.f = this.f;
        ny9Var.g = this.g;
        return ny9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oy9)) {
            return false;
        }
        oy9 oy9Var = (oy9) obj;
        return this.a.equals(oy9Var.a) && Objects.equals(this.b, oy9Var.b) && Objects.equals(this.c, oy9Var.c) && this.d == oy9Var.d && this.e == oy9Var.e && Objects.equals(this.f, oy9Var.f) && Objects.equals(this.g, oy9Var.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
