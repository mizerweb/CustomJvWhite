package defpackage;

import kotlinx.serialization.json.internal.JsonDecodingException;

/* JADX INFO: loaded from: classes.dex */
public abstract class kt8 {
    public static final hg8 a = oc9.b(n5h.a, "kotlinx.serialization.json.JsonUnquotedLiteral");

    public static final pu8 a(Boolean bool) {
        return new vt8(bool, false, null);
    }

    public static final pu8 b(Number number) {
        return number == null ? zt8.INSTANCE : new vt8(number, false, null);
    }

    public static final pu8 c(String str) {
        return str == null ? zt8.INSTANCE : new vt8(str, true, null);
    }

    public static final void d(jt8 jt8Var, String str) {
        throw new IllegalArgumentException("Element " + zfe.a(jt8Var.getClass()) + " is not a " + str);
    }

    public static final String e(pu8 pu8Var) {
        if (pu8Var instanceof zt8) {
            return null;
        }
        return pu8Var.a();
    }

    public static final int f(pu8 pu8Var) {
        try {
            long jK = new vyh(pu8Var.a()).k();
            if (-2147483648L <= jK && jK <= 2147483647L) {
                return (int) jK;
            }
            throw new NumberFormatException(pu8Var.a() + " is not an Int");
        } catch (JsonDecodingException e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    public static final cu8 g(jt8 jt8Var) {
        cu8 cu8Var = jt8Var instanceof cu8 ? (cu8) jt8Var : null;
        if (cu8Var != null) {
            return cu8Var;
        }
        d(jt8Var, "JsonObject");
        throw null;
    }

    public static final pu8 h(jt8 jt8Var) {
        pu8 pu8Var = jt8Var instanceof pu8 ? (pu8) jt8Var : null;
        if (pu8Var != null) {
            return pu8Var;
        }
        d(jt8Var, "JsonPrimitive");
        throw null;
    }
}
