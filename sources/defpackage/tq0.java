package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tq0 extends LinearLayout implements eph {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq0(Context context, int i, int i2, int i3) {
        super(context, null, 0);
        i = (i3 & 8) != 0 ? gm0.K(yl5.d().getDisplayMetrics().density * 14.0f) : i;
        i2 = (i3 & 16) != 0 ? gm0.K(14.0f * yl5.d().getDisplayMetrics().density) : i2;
        setOrientation(1);
        setPadding(i, i2, i, i2);
        a8g a8gVar = pq3.j;
        qg8 qg8Var = new qg8(yl5.d().getDisplayMetrics().density * 2.0f, yl5.d().getDisplayMetrics().density * 24.0f, a8gVar.h(this).l().h);
        qg8Var.h.B(qg8Var, qg8.j[0], new GradientDrawable(GradientDrawable.Orientation.TL_BR, (int[]) ((t84) a8gVar.h(this).f().c).d));
        setBackground(qg8Var);
    }

    public void onThemeChanged(kbc kbcVar) {
        Drawable background = getBackground();
        qg8 qg8Var = background instanceof qg8 ? (qg8) background : null;
        if (qg8Var != null) {
            a8g a8gVar = pq3.j;
            int i = a8gVar.h(this).l().h;
            pg8 pg8Var = qg8Var.i;
            zv8[] zv8VarArr = qg8.j;
            pg8Var.B(qg8Var, zv8VarArr[1], Integer.valueOf(i));
            qg8Var.h.B(qg8Var, zv8VarArr[0], new GradientDrawable(GradientDrawable.Orientation.TL_BR, (int[]) ((t84) a8gVar.h(this).f().c).d));
        }
    }
}
