package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import java.util.LinkedHashMap;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class ka8 extends wq4 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ ka8(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.wq4
    public void a(br4 br4Var, gr4 gr4Var, hr4 hr4Var) {
        switch (this.a) {
            case 1:
                if (((Widget) this.c) == br4Var && hr4Var.b && gr4Var.d()) {
                    View view = br4Var.getView();
                    if ((view != null ? view.getWindowToken() : null) != null) {
                        i19 i19Var = ((okc) this.b).a;
                        if ((i19Var == null ? null : i19Var).d == n09.d) {
                            (i19Var != null ? i19Var : null).d(m09.ON_RESUME);
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.wq4
    public void b(br4 br4Var, gr4 gr4Var, hr4 hr4Var) {
        switch (this.a) {
            case 1:
                okc.a((okc) this.b, (Widget) this.c, br4Var, gr4Var, hr4Var);
                for (ln7 ln7Var : mn7.a.values()) {
                    if (ln7Var.a.contains(br4Var.getInstanceId())) {
                        ln7Var.b.i(br4Var, gr4Var, hr4Var);
                    }
                }
                break;
        }
    }

    @Override // defpackage.wq4
    public void c(br4 br4Var, Bundle bundle) {
        switch (this.a) {
            case 1:
                ((okc) this.b).d = bundle.getBundle("Registry.savedState");
                break;
        }
    }

    @Override // defpackage.wq4
    public void e(br4 br4Var, Bundle bundle) {
        switch (this.a) {
            case 1:
                bundle.putBundle("Registry.savedState", ((okc) this.b).d);
                break;
        }
    }

    @Override // defpackage.wq4
    public void f(br4 br4Var) {
        switch (this.a) {
            case 1:
                okc okcVar = (okc) this.b;
                if (!okcVar.c) {
                    Bundle bundle = new Bundle();
                    okcVar.d = bundle;
                    s68 s68Var = okcVar.b;
                    if (s68Var == null) {
                        s68Var = null;
                    }
                    s68Var.c(bundle);
                }
                break;
        }
    }

    @Override // defpackage.wq4
    public final void g(br4 br4Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ia8 ia8Var = (ia8) this.c;
                if (ia8Var != null) {
                    ia8Var.e(Integer.valueOf(((y3f) obj).a));
                }
                break;
            default:
                i19 i19Var = ((okc) obj).a;
                if (i19Var == null) {
                    i19Var = null;
                }
                i19Var.d(m09.ON_RESUME);
                break;
        }
    }

    @Override // defpackage.wq4
    public void h(br4 br4Var) {
        switch (this.a) {
            case 1:
                okc okcVar = (okc) this.b;
                LinkedHashMap linkedHashMap = mn7.a;
                c79 c79VarW = yab.w();
                for (br4 parentController = br4Var.getParentController(); parentController != null; parentController = parentController.getParentController()) {
                    c79VarW.add(parentController.getInstanceId());
                }
                mn7.a.put(br4Var.getInstanceId(), new ln7(yab.j(c79VarW), new nkc(okcVar)));
                break;
        }
    }

    @Override // defpackage.wq4
    public void j(br4 br4Var, View view) {
        switch (this.a) {
            case 1:
                okc okcVar = (okc) this.b;
                if (view.getTag(R.id.view_tree_lifecycle_owner) == null && view.getTag(R.id.view_tree_saved_state_registry_owner) == null) {
                    view.setTag(R.id.view_tree_lifecycle_owner, okcVar);
                    view.setTag(R.id.view_tree_saved_state_registry_owner, okcVar);
                }
                i19 i19Var = okcVar.a;
                if (i19Var == null) {
                    i19Var = null;
                }
                i19Var.d(m09.ON_START);
                break;
        }
    }

    @Override // defpackage.wq4
    public void p(br4 br4Var) {
        switch (this.a) {
            case 1:
                mn7.a.remove(br4Var.getInstanceId());
                break;
        }
    }

    @Override // defpackage.wq4
    public void q(br4 br4Var) {
        switch (this.a) {
            case 1:
                okc okcVar = (okc) this.b;
                okcVar.c = false;
                okcVar.a = new i19(okcVar);
                s68 s68Var = new s68(okcVar);
                okcVar.b = s68Var;
                s68Var.b(okcVar.d);
                i19 i19Var = okcVar.a;
                if (i19Var == null) {
                    i19Var = null;
                }
                i19Var.d(m09.ON_CREATE);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wq4
    public void s(br4 br4Var, View view) {
        switch (this.a) {
            case 1:
                okc okcVar = (okc) this.b;
                if (br4Var.isBeingDestroyed() && br4Var.getRouter().a.a.size() == 0) {
                    ViewParent parent = view.getParent();
                    View view2 = parent instanceof View ? (View) parent : null;
                    if (view2 != null) {
                        view2.addOnAttachStateChangeListener(new ga0(view2, 10, okcVar));
                    }
                } else {
                    i19 i19Var = okcVar.a;
                    (i19Var != null ? i19Var : null).d(m09.ON_DESTROY);
                }
                break;
        }
    }

    @Override // defpackage.wq4
    public void t(br4 br4Var) {
        switch (this.a) {
            case 1:
                okc okcVar = (okc) this.b;
                i19 i19Var = okcVar.a;
                if ((i19Var == null ? null : i19Var).d == n09.e) {
                    if (i19Var == null) {
                        i19Var = null;
                    }
                    i19Var.d(m09.ON_PAUSE);
                }
                i19 i19Var2 = okcVar.a;
                (i19Var2 != null ? i19Var2 : null).d(m09.ON_STOP);
                break;
        }
    }
}
