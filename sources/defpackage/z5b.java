package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z5b implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c6b b;

    public /* synthetic */ z5b(c6b c6bVar, int i) {
        this.a = i;
        this.b = c6bVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        c6b c6bVar = this.b;
        switch (i) {
            case 0:
                c6bVar.c.a();
                return sbi.a;
            default:
                Context context = c6bVar.a.getContext();
                EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context, R.drawable.ic_check_filled_24);
                a8g a8gVar = pq3.j;
                lvb.A0(enhancedVectorDrawable, "circle_background", c0a.h(a8gVar, context).h);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                gradientDrawable.setSize(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
                gradientDrawable.setColor(a8gVar.e(context).m().b().g);
                gradientDrawable.setStroke(gm0.K(2.0f * yl5.d().getDisplayMetrics().density), a8gVar.e(context).m().l().d);
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{android.R.attr.state_checked}, enhancedVectorDrawable);
                stateListDrawable.addState(new int[]{-16842912}, gradientDrawable);
                return stateListDrawable;
        }
    }
}
