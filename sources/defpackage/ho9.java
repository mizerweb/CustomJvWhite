package defpackage;

import android.R;
import android.content.res.ColorStateList;

/* JADX INFO: loaded from: classes2.dex */
public final class ho9 extends fs {
    public static final int[][] g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList e;
    public boolean f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.e == null) {
            int iD = qyj.D(this, ru.oneme.app.R.attr.colorControlActivated);
            int iD2 = qyj.D(this, ru.oneme.app.R.attr.colorOnSurface);
            int iD3 = qyj.D(this, ru.oneme.app.R.attr.colorSurface);
            this.e = new ColorStateList(g, new int[]{qyj.K(iD3, 1.0f, iD), qyj.K(iD3, 0.54f, iD2), qyj.K(iD3, 0.38f, iD2), qyj.K(iD3, 0.38f, iD2)});
        }
        return this.e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
