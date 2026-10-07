package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class nz8 extends urb implements w36 {
    public static final Rect j = new Rect();
    public static final Pattern k = Pattern.compile("[\\.,…\\:\\s]*$", 32);
    public boolean b;
    public boolean c;
    public CharSequence d;
    public int e;
    public float f;
    public float g;
    public Pattern h;
    public boolean i;

    public nz8(Context context) {
        super(context, null, 0);
        this.e = Integer.MAX_VALUE;
        this.f = 1.0f;
        this.h = k;
    }

    private final int getFullyVisibleLinesCount() {
        return ((getHeight() - getPaddingTop()) - getPaddingBottom()) / a("").getLineBottom(0);
    }

    private final int getLinesCount() {
        int fullyVisibleLinesCount = getFullyVisibleLinesCount();
        if (fullyVisibleLinesCount == -1) {
            return 1;
        }
        return fullyVisibleLinesCount;
    }

    public final StaticLayout a(CharSequence charSequence) {
        int intrinsicWidth;
        int compoundDrawablePadding;
        Drawable[] compoundDrawables = getCompoundDrawables();
        int intrinsicWidth2 = 0;
        Drawable drawable = compoundDrawables[0];
        if (drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
            compoundDrawablePadding = getCompoundDrawablePadding();
        } else {
            intrinsicWidth = 0;
            compoundDrawablePadding = 0;
        }
        Drawable drawable2 = compoundDrawables[2];
        if (drawable2 != null) {
            intrinsicWidth2 = drawable2.getIntrinsicWidth();
            compoundDrawablePadding += getCompoundDrawablePadding();
        }
        return new StaticLayout(charSequence, getPaint(), ((((getWidth() - getPaddingLeft()) - getPaddingRight()) - intrinsicWidth) - intrinsicWidth2) - compoundDrawablePadding, Layout.Alignment.ALIGN_NORMAL, this.f, this.g, false);
    }

    @Override // defpackage.w36
    public final boolean b() {
        return getVisibility() == 0;
    }

    @Override // defpackage.w36
    public final Rect d() {
        int lineStart = getLayout().getLineStart(0);
        float lineWidth = getLayout().getLineWidth(0);
        int lineTop = getLayout().getLineTop(0);
        Rect rect = j;
        rect.top = lineTop;
        rect.bottom = getLayout().getLineTop(1);
        rect.left = lineStart;
        rect.right = gm0.K(lineStart + lineWidth);
        return rect;
    }

    @Override // defpackage.w36
    public final void e(kbc kbcVar) {
        CharSequence text = getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        Object[] spans = spanned != null ? spanned.getSpans(0, getText().length(), eph.class) : null;
        if (spans == null) {
            spans = new eph[0];
        }
        for (Object obj : spans) {
            eph ephVar = (eph) obj;
            ephVar.onThemeChanged(kbcVar);
            soh.b(this, ephVar);
        }
    }

    @Override // defpackage.w36
    public final float f(String str) {
        return getPaint().measureText(str);
    }

    @Override // defpackage.w36
    public final void g(noh nohVar, bx5 bx5Var) {
        q9i.a(nohVar, this);
    }

    @Override // defpackage.w36
    public View getAsView() {
        return this;
    }

    @Override // android.widget.TextView
    public int getMaxLines() {
        return this.e;
    }

    @Override // defpackage.w36
    public int getMaxLinesValue() {
        return this.e;
    }

    @Override // defpackage.w36
    public CharSequence getSpannableText() {
        return this.d;
    }

    public int getTextColor() {
        return getCurrentTextColor();
    }

    @Override // defpackage.w36
    public CharSequence getTextValue() {
        return this.d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        CharSequence charSequenceConcat;
        if (this.b && (charSequenceConcat = this.d) != null) {
            CharSequence charSequenceConcat2 = this.i ? TextUtils.concat("…", charSequenceConcat.subSequence(charSequenceConcat.length() - 1, charSequenceConcat.length())) : "…";
            StaticLayout staticLayoutA = a(charSequenceConcat);
            int linesCount = getLinesCount();
            if (linesCount > 0 && staticLayoutA.getLineCount() > linesCount) {
                int lineEnd = staticLayoutA.getLineEnd(linesCount - 1) + 1;
                if (lineEnd >= charSequenceConcat.length()) {
                    lineEnd = charSequenceConcat.length() - 1;
                }
                CharSequence charSequenceSubSequence = charSequenceConcat.subSequence(0, lineEnd);
                while (a(TextUtils.concat(charSequenceSubSequence, charSequenceConcat2)).getLineCount() > linesCount && (lineEnd = lineEnd - 1) > 0) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, lineEnd);
                }
                if (charSequenceSubSequence instanceof Spanned) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceSubSequence);
                    Matcher matcher = this.h.matcher(charSequenceSubSequence);
                    if (matcher.find()) {
                        spannableStringBuilder.replace(matcher.start(), charSequenceSubSequence.length(), charSequenceConcat2);
                    }
                    charSequenceConcat = spannableStringBuilder;
                } else {
                    charSequenceConcat = TextUtils.concat(this.h.matcher(charSequenceSubSequence).replaceFirst(""), charSequenceConcat2);
                }
            }
            if (!charSequenceConcat.equals(getText())) {
                this.c = true;
                try {
                    setText(charSequenceConcat);
                    this.c = false;
                } catch (Throwable th) {
                    this.c = false;
                    throw th;
                }
            }
            this.b = false;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.b = true;
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if ((this.c || this.d != null) && charSequence != null && charSequence.equals(this.d)) {
            return;
        }
        this.d = charSequence;
        this.b = true;
    }

    public void setEllipsizing(TextUtils.TruncateAt truncateAt) {
        setEllipsize(truncateAt);
    }

    public final void setEndPunctuationPattern(Pattern pattern) {
        if (pattern == null) {
            pattern = k;
        }
        this.h = pattern;
    }

    public void setFallbackLineSpace(boolean z) {
        np4.C(this, z);
    }

    public void setLayout(dnh dnhVar) {
    }

    @Override // android.widget.TextView
    public final void setLineSpacing(float f, float f2) {
        this.g = f;
        this.f = f2;
        super.setLineSpacing(f, f2);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        super.setMaxLines(i);
        this.e = i;
        this.b = true;
    }

    public void setMaxLinesValue(int i) {
        setMaxLines(i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        this.b = true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        this.b = true;
    }

    public void setSaveLastCharPosition(boolean z) {
        this.i = z;
    }

    @Override // defpackage.w36
    public void setTextValue(CharSequence charSequence) {
        if (cqk.d(this.d, charSequence)) {
            return;
        }
        this.d = charSequence;
        this.b = true;
        setText(charSequence);
    }
}
