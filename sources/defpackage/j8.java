package defpackage;

import android.content.Context;
import android.view.View;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class j8 extends jca {
    public final /* synthetic */ int l = 0;
    public final /* synthetic */ m8 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8(m8 m8Var, Context context, g7h g7hVar, View view) {
        super(context, g7hVar, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.m = m8Var;
        if ((g7hVar.A.x & 32) != 32) {
            View view2 = m8Var.i;
            this.e = view2 == null ? (View) m8Var.h : view2;
        }
        xva xvaVar = m8Var.w;
        this.h = xvaVar;
        hca hcaVar = this.i;
        if (hcaVar != null) {
            hcaVar.d(xvaVar);
        }
    }

    @Override // defpackage.jca
    public final void c() {
        int i = this.l;
        m8 m8Var = this.m;
        switch (i) {
            case 0:
                m8Var.t = null;
                super.c();
                break;
            default:
                yba ybaVar = m8Var.c;
                if (ybaVar != null) {
                    ybaVar.d(true);
                }
                m8Var.s = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8(m8 m8Var, Context context, yba ybaVar, View view) {
        super(context, ybaVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = m8Var;
        this.f = 8388613;
        xva xvaVar = m8Var.w;
        this.h = xvaVar;
        hca hcaVar = this.i;
        if (hcaVar != null) {
            hcaVar.d(xvaVar);
        }
    }
}
