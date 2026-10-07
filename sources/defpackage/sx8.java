package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class sx8 {
    public static final String c;
    public static final String d;
    public final String a;
    public final String b;

    static {
        String str = vqi.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public sx8(String str, String str2) {
        this.a = vqi.Y(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sx8.class == obj.getClass()) {
            sx8 sx8Var = (sx8) obj;
            if (Objects.equals(this.a, sx8Var.a) && Objects.equals(this.b, sx8Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
