package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class ao4 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ View f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ao4(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        int i2 = 3;
        View view = (View) obj;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                ao4 ao4Var = new ao4(i2, lq4Var, 0);
                ao4Var.f = view;
                ao4Var.invokeSuspend(sbiVar);
                break;
            default:
                ao4 ao4Var2 = new ao4(i2, lq4Var, 1);
                ao4Var2.f = view;
                ao4Var2.invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        a8g a8gVar = pq3.j;
        View view = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                view.setBackgroundColor(a8gVar.h(view).b().c);
                break;
            default:
                ch3.d0(obj);
                Drawable background = view.getBackground();
                GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
                if (gradientDrawable != null) {
                    gradientDrawable.setColor(a8gVar.h(view).getText().j);
                }
                break;
        }
        return sbiVar;
    }
}
