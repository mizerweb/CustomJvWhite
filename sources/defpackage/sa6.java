package defpackage;

import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class sa6 implements Serializable {
    public static final sa6 a = new sa6();
    public static final sa6 b = new sa6();
    public static final sa6 c = new sa6();

    public static String a(String str) {
        return c0a.o("`StreamReadConstraints.", str, "()`");
    }

    public static void b(String str, Object... objArr) throws StreamConstraintsException {
        throw new StreamConstraintsException(String.format(str, objArr));
    }

    public static sa6 c(go8[] go8VarArr) {
        if (go8VarArr.length > 31) {
            throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", go8VarArr[0].getClass().getName(), Integer.valueOf(go8VarArr.length)));
        }
        for (go8 go8Var : go8VarArr) {
            if (go8Var.a()) {
                go8Var.h();
            }
        }
        return new sa6();
    }

    public static void d(int i) throws StreamConstraintsException {
        if (i <= 50000) {
            return;
        }
        b("Name length (%d) exceeds the maximum allowed (%d, from %s)", Integer.valueOf(i), 50000, a("getMaxNameLength"));
        throw null;
    }
}
