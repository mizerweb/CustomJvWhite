package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class rfb extends trb implements w36, b77 {
    public static final Pattern v = Pattern.compile("[.,…:\\s]*$", 32);
    public static final TextPaint w = new TextPaint(1);
    public final Pattern a;
    public final Rect b;
    public StaticLayout c;
    public CharSequence d;
    public CharSequence e;
    public boolean f;
    public final float g;
    public float h;
    public boolean i;
    public dnh j;
    public noh k;
    public bx5 l;
    public int m;
    public boolean n;
    public int o;
    public Typeface p;
    public float q;
    public float r;
    public boolean s;
    public int t;
    public final qfb u;

    public rfb(Context context) {
        super(context, null, 0);
        this.a = v;
        this.b = new Rect();
        this.g = 1.0f;
        this.l = bx5.b;
        this.m = -1;
        this.o = -16777216;
        TextPaint textPaint = w;
        this.p = textPaint.getTypeface();
        this.q = textPaint.getLetterSpacing();
        this.r = textPaint.getTextSize();
        this.s = textPaint.isElegantTextHeight();
        this.t = 2;
        this.u = new qfb(this, context);
    }

    private final int getFullyVisibleLinesCount() throws Throwable {
        return ((getHeight() - getPaddingTop()) - getPaddingBottom()) / k((getWidth() - getPaddingLeft()) - getPaddingRight(), "").getLineBottom(0);
    }

    private final int getLinesCount() throws Throwable {
        int fullyVisibleLinesCount = getFullyVisibleLinesCount();
        if (fullyVisibleLinesCount == -1) {
            return 1;
        }
        return fullyVisibleLinesCount;
    }

    public static final void h(rfb rfbVar, TextPaint textPaint) {
        textPaint.setTypeface(rfbVar.p);
        textPaint.setLetterSpacing(rfbVar.q);
        textPaint.setTextSize(rfbVar.r);
        textPaint.setColor(rfbVar.o);
        textPaint.setLinearText(true);
        textPaint.setSubpixelText(true);
        textPaint.setAntiAlias(true);
    }

    private final void setContent(CharSequence charSequence) {
        if (cqk.d(this.d, charSequence)) {
            return;
        }
        l();
        this.d = charSequence;
        this.j = null;
        this.f = true;
        if (isAttachedToWindow()) {
            j();
        }
        invalidate();
        requestLayout();
    }

    private final void setLayoutInternal(Layout layout) {
        this.c = layout instanceof StaticLayout ? (StaticLayout) layout : null;
        this.d = layout != null ? layout.getText() : null;
        this.e = layout != null ? layout.getText() : null;
    }

    private final void setStaticLayoutsTextColor(int i) {
        TextPaint paint;
        StaticLayout staticLayout = this.c;
        if (staticLayout != null && (paint = staticLayout.getPaint()) != null) {
            paint.setColor(i);
        }
        dnh dnhVar = this.j;
        if (dnhVar != null) {
            dnhVar.a.a().getPaint().setColor(i);
            dnhVar.b.a().getPaint().setColor(i);
        }
    }

    @Override // defpackage.b77
    public final void a(bx5 bx5Var) {
        noh nohVar = this.k;
        if (nohVar == null || this.l == bx5Var) {
            return;
        }
        this.l = bx5Var;
        i(nohVar, bx5Var);
    }

    @Override // defpackage.w36
    public final boolean b() {
        return getVisibility() == 0;
    }

    @Override // defpackage.w36
    public final Rect d() {
        StaticLayout staticLayout = this.c;
        Rect rect = this.b;
        if (staticLayout == null) {
            rect.setEmpty();
            return rect;
        }
        if (staticLayout.getLineCount() <= 0) {
            rect.setEmpty();
            return rect;
        }
        int lineStart = staticLayout.getLineStart(0);
        float lineWidth = staticLayout.getLineWidth(0);
        rect.top = staticLayout.getLineTop(0);
        rect.bottom = staticLayout.getLineTop(1);
        rect.left = lineStart;
        rect.right = (int) (lineStart + lineWidth);
        return rect;
    }

    @Override // defpackage.w36
    public final void e(kbc kbcVar) {
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            vd7.h(charSequence, kbcVar);
        }
        invalidate();
    }

    @Override // defpackage.w36
    public final float f(String str) {
        TextPaint textPaint = w;
        float strokeWidth = textPaint.getStrokeWidth();
        int color = textPaint.getColor();
        int alpha = textPaint.getAlpha();
        Paint.Style style = textPaint.getStyle();
        Paint.Cap strokeCap = textPaint.getStrokeCap();
        Paint.Join strokeJoin = textPaint.getStrokeJoin();
        float strokeMiter = textPaint.getStrokeMiter();
        Typeface typeface = textPaint.getTypeface();
        float letterSpacing = textPaint.getLetterSpacing();
        float textSize = textPaint.getTextSize();
        boolean zIsLinearText = textPaint.isLinearText();
        boolean zIsSubpixelText = textPaint.isSubpixelText();
        boolean zIsAntiAlias = textPaint.isAntiAlias();
        try {
            h(this, textPaint);
            return textPaint.measureText(str);
        } finally {
            textPaint.setStrokeWidth(strokeWidth);
            textPaint.setColor(color);
            textPaint.setAlpha(alpha);
            textPaint.setStyle(style);
            textPaint.setStrokeCap(strokeCap);
            textPaint.setStrokeJoin(strokeJoin);
            textPaint.setStrokeMiter(strokeMiter);
            textPaint.setTypeface(typeface);
            textPaint.setLetterSpacing(letterSpacing);
            textPaint.setTextSize(textSize);
            textPaint.setLinearText(zIsLinearText);
            textPaint.setSubpixelText(zIsSubpixelText);
            textPaint.setAntiAlias(zIsAntiAlias);
        }
    }

    @Override // defpackage.w36
    public final void g(noh nohVar, bx5 bx5Var) {
        this.k = nohVar;
        this.l = bx5Var;
        i(nohVar, bx5Var);
    }

    @Override // defpackage.w36
    public View getAsView() {
        return this;
    }

    @Override // defpackage.w36
    public int getLineHeight() {
        TextPaint textPaint = w;
        float strokeWidth = textPaint.getStrokeWidth();
        int color = textPaint.getColor();
        int alpha = textPaint.getAlpha();
        Paint.Style style = textPaint.getStyle();
        Paint.Cap strokeCap = textPaint.getStrokeCap();
        Paint.Join strokeJoin = textPaint.getStrokeJoin();
        float strokeMiter = textPaint.getStrokeMiter();
        Typeface typeface = textPaint.getTypeface();
        float letterSpacing = textPaint.getLetterSpacing();
        float textSize = textPaint.getTextSize();
        boolean zIsLinearText = textPaint.isLinearText();
        boolean zIsSubpixelText = textPaint.isSubpixelText();
        boolean zIsAntiAlias = textPaint.isAntiAlias();
        try {
            h(this, textPaint);
            Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
            return (int) (((fontMetricsInt.descent - fontMetricsInt.ascent) * this.g) + this.h);
        } finally {
            textPaint.setStrokeWidth(strokeWidth);
            textPaint.setColor(color);
            textPaint.setAlpha(alpha);
            textPaint.setStyle(style);
            textPaint.setStrokeCap(strokeCap);
            textPaint.setStrokeJoin(strokeJoin);
            textPaint.setStrokeMiter(strokeMiter);
            textPaint.setTypeface(typeface);
            textPaint.setLetterSpacing(letterSpacing);
            textPaint.setTextSize(textSize);
            textPaint.setLinearText(zIsLinearText);
            textPaint.setSubpixelText(zIsSubpixelText);
            textPaint.setAntiAlias(zIsAntiAlias);
        }
    }

    @Override // defpackage.w36
    public int getMaxLinesValue() {
        return this.t;
    }

    @Override // defpackage.trb, defpackage.w36
    public CharSequence getSpannableText() {
        return this.d;
    }

    public int getTextColor() {
        return this.o;
    }

    @Override // defpackage.w36
    public CharSequence getTextValue() {
        return this.d;
    }

    public final void i(noh nohVar, bx5 bx5Var) {
        this.p = h9i.a(getContext(), Typeface.create(nohVar.e, 0), zo5.a(nohVar.f));
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.q = vl5.d(nohVar.i(bx5Var), displayMetrics);
        this.r = vl5.d(nohVar.k(bx5Var), displayMetrics);
        float fD = vl5.d(nohVar.j(bx5Var), displayMetrics);
        TextPaint textPaint = w;
        float strokeWidth = textPaint.getStrokeWidth();
        int color = textPaint.getColor();
        int alpha = textPaint.getAlpha();
        Paint.Style style = textPaint.getStyle();
        Paint.Cap strokeCap = textPaint.getStrokeCap();
        Paint.Join strokeJoin = textPaint.getStrokeJoin();
        float strokeMiter = textPaint.getStrokeMiter();
        Typeface typeface = textPaint.getTypeface();
        float letterSpacing = textPaint.getLetterSpacing();
        float textSize = textPaint.getTextSize();
        boolean zIsLinearText = textPaint.isLinearText();
        boolean zIsSubpixelText = textPaint.isSubpixelText();
        boolean zIsAntiAlias = textPaint.isAntiAlias();
        try {
            h(this, textPaint);
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            float f = fontMetrics.descent - fontMetrics.ascent;
            textPaint.setStrokeWidth(strokeWidth);
            textPaint.setColor(color);
            textPaint.setAlpha(alpha);
            textPaint.setStyle(style);
            textPaint.setStrokeCap(strokeCap);
            textPaint.setStrokeJoin(strokeJoin);
            textPaint.setStrokeMiter(strokeMiter);
            textPaint.setTypeface(typeface);
            textPaint.setLetterSpacing(letterSpacing);
            textPaint.setTextSize(textSize);
            textPaint.setLinearText(zIsLinearText);
            textPaint.setSubpixelText(zIsSubpixelText);
            textPaint.setAntiAlias(zIsAntiAlias);
            this.h = fD - f;
            this.s = false;
            this.f = true;
            invalidate();
            requestLayout();
        } catch (Throwable th) {
            textPaint.setStrokeWidth(strokeWidth);
            textPaint.setColor(color);
            textPaint.setAlpha(alpha);
            textPaint.setStyle(style);
            textPaint.setStrokeCap(strokeCap);
            textPaint.setStrokeJoin(strokeJoin);
            textPaint.setStrokeMiter(strokeMiter);
            textPaint.setTypeface(typeface);
            textPaint.setLetterSpacing(letterSpacing);
            textPaint.setTextSize(textSize);
            textPaint.setLinearText(zIsLinearText);
            textPaint.setSubpixelText(zIsSubpixelText);
            textPaint.setAntiAlias(zIsAntiAlias);
            throw th;
        }
    }

    public final void j() {
        CharSequence charSequence = this.d;
        Object[] spans = null;
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned == null) {
            return;
        }
        try {
            spans = spanned.getSpans(0, spanned.length(), k8j.class);
        } catch (Throwable unused) {
        }
        if (spans == null) {
            spans = new k8j[0];
        }
        for (Object obj : spans) {
            ((k8j) obj).attach(this);
        }
    }

    public final StaticLayout k(int i, CharSequence charSequence) throws Throwable {
        TextPaint textPaint = w;
        float strokeWidth = textPaint.getStrokeWidth();
        int color = textPaint.getColor();
        int alpha = textPaint.getAlpha();
        Paint.Style style = textPaint.getStyle();
        Paint.Cap strokeCap = textPaint.getStrokeCap();
        Paint.Join strokeJoin = textPaint.getStrokeJoin();
        float strokeMiter = textPaint.getStrokeMiter();
        Typeface typeface = textPaint.getTypeface();
        float letterSpacing = textPaint.getLetterSpacing();
        float textSize = textPaint.getTextSize();
        boolean zIsLinearText = textPaint.isLinearText();
        boolean zIsSubpixelText = textPaint.isSubpixelText();
        boolean zIsAntiAlias = textPaint.isAntiAlias();
        try {
            h(this, textPaint);
            try {
                try {
                    try {
                        try {
                            StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, this.g, this.h, this.s);
                            textPaint.setStrokeWidth(strokeWidth);
                            textPaint.setColor(color);
                            textPaint.setAlpha(alpha);
                            textPaint.setStyle(style);
                            textPaint.setStrokeCap(strokeCap);
                            textPaint.setStrokeJoin(strokeJoin);
                            textPaint.setStrokeMiter(strokeMiter);
                            textPaint.setTypeface(typeface);
                            textPaint.setLetterSpacing(letterSpacing);
                            textPaint.setTextSize(textSize);
                            textPaint.setLinearText(zIsLinearText);
                            textPaint.setSubpixelText(zIsSubpixelText);
                            textPaint.setAntiAlias(zIsAntiAlias);
                            return staticLayout;
                        } catch (Throwable th) {
                            th = th;
                            letterSpacing = letterSpacing;
                            textSize = textSize;
                            zIsLinearText = zIsLinearText;
                            zIsSubpixelText = zIsSubpixelText;
                            zIsAntiAlias = zIsAntiAlias;
                            textPaint.setStrokeWidth(strokeWidth);
                            textPaint.setColor(color);
                            textPaint.setAlpha(alpha);
                            textPaint.setStyle(style);
                            textPaint.setStrokeCap(strokeCap);
                            textPaint.setStrokeJoin(strokeJoin);
                            textPaint.setStrokeMiter(strokeMiter);
                            textPaint.setTypeface(typeface);
                            textPaint.setLetterSpacing(letterSpacing);
                            textPaint.setTextSize(textSize);
                            textPaint.setLinearText(zIsLinearText);
                            textPaint.setSubpixelText(zIsSubpixelText);
                            textPaint.setAntiAlias(zIsAntiAlias);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        zIsLinearText = zIsLinearText;
                        zIsSubpixelText = zIsSubpixelText;
                        zIsAntiAlias = zIsAntiAlias;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    zIsLinearText = zIsLinearText;
                    zIsSubpixelText = zIsSubpixelText;
                }
            } catch (Throwable th4) {
                th = th4;
                zIsLinearText = zIsLinearText;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final void l() {
        CharSequence charSequence = this.d;
        Object[] spans = null;
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned == null) {
            return;
        }
        try {
            spans = spanned.getSpans(0, spanned.length(), k8j.class);
        } catch (Throwable unused) {
        }
        if (spans == null) {
            spans = new k8j[0];
        }
        for (Object obj : spans) {
            ((k8j) obj).detach(this);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        j();
        dnh dnhVar = this.j;
        if (dnhVar != null) {
            mnh mnhVar = dnhVar.a;
            CopyOnWriteArraySet copyOnWriteArraySet = mnhVar.c;
            qfb qfbVar = this.u;
            copyOnWriteArraySet.add(qfbVar);
            mnh mnhVar2 = dnhVar.b;
            if (mnhVar != mnhVar2) {
                mnhVar2.c.add(qfbVar);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
        dnh dnhVar = this.j;
        qfb qfbVar = this.u;
        if (dnhVar != null) {
            dnhVar.a.c.remove(qfbVar);
        }
        dnh dnhVar2 = this.j;
        if (dnhVar2 != null) {
            dnhVar2.b.c.remove(qfbVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0022  */
    /* JADX WARN: Code duplicated, block: B:17:0x0026  */
    /* JADX WARN: Code duplicated, block: B:18:0x0028  */
    /* JADX WARN: Code duplicated, block: B:20:0x002e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0031  */
    /* JADX WARN: Code duplicated, block: B:25:0x003a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0040  */
    /* JADX WARN: Code duplicated, block: B:31:0x0049  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f3  */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x0049, please report this as an issue */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) throws Throwable {
        dnh dnhVar;
        CharSequence charSequence;
        int linesCount;
        CharSequence charSequenceConcat;
        SpannableStringBuilder spannableStringBuilder;
        mnh mnhVar;
        boolean z;
        boolean z2;
        if (this.f) {
            dnhVar = this.j;
            if (dnhVar == null) {
                this.n = false;
                charSequence = this.d;
                if (charSequence != null) {
                    int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                    StaticLayout staticLayoutK = k(width, charSequence);
                    linesCount = getLinesCount();
                    if (linesCount > 0 || staticLayoutK.getLineCount() <= linesCount) {
                        this.e = charSequence;
                    } else {
                        CharSequence charSequenceConcat2 = this.i ? TextUtils.concat("…", charSequence.subSequence(charSequence.length() - 1, charSequence.length())) : "…";
                        int length = charSequence.length();
                        int i = 1;
                        int i2 = 1;
                        while (i <= length) {
                            int i3 = (i + length) / 2;
                            if (k(width, TextUtils.concat(charSequence.subSequence(0, i3), charSequenceConcat2)).getLineCount() <= linesCount) {
                                i = i3 + 1;
                                i2 = i3;
                            } else {
                                length = i3 - 1;
                            }
                        }
                        CharSequence charSequenceSubSequence = charSequence.subSequence(0, i2);
                        boolean z3 = charSequenceSubSequence instanceof Spanned;
                        Pattern pattern = this.a;
                        if (z3) {
                            spannableStringBuilder = new SpannableStringBuilder(charSequenceSubSequence);
                            Matcher matcher = pattern.matcher(charSequenceSubSequence);
                            if (matcher.find()) {
                                charSequenceConcat = spannableStringBuilder;
                                spannableStringBuilder.replace(matcher.start(), charSequenceSubSequence.length(), charSequenceConcat2);
                                charSequenceConcat = spannableStringBuilder;
                            }
                        } else {
                            charSequenceConcat = TextUtils.concat(pattern.matcher(charSequenceSubSequence).replaceFirst(""), charSequenceConcat2);
                        }
                        charSequenceConcat = spannableStringBuilder;
                        this.e = charSequenceConcat;
                    }
                    CharSequence charSequence2 = this.e;
                    this.c = k(width, charSequence2 != null ? charSequence2 : "");
                    this.f = false;
                }
            } else if (dnhVar == null) {
                if (p90.F(this)) {
                    mnhVar = dnhVar.a;
                } else {
                    mnhVar = dnhVar.b;
                }
                if (mnhVar.b != this.l) {
                    this.n = false;
                    charSequence = this.d;
                    if (charSequence != null) {
                        int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                        StaticLayout staticLayoutK2 = k(width2, charSequence);
                        linesCount = getLinesCount();
                        if (linesCount > 0) {
                            this.e = charSequence;
                        } else {
                            this.e = charSequence;
                        }
                        CharSequence charSequence3 = this.e;
                        this.c = k(width2, charSequence3 != null ? charSequence3 : "");
                        this.f = false;
                    }
                } else if (this.n) {
                    this.n = false;
                    charSequence = this.d;
                    if (charSequence != null) {
                        int width3 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                        StaticLayout staticLayoutK3 = k(width3, charSequence);
                        linesCount = getLinesCount();
                        if (linesCount > 0) {
                            this.e = charSequence;
                        } else {
                            this.e = charSequence;
                        }
                        CharSequence charSequence4 = this.e;
                        this.c = k(width3, charSequence4 != null ? charSequence4 : "");
                        this.f = false;
                    }
                }
            } else if (this.n) {
                this.n = false;
                charSequence = this.d;
                if (charSequence != null) {
                    int width4 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                    StaticLayout staticLayoutK4 = k(width4, charSequence);
                    linesCount = getLinesCount();
                    if (linesCount > 0) {
                        this.e = charSequence;
                    } else {
                        this.e = charSequence;
                    }
                    CharSequence charSequence5 = this.e;
                    this.c = k(width4, charSequence5 != null ? charSequence5 : "");
                    this.f = false;
                }
            }
        } else {
            dnh dnhVar2 = this.j;
            if (dnhVar2 != null) {
                if ((p90.F(this) ? dnhVar2.a : dnhVar2.b).b != this.l) {
                    dnhVar = this.j;
                    if (dnhVar == null) {
                        this.n = false;
                        charSequence = this.d;
                        if (charSequence != null) {
                            int width5 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                            StaticLayout staticLayoutK5 = k(width5, charSequence);
                            linesCount = getLinesCount();
                            if (linesCount > 0) {
                                this.e = charSequence;
                            } else {
                                this.e = charSequence;
                            }
                            CharSequence charSequence6 = this.e;
                            this.c = k(width5, charSequence6 != null ? charSequence6 : "");
                            this.f = false;
                        }
                    } else if (dnhVar == null) {
                        if (p90.F(this)) {
                            mnhVar = dnhVar.a;
                        } else {
                            mnhVar = dnhVar.b;
                        }
                        if (mnhVar.b != this.l) {
                            this.n = false;
                            charSequence = this.d;
                            if (charSequence != null) {
                                int width6 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                                StaticLayout staticLayoutK6 = k(width6, charSequence);
                                linesCount = getLinesCount();
                                if (linesCount > 0) {
                                    this.e = charSequence;
                                } else {
                                    this.e = charSequence;
                                }
                                CharSequence charSequence7 = this.e;
                                this.c = k(width6, charSequence7 != null ? charSequence7 : "");
                                this.f = false;
                            }
                        } else if (this.n) {
                            this.n = false;
                            charSequence = this.d;
                            if (charSequence != null) {
                                int width7 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                                StaticLayout staticLayoutK7 = k(width7, charSequence);
                                linesCount = getLinesCount();
                                if (linesCount > 0) {
                                    this.e = charSequence;
                                } else {
                                    this.e = charSequence;
                                }
                                CharSequence charSequence8 = this.e;
                                this.c = k(width7, charSequence8 != null ? charSequence8 : "");
                                this.f = false;
                            }
                        }
                    } else if (this.n) {
                        this.n = false;
                        charSequence = this.d;
                        if (charSequence != null) {
                            int width8 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                            StaticLayout staticLayoutK8 = k(width8, charSequence);
                            linesCount = getLinesCount();
                            if (linesCount > 0) {
                                this.e = charSequence;
                            } else {
                                this.e = charSequence;
                            }
                            CharSequence charSequence9 = this.e;
                            this.c = k(width8, charSequence9 != null ? charSequence9 : "");
                            this.f = false;
                        }
                    }
                } else if (this.n) {
                    dnhVar = this.j;
                    if (dnhVar == null) {
                        this.n = false;
                        charSequence = this.d;
                        if (charSequence != null) {
                            int width9 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                            StaticLayout staticLayoutK9 = k(width9, charSequence);
                            linesCount = getLinesCount();
                            if (linesCount > 0) {
                                this.e = charSequence;
                            } else {
                                this.e = charSequence;
                            }
                            CharSequence charSequence10 = this.e;
                            this.c = k(width9, charSequence10 != null ? charSequence10 : "");
                            this.f = false;
                        }
                    } else if (dnhVar == null) {
                        if (p90.F(this)) {
                            mnhVar = dnhVar.a;
                        } else {
                            mnhVar = dnhVar.b;
                        }
                        if (mnhVar.b != this.l) {
                            this.n = false;
                            charSequence = this.d;
                            if (charSequence != null) {
                                int width10 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                                StaticLayout staticLayoutK10 = k(width10, charSequence);
                                linesCount = getLinesCount();
                                if (linesCount > 0) {
                                    this.e = charSequence;
                                } else {
                                    this.e = charSequence;
                                }
                                CharSequence charSequence11 = this.e;
                                this.c = k(width10, charSequence11 != null ? charSequence11 : "");
                                this.f = false;
                            }
                        } else if (this.n) {
                            this.n = false;
                            charSequence = this.d;
                            if (charSequence != null) {
                                int width11 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                                StaticLayout staticLayoutK11 = k(width11, charSequence);
                                linesCount = getLinesCount();
                                if (linesCount > 0) {
                                    this.e = charSequence;
                                } else {
                                    this.e = charSequence;
                                }
                                CharSequence charSequence12 = this.e;
                                this.c = k(width11, charSequence12 != null ? charSequence12 : "");
                                this.f = false;
                            }
                        }
                    } else if (this.n) {
                        this.n = false;
                        charSequence = this.d;
                        if (charSequence != null) {
                            int width12 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                            StaticLayout staticLayoutK12 = k(width12, charSequence);
                            linesCount = getLinesCount();
                            if (linesCount > 0) {
                                this.e = charSequence;
                            } else {
                                this.e = charSequence;
                            }
                            CharSequence charSequence13 = this.e;
                            this.c = k(width12, charSequence13 != null ? charSequence13 : "");
                            this.f = false;
                        }
                    }
                }
            } else if (this.n) {
                dnhVar = this.j;
                if (dnhVar == null) {
                    this.n = false;
                    charSequence = this.d;
                    if (charSequence != null) {
                        int width13 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                        StaticLayout staticLayoutK13 = k(width13, charSequence);
                        linesCount = getLinesCount();
                        if (linesCount > 0) {
                            this.e = charSequence;
                        } else {
                            this.e = charSequence;
                        }
                        CharSequence charSequence14 = this.e;
                        this.c = k(width13, charSequence14 != null ? charSequence14 : "");
                        this.f = false;
                    }
                } else if (dnhVar == null) {
                    if (p90.F(this)) {
                        mnhVar = dnhVar.a;
                    } else {
                        mnhVar = dnhVar.b;
                    }
                    if (mnhVar.b != this.l) {
                        this.n = false;
                        charSequence = this.d;
                        if (charSequence != null) {
                            int width14 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                            StaticLayout staticLayoutK14 = k(width14, charSequence);
                            linesCount = getLinesCount();
                            if (linesCount > 0) {
                                this.e = charSequence;
                            } else {
                                this.e = charSequence;
                            }
                            CharSequence charSequence15 = this.e;
                            this.c = k(width14, charSequence15 != null ? charSequence15 : "");
                            this.f = false;
                        }
                    } else if (this.n) {
                        this.n = false;
                        charSequence = this.d;
                        if (charSequence != null) {
                            int width15 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                            StaticLayout staticLayoutK15 = k(width15, charSequence);
                            linesCount = getLinesCount();
                            if (linesCount > 0) {
                                this.e = charSequence;
                            } else {
                                this.e = charSequence;
                            }
                            CharSequence charSequence16 = this.e;
                            this.c = k(width15, charSequence16 != null ? charSequence16 : "");
                            this.f = false;
                        }
                    }
                } else if (this.n) {
                    this.n = false;
                    charSequence = this.d;
                    if (charSequence != null) {
                        int width16 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                        StaticLayout staticLayoutK16 = k(width16, charSequence);
                        linesCount = getLinesCount();
                        if (linesCount > 0) {
                            this.e = charSequence;
                        } else {
                            this.e = charSequence;
                        }
                        CharSequence charSequence17 = this.e;
                        this.c = k(width16, charSequence17 != null ? charSequence17 : "");
                        this.f = false;
                    }
                }
            }
        }
        StaticLayout staticLayout = this.c;
        if (staticLayout == null) {
            return;
        }
        TextPaint textPaint = w;
        float strokeWidth = textPaint.getStrokeWidth();
        int color = textPaint.getColor();
        int alpha = textPaint.getAlpha();
        Paint.Style style = textPaint.getStyle();
        Paint.Cap strokeCap = textPaint.getStrokeCap();
        Paint.Join strokeJoin = textPaint.getStrokeJoin();
        float strokeMiter = textPaint.getStrokeMiter();
        Typeface typeface = textPaint.getTypeface();
        float letterSpacing = textPaint.getLetterSpacing();
        float textSize = textPaint.getTextSize();
        boolean zIsLinearText = textPaint.isLinearText();
        boolean zIsSubpixelText = textPaint.isSubpixelText();
        boolean zIsAntiAlias = textPaint.isAntiAlias();
        try {
            h(this, textPaint);
            z2 = zIsAntiAlias;
            try {
                int iSave = canvas.save();
                try {
                    try {
                        canvas.translate(getPaddingLeft(), getPaddingTop());
                        staticLayout.draw(canvas);
                        try {
                            canvas.restoreToCount(iSave);
                            textPaint.setStrokeWidth(strokeWidth);
                            textPaint.setColor(color);
                            textPaint.setAlpha(alpha);
                            textPaint.setStyle(style);
                            textPaint.setStrokeCap(strokeCap);
                            textPaint.setStrokeJoin(strokeJoin);
                            textPaint.setStrokeMiter(strokeMiter);
                            textPaint.setTypeface(typeface);
                            textPaint.setLetterSpacing(letterSpacing);
                            textPaint.setTextSize(textSize);
                            textPaint.setLinearText(zIsLinearText);
                            textPaint.setSubpixelText(zIsSubpixelText);
                            textPaint.setAntiAlias(z2);
                        } catch (Throwable th) {
                            th = th;
                            zIsSubpixelText = zIsSubpixelText;
                            z = zIsLinearText;
                            z2 = z2;
                            textPaint.setStrokeWidth(strokeWidth);
                            textPaint.setColor(color);
                            textPaint.setAlpha(alpha);
                            textPaint.setStyle(style);
                            textPaint.setStrokeCap(strokeCap);
                            textPaint.setStrokeJoin(strokeJoin);
                            textPaint.setStrokeMiter(strokeMiter);
                            textPaint.setTypeface(typeface);
                            textPaint.setLetterSpacing(letterSpacing);
                            textPaint.setTextSize(textSize);
                            textPaint.setLinearText(z);
                            textPaint.setSubpixelText(zIsSubpixelText);
                            textPaint.setAntiAlias(z2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z = zIsLinearText;
                        try {
                            canvas.restoreToCount(iSave);
                            throw th;
                        } catch (Throwable th3) {
                            th = th3;
                            textPaint.setStrokeWidth(strokeWidth);
                            textPaint.setColor(color);
                            textPaint.setAlpha(alpha);
                            textPaint.setStyle(style);
                            textPaint.setStrokeCap(strokeCap);
                            textPaint.setStrokeJoin(strokeJoin);
                            textPaint.setStrokeMiter(strokeMiter);
                            textPaint.setTypeface(typeface);
                            textPaint.setLetterSpacing(letterSpacing);
                            textPaint.setTextSize(textSize);
                            textPaint.setLinearText(z);
                            textPaint.setSubpixelText(zIsSubpixelText);
                            textPaint.setAntiAlias(z2);
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    z = zIsLinearText;
                }
            } catch (Throwable th5) {
                th = th5;
                z = zIsLinearText;
                zIsSubpixelText = zIsSubpixelText;
                z2 = z2;
            }
        } catch (Throwable th6) {
            th = th6;
            z = zIsLinearText;
            z2 = zIsAntiAlias;
            zIsSubpixelText = zIsSubpixelText;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0047  */
    /* JADX WARN: Code duplicated, block: B:31:0x004b  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) throws Throwable {
        CharSequence charSequence;
        int paddingTop;
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        StaticLayout staticLayout = this.c;
        boolean z = false;
        boolean z2 = this.m != -1 && ((staticLayout != null ? staticLayout.getWidth() : 0) > paddingLeft);
        this.m = paddingLeft;
        this.n = z2;
        if (this.j != null && !this.f && this.c != null && !z2) {
            z = true;
        }
        StaticLayout staticLayoutK = this.c;
        if (staticLayoutK == null) {
            charSequence = this.d;
            if (charSequence == null) {
                charSequence = "";
            }
            staticLayoutK = k(paddingLeft, charSequence);
        } else {
            if (!z) {
                staticLayoutK = null;
            }
            if (staticLayoutK == null) {
                charSequence = this.d;
                if (charSequence == null) {
                    charSequence = "";
                }
                staticLayoutK = k(paddingLeft, charSequence);
            }
        }
        int iMin = Math.min(staticLayoutK.getLineCount(), getMaxLinesValue());
        if (iMin > 0) {
            paddingTop = getPaddingBottom() + getPaddingTop() + staticLayoutK.getLineBottom(iMin - 1);
        } else {
            paddingTop = getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(size, paddingTop);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f = true;
        dnh dnhVar = this.j;
        if (dnhVar != null) {
            Layout layoutA = (p90.F(this) ? dnhVar.a : dnhVar.b).a();
            if (this.c != layoutA) {
                setLayoutInternal(layoutA);
            }
        }
        invalidate();
    }

    @Override // defpackage.trb, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            j();
        } else if (i == 4 || i == 8) {
            l();
        }
    }

    public void setEllipsizing(TextUtils.TruncateAt truncateAt) {
    }

    public void setFallbackLineSpace(boolean z) {
    }

    public void setLayout(dnh dnhVar) {
        dnh dnhVar2;
        dnh dnhVar3 = this.j;
        qfb qfbVar = this.u;
        if (dnhVar3 != null) {
            dnhVar3.a.c.remove(qfbVar);
        }
        dnh dnhVar4 = this.j;
        if (dnhVar4 != null) {
            dnhVar4.b.c.remove(qfbVar);
        }
        this.j = dnhVar;
        if (isAttachedToWindow() && (dnhVar2 = this.j) != null) {
            mnh mnhVar = dnhVar2.a;
            mnhVar.c.add(qfbVar);
            mnh mnhVar2 = dnhVar2.b;
            if (mnhVar != mnhVar2) {
                mnhVar2.c.add(qfbVar);
            }
        }
        Layout layoutA = (getContext().getResources().getConfiguration().orientation == 1 ? dnhVar.a : dnhVar.b).a();
        l();
        this.d = layoutA.getText();
        this.e = layoutA.getText();
        this.c = layoutA instanceof StaticLayout ? (StaticLayout) layoutA : null;
        this.f = false;
        if (isAttachedToWindow()) {
            j();
        }
        invalidate();
        requestLayout();
    }

    public void setMaxLinesValue(int i) {
        if (this.t != i) {
            this.t = i;
            this.f = true;
            invalidate();
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f = true;
        super.setPadding(i, i2, i3, i4);
    }

    public void setSaveLastCharPosition(boolean z) {
        this.i = z;
        this.f = true;
        invalidate();
    }

    @Override // defpackage.w36
    public void setTextColor(int i) {
        this.o = i;
        setStaticLayoutsTextColor(i);
        invalidate();
    }

    @Override // defpackage.w36
    public void setTextValue(CharSequence charSequence) {
        setContent(charSequence);
    }
}
