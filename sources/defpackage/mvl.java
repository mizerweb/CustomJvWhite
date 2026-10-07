package defpackage;

import android.content.Context;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mvl {
    public static final String a() {
        Object poeVar;
        try {
            Context context = swh.d;
            if (context == null) {
                context = null;
            }
            poeVar = context.getPackageName();
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (roe.a(poeVar) != null) {
            poeVar = "NA";
        }
        return (String) poeVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0049 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a A[RETURN] */
    public static final boolean b(fx5 fx5Var, Set set) {
        if (fx5Var.b()) {
            return set.contains(fx5Var);
        }
        for (Object obj : set) {
            fx5 fx5Var2 = (fx5) obj;
            qyj.l("Fully specified range is not actually fully specified.", fx5Var2.b());
            int i = fx5Var.b;
            if (i == 0 || i == fx5Var2.b) {
                qyj.l("Fully specified range is not actually fully specified.", fx5Var2.b());
                int i2 = fx5Var.a;
                if (i2 != 0) {
                    int i3 = fx5Var2.a;
                    if ((i2 != 2 || i3 == 1) && i2 != i3) {
                    }
                }
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }
}
