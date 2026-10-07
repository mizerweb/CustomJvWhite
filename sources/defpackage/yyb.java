package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class yyb extends LinearLayout implements eph, oqe {
    public static final /* synthetic */ zv8[] g = {new z8b(yyb.class, "iconSize", "getIconSize()I"), zo5.e(zfe.a, yyb.class, "appearance", "getAppearance()Lone/me/sdk/uikit/common/views/OneMeCellAction$Appearance;")};
    public final ShapeDrawable a;
    public final xyb b;
    public kbc c;
    public final xyb d;
    public final cs e;
    public final AppCompatTextView f;

    public yyb(Context context) {
        super(context, null);
        this.a = new ShapeDrawable();
        this.b = new xyb(bc1.k(28.0f, yl5.d().getDisplayMetrics().density), this);
        this.d = new xyb(this);
        cs csVar = new cs(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(28.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.setMarginEnd(gm0.K(yl5.d().getDisplayMetrics().density * 18.0f));
        csVar.setLayoutParams(layoutParams);
        addView(csVar);
        this.e = csVar;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        q9i.a(q9i.f, appCompatTextView);
        addView(appCompatTextView);
        this.f = appCompatTextView;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setGravity(16);
        setMinimumHeight(gm0.K(56.0f * yl5.d().getDisplayMetrics().density));
        setPadding(gm0.K(18.0f * yl5.d().getDisplayMetrics().density), getPaddingTop(), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), getPaddingBottom());
        onThemeChanged(pq3.j.h(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kbc getCurrentTheme() {
        kbc kbcVar = this.c;
        return kbcVar == null ? pq3.j.h(this) : kbcVar;
    }

    public final wyb getAppearance() {
        zv8 zv8Var = g[1];
        return (wyb) this.d.b;
    }

    public final kbc getCustomTheme() {
        return this.c;
    }

    public final Drawable getIcon() {
        return this.e.getDrawable();
    }

    public final int getIconSize() {
        zv8 zv8Var = g[0];
        return ((Number) this.b.b).intValue();
    }

    public final CharSequence getText() {
        return this.f.getText();
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        kbc kbcVar2 = this.c;
        if (kbcVar2 != null) {
            kbcVar = kbcVar2;
        }
        int iOrdinal = getAppearance().ordinal();
        AppCompatTextView appCompatTextView = this.f;
        cs csVar = this.e;
        if (iOrdinal == 0) {
            csVar.setImageTintList(ColorStateList.valueOf(kbcVar.getText().h));
            appCompatTextView.setTextColor(kbcVar.getText().h);
        } else if (iOrdinal == 1) {
            csVar.setImageTintList(ColorStateList.valueOf(kbcVar.getText().b));
            appCompatTextView.setTextColor(kbcVar.getText().b);
        } else if (iOrdinal != 2) {
            ore.o();
            return;
        } else {
            csVar.setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().c));
            appCompatTextView.setTextColor(kbcVar.getText().c);
        }
        setBackground(new RippleDrawable(ColorStateList.valueOf(((bs0) kbcVar.u().c.g).c), null, this.a));
    }

    public final void setAppearance(wyb wybVar) {
        this.d.B(this, g[1], wybVar);
    }

    public final void setCustomTheme(kbc kbcVar) {
        this.c = kbcVar;
    }

    public final void setIcon(Drawable drawable) {
        this.e.setImageDrawable(drawable);
    }

    public final void setIconSize(int i) {
        this.b.B(this, g[0], Integer.valueOf(i));
    }

    @Override // defpackage.oqe
    public void setRippleMask(Shape shape) {
        this.a.setShape(shape);
    }

    public final void setText(CharSequence charSequence) {
        this.f.setText(charSequence);
    }
}
