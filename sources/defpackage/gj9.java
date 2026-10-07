package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class gj9 extends s7g {
    public final /* synthetic */ int u;
    public final int v;
    public tlg w;

    public gj9(Context context, qlg qlgVar, int i) {
        this.u = i;
        switch (i) {
            case 1:
                hlg hlgVar = new hlg(context);
                super(hlgVar);
                this.v = 81;
                int iK = gm0.K(81.0f * yl5.d().getDisplayMetrics().density);
                hlgVar.setLayoutParams(new ViewGroup.LayoutParams(iK, iK));
                qe7.H(hlgVar, 300L, new jvf(this, 6, qlgVar));
                hlgVar.setOnLongClickListener(new ro2(this, 9, qlgVar));
                break;
            case 2:
                ouj oujVar = new ouj(context);
                super(oujVar);
                int iMin = Math.min(350, gm0.K(81.0f * yl5.d().getDisplayMetrics().density));
                this.v = iMin;
                oujVar.setLayoutParams(new ViewGroup.LayoutParams(iMin, iMin));
                qe7.H(oujVar, 300L, new jvf(this, 24, qlgVar));
                oujVar.setOnLongClickListener(new ro2(this, 12, qlgVar));
                break;
            default:
                fj9 fj9Var = new fj9(context);
                super(fj9Var);
                int iMin2 = Math.min(350, gm0.K(81.0f * yl5.d().getDisplayMetrics().density));
                this.v = iMin2;
                fj9Var.setLayoutParams(new ViewGroup.LayoutParams(iMin2, iMin2));
                qe7.H(fj9Var, 300L, new z36(this, 16, qlgVar));
                fj9Var.setOnLongClickListener(new ro2(this, 3, qlgVar));
                break;
        }
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        int i = this.u;
        int i2 = this.v;
        View view = this.a;
        switch (i) {
            case 0:
                if (k79Var instanceof tlg) {
                    tlg tlgVar = (tlg) k79Var;
                    this.w = tlgVar;
                    ((fj9) view).a(tlgVar, i2);
                    ((fj9) view).setAlpha(tlgVar.j ? 0.3f : 1.0f);
                    break;
                }
                break;
            case 1:
                if (k79Var instanceof tlg) {
                    tlg tlgVar2 = (tlg) k79Var;
                    this.w = tlgVar2;
                    if (i2 == 0) {
                        ((hlg) view).setSizeConfigurator(new rmg(view));
                    }
                    ((hlg) view).a(tlgVar2);
                    ((hlg) view).setAlpha(tlgVar2.j ? 0.3f : 1.0f);
                    break;
                }
                break;
            default:
                if (k79Var instanceof tlg) {
                    tlg tlgVar3 = (tlg) k79Var;
                    this.w = tlgVar3;
                    ((ouj) view).a(tlgVar3, i2);
                    ((ouj) view).setAlpha(tlgVar3.j ? 0.3f : 1.0f);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.s7g
    public final void C(k79 k79Var, Object obj) {
        int i = this.u;
        View view = this.a;
        switch (i) {
            case 0:
                if (!(obj instanceof slg)) {
                    B(k79Var);
                } else {
                    ((fj9) view).setAlpha(((slg) obj).a ? 0.3f : 1.0f);
                }
                break;
            case 1:
                if (!(obj instanceof slg)) {
                    B(k79Var);
                } else {
                    ((hlg) view).setAlpha(((slg) obj).a ? 0.3f : 1.0f);
                }
                break;
            default:
                if (!(obj instanceof slg)) {
                    B(k79Var);
                } else {
                    ((ouj) view).setAlpha(((slg) obj).a ? 0.3f : 1.0f);
                }
                break;
        }
    }
}
