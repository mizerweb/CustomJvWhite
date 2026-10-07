package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class aac extends xgh implements eph {
    public final bac r1;
    public final ny8 s1;

    public aac(Context context) {
        super(context);
        this.r1 = (bac) cac.a.getValue();
        this.s1 = rx8.P(3, new ap9(13, this));
        super.setSelectedTabIndicator(getIndicatorDrawable());
        super.setSelectedTabIndicatorColor(pq3.j.h(this).l().a);
        super.setTabIndicatorFullWidth(false);
        setBackgroundColor(0);
        setTabGravity(2);
        setTabRippleColor(null);
        setClipToPadding(false);
        post(new e6(27, this));
        e9i.C0(zfe.a(xgh.class), this, "requestedTabMinWidth", 0);
    }

    private final GradientDrawable getIndicatorDrawable() {
        return (GradientDrawable) this.s1.getValue();
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        super.setSelectedTabIndicatorColor(kbcVar.l().a);
        pq3.g(pq3.j.e(getContext()), this);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            layoutParams.height = gm0.K(40.0f * yl5.d().getDisplayMetrics().density);
        }
        super.setLayoutParams(layoutParams);
    }
}
