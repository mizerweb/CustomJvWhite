package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.BoringLayout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class u35 extends View implements eph {
    public static final /* synthetic */ zv8[] x = {new z8b(u35.class, "isBackgroundEnabled", "isBackgroundEnabled$message_list()Z"), zo5.e(zfe.a, u35.class, "dateText", "getDateText()Ljava/lang/CharSequence;"), new z8b(u35.class, "countViewText", "getCountViewText()Ljava/lang/CharSequence;"), new z8b(u35.class, "isChannelMode", "isChannelMode$message_list()Z")};
    public static final TextPaint y = new TextPaint();
    public final float a;
    public final int b;
    public final int c;
    public final int d;
    public int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final ny8 j;
    public final ny8 k;
    public int l;
    public int m;
    public final t35 n;
    public f9j o;
    public Drawable p;
    public BoringLayout q;
    public BoringLayout r;
    public final ny8 s;
    public final t35 t;
    public final t35 u;
    public final t35 v;
    public final e8b w;

    public u35(Context context) {
        super(context);
        this.a = yl5.d().getDisplayMetrics().density * 4.0f;
        this.b = gm0.K(yl5.d().getDisplayMetrics().density * 2.0f);
        this.c = gm0.K(yl5.d().getDisplayMetrics().density * 16.0f);
        this.d = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        this.f = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
        this.g = gm0.K(yl5.d().getDisplayMetrics().density * 2.0f);
        this.h = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
        this.i = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        this.j = rx8.P(3, new s35(0));
        this.k = rx8.P(3, new pe3(24, this));
        this.l = -1;
        this.m = -1;
        this.n = new t35(this, 3);
        this.o = f9j.None;
        this.s = rx8.P(3, new s35(1));
        this.t = new t35(this, 0, false);
        this.u = new t35(this, 1, false);
        this.v = new t35(this, 2);
        setId(R.id.messages_list_item_date);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setTranslationZ(Float.MAX_VALUE);
        TextPaint textPaint = y;
        textPaint.setAntiAlias(true);
        noh nohVar = q9i.x;
        bx5 bx5Var = bx5.b;
        textPaint.setTextSize(vl5.c(nohVar.k(bx5Var), context));
        textPaint.setLetterSpacing(vl5.c(nohVar.i(bx5Var), context));
        textPaint.setTypeface(Typeface.create(Typeface.create(nohVar.e, 0), zo5.a(nohVar.f)));
        setWillNotDraw(false);
        this.w = new e8b(f9j.h.getSize());
    }

    private final float getBackgroundCornerRadius() {
        return getHeight() / 2.0f;
    }

    private final Drawable getChannelViewCountDrawable() {
        return (Drawable) this.k.getValue();
    }

    private final CharSequence getCountViewText() {
        zv8 zv8Var = x[2];
        return (CharSequence) this.u.b;
    }

    private final CharSequence getDateText() {
        zv8 zv8Var = x[1];
        return (CharSequence) this.t.b;
    }

    public final BoringLayout.Metrics getMetrics() {
        return (BoringLayout.Metrics) this.s.getValue();
    }

    private final void setCountViewText(CharSequence charSequence) {
        this.u.B(this, x[2], charSequence);
    }

    private final void setDateText(CharSequence charSequence) {
        this.t.B(this, x[1], charSequence);
    }

    public final boolean b() {
        zv8 zv8Var = x[0];
        return ((Boolean) this.n.b).booleanValue();
    }

    public final boolean c() {
        zv8 zv8Var = x[3];
        return ((Boolean) this.v.b).booleanValue();
    }

    public final void d(CharSequence charSequence, boolean z) {
        if (z) {
            charSequence = new SpannableStringBuilder(getContext().getString(R.string.messages_list_date_status_edit)).append((CharSequence) " · ").append(charSequence);
        }
        setDateText(charSequence);
    }

    public final void e(f9j f9jVar) {
        Drawable drawable = this.p;
        if (drawable != null) {
            int iOrdinal = f9jVar.ordinal();
            if (iOrdinal == 1) {
                oi oiVar = drawable instanceof oi ? (oi) drawable : null;
                if (oiVar != null) {
                    oiVar.c(this.m);
                    return;
                }
                return;
            }
            if (iOrdinal != 4) {
                drawable.setTint(this.m);
                return;
            }
            EnhancedVectorDrawable enhancedVectorDrawable = drawable instanceof EnhancedVectorDrawable ? (EnhancedVectorDrawable) drawable : null;
            if (enhancedVectorDrawable != null) {
                a8g a8gVar = pq3.j;
                lvb.A0(enhancedVectorDrawable, "background", ((xac) a8gVar.h(this).f().b).c.d);
                a8gVar.h(this);
                lvb.A0(enhancedVectorDrawable, "bar", -1);
                a8gVar.h(this);
                lvb.A0(enhancedVectorDrawable, "dot", -1);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int height;
        Canvas canvas2;
        TextPaint paint;
        TextPaint paint2;
        BoringLayout boringLayout = this.q;
        BoringLayout boringLayout2 = this.r;
        if (boringLayout == null && boringLayout2 == null) {
            return;
        }
        if (boringLayout != null && (paint2 = boringLayout.getPaint()) != null) {
            paint2.setColor(this.l);
        }
        if (boringLayout2 != null && (paint = boringLayout2.getPaint()) != null) {
            paint.setColor(this.l);
        }
        getChannelViewCountDrawable().setTint(this.l);
        if (boringLayout != null) {
            height = boringLayout.getHeight();
        } else if (boringLayout2 == null) {
            return;
        } else {
            height = boringLayout2.getHeight();
        }
        float height2 = (getHeight() - height) * 0.5f;
        boolean zB = b();
        int i = this.f;
        float f = 0.0f;
        if (zB) {
            f = 0.0f + i;
            ny8 ny8Var = this.j;
            ((Paint) ny8Var.getValue()).setColor(this.e);
            canvas2 = canvas;
            canvas2.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), getBackgroundCornerRadius(), getBackgroundCornerRadius(), (Paint) ny8Var.getValue());
        } else {
            canvas2 = canvas;
        }
        if (!c()) {
            BoringLayout boringLayout3 = this.q;
            if (boringLayout3 != null) {
                int iSave = canvas2.save();
                canvas2.translate(f, height2);
                try {
                    boringLayout3.draw(canvas2);
                    boringLayout3.getWidth();
                    canvas2.restoreToCount(iSave);
                } catch (Throwable th) {
                    canvas2.restoreToCount(iSave);
                    throw th;
                }
            }
            if (!b()) {
                i = 0;
            }
            Drawable drawable = this.p;
            if (drawable != null) {
                float measuredWidth = (getMeasuredWidth() - i) - drawable.getBounds().width();
                float height3 = (getHeight() - drawable.getBounds().height()) * 0.5f;
                int iSave2 = canvas2.save();
                canvas2.translate(measuredWidth, height3);
                try {
                    drawable.draw(canvas2);
                    drawable.getBounds().width();
                    return;
                } finally {
                    canvas2.restoreToCount(iSave2);
                }
            }
            return;
        }
        float width = getWidth() - f;
        BoringLayout boringLayout4 = this.q;
        if (boringLayout4 != null) {
            float width2 = width - boringLayout4.getWidth();
            int iSave3 = canvas2.save();
            canvas2.translate(width2, height2);
            try {
                boringLayout4.draw(canvas2);
                width -= boringLayout4.getWidth();
                canvas2.restoreToCount(iSave3);
            } catch (Throwable th2) {
                canvas2.restoreToCount(iSave3);
                throw th2;
            }
        }
        Drawable drawable2 = this.p;
        if (drawable2 != null) {
            float fWidth = (width - drawable2.getBounds().width()) - this.a;
            float height4 = (getHeight() - drawable2.getBounds().height()) * 0.5f;
            int iSave4 = canvas2.save();
            canvas2.translate(fWidth, height4);
            try {
                drawable2.draw(canvas2);
                return;
            } finally {
                canvas2.restoreToCount(iSave4);
            }
        }
        BoringLayout boringLayout5 = this.r;
        if (boringLayout5 != null) {
            float width3 = width - boringLayout5.getWidth();
            int iSave5 = canvas2.save();
            canvas2.translate(width3, height2);
            try {
                boringLayout5.draw(canvas2);
                float width4 = width - (boringLayout5.getWidth() + this.h);
                canvas2.restoreToCount(iSave5);
                float fWidth2 = width4 - getChannelViewCountDrawable().getBounds().width();
                float height5 = (getHeight() - getChannelViewCountDrawable().getBounds().height()) * 0.5f;
                int iSave6 = canvas2.save();
                canvas2.translate(fWidth2, height5);
                try {
                    getChannelViewCountDrawable().draw(canvas2);
                } finally {
                    canvas2.restoreToCount(iSave6);
                }
            } catch (Throwable th3) {
                canvas2.restoreToCount(iSave5);
                throw th3;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMax;
        int width;
        Rect bounds;
        BoringLayout boringLayout = this.q;
        int iMax2 = 0;
        if (boringLayout != null) {
            width = boringLayout.getWidth();
            iMax = Math.max(0, boringLayout.getHeight());
        } else {
            iMax = 0;
            width = 0;
        }
        Drawable drawable = this.p;
        int iWidth = drawable != null ? drawable.getBounds().width() + gm0.K(this.a) : 0;
        Drawable drawable2 = this.p;
        int iHeight = (drawable2 == null || (bounds = drawable2.getBounds()) == null) ? 0 : bounds.height();
        BoringLayout boringLayout2 = this.r;
        int width2 = (boringLayout2 == null || (this.p != null && b())) ? 0 : boringLayout2.getWidth() + (this.h * 2) + getChannelViewCountDrawable().getBounds().width();
        BoringLayout boringLayout3 = this.r;
        if (boringLayout3 != null && (this.p == null || !b())) {
            iMax2 = Math.max((this.b * 2) + getChannelViewCountDrawable().getBounds().height(), boringLayout3.getHeight());
        }
        int iMax3 = Math.max(iWidth, width2) + width;
        int iL0 = e9i.l0(iMax, iHeight, iMax2, this.i);
        if (b()) {
            boolean zC = c();
            int i3 = this.g;
            int i4 = this.f;
            iMax3 += (!zC || this.p == null || this.r == null) ? i4 * 2 : i4 + i3;
            iL0 += i3 * 2;
        }
        setMeasuredDimension(iMax3, iL0);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        e(this.o);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        invalidate();
    }

    public final void setBackgroundEnabled$message_list(boolean z) {
        this.n.B(this, x[0], Boolean.valueOf(z));
    }

    public final void setChannelMode$message_list(boolean z) {
        this.v.B(this, x[3], Boolean.valueOf(z));
    }

    public final void setCountView$message_list(CharSequence charSequence) {
        if (charSequence == null) {
            setCountViewText(charSequence);
            return;
        }
        setCountViewText(new SpannableStringBuilder(charSequence).append((CharSequence) " · "));
        Drawable channelViewCountDrawable = getChannelViewCountDrawable();
        int i = this.d;
        channelViewCountDrawable.setBounds(0, 0, i, i);
    }

    public final void setDateViewStatusColor(int i) {
        if (this.m == i) {
            return;
        }
        this.m = i;
        e(this.o);
        invalidate();
    }

    public final void setStatus$message_list(f9j f9jVar) {
        Object obj;
        Drawable drawable;
        Object enhancedVectorDrawable;
        Object objMutate;
        this.o = f9jVar;
        Integer num = f9jVar.a;
        if (num == null) {
            drawable = null;
        } else {
            int iIntValue = num.intValue();
            e8b e8bVar = this.w;
            Object objC = e8bVar.c(iIntValue);
            if (objC == null) {
                int iOrdinal = this.o.ordinal();
                if (iOrdinal != 1) {
                    if (iOrdinal != 4) {
                        obj = objC;
                        objMutate = getContext().getDrawable(num.intValue()).mutate();
                    } else {
                        obj = objC;
                        enhancedVectorDrawable = new EnhancedVectorDrawable(getContext(), num.intValue());
                    }
                    int iA = e8bVar.a(iIntValue);
                    e8bVar.b[iA] = iIntValue;
                    e8bVar.c[iA] = enhancedVectorDrawable;
                    obj = enhancedVectorDrawable;
                } else {
                    obj = objC;
                    oi oiVar = new oi(getContext());
                    oiVar.setCallback(this);
                    oiVar.c(this.m);
                    oiVar.start();
                    objMutate = oiVar;
                }
                enhancedVectorDrawable = objMutate;
                int iA2 = e8bVar.a(iIntValue);
                e8bVar.b[iA2] = iIntValue;
                e8bVar.c[iA2] = enhancedVectorDrawable;
                obj = enhancedVectorDrawable;
            }
            obj = objC;
            drawable = (Drawable) obj;
        }
        boolean zD = cqk.d(this.p, drawable);
        if (drawable != null) {
            int i = this.c;
            drawable.setBounds(0, 0, i, i);
        }
        this.p = drawable;
        e(f9jVar);
        invalidate();
        if (zD) {
            return;
        }
        requestLayout();
    }

    public final void setTextColor$message_list(int i) {
        if (this.l == i) {
            return;
        }
        this.l = i;
        y.setColor(i);
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable instanceof Animatable) || super.verifyDrawable(drawable);
    }
}
