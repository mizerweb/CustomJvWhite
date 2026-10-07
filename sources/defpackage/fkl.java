package defpackage;

import android.content.Context;
import android.os.PowerManager;
import android.util.Rational;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fkl {
    public static final boolean a(Context context) {
        Object poeVar;
        try {
            Object systemService = context.getSystemService((Class<Object>) PowerManager.class);
            if (systemService == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            poeVar = Boolean.valueOf(((PowerManager) systemService).isIgnoringBatteryOptimizations(context.getPackageName()));
            if (poeVar instanceof poe) {
                poeVar = null;
            }
            Boolean bool = (Boolean) poeVar;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
    }

    public static final boolean b(Rational rational) {
        return cqk.d(rational, Rational.NaN) || cqk.d(rational, Rational.ZERO) || cqk.d(rational, Rational.NEGATIVE_INFINITY) || cqk.d(rational, Rational.POSITIVE_INFINITY);
    }
}
