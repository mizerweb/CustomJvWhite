package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class kyb extends LinearLayout implements eph {
    public static final /* synthetic */ zv8[] g = {new z8b(kyb.class, "iconTintResolver", "getIconTintResolver()Lkotlin/jvm/functions/Function1;"), zo5.e(zfe.a, kyb.class, "customTheme", "getCustomTheme()Lone/me/sdk/design/theme/OneMeTheme;"), new z8b(kyb.class, "mode", "getMode()Lone/me/sdk/uikit/common/buttontool/OneMeButtonTool$Mode;"), new z8b(kyb.class, "appearance", "getAppearance()Lone/me/sdk/uikit/common/buttontool/OneMeButtonTool$Appearance;")};
    public final ny8 a;
    public final ny8 b;
    public final jyb c;
    public final jyb d;
    public final jyb e;
    public final jyb f;

    public kyb(Context context) {
        super(context, null);
        this.a = rx8.P(3, new n52(context, 25));
        this.b = rx8.P(3, new n52(context, 26));
        this.c = new jyb(new s9a(28), this);
        this.d = new jyb(this, 1);
        this.e = new jyb(this, 2);
        this.f = new jyb(this, 3);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setGravity(17);
        onThemeChanged(pq3.j.h(this));
        setClipToOutline(true);
        setOutlineProvider(new nt4(gm0.K(16.0f * yl5.d().getDisplayMetrics().density)));
        setClickable(true);
        setOrientation(1);
        addView(getIconView());
    }

    public final kbc getCurrentTheme() {
        kbc customTheme = getCustomTheme();
        return customTheme == null ? pq3.j.h(this) : customTheme;
    }

    private final ImageView getIconView() {
        return (ImageView) this.a.getValue();
    }

    public final AppCompatTextView getTextView() {
        return (AppCompatTextView) this.b.getValue();
    }

    public final void c() {
        invalidate();
        requestLayout();
    }

    public final gyb getAppearance() {
        zv8 zv8Var = g[3];
        return (gyb) this.f.b;
    }

    public final kbc getCustomTheme() {
        zv8 zv8Var = g[1];
        return (kbc) this.d.b;
    }

    public final cf7 getIconTintResolver() {
        zv8 zv8Var = g[0];
        return (cf7) this.c.b;
    }

    public final hyb getMode() {
        zv8 zv8Var = g[2];
        return (hyb) this.e.b;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iMax = Math.max(getMeasuredHeight(), gm0.K(60.0f * yl5.d().getDisplayMetrics().density));
        if (getMeasuredWidth() < iMax) {
            setMeasuredDimension(iMax, iMax);
        } else {
            setMeasuredDimension(getMeasuredWidth(), iMax);
        }
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        int iOrdinal = getAppearance().ordinal();
        a8g a8gVar = pq3.j;
        if (iOrdinal == 0) {
            setBackground(col.d(a8gVar.h(this), getCurrentTheme().b().f, ((bs0) getCurrentTheme().u().c.g).c, 4));
            getTextView().setTextColor(getCurrentTheme().getText().h);
        } else if (iOrdinal != 1) {
            ore.o();
            return;
        } else {
            setBackground(col.d(a8gVar.h(this), ((fn8) getCurrentTheme().u().c.b).c, 0, 6));
            getTextView().setTextColor(getCurrentTheme().getText().b);
            getIconView().setImageTintList(ColorStateList.valueOf(getCurrentTheme().getIcon().h));
        }
        int iIntValue = ((Number) getIconTintResolver().invoke(getCurrentTheme())).intValue();
        getIconView().setImageTintList(ColorStateList.valueOf(iIntValue));
        Drawable background = getIconView().getBackground();
        if (background != null) {
            background.setTint(iIntValue);
        }
    }

    public final void setAppearance(gyb gybVar) {
        this.f.B(this, g[3], gybVar);
    }

    public final void setCustomTheme(kbc kbcVar) {
        this.d.B(this, g[1], kbcVar);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(z ? 1.0f : 0.48f);
    }

    public final void setIcon(Drawable drawable) {
        if (getIconView().getDrawable() == drawable) {
            return;
        }
        if (drawable != null) {
            drawable.setTint(((Number) getIconTintResolver().invoke(pq3.j.h(this))).intValue());
        }
        getIconView().setImageDrawable(drawable);
        c();
    }

    public final void setIconTintResolver(cf7 cf7Var) {
        this.c.B(this, g[0], cf7Var);
    }

    public final void setMode(hyb hybVar) {
        this.e.B(this, g[2], hybVar);
    }

    public final void setText(CharSequence charSequence) {
        if (getMode() != hyb.b || cqk.d(getTextView().getText(), charSequence)) {
            return;
        }
        getTextView().setText(charSequence);
        if (getTextView().getParent() == null) {
            addView(getTextView());
        }
        c();
    }

    public final void setIcon(int i) {
        setIcon(getContext().getDrawable(i).mutate());
    }

    public final void setText(int i) {
        setText(getContext().getString(i));
    }
}
