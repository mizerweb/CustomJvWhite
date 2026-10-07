package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: loaded from: classes2.dex */
public final class h8 extends ha7 {
    public final /* synthetic */ int j = 0;
    public final /* synthetic */ View k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.k = actionMenuItemView;
    }

    @Override // defpackage.ha7
    public final x3g b() {
        j8 j8Var;
        int i = this.j;
        View view = this.k;
        switch (i) {
            case 0:
                i8 i8Var = ((ActionMenuItemView) view).m;
                if (i8Var == null || (j8Var = ((k8) i8Var).a.t) == null) {
                    return null;
                }
                return j8Var.a();
            default:
                j8 j8Var2 = ((l8) view).d.s;
                if (j8Var2 == null) {
                    return null;
                }
                return j8Var2.a();
        }
    }

    @Override // defpackage.ha7
    public final boolean c() {
        x3g x3gVarB;
        int i = this.j;
        View view = this.k;
        switch (i) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                xba xbaVar = actionMenuItemView.k;
                return xbaVar != null && xbaVar.b(actionMenuItemView.h) && (x3gVarB = b()) != null && x3gVarB.a();
            default:
                ((l8) view).d.l();
                return true;
        }
    }

    @Override // defpackage.ha7
    public boolean d() {
        switch (this.j) {
            case 1:
                m8 m8Var = ((l8) this.k).d;
                if (m8Var.u != null) {
                    return false;
                }
                m8Var.j();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(l8 l8Var, l8 l8Var2) {
        super(l8Var2);
        this.k = l8Var;
    }
}
