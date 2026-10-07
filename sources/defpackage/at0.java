package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public abstract class at0 extends Drawable {
    private Drawable backgroundDrawable;
    private Drawable iconDrawable;
    private final Integer intrinsicSizePx;
    private final float iconScale = 1.0f;
    private final zs0 backgroundSpec = ys0.a;

    public final void a(Rect rect) {
        Drawable drawable = this.backgroundDrawable;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        int iComputeIconSize = computeIconSize(rect);
        int iWidth = ((rect.width() - iComputeIconSize) / 2) + rect.left;
        int iHeight = ((rect.height() - iComputeIconSize) / 2) + rect.top;
        Rect rect2 = new Rect(iWidth, iHeight, iWidth + iComputeIconSize, iComputeIconSize + iHeight);
        Drawable drawable2 = this.iconDrawable;
        if (drawable2 != null) {
            drawable2.setBounds(rect2);
        }
    }

    public int computeIconSize(Rect rect) {
        return gm0.K(getIconScale() * Math.min(rect.width(), rect.height()));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        drawBackground(canvas);
        drawIcon(canvas);
    }

    public void drawBackground(Canvas canvas) {
        Drawable drawable = this.backgroundDrawable;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public void drawIcon(Canvas canvas) {
        Drawable drawable = this.iconDrawable;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public final Drawable getBackgroundDrawable() {
        return this.backgroundDrawable;
    }

    public abstract zs0 getBackgroundSpec();

    public final Drawable getIconDrawable() {
        return this.iconDrawable;
    }

    public abstract int getIconResId();

    public float getIconScale() {
        return this.iconScale;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Integer intrinsicSizePx = getIntrinsicSizePx();
        return intrinsicSizePx != null ? intrinsicSizePx.intValue() : super.getIntrinsicHeight();
    }

    public Integer getIntrinsicSizePx() {
        return this.intrinsicSizePx;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Integer intrinsicSizePx = getIntrinsicSizePx();
        return intrinsicSizePx != null ? intrinsicSizePx.intValue() : super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        ShapeDrawable shapeDrawable;
        int iconResId = getIconResId();
        ThreadLocal threadLocal = mne.a;
        Drawable drawable = resources.getDrawable(iconResId, theme);
        this.iconDrawable = drawable != null ? drawable.mutate() : null;
        zs0 backgroundSpec = getBackgroundSpec();
        if (backgroundSpec.equals(ys0.a)) {
            shapeDrawable = null;
        } else if (!(backgroundSpec instanceof xs0)) {
            ore.o();
            return;
        } else {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.getPaint().setColor(((xs0) backgroundSpec).a);
        }
        this.backgroundDrawable = shapeDrawable != null ? shapeDrawable.mutate() : null;
        onDrawablesInflated(resources, xmlPullParser, attributeSet, theme);
        a(getBounds());
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        at0 at0VarOnMutate = onMutate();
        Drawable drawable = this.iconDrawable;
        at0VarOnMutate.iconDrawable = drawable != null ? drawable.mutate() : null;
        Drawable drawable2 = this.backgroundDrawable;
        at0VarOnMutate.backgroundDrawable = drawable2 != null ? drawable2.mutate() : null;
        at0VarOnMutate.setBounds(getBounds());
        return at0VarOnMutate;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        a(rect);
    }

    public void onDrawablesInflated(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
    }

    public abstract at0 onMutate();

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    public final void setBackgroundColor(int i) {
        Drawable drawable = this.backgroundDrawable;
        if (drawable instanceof ShapeDrawable) {
            ((ShapeDrawable) drawable).getPaint().setColor(i);
        } else if (drawable != null) {
            drawable.setTint(i);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setIconTint(int i) {
        Drawable drawable = this.iconDrawable;
        if (drawable != null) {
            drawable.setTint(i);
        }
        invalidateSelf();
    }
}
