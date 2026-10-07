package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class sj0 extends Drawable implements eph {
    public final Context a;
    public final dwb b;
    public final int[] c;
    public final Rect d;
    public final char[] e;
    public final Drawable f;
    public int g;
    public LinearGradient h;
    public int i;
    public ColorFilter j;
    public float k;
    public int l;
    public final qj0 m;
    public final rj0 n;
    public static final /* synthetic */ zv8[] p = {new z8b(sj0.class, "padding", "getPadding()F"), zo5.e(zfe.a, sj0.class, "isGradientEnabled", "isGradientEnabled$common()Z")};
    public static final oj0 o = new oj0();
    public static final fbc q = new fbc(19, new b6(7));
    public static final fbc r = new fbc(19, new b6(8));
    public static final ThreadLocal s = new ThreadLocal();

    public sj0(Context context, dwb dwbVar, tj0 tj0Var, kbc kbcVar) {
        Object[] spans;
        geg gegVar;
        Drawable drawableB;
        this.a = context;
        this.b = dwbVar;
        af7 af7Var = nk0.a;
        int[][] iArr = !((Boolean) nk0.a.invoke()).booleanValue() ? qe7.d : (int[][]) nk0.b.computeIfAbsent(kbcVar, new mm(1, new z9(2, kbcVar)));
        this.c = iArr[(int) Math.abs(tj0Var.a % ((long) iArr.length))];
        this.d = new Rect();
        CharSequence charSequence = tj0Var.b;
        char[] cArr = {0, 0};
        Drawable drawableNewDrawable = null;
        if (charSequence.length() != 0) {
            Character chR0 = r5h.R0(0, charSequence);
            Character chValueOf = chR0 != null ? Character.valueOf(Character.toUpperCase(chR0.charValue())) : null;
            Character chR1 = r5h.R0(1, charSequence);
            char upperCase = chR1 != null ? Character.toUpperCase(chR1.charValue()) : (char) 0;
            if (chValueOf != null) {
                cArr[0] = chValueOf.charValue();
                cArr[1] = upperCase;
            }
        }
        this.e = cArr;
        CharSequence charSequence2 = tj0Var.b;
        int length = charSequence2.length();
        try {
            Spanned spanned = charSequence2 instanceof Spanned ? (Spanned) charSequence2 : null;
            spans = spanned != null ? spanned.getSpans(0, length, geg.class) : null;
        } catch (Throwable unused) {
        }
        geg[] gegVarArr = (geg[]) spans;
        if (gegVarArr != null && (gegVar = (geg) a.b1(gegVarArr)) != null && (drawableB = gegVar.b()) != null) {
            Drawable.ConstantState constantState = drawableB.getConstantState();
            drawableNewDrawable = constantState != null ? constantState.newDrawable() : null;
            if (drawableNewDrawable == null) {
                String name = drawableB.getClass().getName();
                pj0 pj0Var = new pj0(zfe.a(drawableB.getClass()));
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, c0a.o("emoji drawable ", drawableB.getClass().getSimpleName(), " has no ConstantState, drawing shared instance"), pj0Var);
                    }
                }
                drawableNewDrawable = drawableB;
            }
        }
        this.f = drawableNewDrawable;
        this.g = 255;
        this.i = kbcVar.b().b;
        this.l = -1;
        this.m = new qj0(this);
        this.n = new rj0(this, kbcVar);
    }

    public final Paint a() {
        o.getClass();
        ThreadLocal threadLocal = s;
        Paint paint = (Paint) threadLocal.get();
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        paint2.setSubpixelText(true);
        paint2.setLinearText(true);
        paint2.setTypeface(h9i.a(this.a, Typeface.SANS_SERIF, 600));
        threadLocal.set(paint2);
        return paint2;
    }

    public final void b() {
        LinearGradient linearGradient;
        if (getBounds().isEmpty()) {
            return;
        }
        zv8 zv8Var = p[1];
        if (((Boolean) this.n.b).booleanValue()) {
            linearGradient = new LinearGradient(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, this.c, (float[]) null, Shader.TileMode.CLAMP);
        } else {
            linearGradient = null;
        }
        this.h = linearGradient;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        oj0 oj0Var = o;
        int color = oj0.a(oj0Var).getColor();
        int alpha = oj0.a(oj0Var).getAlpha();
        ColorFilter colorFilter = oj0.a(oj0Var).getColorFilter();
        Shader shader = oj0.a(oj0Var).getShader();
        try {
            oj0.a(oj0Var).setAlpha(this.g);
            oj0.a(oj0Var).setColorFilter(this.j);
            oj0.a(oj0Var).setShader(this.h);
            oj0.a(oj0Var).setColor(this.i);
            dwb dwbVar = this.b;
            if (dwbVar instanceof awb) {
                float fExactCenterX = getBounds().exactCenterX();
                float fExactCenterY = getBounds().exactCenterY();
                float fWidth = getBounds().width() / 2.0f;
                qj0 qj0Var = this.m;
                zv8 zv8Var = p[0];
                canvas.drawCircle(fExactCenterX, fExactCenterY, fWidth - ((Number) qj0Var.b).floatValue(), oj0.a(oj0Var));
            } else if (dwbVar instanceof cwb) {
                fbc fbcVar = q;
                zv8 zv8Var2 = oj0.a[0];
                Path path = (Path) ((b9b) ((oqh) fbcVar.c).get()).d(getBounds());
                if (path != null) {
                    canvas.drawPath(path, oj0.a(oj0Var));
                }
            } else {
                if (!cqk.d(dwbVar, bwb.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                canvas.drawPaint(oj0.a(oj0Var));
            }
            oj0.a(oj0Var).setColor(color);
            oj0.a(oj0Var).setAlpha(alpha);
            oj0.a(oj0Var).setColorFilter(colorFilter);
            oj0.a(oj0Var).setShader(shader);
            Drawable drawable = this.f;
            if (drawable != null) {
                float fExactCenterX2 = getBounds().exactCenterX() - (drawable.getBounds().width() / 2);
                float fExactCenterY2 = getBounds().exactCenterY() - (drawable.getBounds().height() / 2);
                int iSave = canvas.save();
                canvas.translate(fExactCenterX2, fExactCenterY2);
                try {
                    drawable.draw(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
            float fExactCenterX3 = getBounds().exactCenterX();
            Rect rect = this.d;
            float fExactCenterX4 = fExactCenterX3 - rect.exactCenterX();
            float fExactCenterY3 = getBounds().exactCenterY() - rect.exactCenterY();
            int color2 = a().getColor();
            try {
                a().setColor(this.l);
                Paint paintA = a();
                float f = this.k;
                float textSize = paintA.getTextSize();
                try {
                    paintA.setTextSize(f);
                    char[] cArr = this.e;
                    canvas.drawText(cArr, 0, cArr.length, fExactCenterX4, fExactCenterY3, a());
                    paintA.setTextSize(textSize);
                    a().setColor(color2);
                } catch (Throwable th) {
                    paintA.setTextSize(textSize);
                    throw th;
                }
            } catch (Throwable th2) {
                a().setColor(color2);
                throw th2;
            }
        } catch (Throwable th3) {
            oj0.a(oj0Var).setColor(color);
            oj0.a(oj0Var).setAlpha(alpha);
            oj0.a(oj0Var).setColorFilter(colorFilter);
            oj0.a(oj0Var).setShader(shader);
            throw th3;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        if (this.b instanceof cwb) {
            o.getClass();
            zv8 zv8Var = oj0.a[0];
            b9b b9bVar = (b9b) ((oqh) q.c).get();
            Object objD = b9bVar.d(rect);
            if (objD == null) {
                objD = new Path();
                b9bVar.o(rect, objD);
            }
            jxf.a((Path) objD, 2.8d, rect);
        }
        this.k = rect.height() * 0.33f;
        Paint paintA = a();
        float f = this.k;
        float textSize = paintA.getTextSize();
        try {
            paintA.setTextSize(f);
            Drawable drawable = this.f;
            if (drawable != null) {
                int i = a().getFontMetricsInt().descent - a().getFontMetricsInt().ascent;
                drawable.setBounds(0, 0, i, i);
            } else {
                Paint paintA2 = a();
                char[] cArr = this.e;
                paintA2.getTextBounds(cArr, 0, cArr.length, this.d);
            }
            paintA.setTextSize(textSize);
            b();
            invalidateSelf();
        } catch (Throwable th) {
            paintA.setTextSize(textSize);
            throw th;
        }
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        zv8 zv8Var = p[1];
        if (((Boolean) this.n.b).booleanValue()) {
            return;
        }
        this.l = kbcVar.getText().b;
        this.i = kbcVar.b().b;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.g = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.j = colorFilter;
        invalidateSelf();
    }
}
