package defpackage;

import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class vue extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ wue d;

    /* JADX WARN: Illegal instructions before constructor call */
    public vue(wue wueVar, int i) {
        this.c = i;
        int i2 = 4;
        this.d = wueVar;
        switch (i) {
            case 1:
                super(i2, que.a);
                break;
            default:
                super(i2, rue.i);
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        wue wueVar = this.d;
        switch (i) {
            case 0:
                if (!cqk.d(obj, obj2)) {
                    wueVar.D();
                }
                break;
            case 1:
                if (!cqk.d(obj, obj2)) {
                    wueVar.D();
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    sue sueVar = (sue) obj2;
                    ImageView iconView = wueVar.getIconView();
                    ViewGroup.LayoutParams layoutParams = iconView.getLayoutParams();
                    if (layoutParams == null) {
                        ore.n("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    } else {
                        uf4 uf4Var = (uf4) layoutParams;
                        ((ViewGroup.MarginLayoutParams) uf4Var).height = sueVar.b;
                        ((ViewGroup.MarginLayoutParams) uf4Var).width = sueVar.a;
                        iconView.setLayoutParams(uf4Var);
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vue(sue sueVar, wue wueVar) {
        super(4, sueVar);
        this.c = 2;
        this.d = wueVar;
    }
}
