package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.richvector.VectorPath;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class npb extends Button implements eph {
    public static EnhancedVectorDrawable f;
    public final OvershootInterpolator a;
    public final ll6 b;
    public final ifh c;
    public boolean d;
    public Drawable e;

    public npb(Context context) {
        super(context, null, 0);
        this.a = new OvershootInterpolator();
        this.b = new ll6();
        this.c = new ifh(new n52(context, 22));
        setBackground(R.drawable.ic_checkbox_empty_28);
    }

    private final void setBackground(int i) {
        setBackground(getContext().getDrawable(i));
    }

    private final void setChecked(boolean z) {
        ScaleAnimation scaleAnimation;
        if (z == this.d) {
            return;
        }
        this.d = z;
        clearAnimation();
        if (z) {
            scaleAnimation = new ScaleAnimation(0.9f, 1.0f, 0.9f, 1.0f, 50.0f, 50.0f);
            scaleAnimation.setInterpolator(this.a);
        } else {
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.9f, 1.0f, 0.9f, 50.0f, 50.0f);
            scaleAnimation2.setRepeatCount(1);
            scaleAnimation2.setRepeatMode(2);
            scaleAnimation2.setInterpolator(this.b);
            scaleAnimation = scaleAnimation2;
        }
        scaleAnimation.setDuration(100L);
        startAnimation(scaleAnimation);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        ifh ifhVar = this.c;
        if (ifhVar.d()) {
            EnhancedVectorDrawable enhancedVectorDrawable = (EnhancedVectorDrawable) ifhVar.getValue();
            int i = kbcVar.getIcon().h;
            VectorPath vectorPathFindPath = enhancedVectorDrawable.findPath("colored");
            if (vectorPathFindPath != null) {
                vectorPathFindPath.setFillColor(i);
                vectorPathFindPath.setStrokeColor(i);
                enhancedVectorDrawable.invalidatePath();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setBackground(isEnabled() ? R.drawable.ic_checkbox_empty_28 : R.drawable.ic_checkbox_disabled_28);
    }

    public final void setNumber(int i) {
        float f2;
        if (i <= 0) {
            Drawable drawable = this.e;
            if (drawable == null) {
                setBackground(R.drawable.ic_checkbox_empty_28);
            } else {
                setBackground(drawable);
            }
            setText((CharSequence) null);
            setChecked(false);
            return;
        }
        setBackground((Drawable) this.c.getValue());
        onThemeChanged(pq3.j.h(this));
        String strValueOf = i > 99999 ? "99999+" : String.valueOf(i);
        if (i < 1000) {
            f2 = 12.0f;
        } else if (i > 99999) {
            f2 = 7.0f;
        } else {
            f2 = i > 9999 ? 8.0f : 10.0f;
        }
        setTextSize(f2);
        setText(strValueOf);
        setChecked(true);
    }

    public final void setUncheckedBackground(Drawable drawable) {
        this.e = drawable;
    }
}
