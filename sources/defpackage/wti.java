package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class wti extends View {
    public static final /* synthetic */ zv8[] o = {new z8b(wti.class, "textColor", "getTextColor()I"), zo5.e(zfe.a, wti.class, "isBackgroundEnabled", "isBackgroundEnabled()Z"), new z8b(wti.class, "isCapsuleInside", "isCapsuleInside()Z"), new z8b(wti.class, "isDrawableEnabled", "isDrawableEnabled()Z"), new z8b(wti.class, "text", "getText()Ljava/lang/CharSequence;")};
    public static final TextPaint p = new TextPaint();
    public final ky8 a;
    public final float b;
    public final int c;
    public final int d;
    public final int e;
    public final ny8 f;
    public final vti g;
    public final vti h;
    public final vti i;
    public final vti j;
    public Drawable k;
    public Layout l;
    public final ny8 m;
    public final vti n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wti(Context context) {
        super(context);
        r7 r7Var = r7.a;
        ky8 ky8Var = (ky8) new h(r7.d(ha9.b)).getAccessor().c(178);
        this.a = ky8Var;
        this.b = yl5.d().getDisplayMetrics().density * 4.0f;
        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        this.c = iK;
        this.d = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
        this.e = gm0.K(3.0f * yl5.d().getDisplayMetrics().density);
        this.f = rx8.P(3, new yfi(21));
        pq3.j.h(this);
        this.g = new vti(this, 1);
        this.h = new vti(this, 2);
        this.i = new vti(this, 3);
        vti vtiVar = new vti(this, 4);
        this.j = vtiVar;
        this.m = rx8.P(3, new yfi(22));
        this.n = new vti(this, 0);
        setId(R.id.messages_list_item_video_duration);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setTranslationZ(Float.MAX_VALUE);
        TextPaint textPaint = p;
        textPaint.setAntiAlias(true);
        noh nohVar = q9i.x;
        bx5 bx5Var = bx5.b;
        textPaint.setTextSize(vl5.c(nohVar.k(bx5Var), context));
        textPaint.setLetterSpacing(vl5.c(nohVar.i(bx5Var), context));
        textPaint.setTypeface(Typeface.create(Typeface.create(nohVar.e, 0), zo5.a(nohVar.f)));
        setWillNotDraw(false);
        zv8 zv8Var = o[3];
        if (((Boolean) vtiVar.b).booleanValue()) {
            Drawable drawableMutate = getContext().getDrawable(R.drawable.icon_video_call_fill).mutate();
            drawableMutate.setBounds(0, 0, iK, iK);
            drawableMutate.setTint(getDrawableColor());
            this.k = drawableMutate;
        }
    }

    private final int getBackgroundColor() {
        zv8 zv8Var = o[2];
        boolean zBooleanValue = ((Boolean) this.i.b).booleanValue();
        a8g a8gVar = pq3.j;
        return zBooleanValue ? a8gVar.h(this).t().a : a8gVar.h(this).t().b;
    }

    private final float getBackgroundCornerRadius() {
        return getHeight() / 2.0f;
    }

    public final int getDrawableColor() {
        pq3.j.h(this);
        return -1;
    }

    public final BoringLayout.Metrics getMetrics() {
        return (BoringLayout.Metrics) this.m.getValue();
    }

    private final CharSequence getText() {
        zv8 zv8Var = o[4];
        return (CharSequence) this.n.b;
    }

    private final void setText(CharSequence charSequence) {
        this.n.B(this, o[4], charSequence);
    }

    public final int getTextColor() {
        zv8 zv8Var = o[0];
        return ((Number) this.g.b).intValue();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Layout layout = this.l;
        if (layout == null) {
            return;
        }
        layout.getPaint().setColor(getTextColor());
        float height = (getHeight() - layout.getHeight()) * 0.5f;
        zv8 zv8Var = o[1];
        float fWidth = 0.0f;
        if (((Boolean) this.h.b).booleanValue()) {
            fWidth = 0.0f + this.d;
            ny8 ny8Var = this.f;
            ((Paint) ny8Var.getValue()).setColor(getBackgroundColor());
            canvas2 = canvas;
            canvas2.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), getBackgroundCornerRadius(), getBackgroundCornerRadius(), (Paint) ny8Var.getValue());
        } else {
            canvas2 = canvas;
        }
        boolean zG0 = yab.g0(this);
        float f = this.b;
        if (!zG0) {
            Drawable drawable = this.k;
            if (drawable != null) {
                float height2 = (getHeight() - drawable.getBounds().height()) * 0.5f;
                int iSave = canvas2.save();
                canvas2.translate(fWidth, height2);
                try {
                    drawable.draw(canvas2);
                    canvas2.restoreToCount(iSave);
                    fWidth += drawable.getBounds().width() + f;
                } catch (Throwable th) {
                    canvas2.restoreToCount(iSave);
                    throw th;
                }
            }
            int iSave2 = canvas2.save();
            canvas2.translate(fWidth, height);
            try {
                layout.draw(canvas2);
                return;
            } finally {
                canvas2.restoreToCount(iSave2);
            }
        }
        int iSave3 = canvas2.save();
        canvas2.translate(fWidth, height);
        try {
            layout.draw(canvas2);
            canvas2.restoreToCount(iSave3);
            Drawable drawable2 = this.k;
            if (drawable2 == null) {
                return;
            }
            float width = fWidth + layout.getWidth() + f;
            float height3 = (getHeight() - drawable2.getBounds().height()) * 0.5f;
            int iSave4 = canvas2.save();
            canvas2.translate(width, height3);
            try {
                drawable2.draw(canvas2);
            } finally {
                canvas2.restoreToCount(iSave4);
            }
        } catch (Throwable th2) {
            canvas2.restoreToCount(iSave3);
            throw th2;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iWidth;
        int iMax;
        Layout layout = this.l;
        if (layout != null) {
            iWidth = layout.getWidth();
            iMax = layout.getHeight();
        } else {
            iWidth = 0;
            iMax = 0;
        }
        Drawable drawable = this.k;
        if (drawable != null) {
            iWidth += drawable.getBounds().width() + gm0.K(this.b);
            iMax = Math.max(iMax, drawable.getBounds().height());
        }
        zv8 zv8Var = o[1];
        if (((Boolean) this.h.b).booleanValue()) {
            iWidth += this.d * 2;
            iMax += this.e * 2;
        }
        setMeasuredDimension(iWidth, iMax);
    }

    public final void setBackgroundEnabled(boolean z) {
        this.h.B(this, o[1], Boolean.valueOf(z));
    }

    public final void setCapsuleInside(boolean z) {
        this.i.B(this, o[2], Boolean.valueOf(z));
    }

    public final void setContent(CharSequence charSequence) {
        setText(charSequence);
    }

    public final void setDrawableEnabled(boolean z) {
        this.j.B(this, o[3], Boolean.valueOf(z));
    }

    public final void setTextColor(int i) {
        this.g.B(this, o[0], Integer.valueOf(i));
    }
}
