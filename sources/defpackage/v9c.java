package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;

/* JADX INFO: loaded from: classes4.dex */
public final class v9c extends weh implements eph {
    public static final /* synthetic */ zv8[] w1;
    public final zb v1;

    static {
        z8b z8bVar = new z8b(v9c.class, "customTheme", "getCustomTheme()Lone/me/sdk/design/theme/OneMeTheme;");
        zfe.a.getClass();
        w1 = new zv8[]{z8bVar};
    }

    public v9c(Context context) {
        super(context);
        this.v1 = new zb(this, 27);
        kbc currentTheme = getCurrentTheme();
        setThumbDrawable(new tbc(new xeh(currentTheme.getIcon().d, currentTheme.getIcon().e)));
        onThemeChanged(getCurrentTheme());
        setSwitchMinWidth(gm0.K(52.0f * yl5.d().getDisplayMetrics().density));
        setEnforceSwitchWidth(false);
        setSplitTrack(false);
        setShowText(false);
        setBackground(null);
    }

    private final kbc getCurrentTheme() {
        kbc customTheme = getCustomTheme();
        return customTheme == null ? pq3.j.h(this) : customTheme;
    }

    public final kbc getCustomTheme() {
        zv8 zv8Var = w1[0];
        return (kbc) this.v1.b;
    }

    @Override // defpackage.weh, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable thumbDrawable = getThumbDrawable();
        tbc tbcVar = thumbDrawable instanceof tbc ? (tbc) thumbDrawable : null;
        if (tbcVar != null) {
            tbcVar.a.B(tbcVar, tbc.d[0], Float.valueOf(getThumbPosition()));
        }
        super.onDraw(canvas);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        Drawable thumbDrawable = getThumbDrawable();
        tbc tbcVar = thumbDrawable instanceof tbc ? (tbc) thumbDrawable : null;
        if (tbcVar != null) {
            kbc currentTheme = getCurrentTheme();
            tbcVar.b.B(tbcVar, tbc.d[1], new xeh(currentTheme.getIcon().d, currentTheme.getIcon().e));
        }
        kbc currentTheme2 = getCurrentTheme();
        float f = yl5.d().getDisplayMetrics().density * 20.0f;
        int iK = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
        int iK2 = gm0.K(52.0f * yl5.d().getDisplayMetrics().density);
        int iK3 = gm0.K(32.0f * yl5.d().getDisplayMetrics().density);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(0);
        ColorStateList colorStateListValueOf2 = ColorStateList.valueOf(currentTheme2.h().a);
        ColorStateList colorStateListValueOf3 = ColorStateList.valueOf(((fn8) currentTheme2.u().c.a).d);
        ColorStateList colorStateListValueOf4 = ColorStateList.valueOf(((fn8) currentTheme2.u().c.b).d);
        ColorStateList colorStateListValueOf5 = ColorStateList.valueOf(currentTheme2.B().b);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setColor(colorStateListValueOf2);
        gradientDrawable.setSize(iK2, iK3);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(f);
        gradientDrawable2.setColor(colorStateListValueOf);
        gradientDrawable2.setStroke(iK, colorStateListValueOf5);
        gradientDrawable2.setSize(iK2, iK3);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(0);
        gradientDrawable3.setCornerRadius(f);
        gradientDrawable3.setColor(colorStateListValueOf3);
        gradientDrawable3.setSize(iK2, iK3);
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setShape(0);
        gradientDrawable4.setCornerRadius(f);
        gradientDrawable4.setColor(colorStateListValueOf4);
        gradientDrawable4.setSize(iK2, iK3);
        GradientDrawable gradientDrawable5 = new GradientDrawable();
        gradientDrawable5.setShape(0);
        gradientDrawable5.setCornerRadius(f);
        gradientDrawable5.setColor(colorStateListValueOf);
        gradientDrawable5.setStroke(iK, colorStateListValueOf5);
        gradientDrawable5.setSize(iK2, iK3);
        LayerDrawable layerDrawable = new LayerDrawable(new GradientDrawable[]{gradientDrawable4, gradientDrawable5});
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled, R.attr.state_checked}, gradientDrawable);
        stateListDrawable.addState(new int[]{R.attr.state_enabled, -16842912}, gradientDrawable2);
        stateListDrawable.addState(new int[]{-16842910, -16842912}, layerDrawable);
        stateListDrawable.addState(new int[]{-16842910, R.attr.state_checked}, gradientDrawable3);
        setTrackDrawable(stateListDrawable);
        drawableStateChanged();
    }

    public final void setCustomTheme(kbc kbcVar) {
        this.v1.B(this, w1[0], kbcVar);
    }
}
