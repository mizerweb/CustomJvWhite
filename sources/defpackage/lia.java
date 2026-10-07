package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class lia extends ViewGroup implements ff3 {
    public static final /* synthetic */ zv8[] x = {new z8b(lia.class, "drawMode", "getDrawMode()Lone/me/messages/list/ui/view/delegates/views/MessageLinkView$Mode;"), zo5.e(zfe.a, lia.class, "isFloating", "isFloating()Z")};
    public final kia a;
    public final kia b;
    public xac c;
    public Long d;
    public Layout e;
    public Layout f;
    public Layout g;
    public Layout h;
    public final ny8 i;
    public Layout j;
    public Layout k;
    public int l;
    public Layout m;
    public final ny8 n;
    public final ny8 o;
    public final ny8 p;
    public final Path q;
    public final RectF r;
    public final Paint s;
    public final Paint t;
    public final TextPaint u;
    public final gn v;
    public final ny8 w;

    public lia(Context context) {
        super(context);
        this.a = new kia(this, 0);
        this.b = new kia(this, 1);
        this.i = rx8.P(3, new n52(context, 20));
        this.n = rx8.P(3, new bh9(28));
        this.o = rx8.P(3, new bh9(29));
        this.p = rx8.P(3, new n52(context, 21));
        this.q = new Path();
        this.r = new RectF();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.s = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(yl5.d().getDisplayMetrics().density * 2.0f);
        this.t = paint2;
        TextPaint textPaint = new TextPaint();
        p90.Q(this, textPaint, q9i.x);
        this.u = textPaint;
        this.v = new gn(2, this);
        this.w = rx8.P(3, new ww8(23, this));
    }

    public static final void d(lia liaVar, Canvas canvas, float f) {
        boolean zF = liaVar.f();
        Paint paint = liaVar.t;
        float strokeWidth = zF ? 0.0f : paint.getStrokeWidth();
        boolean zF2 = liaVar.f();
        float measuredHeight = liaVar.getMeasuredHeight();
        if (!zF2) {
            measuredHeight -= paint.getStrokeWidth();
        }
        canvas.drawLine(f, strokeWidth, f, measuredHeight, paint);
    }

    private final kwb getAvatarView() {
        return (kwb) this.i.getValue();
    }

    private final nt4 getDefaultImageOutlineProvider() {
        return (nt4) this.n.getValue();
    }

    private final iia getDrawMode() {
        zv8 zv8Var = x[0];
        return (iia) this.a.b;
    }

    private final l1c getImageView() {
        return (l1c) this.p.getValue();
    }

    private final hia getPlaceholderDrawable() {
        return (hia) this.w.getValue();
    }

    private final nt4 getRoundImageOutlineProvider() {
        return (nt4) this.o.getValue();
    }

    private final void setDrawMode(iia iiaVar) {
        this.a.B(this, x[0], iiaVar);
    }

    private final void setFloating(boolean z) {
        this.b.B(this, x[1], Boolean.valueOf(z));
    }

    @Override // defpackage.ff3
    public final void a(xac xacVar) {
        this.c = xacVar;
        p();
        q();
        a8g a8gVar = pq3.j;
        this.s.setColor(a8gVar.h(this).t().b);
        hia placeholderDrawable = getPlaceholderDrawable();
        int i = a8gVar.h(this).getIcon().b;
        int i2 = ((xac) a8gVar.h(this).f().b).a.d;
        Drawable drawable = placeholderDrawable.getDrawable(placeholderDrawable.c);
        GradientDrawable gradientDrawable = drawable instanceof GradientDrawable ? (GradientDrawable) drawable : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(ColorStateList.valueOf(i2));
        }
        int i3 = placeholderDrawable.d;
        if (i3 >= 0) {
            sb8.m0(i, placeholderDrawable.getDrawable(i3));
        }
        invalidate();
    }

    public final int b() {
        if (f()) {
            return gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        }
        if (getDrawMode() == iia.e) {
            return 0;
        }
        return gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
    }

    public final int c() {
        if (f()) {
            return gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0285  */
    /* JADX WARN: Code duplicated, block: B:135:0x0292 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Layout layout;
        p();
        int iB = b();
        int iC = c();
        boolean zF = f();
        Path path = this.q;
        if (zF) {
            int iSave = canvas.save();
            canvas.clipPath(path);
            try {
                canvas.drawRect(this.r, this.s);
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        }
        boolean zF2 = f();
        iia iiaVar = iia.e;
        if (zF2 || getDrawMode() != iiaVar) {
            boolean zG0 = yab.g0(this);
            Paint paint = this.t;
            float measuredWidth = zG0 ? getMeasuredWidth() - (paint.getStrokeWidth() / 2.0f) : paint.getStrokeWidth() / 2.0f;
            if (f()) {
                int iSave2 = canvas.save();
                canvas.clipPath(path);
                try {
                    d(this, canvas, measuredWidth);
                    canvas.restoreToCount(iSave2);
                } catch (Throwable th2) {
                    canvas.restoreToCount(iSave2);
                    throw th2;
                }
            } else {
                int iSave3 = canvas.save();
                try {
                    d(this, canvas, measuredWidth);
                    canvas.restoreToCount(iSave3);
                } catch (Throwable th3) {
                    canvas.restoreToCount(iSave3);
                    throw th3;
                }
            }
        }
        if (getDrawMode() != iiaVar && getDrawMode() != iia.c) {
            Layout layout2 = this.e;
            int i = i();
            if (layout2 != null) {
                layout2.getPaint().setColor(i);
            }
            int iSave4 = canvas.save();
            canvas.translate(iB, iC);
            if (layout2 != null) {
                try {
                    layout2.draw(canvas);
                } catch (Throwable th4) {
                    canvas.restoreToCount(iSave4);
                    throw th4;
                }
            }
            canvas.restoreToCount(iSave4);
            iC += o9b.c(this.e);
        }
        int iOrdinal = getDrawMode().ordinal();
        if (iOrdinal == 0) {
            layout = this.f;
            int iSave5 = canvas.save();
            canvas.translate(iB, iC);
            if (layout != null) {
                try {
                    layout.draw(canvas);
                } catch (Throwable th5) {
                    canvas.restoreToCount(iSave5);
                    throw th5;
                }
            }
            canvas.restoreToCount(iSave5);
        } else if (iOrdinal == 1) {
            int iB2 = zo5.b(2.0f, yl5.d().getDisplayMetrics().density, iC);
            int iE = c0a.e(6.0f, yl5.d().getDisplayMetrics().density, gm0.K(28.0f * yl5.d().getDisplayMetrics().density), iB);
            Layout layout3 = this.g;
            int iG = g();
            if (layout3 != null) {
                layout3.getPaint().setColor(iG);
            }
            float f = iE;
            int iSave6 = canvas.save();
            canvas.translate(f, iB2);
            if (layout3 != null) {
                try {
                    layout3.draw(canvas);
                } catch (Throwable th6) {
                    canvas.restoreToCount(iSave6);
                    throw th6;
                }
            }
            canvas.restoreToCount(iSave6);
            int iC2 = o9b.c(this.g) + iB2;
            Layout layout4 = this.h;
            int iG2 = g();
            if (layout4 != null) {
                layout4.getPaint().setColor(iG2);
            }
            int iSave7 = canvas.save();
            canvas.translate(f, iC2);
            if (layout4 != null) {
                try {
                    layout4.draw(canvas);
                } catch (Throwable th7) {
                    canvas.restoreToCount(iSave7);
                    throw th7;
                }
            }
            canvas.restoreToCount(iSave7);
        } else if (iOrdinal == 2) {
            float f2 = iB;
            if (this.l > 1) {
                float fK = f2 + gm0.K(yl5.d().getDisplayMetrics().density * 11.0f);
                float bottom = getImageView().getBottom() - gm0.K(11.0f * yl5.d().getDisplayMetrics().density);
                a8g a8gVar = pq3.j;
                int i2 = a8gVar.h(this).b().g;
                TextPaint textPaint = this.u;
                textPaint.setColor(i2);
                canvas.drawCircle(fK, bottom, gm0.K(9.0f * yl5.d().getDisplayMetrics().density), textPaint);
                a8gVar.h(this);
                textPaint.setColor(-1);
                canvas.drawText(String.valueOf(this.l), fK - (textPaint.measureText(String.valueOf(this.l)) / 2.0f), bottom - ((textPaint.ascent() + textPaint.descent()) / 2.0f), textPaint);
            }
            int iE2 = c0a.e(4.0f, yl5.d().getDisplayMetrics().density, gm0.K(32.0f * yl5.d().getDisplayMetrics().density), iB);
            int measuredHeight = (((getMeasuredHeight() - iC) / 2) - ((o9b.c(this.m) + o9b.c(this.e)) / 2)) + iC;
            Layout layout5 = this.e;
            int i3 = i();
            if (layout5 != null) {
                layout5.getPaint().setColor(i3);
            }
            float f3 = iE2;
            int iSave8 = canvas.save();
            canvas.translate(f3, measuredHeight);
            if (layout5 != null) {
                try {
                    layout5.draw(canvas);
                } catch (Throwable th8) {
                    canvas.restoreToCount(iSave8);
                    throw th8;
                }
            }
            canvas.restoreToCount(iSave8);
            int iC3 = o9b.c(this.e) + measuredHeight;
            Layout layout6 = this.m;
            int iSave9 = canvas.save();
            canvas.translate(f3, iC3);
            if (layout6 != null) {
                try {
                    layout6.draw(canvas);
                } catch (Throwable th9) {
                    canvas.restoreToCount(iSave9);
                    throw th9;
                }
            }
            canvas.restoreToCount(iSave9);
        } else if (iOrdinal == 3) {
            layout = this.f;
            int iSave10 = canvas.save();
            canvas.translate(iB, iC);
            if (layout != null) {
                layout.draw(canvas);
            }
            canvas.restoreToCount(iSave10);
        } else {
            if (iOrdinal != 4) {
                ore.o();
                return;
            }
            Layout layout7 = this.j;
            float f4 = iB;
            int iSave11 = canvas.save();
            canvas.translate(f4, iC);
            if (layout7 != null) {
                try {
                    layout7.draw(canvas);
                } catch (Throwable th10) {
                    canvas.restoreToCount(iSave11);
                    throw th10;
                }
            }
            canvas.restoreToCount(iSave11);
            int iC4 = o9b.c(this.j) + iC;
            Layout layout8 = this.k;
            int iSave12 = canvas.save();
            canvas.translate(f4, iC4);
            if (layout8 != null) {
                try {
                    layout8.draw(canvas);
                } catch (Throwable th11) {
                    canvas.restoreToCount(iSave12);
                    throw th11;
                }
            }
            canvas.restoreToCount(iSave12);
        }
        super.dispatchDraw(canvas);
    }

    public final void e(zha zhaVar) {
        yab.e(this, getImageView(), -1);
        l1c imageView = getImageView();
        String str = zhaVar.a;
        Integer num = zhaVar.f;
        imageView.setVisibility(((str == null || str.length() == 0) && num == null) ? 8 : 0);
        l1c imageView2 = getImageView();
        String str2 = zhaVar.a;
        v78 v78VarB = str2 != null ? v78.b(str2) : null;
        Uri uri = zhaVar.d;
        l1c.j(imageView2, v78VarB, uri != null ? v78.a(uri) : null, 4);
        getImageView().setOutlineProvider(zhaVar.e ? getRoundImageOutlineProvider() : getDefaultImageOutlineProvider());
        if (num != null) {
            int iIntValue = num.intValue();
            hia placeholderDrawable = getPlaceholderDrawable();
            Drawable drawableMutate = getContext().getDrawable(iIntValue).mutate();
            int i = pq3.j.h(this).getIcon().b;
            int i2 = placeholderDrawable.d;
            if (i2 >= 0) {
                placeholderDrawable.setDrawable(i2, drawableMutate);
            } else {
                int iAddLayer = placeholderDrawable.addLayer(drawableMutate);
                placeholderDrawable.d = iAddLayer;
                int i3 = placeholderDrawable.b;
                placeholderDrawable.setLayerSize(iAddLayer, i3, i3);
                placeholderDrawable.setLayerGravity(placeholderDrawable.d, 17);
            }
            drawableMutate.setTint(i);
            ((wj7) getImageView().getHierarchy()).i(1, getPlaceholderDrawable());
        } else {
            ((wj7) getImageView().getHierarchy()).i(1, null);
        }
        this.l = zhaVar.b;
        this.m = zhaVar.c;
    }

    public final boolean f() {
        zv8 zv8Var = x[1];
        return ((Boolean) this.b.b).booleanValue();
    }

    public final int g() {
        xac xacVar = this.c;
        if (xacVar == null) {
            return 0;
        }
        if (!f()) {
            return xacVar.b.i;
        }
        pq3.j.h(this);
        return -1;
    }

    public final int i() {
        xac xacVar = this.c;
        if (xacVar == null) {
            return 0;
        }
        boolean zF = f();
        a8g a8gVar = pq3.j;
        if (!zF) {
            return isk.i(a8gVar.h(this), this.d, xacVar.b.h);
        }
        a8gVar.h(this);
        return -1;
    }

    public final void j(Layout layout, xha xhaVar) {
        setDrawMode(iia.b);
        this.e = layout;
        this.g = xhaVar.a;
        this.h = xhaVar.b;
        yab.e(this, getAvatarView(), -1);
        getAvatarView().setVisibility(0);
        kwb.v(getAvatarView(), xhaVar.e, Long.valueOf(xhaVar.c), xhaVar.d);
    }

    public final void k(zha zhaVar, Layout layout) {
        setDrawMode(iia.c);
        this.e = layout;
        e(zhaVar);
    }

    public final void l(zha zhaVar, Layout layout) {
        setDrawMode(iia.c);
        this.e = layout;
        e(zhaVar);
    }

    public final void m(Layout layout, Layout layout2) {
        setDrawMode(iia.a);
        this.e = layout;
        this.f = layout2;
    }

    public final void n(Layout layout, Layout layout2) {
        setDrawMode(iia.a);
        this.e = layout;
        this.f = layout2;
        osk.b(this, layout2, this.v);
    }

    public final void o(Layout layout, bia biaVar) {
        setDrawMode(iia.d);
        this.e = layout;
        yab.e(this, getImageView(), -1);
        l1c imageView = getImageView();
        String str = biaVar.a;
        imageView.setVisibility((str == null || str.length() == 0) ? 8 : 0);
        l1c imageView2 = getImageView();
        v78 v78VarB = str != null ? v78.b(str) : null;
        Uri uri = biaVar.b;
        l1c.j(imageView2, v78VarB, uri != null ? v78.a(uri) : null, 4);
        getImageView().setOutlineProvider(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Layout layout = this.f;
        if (layout != null) {
            osk.b(this, layout, this.v);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Layout layout = this.f;
        if (layout != null) {
            osk.d(layout, this.v);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iB = b();
        int iC = o9b.c(this.e) + c();
        int iOrdinal = getDrawMode().ordinal();
        if (iOrdinal == 1) {
            qyj.M(getAvatarView(), iB, zo5.b(2.0f, yl5.d().getDisplayMetrics().density, iC), 0, 12);
        } else if (iOrdinal == 2) {
            qyj.M(getImageView(), iB, (getMeasuredHeight() / 2) - (getImageView().getMeasuredHeight() / 2), 0, 12);
        } else {
            if (iOrdinal != 3) {
                return;
            }
            qyj.M(getImageView(), iB, iC, 0, 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:28:0x01f4  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iC;
        int iL0;
        int iB;
        int iMax;
        int size = View.MeasureSpec.getSize(i);
        int iC2 = c() * 2;
        int iB2 = b();
        if (jia.$EnumSwitchMapping$0[getDrawMode().ordinal()] == 5) {
            iC = o9b.c(this.k) + o9b.c(this.j) + iC2;
            iL0 = Math.max(o9b.d(this.j), o9b.d(this.k));
        } else {
            iC = o9b.c(this.e) + iC2;
            int iOrdinal = getDrawMode().ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    iC += Math.max(gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), o9b.c(this.g) + o9b.c(this.h)) + gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
                    iB2 += Math.max(o9b.d(this.e), Math.max(o9b.d(this.h), o9b.d(this.g)) + zo5.b(6.0f, yl5.d().getDisplayMetrics().density, gm0.K(yl5.d().getDisplayMetrics().density * 28.0f)));
                    int iA = qv1.a(28.0f, yl5.d().getDisplayMetrics().density, 1073741824);
                    getAvatarView().measure(iA, iA);
                } else if (iOrdinal == 2) {
                    int iA2 = qv1.a(32.0f, yl5.d().getDisplayMetrics().density, 1073741824);
                    getImageView().measure(iA2, iA2);
                    if (getDrawMode() == iia.c) {
                        iB = zo5.b(4.0f, yl5.d().getDisplayMetrics().density, getImageView().getMeasuredWidth());
                        iMax = Math.max(o9b.d(this.e), o9b.d(this.m));
                    } else {
                        iB = zo5.b(4.0f, yl5.d().getDisplayMetrics().density, getImageView().getMeasuredWidth());
                        iMax = Math.max(o9b.d(this.e), Math.max(o9b.d(this.m), o9b.d(this.k)));
                    }
                    iB2 += iMax + iB;
                    iC += Math.max(getImageView().getMeasuredHeight(), o9b.c(this.e) + o9b.c(this.m)) - o9b.c(this.e);
                } else if (iOrdinal == 3) {
                    int iA3 = qv1.a(56.0f, yl5.d().getDisplayMetrics().density, 1073741824);
                    getImageView().measure(iA3, iA3);
                    iC += getImageView().getMeasuredHeight();
                    iL0 = Math.max(o9b.d(this.e), getImageView().getMeasuredWidth());
                }
                if (f()) {
                    iB2 = zo5.b(8.0f, yl5.d().getDisplayMetrics().density, iB2);
                }
                if (iB2 <= size) {
                    size = iB2;
                }
                setMeasuredDimension(size, iC);
            }
            iC += o9b.c(this.f);
            iL0 = e9i.l0(o9b.d(this.e), o9b.d(this.f), o9b.d(this.j), o9b.d(this.k));
        }
        iB2 += iL0;
        if (f()) {
            iB2 = zo5.b(8.0f, yl5.d().getDisplayMetrics().density, iB2);
        }
        if (iB2 <= size) {
            size = iB2;
        }
        setMeasuredDimension(size, iC);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = this.r;
        rectF.set(0.0f, 0.0f, i, i2);
        Path path = this.q;
        path.reset();
        path.addRoundRect(rectF, yl5.d().getDisplayMetrics().density * 8.0f, yl5.d().getDisplayMetrics().density * 8.0f, Path.Direction.CW);
    }

    public final void p() {
        TextPaint paint;
        TextPaint paint2;
        TextPaint paint3;
        int i;
        TextPaint paint4;
        TextPaint paint5;
        TextPaint paint6;
        xac xacVar = this.c;
        if (xacVar == null) {
            return;
        }
        vac vacVar = xacVar.d;
        wac wacVar = xacVar.b;
        Layout layout = this.f;
        if (layout != null && (paint6 = layout.getPaint()) != null) {
            paint6.setColor(g());
        }
        Layout layout2 = this.f;
        if (layout2 != null) {
            CharSequence text = layout2.getText();
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            if (spanned != null) {
                Object[] spans = spanned.getSpans(0, layout2.getText().length(), Object.class);
                if (spans != null) {
                    for (Object obj : spans) {
                        ff3 ff3Var = obj instanceof ff3 ? (ff3) obj : null;
                        if (ff3Var != null) {
                            ff3Var.a(xacVar);
                        }
                    }
                }
            }
        }
        Layout layout3 = this.h;
        if (layout3 != null && (paint5 = layout3.getPaint()) != null) {
            paint5.setColor(g());
        }
        Layout layout4 = this.g;
        if (layout4 != null && (paint4 = layout4.getPaint()) != null) {
            paint4.setColor(g());
        }
        Layout layout5 = this.j;
        int i2 = -1;
        a8g a8gVar = pq3.j;
        if (layout5 != null && (paint3 = layout5.getPaint()) != null) {
            if (f()) {
                a8gVar.h(this);
                i = -1;
            } else {
                i = wacVar.j;
            }
            paint3.setColor(i);
        }
        Layout layout6 = this.k;
        if (layout6 != null && (paint2 = layout6.getPaint()) != null) {
            if (f()) {
                a8gVar.h(this);
            } else {
                i2 = isk.i(a8gVar.h(this), this.d, wacVar.h);
            }
            paint2.setColor(i2);
        }
        Layout layout7 = this.m;
        if (layout7 != null && (paint = layout7.getPaint()) != null) {
            paint.setColor(g());
        }
        this.t.setColor(f() ? vacVar.b : isk.i(a8gVar.h(this), this.d, vacVar.a));
    }

    public final void q() {
        CharSequence text;
        CharSequence text2;
        Layout layout = this.e;
        a8g a8gVar = pq3.j;
        if (layout != null && (text2 = layout.getText()) != null) {
            vd7.h(text2, a8gVar.h(this));
        }
        Layout layout2 = this.k;
        if (layout2 == null || (text = layout2.getText()) == null) {
            return;
        }
        vd7.h(text, a8gVar.h(this));
    }

    public final void setAccentSourceId(Long l) {
        this.d = l;
        q();
        invalidate();
    }

    public final void setDeletedLayout(Layout layout) {
        setDrawMode(iia.a);
        this.e = null;
        this.f = layout;
    }

    public final void setIsFloating(boolean z) {
        setFloating(z);
    }

    public final void setSingleForward(wha whaVar) {
        setDrawMode(iia.e);
        this.j = whaVar.b();
        this.k = whaVar.a();
    }
}
