package defpackage;

import android.view.View;
import android.widget.ImageView;
import one.me.pinbars.PinBarsWidget;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;

/* JADX INFO: loaded from: classes3.dex */
public final class tc4 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tc4(View view, Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = view;
        this.c = obj;
        this.e = obj2;
        this.d = obj3;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        View view2 = this.b;
        switch (i) {
            case 0:
                ((ImageView) view2).removeOnAttachStateChangeListener(this);
                ((ImageView) obj3).postDelayed(new sc4((EnhancedAnimatedVectorDrawable) obj2, 0), ((nc4) obj).h);
                break;
            case 1:
                ((ImageView) view2).removeOnAttachStateChangeListener(this);
                ((ImageView) obj3).postDelayed(new sc4((EnhancedAnimatedVectorDrawable) obj2, 1), ((id8) obj).d);
                break;
            default:
                ((v5c) view2).removeOnAttachStateChangeListener(this);
                gf8 gf8Var = (gf8) ((if8) obj3);
                if (gf8Var.e) {
                    yab.i0(v7j.b(view), null, 0, new awa((v5c) obj2, (lq4) null, 29), 3);
                }
                zv8[] zv8VarArr = PinBarsWidget.z;
                nzc nzcVarT1 = ((PinBarsWidget) obj).t1();
                String str = gf8Var.a;
                ae8 ae8Var = nzcVarT1.z;
                if (ae8Var != null) {
                    yab.i0(ae8Var.n, null, 0, new ue0(ae8Var, str, (lq4) null), 3);
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.a;
    }
}
