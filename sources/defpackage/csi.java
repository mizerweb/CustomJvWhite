package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class csi extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public csi(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        dsi dsiVar = new dsi();
        dsiVar.a = (VectorDrawable) this.a.newDrawable();
        return dsiVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        dsi dsiVar = new dsi();
        dsiVar.a = (VectorDrawable) this.a.newDrawable(resources);
        return dsiVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        dsi dsiVar = new dsi();
        dsiVar.a = (VectorDrawable) this.a.newDrawable(resources, theme);
        return dsiVar;
    }
}
