package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* JADX INFO: loaded from: classes2.dex */
public final class rj extends Drawable.ConstantState {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public rj(EnhancedVectorDrawable enhancedVectorDrawable) {
        this.b = enhancedVectorDrawable;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.a) {
            case 0:
                return ((Drawable.ConstantState) this.b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.a) {
            case 0:
                return ((Drawable.ConstantState) this.b).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                sj sjVar = new sj(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) obj).newDrawable(resources);
                sjVar.a = drawableNewDrawable;
                drawableNewDrawable.setCallback(sjVar.f);
                return sjVar;
            default:
                return resources != null ? new EnhancedVectorDrawable(resources, ((EnhancedVectorDrawable) obj).resId) : newDrawable();
        }
    }

    public rj(Drawable.ConstantState constantState) {
        this.b = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                sj sjVar = new sj(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) obj).newDrawable();
                sjVar.a = drawableNewDrawable;
                drawableNewDrawable.setCallback(sjVar.f);
                return sjVar;
            default:
                EnhancedVectorDrawable enhancedVectorDrawable = (EnhancedVectorDrawable) obj;
                return new EnhancedVectorDrawable(enhancedVectorDrawable.resources, enhancedVectorDrawable.resId);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.a) {
            case 0:
                sj sjVar = new sj(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources, theme);
                sjVar.a = drawableNewDrawable;
                drawableNewDrawable.setCallback(sjVar.f);
                return sjVar;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
