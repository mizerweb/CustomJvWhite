package defpackage;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class fm3 extends FrameLayout implements eph {
    public final r6c a;

    public fm3(Context context) {
        super(context);
        r6c r6cVar = new r6c(context);
        r6cVar.setAppearance(g6c.a);
        r6cVar.setIndicatorSize(gm0.K(yl5.d().getDisplayMetrics().density * 28.0f));
        r6cVar.setIndicatorDirection(0);
        r6cVar.setTrackThickness(gm0.K(3.0f * yl5.d().getDisplayMetrics().density));
        r6cVar.setIndicatorTrackGapSize(gm0.K(2.0f * yl5.d().getDisplayMetrics().density));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(yl5.d().getDisplayMetrics().density * 28.0f));
        layoutParams.gravity = 17;
        r6cVar.setLayoutParams(layoutParams);
        this.a = r6cVar;
        addView(r6cVar);
        setPadding(0, gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), 0, gm0.K(10.0f * yl5.d().getDisplayMetrics().density));
        setLayoutParams(new FrameLayout.LayoutParams(-1, zo5.b(28.0f, yl5.d().getDisplayMetrics().density, getPaddingBottom() + getPaddingTop())));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        onThemeChanged(pq3.j.h(this));
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.a.onThemeChanged(kbcVar);
    }
}
