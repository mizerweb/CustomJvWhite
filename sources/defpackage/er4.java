package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class er4 {
    public final /* synthetic */ br4 a;
    public final /* synthetic */ gr4 b;
    public final /* synthetic */ hr4 c;
    public final /* synthetic */ br4 d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ View f;
    public final /* synthetic */ hr4 g;
    public final /* synthetic */ boolean h;

    public er4(br4 br4Var, gr4 gr4Var, hr4 hr4Var, br4 br4Var2, ArrayList arrayList, View view, hr4 hr4Var2, boolean z, ViewGroup viewGroup) {
        this.a = br4Var;
        this.b = gr4Var;
        this.c = hr4Var;
        this.d = br4Var2;
        this.e = arrayList;
        this.f = view;
        this.g = hr4Var2;
        this.h = z;
    }

    public final void a() {
        gr4 gr4Var = this.b;
        br4 br4Var = this.a;
        if (br4Var != null) {
            br4Var.changeEnded(gr4Var, this.c);
        }
        br4 br4Var2 = this.d;
        if (br4Var2 != null) {
            gr4.c.remove(br4Var2.getInstanceId());
            br4Var2.changeEnded(gr4Var, this.g);
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((fr4) it.next()).W0(br4Var2, br4Var, this.h);
        }
        if (gr4Var.a) {
            View view = this.f;
            ViewParent parent = view != null ? view.getParent() : null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        if (!gr4Var.d() || br4Var == null) {
            return;
        }
        br4Var.setNeedsAttach(false);
    }
}
