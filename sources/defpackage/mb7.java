package defpackage;

import android.util.Log;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import androidx.fragment.app.strictmode.Violation;

/* JADX INFO: loaded from: classes.dex */
public abstract class mb7 {
    public static final lb7 a = lb7.a;

    public static lb7 a(a aVar) {
        while (aVar != null) {
            if (aVar.p()) {
                aVar.l();
            }
            aVar = aVar.w;
        }
        return a;
    }

    public static void b(Violation violation) {
        if (c.K(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(violation.a.getClass().getName()), violation);
        }
    }
}
