package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public interface m74 {
    ComponentName c();

    default boolean f(Context context) {
        ComponentName componentNameC = c();
        boolean z = false;
        try {
            if (context.getPackageManager().getComponentEnabledSetting(componentNameC) == 1) {
                z = true;
            }
        } catch (Throwable th) {
            String name = getClass().getName();
            l74 l74Var = new l74(th);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "fail to get component " + componentNameC, l74Var);
                }
            }
        }
        String name2 = getClass().getName();
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null) {
            je9 je9Var2 = je9.e;
            if (a4cVar2.b(je9Var2)) {
                a4cVar2.c(je9Var2, name2, zo5.s("isEnabled=", z), null);
            }
        }
        return z;
    }

    default void g(Context context, boolean z) {
        ComponentName componentNameC = c();
        gm0.x(getClass().getName(), "setEnabled " + z + " for " + componentNameC, null);
        try {
            context.getPackageManager().setComponentEnabledSetting(componentNameC, z ? 1 : 2, 1);
        } catch (Throwable th) {
            gm0.V(getClass().getName(), "fail to update component state", new l74(th));
        }
    }
}
