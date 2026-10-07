package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class fo0 extends Drawable implements fmh {
    public final WeakReference a;
    public final jo9 b;
    public final gmh c;
    public final Rect d;
    public final ho0 e;
    public float f;
    public float g;
    public final int h;
    public float i;
    public float j;
    public float k;
    public WeakReference l;
    public WeakReference m;

    public fo0(Context context) {
        zlh zlhVar;
        WeakReference weakReference = new WeakReference(context);
        this.a = weakReference;
        ch3.g(context, ch3.e, "Theme.MaterialComponents");
        this.d = new Rect();
        gmh gmhVar = new gmh(this);
        this.c = gmhVar;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = gmhVar.a;
        textPaint.setTextAlign(align);
        ho0 ho0Var = new ho0(context);
        this.e = ho0Var;
        boolean zG = g();
        go0 go0Var = ho0Var.b;
        jo9 jo9Var = new jo9(ywf.a(context, zG ? go0Var.g.intValue() : go0Var.e.intValue(), g() ? go0Var.h.intValue() : go0Var.f.intValue(), new f0(0.0f)).d());
        this.b = jo9Var;
        i();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && gmhVar.g != (zlhVar = new zlh(context2, go0Var.d.intValue()))) {
            gmhVar.b(zlhVar, context2);
            textPaint.setColor(go0Var.c.intValue());
            invalidateSelf();
            k();
            invalidateSelf();
        }
        int i = go0Var.l;
        if (i != -2) {
            this.h = ((int) Math.pow(10.0d, ((double) i) - 1.0d)) - 1;
        } else {
            this.h = go0Var.m;
        }
        gmhVar.e = true;
        k();
        invalidateSelf();
        gmhVar.e = true;
        i();
        k();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(go0Var.b.intValue());
        if (jo9Var.a.c != colorStateListValueOf) {
            jo9Var.j(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(go0Var.c.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.l;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.l.get();
            WeakReference weakReference3 = this.m;
            j(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        k();
        setVisible(go0Var.t.booleanValue(), false);
    }

    public static fo0 b(Context context) {
        return new fo0(context);
    }

    @Override // defpackage.fmh
    public final void a() {
        invalidateSelf();
    }

    public final String c() {
        ho0 ho0Var = this.e;
        go0 go0Var = ho0Var.b;
        go0 go0Var2 = ho0Var.b;
        String str = go0Var.j;
        WeakReference weakReference = this.a;
        if (str == null) {
            if (!h()) {
                return null;
            }
            int i = this.h;
            if (i == -2 || f() <= i) {
                return NumberFormat.getInstance(go0Var2.n).format(f());
            }
            Context context = (Context) weakReference.get();
            return context == null ? "" : String.format(go0Var2.n, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(i), "+");
        }
        int i2 = go0Var.l;
        if (i2 == -2 || str == null || str.length() <= i2) {
            return str;
        }
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i2 - 1), "…");
    }

    public final CharSequence d() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        ho0 ho0Var = this.e;
        go0 go0Var = ho0Var.b;
        if (go0Var.j != null) {
            CharSequence charSequence = go0Var.o;
            return charSequence != null ? charSequence : ho0Var.b.j;
        }
        boolean zH = h();
        go0 go0Var2 = ho0Var.b;
        if (!zH) {
            return go0Var2.p;
        }
        if (go0Var2.q == 0 || (context = (Context) this.a.get()) == null) {
            return null;
        }
        int i = this.h;
        return (i == -2 || f() <= i) ? context.getResources().getQuantityString(go0Var2.q, f(), Integer.valueOf(f())) : context.getString(go0Var2.r, Integer.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strC;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.b.draw(canvas);
        if (!g() || (strC = c()) == null) {
            return;
        }
        Rect rect = new Rect();
        gmh gmhVar = this.c;
        gmhVar.a.getTextBounds(strC, 0, strC.length(), rect);
        float fExactCenterY = this.g - rect.exactCenterY();
        canvas.drawText(strC, this.f, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), gmhVar.a);
    }

    public final FrameLayout e() {
        WeakReference weakReference = this.m;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public final int f() {
        int i = this.e.b.k;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    public final boolean g() {
        return this.e.b.j != null || h();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.e.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final boolean h() {
        go0 go0Var = this.e.b;
        return go0Var.j == null && go0Var.k != -1;
    }

    public final void i() {
        Context context = (Context) this.a.get();
        if (context == null) {
            return;
        }
        boolean zG = g();
        ho0 ho0Var = this.e;
        this.b.setShapeAppearanceModel(ywf.a(context, zG ? ho0Var.b.g.intValue() : ho0Var.b.e.intValue(), g() ? ho0Var.b.h.intValue() : ho0Var.b.f.intValue(), new f0(0.0f)).d());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    public final void j(View view, FrameLayout frameLayout) {
        this.l = new WeakReference(view);
        this.m = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        k();
        invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0222  */
    /* JADX WARN: Code duplicated, block: B:101:0x023a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0243  */
    /* JADX WARN: Code duplicated, block: B:105:0x025b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0260  */
    /* JADX WARN: Code duplicated, block: B:111:0x026d  */
    /* JADX WARN: Code duplicated, block: B:114:0x027a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0287  */
    public final void k() {
        float y;
        float x;
        float y2;
        float x2;
        float height;
        float width;
        float f;
        WeakReference weakReference = this.a;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.l;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.d;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference3 = this.m;
        ViewGroup viewGroup = weakReference3 != null ? (ViewGroup) weakReference3.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean zG = g();
        ho0 ho0Var = this.e;
        float f2 = zG ? ho0Var.d : ho0Var.c;
        this.i = f2;
        if (f2 != -1.0f) {
            this.j = f2;
            this.k = f2;
        } else {
            this.j = Math.round((g() ? ho0Var.g : ho0Var.e) / 2.0f);
            this.k = Math.round((g() ? ho0Var.h : ho0Var.f) / 2.0f);
        }
        if (g()) {
            String strC = c();
            float f3 = this.j;
            gmh gmhVar = this.c;
            if (gmhVar.e) {
                gmhVar.a(strC);
                f = gmhVar.c;
            } else {
                f = gmhVar.c;
            }
            this.j = Math.max(f3, (f / 2.0f) + ho0Var.b.u.intValue());
            float f4 = this.k;
            if (gmhVar.e) {
                gmhVar.a(strC);
            }
            float fMax = Math.max(f4, (gmhVar.d / 2.0f) + ho0Var.b.v.intValue());
            this.k = fMax;
            this.j = Math.max(this.j, fMax);
        }
        go0 go0Var = ho0Var.b;
        go0 go0Var2 = ho0Var.b;
        int i = ho0Var.k;
        int iIntValue = go0Var.x.intValue();
        if (g()) {
            iIntValue = go0Var.z.intValue();
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                iIntValue = lk.c(iIntValue, lk.b(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f), iIntValue - go0Var.C.intValue());
            }
        }
        if (i == 0) {
            iIntValue -= Math.round(this.k);
        }
        int iIntValue2 = go0Var.B.intValue() + iIntValue;
        int iIntValue3 = go0Var2.s.intValue();
        if (iIntValue3 == 8388691 || iIntValue3 == 8388693) {
            this.g = rect3.bottom - iIntValue2;
        } else {
            this.g = rect3.top + iIntValue2;
        }
        int iIntValue4 = g() ? go0Var.y.intValue() : go0Var.w.intValue();
        if (i == 1) {
            iIntValue4 += g() ? ho0Var.j : ho0Var.i;
        }
        int iIntValue5 = go0Var.A.intValue() + iIntValue4;
        int iIntValue6 = go0Var2.s.intValue();
        if (iIntValue6 == 8388659 || iIntValue6 == 8388691) {
            WeakHashMap weakHashMap = i7j.a;
            this.f = view.getLayoutDirection() == 0 ? (rect3.left - this.j) + iIntValue5 : (rect3.right + this.j) - iIntValue5;
        } else {
            WeakHashMap weakHashMap2 = i7j.a;
            this.f = view.getLayoutDirection() == 0 ? (rect3.right + this.j) - iIntValue5 : (rect3.left - this.j) + iIntValue5;
        }
        if (go0Var.D.booleanValue()) {
            View viewE = e();
            if (viewE != null) {
                FrameLayout frameLayoutE = e();
                if (frameLayoutE == null || frameLayoutE.getId() != R.id.mtrl_anchor_parent) {
                    y = 0.0f;
                    x = 0.0f;
                } else if (viewE.getParent() instanceof View) {
                    y = viewE.getY();
                    x = viewE.getX();
                    viewE = (View) viewE.getParent();
                }
                y2 = viewE.getY() + (this.g - this.k) + y;
                x2 = viewE.getX() + (this.f - this.j) + x;
                if (viewE.getParent() instanceof View) {
                    height = ((this.g + this.k) - (((View) viewE.getParent()).getHeight() - viewE.getY())) + y;
                } else {
                    height = 0.0f;
                }
                if (viewE.getParent() instanceof View) {
                    width = ((this.f + this.j) - (((View) viewE.getParent()).getWidth() - viewE.getX())) + x;
                } else {
                    width = 0.0f;
                }
                if (y2 < 0.0f) {
                    this.g = Math.abs(y2) + this.g;
                }
                if (x2 < 0.0f) {
                    this.f = Math.abs(x2) + this.f;
                }
                if (height > 0.0f) {
                    this.g -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.f -= Math.abs(width);
                }
            } else if (view.getParent() instanceof View) {
                float y3 = view.getY();
                x = view.getX();
                View view2 = (View) view.getParent();
                y = y3;
                viewE = view2;
                y2 = viewE.getY() + (this.g - this.k) + y;
                x2 = viewE.getX() + (this.f - this.j) + x;
                if (viewE.getParent() instanceof View) {
                    height = ((this.g + this.k) - (((View) viewE.getParent()).getHeight() - viewE.getY())) + y;
                } else {
                    height = 0.0f;
                }
                if (viewE.getParent() instanceof View) {
                    width = ((this.f + this.j) - (((View) viewE.getParent()).getWidth() - viewE.getX())) + x;
                } else {
                    width = 0.0f;
                }
                if (y2 < 0.0f) {
                    this.g = Math.abs(y2) + this.g;
                }
                if (x2 < 0.0f) {
                    this.f = Math.abs(x2) + this.f;
                }
                if (height > 0.0f) {
                    this.g -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.f -= Math.abs(width);
                }
            }
        }
        float f5 = this.f;
        float f6 = this.g;
        float f7 = this.j;
        float f8 = this.k;
        rect2.set((int) (f5 - f7), (int) (f6 - f8), (int) (f5 + f7), (int) (f6 + f8));
        float f9 = this.i;
        jo9 jo9Var = this.b;
        if (f9 != -1.0f) {
            ywf ywfVar = jo9Var.a.a;
            ywfVar.getClass();
            yab yabVar = ywfVar.a;
            yab yabVar2 = ywfVar.b;
            yab yabVar3 = ywfVar.c;
            yab yabVar4 = ywfVar.d;
            cy5 cy5Var = ywfVar.i;
            cy5 cy5Var2 = ywfVar.j;
            cy5 cy5Var3 = ywfVar.k;
            cy5 cy5Var4 = ywfVar.l;
            f0 f0Var = new f0(f9);
            f0 f0Var2 = new f0(f9);
            f0 f0Var3 = new f0(f9);
            f0 f0Var4 = new f0(f9);
            ywf ywfVar2 = new ywf();
            ywfVar2.a = yabVar;
            ywfVar2.b = yabVar2;
            ywfVar2.c = yabVar3;
            ywfVar2.d = yabVar4;
            ywfVar2.e = f0Var;
            ywfVar2.f = f0Var2;
            ywfVar2.g = f0Var3;
            ywfVar2.h = f0Var4;
            ywfVar2.i = cy5Var;
            ywfVar2.j = cy5Var2;
            ywfVar2.k = cy5Var3;
            ywfVar2.l = cy5Var4;
            jo9Var.setShapeAppearanceModel(ywfVar2);
        }
        if (rect.equals(rect2)) {
            return;
        }
        jo9Var.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable, defpackage.fmh
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        ho0 ho0Var = this.e;
        ho0Var.a.i = i;
        ho0Var.b.i = i;
        this.c.a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
