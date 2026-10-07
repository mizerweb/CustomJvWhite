package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: loaded from: classes2.dex */
public final class dx8 extends xgh implements eph {
    public final ny8 r1;
    public kbc s1;

    public dx8(Context context) {
        super(context);
        this.r1 = rx8.P(3, new q38(20));
        setSelectedTabIndicator(getIndicatorDrawable());
        setSelectedTabIndicatorColor(getCurrentTheme().h().b);
        setTabIndicatorFullWidth(false);
        bdc.a(this, new pi(24, this, this));
        setTabIndicatorAnimationMode(1);
        a8g a8gVar = pq3.j;
        setTabTextColors(xgh.f(a8gVar.h(this).getText().b, a8gVar.h(this).getText().d));
        setBackgroundColor(0);
        setTabRippleColor(null);
        setClipToPadding(false);
        int iK = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
        e9i.C0(zfe.a(xgh.class), this, "tabPaddingStart", Integer.valueOf(iK));
        e9i.C0(zfe.a(xgh.class), this, "tabPaddingEnd", Integer.valueOf(iK));
    }

    private final kbc getCurrentTheme() {
        kbc kbcVar = this.s1;
        return kbcVar == null ? pq3.j.h(this) : kbcVar;
    }

    public final GradientDrawable getIndicatorDrawable() {
        return (GradientDrawable) this.r1.getValue();
    }

    public final kbc getCustomTheme() {
        return this.s1;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        kbc kbcVar2 = this.s1;
        if (kbcVar2 != null) {
            kbcVar = kbcVar2;
        }
        setSelectedTabIndicatorColor(kbcVar.h().b);
        setTabTextColors(xgh.f(kbcVar.getText().b, kbcVar.getText().d));
        pq3.j.e(getContext()).getClass();
        pq3.f(this, kbcVar);
    }

    public final void setCustomTheme(kbc kbcVar) {
        this.s1 = kbcVar;
        if (kbcVar != null) {
            onThemeChanged(kbcVar);
        }
    }
}
