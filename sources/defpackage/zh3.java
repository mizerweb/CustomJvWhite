package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class zh3 extends g6g {
    public final v56 f;
    public g3 g;

    public zh3(v56 v56Var, ExecutorService executorService) {
        super(executorService);
        this.f = v56Var;
    }

    @Override // defpackage.g6g, defpackage.nee
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void u(final tg3 tg3Var, int i) {
        final w73 w73Var = (w73) this.d.f.get(i);
        v56 v56Var = this.f;
        final xh3 xh3Var = new xh3(v56Var, 0);
        yh3 yh3Var = new yh3(v56Var, 0);
        yh3 yh3Var2 = new yh3(v56Var, 1);
        final xh3 xh3Var2 = new xh3(v56Var, 1);
        xh3 xh3Var3 = new xh3(v56Var, 2);
        tg3Var.B(w73Var);
        xu2 xu2Var = (xu2) tg3Var.a;
        qe7.H(xu2Var, 300L, new qg3(xh3Var, 0, w73Var));
        xu2Var.setOnLongClickListener(new rg3(yh3Var, tg3Var, w73Var, 0));
        xu2Var.setAvatarLongClickListener(new rg3(yh3Var2, tg3Var, w73Var, 1));
        xu2Var.setAvatarClickListener(new View.OnClickListener() { // from class: sg3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ozg ozgVar = tg3Var.v;
                if (ozgVar == null || ozgVar.c == 0) {
                    xh3Var.accept(w73Var.a);
                } else {
                    xh3Var2.accept(ozgVar.b.a());
                }
            }
        });
        xu2Var.setTrailingButtonClickListener(new qg3(xh3Var3, 1, w73Var));
    }

    @Override // defpackage.nee
    public final void v(lfe lfeVar, int i, List list) throws Exception {
        tg3 tg3Var = (tg3) lfeVar;
        g3 g3Var = this.g;
        d20 d20Var = this.d;
        if (g3Var != null) {
            g3Var.invoke(Long.valueOf(((w73) d20Var.f.get(i)).a));
        }
        if (list.isEmpty()) {
            u(tg3Var, i);
            return;
        }
        u73 u73Var = new u73(3);
        for (Object obj : list) {
            u73 u73Var2 = obj instanceof u73 ? (u73) obj : null;
            if (u73Var2 != null) {
                u73Var.e(u73Var2);
            }
        }
        tg3Var.C((w73) d20Var.f.get(i), u73Var);
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        tg3 tg3Var = new tg3(new xu2(viewGroup.getContext()));
        tg3Var.u = 0L;
        return tg3Var;
    }

    @Override // defpackage.nee
    public final /* bridge */ /* synthetic */ boolean y(lfe lfeVar) {
        return true;
    }
}
