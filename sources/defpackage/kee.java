package defpackage;

import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class kee implements z09 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ kee(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.z09
    public final void l(g19 g19Var, m09 m09Var) throws IllegalAccessException, InvocationTargetException {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                c1f c1fVar = (c1f) obj;
                if (m09Var != m09.ON_CREATE) {
                    c.e("Next event must be ON_CREATE");
                    return;
                }
                g19Var.f().f(this);
                Bundle bundleA = c1fVar.c().a("androidx.savedstate.Restarter");
                if (bundleA == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    ore.k("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, kee.class.getClassLoader()).asSubclass(z0f.class);
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                ((pz8) ((z0f) declaredConstructor.newInstance(null))).a(c1fVar);
                            } catch (Exception e) {
                                ore.h(qv1.k("Failed to instantiate ", str), e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        ore.h(c0a.o("Class ", str, " wasn't found"), e3);
                        return;
                    }
                }
                return;
            case 1:
                b bVar = (b) obj;
                if (bVar.e == null) {
                    c74 c74Var = (c74) bVar.getLastNonConfigurationInstance();
                    if (c74Var != null) {
                        bVar.e = c74Var.a;
                    }
                    if (bVar.e == null) {
                        bVar.e = new h8j();
                    }
                }
                bVar.a.f(this);
                return;
            case 2:
                if (m09Var == m09.ON_STOP) {
                    ((a) obj).getClass();
                    return;
                }
                return;
            case 3:
                qu quVar = (qu) obj;
                gm0.n("qu", "onStateChanged: new event = " + m09Var);
                if (m09Var != m09.ON_RESUME) {
                    return;
                }
                sgg sggVar = (sgg) quVar.e;
                if (sggVar != null) {
                    sggVar.b(null);
                }
                int i2 = ((rb8) ((pgg) quVar.c).a).p.get();
                gm0.n("qu", "onStateChanged: prevAllMediaCount = " + i2);
                quVar.e = yab.i0((rb8) quVar.a, (yt4) quVar.b, 0, new nq3(quVar, i2, (lq4) null), 2);
                return;
            default:
                if (m09Var != m09.ON_CREATE) {
                    qr7.r(m09Var, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    g19Var.f().f(this);
                    ((y0f) obj).b();
                    return;
                }
        }
    }
}
