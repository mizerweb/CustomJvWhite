package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.ArrayMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.richvector.VectorPath;
import org.xmlpull.v1.XmlPullParserException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class x96 extends Drawable implements hsi {
    public final EnhancedVectorDrawable a;
    public final w96 b;

    public x96(Context context) throws XmlPullParserException, IOException {
        pj pjVar = new pj(3, this);
        tj tjVarB = new uj(context).b(R.drawable.lock);
        EnhancedVectorDrawable enhancedVectorDrawable = tjVarB.a;
        enhancedVectorDrawable.setCallback(pjVar);
        this.a = enhancedVectorDrawable;
        ArrayList arrayList = tjVarB.b;
        ArrayMap arrayMap = tjVarB.c;
        AnimatorSet animatorSet = new AnimatorSet();
        tre.v0(enhancedVectorDrawable, animatorSet, arrayList, arrayMap);
        this.b = new w96(this, animatorSet);
    }

    public final void a(float f) {
        float fU = oc9.u(f, 0.0f, 1.0f);
        w96 w96Var = this.b;
        float f2 = w96Var.e;
        w96Var.e = fU;
        long jLongValue = (long) (((Number) w96Var.c.getValue()).longValue() * fU);
        boolean z = fU < f2;
        ifh ifhVar = w96Var.d;
        for (ValueAnimator valueAnimator : z ? ww3.J1((List) ifhVar.getValue()) : (List) ifhVar.getValue()) {
            if (valueAnimator.getDuration() > 0) {
                long startDelay = valueAnimator.getStartDelay();
                long duration = valueAnimator.getDuration() + startDelay;
                if (jLongValue < startDelay) {
                    if (valueAnimator.getCurrentPlayTime() > 0) {
                        valueAnimator.setCurrentPlayTime(0L);
                    }
                } else if (jLongValue < duration) {
                    valueAnimator.setCurrentPlayTime(jLongValue - startDelay);
                } else if (valueAnimator.getCurrentPlayTime() < valueAnimator.getDuration()) {
                    valueAnimator.setCurrentPlayTime(valueAnimator.getDuration());
                }
            }
        }
        w96Var.a.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.b.a.invalidateSelf();
        this.a.draw(canvas);
    }

    @Override // defpackage.hsi
    public final VectorPath findPath(String str) {
        return this.a.findPath(str);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        return this.a.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.a.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.a.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.hsi
    public final void invalidatePath() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        return this.a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        return this.a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.a.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        this.a.setVisible(z, z2);
        return super.setVisible(z, z2);
    }
}
