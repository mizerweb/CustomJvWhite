package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes2.dex */
public final class nu4 extends AppCompatTextView implements eph {
    public long h;
    public final ValueAnimator i;
    public final kr3 j;

    public nu4(Context context) {
        super(context, null);
        this.i = ValueAnimator.ofFloat(360.0f, 0.0f);
        kr3 kr3Var = new kr3();
        a8g a8gVar = pq3.j;
        kr3Var.a.setColor(a8gVar.h(this).l().d);
        this.j = kr3Var;
        setBackground(kr3Var);
        q9i.a(q9i.i, this);
        setTextAlignment(4);
        a8gVar.h(this);
        setTextColor(-1);
        setGravity(17);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        long j = this.h;
        ValueAnimator valueAnimator = this.i;
        valueAnimator.setDuration(j);
        valueAnimator.addUpdateListener(new ak(9, this));
        valueAnimator.start();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.i.cancel();
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.j.a.setColor(kbcVar.l().d);
        setTextColor(-1);
    }

    public final void setMaxValue(long j) {
        this.h = j;
    }
}
