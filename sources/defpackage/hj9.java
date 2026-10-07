package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class hj9 implements nlg {
    public final /* synthetic */ int a;
    public final rmg b;
    public final FrameLayout c;

    public hj9(Context context, int i) {
        this.a = i;
        switch (i) {
            case 1:
                hlg hlgVar = new hlg(context);
                this.c = hlgVar;
                this.b = new rmg(hlgVar);
                break;
            case 2:
                ouj oujVar = new ouj(context);
                this.c = oujVar;
                this.b = new rmg(oujVar);
                break;
            default:
                fj9 fj9Var = new fj9(context);
                this.c = fj9Var;
                this.b = new rmg(fj9Var);
                break;
        }
    }

    private final void b(dj9 dj9Var) {
    }

    @Override // defpackage.nlg
    public final void a(tlg tlgVar) {
        int i = this.a;
        FrameLayout frameLayout = this.c;
        rmg rmgVar = this.b;
        switch (i) {
            case 0:
                rmgVar.b(tlgVar);
                rmgVar.c();
                ((fj9) frameLayout).a(tlgVar, Math.max(350, rmgVar.b));
                break;
            case 1:
                rmgVar.b(tlgVar);
                rmgVar.c();
                ((hlg) frameLayout).a(tlgVar);
                break;
            default:
                rmgVar.b(tlgVar);
                rmgVar.c();
                ((ouj) frameLayout).a(tlgVar, Math.max(350, rmgVar.b));
                break;
        }
    }

    @Override // defpackage.nlg
    public final void c(dj9 dj9Var) {
        int i = this.a;
        FrameLayout frameLayout = this.c;
        switch (i) {
            case 0:
                ((fj9) frameLayout).b(dj9Var);
                break;
            case 1:
                break;
            default:
                ((ouj) frameLayout).b(dj9Var);
                break;
        }
    }

    @Override // defpackage.nlg
    public final void setParent(ViewGroup viewGroup) {
        int i = this.a;
        rmg rmgVar = this.b;
        FrameLayout frameLayout = this.c;
        switch (i) {
            case 0:
                fj9 fj9Var = (fj9) frameLayout;
                fj9Var.setSizeConfigurator(rmgVar);
                viewGroup.addView(fj9Var, new ViewGroup.LayoutParams(-1, -1));
                break;
            case 1:
                hlg hlgVar = (hlg) frameLayout;
                hlgVar.setSizeConfigurator(rmgVar);
                viewGroup.addView(hlgVar, new ViewGroup.LayoutParams(-1, -1));
                break;
            default:
                ouj oujVar = (ouj) frameLayout;
                oujVar.setSizeConfigurator(rmgVar);
                viewGroup.addView(oujVar, new ViewGroup.LayoutParams(-1, -1));
                break;
        }
    }
}
