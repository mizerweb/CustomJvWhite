package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class fi4 {
    public static final fi4 e = new fi4("", ei4.d, "");
    public final String a;
    public final String b;
    public final ei4 c;
    public String d = null;

    public fi4(String str, ei4 ei4Var, String str2) {
        this.a = str;
        this.c = ei4Var;
        this.b = str2;
    }

    public final String a() {
        if (equals(e) || this.c == ei4.d) {
            return "";
        }
        String str = this.b;
        boolean zS = ch3.s(str);
        String str2 = this.a;
        if (!zS) {
            return ch3.r(str2) ? "" : str2;
        }
        if (this.d == null) {
            this.d = str2 + " " + str;
        }
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fi4) {
            fi4 fi4Var = (fi4) obj;
            if (this.c == fi4Var.c && Objects.equals(this.a, fi4Var.a) && this.b.equals(fi4Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.c) + ((Objects.hashCode(this.b) + (Objects.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        String simpleName = fi4.class.getSimpleName();
        boolean zC = gm0.c();
        String str = this.b;
        ei4 ei4Var = this.c;
        String str2 = this.a;
        if (!zC) {
            return simpleName + "type=" + ei4Var + ",f=" + ch3.s(str2) + ",l=" + ch3.s(str);
        }
        return simpleName + "{firstName='" + str2 + "', type=" + ei4Var + "', lastName=" + str + '}';
    }
}
