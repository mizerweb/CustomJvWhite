package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fx5 {
    public static final fx5 c = new fx5(0, 0);
    public static final fx5 d = new fx5(1, 8);
    public static final fx5 e = new fx5(3, 10);
    public static final fx5 f = new fx5(4, 10);
    public static final fx5 g = new fx5(5, 10);
    public static final fx5 h = new fx5(6, 10);
    public static final fx5 i = new fx5(6, 8);
    public final int a;
    public final int b;

    public fx5(int i2, int i3) {
        this.a = i2;
        this.b = i3;
    }

    public final boolean a() {
        return b() && this.a != 1 && this.b == 10;
    }

    public final boolean b() {
        int i2 = this.a;
        return (i2 == 0 || i2 == 2 || this.b == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fx5) {
            fx5 fx5Var = (fx5) obj;
            if (this.a == fx5Var.a && this.b == fx5Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DynamicRange@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("{encoding=");
        switch (this.a) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case 5:
                str = "HDR10_PLUS";
                break;
            case 6:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb.append(str);
        sb.append(", bitDepth=");
        return zo5.t(sb, this.b, "}");
    }
}
