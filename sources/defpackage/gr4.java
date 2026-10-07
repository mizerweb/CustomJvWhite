package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class gr4 {
    public static final HashMap c = new HashMap();
    public boolean a;
    public boolean b;

    public gr4() {
        try {
            getClass().getConstructor(null);
        } catch (Throwable unused) {
            throw new RuntimeException(getClass() + " does not have a default constructor.");
        }
    }

    public static final void c(dr4 dr4Var) {
        View view;
        br4 br4Var = dr4Var.a;
        br4 br4Var2 = dr4Var.b;
        boolean z = dr4Var.c;
        ViewGroup viewGroup = dr4Var.d;
        gr4 gr4VarB = dr4Var.e;
        ArrayList arrayList = dr4Var.f;
        if (viewGroup == null) {
            return;
        }
        if (gr4VarB == null) {
            gr4VarB = new r7g(true);
        } else if (gr4VarB.b && !gr4VarB.e()) {
            gr4VarB = gr4VarB.b();
        }
        gr4 gr4Var = gr4VarB;
        gr4Var.b = true;
        HashMap map = c;
        if (br4Var2 != null) {
            if (z) {
                rx8.p(br4Var2.getInstanceId());
            } else {
                cr4 cr4Var = (cr4) map.get(br4Var2.getInstanceId());
                if (cr4Var != null) {
                    boolean z2 = cr4Var.b;
                    gr4 gr4Var2 = cr4Var.a;
                    if (z2) {
                        gr4Var2.f(gr4Var, br4Var);
                    } else {
                        gr4Var2.a();
                    }
                }
            }
        }
        if (br4Var != null) {
            map.put(br4Var.getInstanceId(), new cr4(gr4Var, z));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fr4) it.next()).w(br4Var, br4Var2, z);
        }
        hr4 hr4Var = z ? hr4.c : hr4.e;
        hr4 hr4Var2 = z ? hr4.d : hr4.f;
        View view2 = null;
        if (br4Var != null) {
            View viewInflate = br4Var.inflate(viewGroup);
            br4Var.changeStarted(gr4Var, hr4Var);
            view = viewInflate;
        } else {
            view = null;
        }
        if (br4Var2 != null) {
            view2 = br4Var2.getView();
            br4Var2.changeStarted(gr4Var, hr4Var2);
        }
        View view3 = view2;
        gr4Var.g(viewGroup, view3, view, z, new er4(br4Var2, gr4Var, hr4Var2, br4Var, arrayList, view3, hr4Var, z, viewGroup));
    }

    public void a() {
    }

    public gr4 b() {
        return rx8.z(j());
    }

    public boolean d() {
        return true;
    }

    public boolean e() {
        return false;
    }

    public void f(gr4 gr4Var, br4 br4Var) {
    }

    public abstract void g(ViewGroup viewGroup, View view, View view2, boolean z, er4 er4Var);

    public void h(Bundle bundle) {
    }

    public void i(Bundle bundle) {
    }

    public final Bundle j() {
        Bundle bundle = new Bundle();
        bundle.putString("ControllerChangeHandler.className", getClass().getName());
        Bundle bundle2 = new Bundle();
        i(bundle2);
        bundle.putBundle("ControllerChangeHandler.savedState", bundle2);
        return bundle;
    }
}
