package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ex3 {
    public static final ex3 h = new ex3(1, 2, 3, null, -1, -1);
    public static final ex3 i = new ex3(1, 1, 2, null, -1, -1);
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final int f;
    public int g;

    static {
        String str = vqi.a;
        j = Integer.toString(0, 36);
        k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        o = Integer.toString(5, 36);
    }

    public ex3(int i2, int i3, int i4, byte[] bArr, int i5, int i6) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = bArr;
        this.e = i5;
        this.f = i6;
    }

    public static String b(int i2) {
        if (i2 == -1) {
            return "Unset color range";
        }
        if (i2 != 1) {
            return i2 != 2 ? zo5.h(i2, "Undefined color range ") : "Limited range";
        }
        return "Full range";
    }

    public static String c(int i2) {
        if (i2 == -1) {
            return "Unset color space";
        }
        if (i2 == 6) {
            return "BT2020";
        }
        if (i2 != 1) {
            return i2 != 2 ? zo5.h(i2, "Undefined color space ") : "BT601";
        }
        return "BT709";
    }

    public static int d(int i2) {
        if (i2 == 1) {
            return 8;
        }
        if (i2 == 2) {
            return 13;
        }
        if (i2 == 6) {
            return 16;
        }
        if (i2 != 7) {
            return i2 != 10 ? 1 : 4;
        }
        return 18;
    }

    public static String e(int i2) {
        if (i2 == -1) {
            return "Unset color transfer";
        }
        if (i2 == 10) {
            return "Gamma 2.2";
        }
        if (i2 == 1) {
            return "Linear";
        }
        if (i2 == 2) {
            return "sRGB";
        }
        if (i2 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i2 != 6) {
            return i2 != 7 ? zo5.h(i2, "Undefined color transfer ") : "HLG";
        }
        return "ST2084 PQ";
    }

    public static boolean g(ex3 ex3Var) {
        if (ex3Var == null) {
            return true;
        }
        int i2 = ex3Var.a;
        if (i2 != -1 && i2 != 1 && i2 != 2) {
            return false;
        }
        int i3 = ex3Var.b;
        if (i3 != -1 && i3 != 2) {
            return false;
        }
        int i4 = ex3Var.c;
        if ((i4 != -1 && i4 != 3) || ex3Var.d != null) {
            return false;
        }
        int i5 = ex3Var.f;
        if (i5 != -1 && i5 != 8) {
            return false;
        }
        int i6 = ex3Var.e;
        return i6 == -1 || i6 == 8;
    }

    public static boolean h(ex3 ex3Var) {
        if (ex3Var == null) {
            return false;
        }
        int i2 = ex3Var.c;
        return i2 == 7 || i2 == 6;
    }

    public static int i(int i2) {
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 9) {
            return (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int j(int i2) {
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 4) {
            return 10;
        }
        if (i2 == 13) {
            return 2;
        }
        if (i2 == 16) {
            return 6;
        }
        if (i2 != 18) {
            return (i2 == 6 || i2 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final dx3 a() {
        dx3 dx3Var = new dx3();
        dx3Var.a = this.a;
        dx3Var.b = this.b;
        dx3Var.c = this.c;
        dx3Var.d = this.d;
        dx3Var.e = this.e;
        dx3Var.f = this.f;
        return dx3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ex3.class == obj.getClass()) {
            ex3 ex3Var = (ex3) obj;
            if (this.a == ex3Var.a && this.b == ex3Var.b && this.c == ex3Var.c && Arrays.equals(this.d, ex3Var.d) && this.e == ex3Var.e && this.f == ex3Var.f) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return (this.a == -1 || this.b == -1 || this.c == -1) ? false : true;
    }

    public final int hashCode() {
        if (this.g == 0) {
            this.g = ((((Arrays.hashCode(this.d) + ((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31)) * 31) + this.e) * 31) + this.f;
        }
        return this.g;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(c(this.a));
        sb.append(", ");
        sb.append(b(this.b));
        sb.append(", ");
        sb.append(e(this.c));
        sb.append(", ");
        sb.append(this.d != null);
        sb.append(", ");
        String str2 = "NA";
        int i2 = this.e;
        if (i2 != -1) {
            str = i2 + "bit Luma";
        } else {
            str = "NA";
        }
        sb.append(str);
        sb.append(", ");
        int i3 = this.f;
        if (i3 != -1) {
            str2 = i3 + "bit Chroma";
        }
        return zo5.w(sb, str2, ")");
    }
}
