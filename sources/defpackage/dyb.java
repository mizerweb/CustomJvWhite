package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class dyb extends FrameLayout implements eph, pu4 {
    public final cyb a;
    public View b;
    public int c;

    public dyb(Context context) {
        super(context, null);
        cyb cybVar = new cyb(context);
        this.a = cybVar;
        addView(cybVar);
    }

    public final void a() {
        View view;
        removeView(this.b);
        this.c = 2;
        int iD = qt4.D(2);
        if (iD == 0) {
            v0c v0cVar = new v0c(getContext());
            v0cVar.setAppearance(p0c.a);
            view = v0cVar;
        } else if (iD != 1) {
            ore.o();
            return;
        } else {
            g1c g1cVar = new g1c(getContext());
            g1cVar.setAppearance(f1c.a);
            view = g1cVar;
        }
        this.b = view;
        addView(view);
        requestLayout();
    }

    @Override // defpackage.pu4
    public final void b(Number number, boolean z, boolean z2) {
        if (this.c != 1) {
            ore.k("use configureBadge with BadgeType.COUNTER before calling this");
            return;
        }
        KeyEvent.Callback callback = this.b;
        pu4 pu4Var = callback instanceof pu4 ? (pu4) callback : null;
        if (pu4Var != null) {
            pu4.c(pu4Var, number, z, 4);
        }
    }

    public final void d(ayb aybVar, zxb zxbVar) {
        cyb cybVar = this.a;
        cybVar.setSize(aybVar);
        cybVar.setAppearance(zxbVar);
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        cyb cybVar = this.a;
        int measuredWidth = cybVar.getMeasuredWidth();
        int measuredHeight = cybVar.getMeasuredHeight();
        View view = this.b;
        int measuredWidth2 = view != null ? view.getMeasuredWidth() : 0;
        View view2 = this.b;
        int measuredHeight2 = view2 != null ? view2.getMeasuredHeight() : 0;
        int i5 = measuredWidth2 / 2;
        int width = ((getWidth() - measuredWidth) - i5) / 2;
        int height = ((getHeight() - measuredHeight) + i5) / 2;
        int i6 = measuredWidth + width;
        cybVar.layout(width, height, i6, measuredHeight + height);
        View view3 = this.b;
        if (view3 != null) {
            int i7 = i6 - i5;
            int i8 = height - (measuredHeight2 / 2);
            view3.layout(i7, i8, measuredWidth2 + i7, measuredHeight2 + i8);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        cyb cybVar = this.a;
        cybVar.measure(i, i2);
        View view = this.b;
        if (view != null) {
            view.measure(i, i2);
        }
        int measuredWidth = cybVar.getMeasuredWidth();
        View view2 = this.b;
        int measuredWidth2 = ((view2 != null ? view2.getMeasuredWidth() : 0) / 2) + measuredWidth;
        int measuredHeight = cybVar.getMeasuredHeight();
        View view3 = this.b;
        setMeasuredDimension(measuredWidth2, ((view3 != null ? view3.getMeasuredHeight() : 0) / 2) + measuredHeight);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
    }

    public void setBadgeVisible(boolean z) {
        View view = this.b;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public final void setButtonIcon(int i) {
        this.a.setIcon(getContext().getDrawable(i));
    }
}
