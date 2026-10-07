package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class xh6 {
    public static volatile xh6 a;
    public static final xh6 b;

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        xh6 xh6Var = new xh6();
        Map map = Collections.EMPTY_MAP;
        b = xh6Var;
    }

    public static xh6 a() {
        xh6 xh6Var;
        xh6 xh6Var2 = a;
        if (xh6Var2 != null) {
            return xh6Var2;
        }
        synchronized (xh6.class) {
            try {
                xh6Var = a;
                if (xh6Var == null) {
                    Class cls = wh6.a;
                    if (cls != null) {
                        try {
                            xh6Var = (xh6) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                            xh6Var = b;
                        }
                    } else {
                        xh6Var = b;
                    }
                    a = xh6Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return xh6Var;
    }
}
