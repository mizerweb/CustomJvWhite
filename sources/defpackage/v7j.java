package defpackage;

import android.util.Log;
import android.view.View;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class v7j {
    public static final u7j a = new u7j();
    public static final boolean b = Log.isLoggable("shared.ViewLifecycle", 3);

    public static final g19 a(View view) {
        i19 i19VarF;
        n09 n09Var;
        g19 g19Var = (g19) yhf.p0(yhf.s0(new rj7(new ap9(26, view), 0, lfh.c), lfh.d));
        if (g19Var == null) {
            Object tag = view.getTag(R.id.view_custom_attach_lifecycle_owner);
            d19 d19Var = tag instanceof d19 ? (d19) tag : null;
            if (d19Var == null || (i19VarF = d19Var.f()) == null || (n09Var = i19VarF.d) == null || !n09Var.a(n09.c)) {
                d19Var = new d19(view);
                view.setTag(R.id.view_custom_attach_lifecycle_owner, d19Var);
            }
            g19Var = d19Var;
        }
        if (b) {
            i19 i19VarF2 = g19Var.f();
            u7j u7jVar = a;
            i19VarF2.f(u7jVar);
            g19Var.f().a(u7jVar);
        }
        return g19Var;
    }

    public static final w09 b(View view) {
        return tre.d0(a(view));
    }
}
