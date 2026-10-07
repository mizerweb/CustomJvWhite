package defpackage;

import android.view.View;
import android.view.ViewGroup;
import one.me.keyboardmedia.MediaKeyboardWidget;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gz9 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kz9 b;

    public /* synthetic */ gz9(kz9 kz9Var, int i) {
        this.a = i;
        this.b = kz9Var;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        kz9 kz9Var = this.b;
        switch (i) {
            case 0:
                tw8 tw8Var = (tw8) kz9Var.d.invoke();
                if (tw8Var != null) {
                    tw8Var.i();
                }
                if (kz9Var.j) {
                    kz9Var.b.setVisibility(0);
                }
                return sbiVar;
            default:
                MediaKeyboardWidget mediaKeyboardWidgetH = kz9Var.h();
                View view = kz9Var.b;
                if (mediaKeyboardWidgetH != null && mediaKeyboardWidgetH.isAttached() && !kz9Var.i) {
                    view.setTranslationY(0.0f);
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        return null;
                    }
                    layoutParams.height = 0;
                    view.setLayoutParams(layoutParams);
                    View view2 = kz9Var.c;
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
                }
                if (kz9Var.j) {
                    view.setVisibility(8);
                }
                kz9Var.c();
                kz9Var.o = false;
                return sbiVar;
        }
    }
}
