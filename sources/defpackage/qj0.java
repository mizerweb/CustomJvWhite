package defpackage;

import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import one.me.pinbars.PinBarsWidget;

/* JADX INFO: loaded from: classes.dex */
public final class qj0 extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX WARN: Illegal instructions before constructor call */
    public qj0(sj0 sj0Var) {
        this.c = 0;
        Float fValueOf = Float.valueOf(0.0f);
        this.d = sj0Var;
        super(4, fValueOf);
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i;
        int i2 = this.c;
        int i3 = 0;
        a8g a8gVar = pq3.j;
        Object obj3 = this.d;
        switch (i2) {
            case 0:
                if (!cqk.d(obj, obj2)) {
                    ((sj0) obj3).invalidateSelf();
                }
                break;
            case 1:
                w66 w66Var = (w66) obj3;
                if (((View) obj2) != null) {
                    w66Var.k2 = new v66(0, w66Var);
                    nee adapter = w66Var.getAdapter();
                    if (adapter != null) {
                        w66.I0(adapter, w66Var.k2);
                    }
                    break;
                } else if (w66Var.getAdapter() != null && w66Var.k2 != null) {
                    nee adapter2 = w66Var.getAdapter();
                    if (adapter2 != null) {
                        w66.J0(adapter2, w66Var.k2);
                    }
                    w66Var.k2 = null;
                    break;
                }
                break;
            case 2:
                if (!cqk.d(obj, obj2)) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    sj0 sj0Var = ((kwb) obj3).G;
                    if (sj0Var != null) {
                        sj0Var.m.B(sj0Var, sj0.p[0], Float.valueOf(zBooleanValue ? yl5.d().getDisplayMetrics().density * 5.0f : 0.0f));
                    }
                }
                break;
            case 3:
                Boolean bool = (Boolean) obj2;
                if (!cqk.d((Boolean) obj, bool)) {
                    txb txbVar = (txb) obj3;
                    txbVar.j(a8gVar.h(txbVar), bool);
                }
                break;
            case 4:
                f1c f1cVar = (f1c) obj2;
                if (((f1c) obj) != f1cVar) {
                    g1c g1cVar = (g1c) obj3;
                    Paint paint = g1cVar.c;
                    kbc kbcVarH = a8gVar.h(g1cVar);
                    int iOrdinal = f1cVar.ordinal();
                    if (iOrdinal == 0) {
                        i = kbcVarH.h().a;
                    } else if (iOrdinal == 1) {
                        i = -1;
                    } else if (iOrdinal == 2) {
                        i = kbcVarH.h().b;
                    } else if (iOrdinal != 3) {
                        ore.o();
                    } else {
                        i = kbcVarH.h().d;
                    }
                    paint.setColor(i);
                }
                break;
            case 5:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                ((Boolean) obj).getClass();
                PinBarsWidget pinBarsWidget = (PinBarsWidget) obj3;
                if (pinBarsWidget.o != null) {
                    LinearLayout linearLayoutS1 = pinBarsWidget.s1();
                    if (zBooleanValue2 && !((Boolean) pinBarsWidget.r1().u().i()).booleanValue()) {
                        i3 = pinBarsWidget.x;
                    }
                    linearLayoutS1.setShowDividers(i3);
                }
                break;
            case 6:
                RecyclerView recyclerView = (RecyclerView) obj2;
                RecyclerView recyclerView2 = (RecyclerView) obj;
                if (recyclerView2 == null || recyclerView2 != recyclerView) {
                    ((jed) obj3).d();
                }
                break;
            default:
                b1g b1gVar = (b1g) obj3;
                if (!cqk.d(obj, obj2)) {
                    int iIntValue = ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    Drawable drawable = b1gVar.getDrawable(b1gVar.b);
                    ColorDrawable colorDrawable = drawable instanceof ColorDrawable ? (ColorDrawable) drawable : null;
                    if (colorDrawable != null) {
                        colorDrawable.setColor(oc9.Z(iIntValue, a8gVar.e(b1gVar.a).m()));
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qj0(int i, Object obj) {
        super(4, null);
        this.c = i;
        this.d = obj;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public qj0(kwb kwbVar) {
        this.c = 2;
        Boolean bool = Boolean.FALSE;
        this.d = kwbVar;
        super(4, bool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj0(g1c g1cVar) {
        super(4, f1c.a);
        this.c = 4;
        this.d = g1cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj0(Integer num, b1g b1gVar) {
        super(4, num);
        this.c = 7;
        this.d = b1gVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public qj0(PinBarsWidget pinBarsWidget) {
        this.c = 5;
        Boolean bool = Boolean.FALSE;
        this.d = pinBarsWidget;
        super(4, bool);
    }
}
