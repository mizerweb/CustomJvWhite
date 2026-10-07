package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class bd0 implements eo {
    public static final bd0 c;
    public final boolean a;
    public final String b;

    static {
        xp9 xp9Var = new xp9(5, false);
        xp9Var.b = Boolean.FALSE;
        c = new bd0(xp9Var);
    }

    public bd0(xp9 xp9Var) {
        this.a = ((Boolean) xp9Var.b).booleanValue();
        this.b = (String) xp9Var.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bd0)) {
            return false;
        }
        bd0 bd0Var = (bd0) obj;
        return f55.h(null, null) && this.a == bd0Var.a && f55.h(this.b, bd0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.a), this.b});
    }
}
