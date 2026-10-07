package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class q44 extends LinearLayout implements h24 {
    public final GradientDrawable a;
    public final cs b;
    public final AppCompatTextView c;

    public q44(Context context) {
        super(context);
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = gm0.K(32.0f * yl5.d().getDisplayMetrics().density);
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f));
        this.a = gradientDrawable;
        Drawable drawableB = col.b(((fn8) pq3.j.h(this).u().c.b).c, gradientDrawable, shapeDrawable);
        cs csVar = new cs(context);
        csVar.setId(R.id.messages_list_compact_comments_icon);
        csVar.setImageResource(R.drawable.ic_comments_fill_20);
        this.b = csVar;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        q9i.a(q9i.x, appCompatTextView);
        this.c = appCompatTextView;
        setId(R.id.messages_list_compact_comments);
        setOrientation(1);
        setGravity(17);
        setMinimumWidth(gm0.K(32.0f * yl5.d().getDisplayMetrics().density));
        setBackground(drawableB);
        setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(6.0f * yl5.d().getDisplayMetrics().density), gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
        addView(csVar, new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
        addView(appCompatTextView, layoutParams);
    }

    private static /* synthetic */ void getRippleMaskDrawable$annotations() {
    }

    @Override // defpackage.h24
    public final void a(xac xacVar) {
        a8g a8gVar = pq3.j;
        a8gVar.h(this);
        this.b.setColorFilter(-1);
        this.c.setTextColor(-1);
        this.a.setColor(a8gVar.h(this).t().b);
    }

    @Override // defpackage.h24
    public final void p(int i) {
        AppCompatTextView appCompatTextView = this.c;
        if (i == 0) {
            appCompatTextView.setVisibility(8);
        } else {
            appCompatTextView.setVisibility(0);
            appCompatTextView.setText(i < 1000 ? l5h.e.format(Integer.valueOf(i)) : l5h.a(i));
        }
    }
}
