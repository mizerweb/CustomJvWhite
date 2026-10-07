package defpackage;

import android.content.ComponentCallbacks2;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import one.me.android.MainActivity;
import one.me.main.MainScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class lr4 extends wq4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lr4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void u(br4 br4Var) {
    }

    @Override // defpackage.wq4
    public void d(br4 br4Var) {
        switch (this.a) {
            case 1:
                ((or4) this.b).a.d(m09.ON_CREATE);
                break;
        }
    }

    @Override // defpackage.wq4
    public void g(br4 br4Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((da2) obj).b.d(m09.ON_RESUME);
                break;
            case 1:
                ((or4) obj).a.d(m09.ON_RESUME);
                break;
        }
    }

    @Override // defpackage.wq4
    public void h(br4 br4Var) {
        switch (this.a) {
            case 0:
                ((da2) this.b).b.d(m09.ON_CREATE);
                break;
        }
    }

    @Override // defpackage.wq4
    public void j(br4 br4Var, View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((da2) obj).b.d(m09.ON_START);
                break;
            case 1:
                or4 or4Var = (or4) obj;
                view.setTag(R.id.view_tree_lifecycle_owner, or4Var);
                if (!kr4.a(br4Var)) {
                    or4Var.a.d(m09.ON_CREATE);
                }
                break;
        }
    }

    @Override // defpackage.wq4
    public void l(br4 br4Var) {
        switch (this.a) {
            case 1:
                or4 or4Var = (or4) this.b;
                if (or4Var.a.d.a(n09.c)) {
                    or4Var.a.d(m09.ON_DESTROY);
                }
                break;
        }
    }

    @Override // defpackage.wq4
    public void n(br4 br4Var, View view) throws IllegalAccessException, InvocationTargetException {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                ((or4) obj).a.d(m09.ON_START);
                break;
            case 2:
                MainScreen mainScreen = (MainScreen) obj;
                if (br4Var instanceof ubf) {
                    ComponentCallbacks2 activity = mainScreen.getActivity();
                    il9 il9Var = activity instanceof il9 ? (il9) activity : null;
                    if (il9Var != null) {
                        ((MainActivity) il9Var).A();
                    }
                } else {
                    n7j.e(view, new uk9(mainScreen, 4));
                }
                br4Var.removeLifecycleListener(this);
                break;
        }
    }

    @Override // defpackage.wq4
    public void p(br4 br4Var) {
        int i = this.a;
    }

    @Override // defpackage.wq4
    public void q(br4 br4Var) {
        switch (this.a) {
            case 1:
                or4 or4Var = (or4) this.b;
                if (or4Var.a.d == n09.a) {
                    gm0.n(np4.t(br4Var), "preCreateView: recreate lifecycleRegistry for viewLifecycleOwner");
                    or4Var.a = new i19(or4Var);
                }
                break;
        }
    }

    @Override // defpackage.wq4
    public void r(br4 br4Var) {
        switch (this.a) {
            case 0:
                i19 i19Var = ((da2) this.b).b;
                if (i19Var.d != n09.b) {
                    i19Var.d(m09.ON_DESTROY);
                }
                break;
        }
    }

    @Override // defpackage.wq4
    public void s(br4 br4Var, View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((da2) obj).b.d(m09.ON_STOP);
                break;
            case 1:
                ((or4) obj).a.d(m09.ON_STOP);
                break;
        }
    }

    @Override // defpackage.wq4
    public void t(br4 br4Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((da2) obj).b.d(m09.ON_PAUSE);
                break;
            case 1:
                ((or4) obj).a.d(m09.ON_PAUSE);
                break;
        }
    }
}
