package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;
import one.me.folders.edit.FolderEditScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class i27 extends g6g {
    public final FolderEditScreen f;

    public i27(ExecutorService executorService, FolderEditScreen folderEditScreen) {
        super(executorService);
        this.f = folderEditScreen;
    }

    @Override // defpackage.g6g, defpackage.nee
    /* JADX INFO: renamed from: K */
    public final void u(s7g s7gVar, int i) {
        int iN = n(i) & 536870911;
        FolderEditScreen folderEditScreen = this.f;
        if (iN == 1) {
            s27 s27Var = (s27) s7gVar;
            s27Var.B((r27) ((k79) F(i)));
            s27Var.v = folderEditScreen;
            return;
        }
        int i2 = 2;
        if (iN == 2) {
            u17 u17Var = (u17) s7gVar;
            k79 k79Var = (k79) F(i);
            n61 n61Var = new n61(1, this.f, g27.class, "onActionItemClick", "onActionItemClick(J)V", 0, 25);
            u17Var.B(k79Var);
            qe7.H(u17Var.a, 300L, new z36(n61Var, i2, k79Var));
            return;
        }
        if (iN == 4) {
            p37 p37Var = (p37) s7gVar;
            l37 l37Var = (l37) ((k79) F(i));
            p37Var.B(l37Var);
            ((izb) p37Var.a).setFirstTrailingIconClickListener(new dx4(folderEditScreen, 14, l37Var));
            return;
        }
        if (iN != 16) {
            super.u(s7gVar, i);
            return;
        }
        h27 h27Var = (h27) s7gVar;
        View view = h27Var.a;
        k79 k79Var2 = (k79) F(i);
        m20 m20Var = new m20(2, this.f, g27.class, "onFilterSwitchClick", "onFilterSwitchClick(JZ)V", 0, 20);
        if (k79Var2 instanceof o27) {
            h27Var.B(k79Var2);
            qe7.H(view, 300L, new z36((o27) k79Var2, 3, m20Var));
            ((atf) view).setOnSwitchCheckedListener(new s81(9, m20Var));
        }
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        int i2 = 536870911 & i;
        if (i2 == 1) {
            return new s27(viewGroup);
        }
        int i3 = 4;
        if (i2 == 4) {
            return new p37(new izb(viewGroup.getContext(), false));
        }
        if (i2 == 2) {
            return new u17(viewGroup);
        }
        lq4 lq4Var = null;
        if (i2 == 32 || i2 == 64) {
            TextView textView = new TextView(viewGroup.getContext());
            am0 am0Var = new am0(textView, i3);
            n1g.N(new ud9(am0Var, lq4Var, 20), textView);
            return am0Var;
        }
        if (i2 == 16) {
            return new h27(new atf(viewGroup.getContext()));
        }
        String name = i27.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, zo5.h(i, "unknown item viewType: "), null);
            }
        }
        return new z91(new View(viewGroup.getContext()), 9);
    }
}
