package defpackage;

import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class wc extends g6g {
    public final vc f;
    public final tbj g;

    public wc(vc vcVar, ExecutorService executorService, tbj tbjVar) {
        super(executorService);
        this.f = vcVar;
        this.g = tbjVar;
    }

    @Override // defpackage.g6g, defpackage.nee
    /* JADX INFO: renamed from: K */
    public final void u(s7g s7gVar, int i) {
        d20 d20Var = this.d;
        int f = ((k79) d20Var.f.get(i)).getF();
        vc vcVar = this.f;
        if (f != R.id.call_screen_admin_user_in_wait_room_vh) {
            if (((k79) d20Var.f.get(i)).getF() != R.id.call_screen_admin_user_in_wait_room_more_vh) {
                s7gVar.B((k79) F(i));
                return;
            }
            View view = ((sc) s7gVar).a;
            k79 k79Var = (k79) F(i);
            if (k79Var instanceof fni) {
                ((atf) view).setModelItem((fni) k79Var);
                qe7.H(view, 300L, new t8(5, vcVar));
                return;
            }
            return;
        }
        uc ucVar = (uc) s7gVar;
        k79 k79Var2 = (k79) F(i);
        tbj tbjVar = ucVar.u;
        View view2 = ucVar.a;
        if (k79Var2 instanceof eni) {
            eni eniVar = (eni) k79Var2;
            ucVar.B(eniVar);
            izb izbVar = (izb) view2;
            izbVar.i();
            izbVar.p((LayerDrawable) tbjVar.b.getValue(), (LayerDrawable) tbjVar.c.getValue(), new tc(vcVar, 0, eniVar));
        }
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        if (i == R.id.call_screen_admin_user_in_wait_room_vh) {
            return new uc(viewGroup.getContext(), this.g);
        }
        if (i != R.id.call_screen_admin_user_in_wait_room_more_vh) {
            ore.k(nbh.q(i, "unknown item viewType "));
            return null;
        }
        atf atfVar = new atf(viewGroup.getContext());
        sc scVar = new sc(atfVar);
        atfVar.setThemeDepended(usf.b);
        return scVar;
    }
}
