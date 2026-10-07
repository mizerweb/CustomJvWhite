package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class nl8 extends LinearLayout implements eph {
    public final cs a;
    public final TextView b;
    public final RippleDrawable c;

    public nl8(Context context) {
        super(context, null);
        cs csVar = new cs(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.setMarginEnd(gm0.K(yl5.d().getDisplayMetrics().density * 18.0f));
        csVar.setLayoutParams(layoutParams);
        addView(csVar);
        this.a = csVar;
        TextView textView = new TextView(context);
        q9i.a(q9i.f, textView);
        addView(textView);
        this.b = textView;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        a8g a8gVar = pq3.j;
        RippleDrawable rippleDrawableB = col.b(a8gVar.h(this).b().f, null, shapeDrawable);
        this.c = rippleDrawableB;
        setLayoutParams(new LinearLayout.LayoutParams(-1, gm0.K(56.0f * yl5.d().getDisplayMetrics().density)));
        setGravity(16);
        setPadding(gm0.K(18.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        setBackground(rippleDrawableB);
        setClipChildren(false);
        setClipToOutline(false);
        onThemeChanged(a8gVar.h(this));
    }

    public final Drawable getIcon() {
        return this.a.getDrawable();
    }

    public final CharSequence getText() {
        return this.b.getText();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        onThemeChanged(pq3.j.h(this));
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.a.setImageTintList(ColorStateList.valueOf(kbcVar.getText().h));
        this.b.setTextColor(kbcVar.getText().h);
        this.c.setColor(ColorStateList.valueOf(((bs0) kbcVar.u().c.g).c));
    }

    public final void setIcon(Drawable drawable) {
        this.a.setImageDrawable(drawable);
    }

    public final void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
