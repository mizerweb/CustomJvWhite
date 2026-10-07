package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Parcelable;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class dc extends EditText implements eph {
    public static final long g = bj8.a(1, 3);
    public final String a;
    public final TextPaint b;
    public float c;
    public int d;
    public int e;
    public int f;

    public dc(Context context) {
        super(context);
        this.a = context.getResources().getString(R.string.profile_edit_reactions_settings_added_reactions_hint);
        TextPaint textPaint = new TextPaint();
        noh.d(q9i.A, context, textPaint, null, null, 12);
        a8g a8gVar = pq3.j;
        textPaint.setColor(a8gVar.e(context).m().getText().e);
        textPaint.setLetterSpacing(0.0f);
        this.b = textPaint;
        setIncludeFontPadding(false);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(a8gVar.e(context).m().getText().h);
        shapeDrawable.setIntrinsicWidth(gm0.K(2.0f * yl5.d().getDisplayMetrics().density));
        shapeDrawable.setIntrinsicHeight(getLineHeight());
        np4.D(this, shapeDrawable);
        setCustomSelectionActionModeCallback(new bc());
        setLongClickable(false);
        setFilters(new u46[]{new u46()});
        setGravity(48);
        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        setPadding(iK, iK, iK, iK);
        setLineSpacing(gm0.K(((int) (g >> 32)) * yl5.d().getDisplayMetrics().density), 1.0f);
        l8j.a(this);
        setShowSoftInputOnFocus(false);
        addTextChangedListener(new a3(1, this));
    }

    public final void a(CharSequence charSequence) {
        int length = charSequence.length();
        Object[] spans = null;
        try {
            Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
            if (spanned != null) {
                spans = spanned.getSpans(0, length, yy7.class);
            }
        } catch (Throwable unused) {
        }
        if (spans == null) {
            spans = new yy7[0];
        }
        for (Object obj : spans) {
            ((yy7) obj).c(this.f);
        }
    }

    public final CharSequence getEmojiBeforeCursor() {
        List listSingletonList;
        Editable text = getText();
        if (text == null || getSelectionEnd() <= 0) {
            return null;
        }
        int i = 0;
        CharSequence charSequenceSubSequence = text.subSequence(0, getSelectionEnd());
        if (!(charSequenceSubSequence instanceof Spanned) || charSequenceSubSequence.length() == 0) {
            listSingletonList = r66.a;
        } else {
            Spanned spanned = (Spanned) charSequenceSubSequence;
            Object[] spans = spanned.getSpans(0, charSequenceSubSequence.length(), geg.class);
            if (spans.length == 0) {
                listSingletonList = Collections.singletonList(charSequenceSubSequence);
            } else {
                pw pwVar = new pw((spans.length * 2) + 2);
                pwVar.add(0);
                pwVar.add(Integer.valueOf(charSequenceSubSequence.length()));
                for (Object obj : spans) {
                    int spanStart = spanned.getSpanStart(obj);
                    int spanEnd = spanned.getSpanEnd(obj);
                    if (spanStart != -1 && spanEnd != -1) {
                        pwVar.add(Integer.valueOf(spanStart));
                        pwVar.add(Integer.valueOf(spanEnd));
                    }
                }
                List listL1 = ww3.L1(pwVar);
                ArrayList arrayList = new ArrayList();
                int size = listL1.size() - 1;
                int i2 = 0;
                while (i2 < size) {
                    int iIntValue = ((Number) listL1.get(i2)).intValue();
                    i2++;
                    int iIntValue2 = ((Number) listL1.get(i2)).intValue();
                    if (iIntValue < iIntValue2) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceSubSequence.subSequence(iIntValue, iIntValue2));
                        int length = spans.length;
                        for (int i3 = i; i3 < length; i3++) {
                            Object obj2 = spans[i3];
                            int spanStart2 = spanned.getSpanStart(obj2);
                            int spanEnd2 = spanned.getSpanEnd(obj2);
                            int spanFlags = spanned.getSpanFlags(obj2);
                            if (spanStart2 < iIntValue2 && spanEnd2 > iIntValue) {
                                int iMax = Math.max(spanStart2, iIntValue) - iIntValue;
                                int iMin = Math.min(spanEnd2, iIntValue2) - iIntValue;
                                if (iMax >= 0 && iMax < iMin) {
                                    spannableStringBuilder.setSpan(obj2, iMax, iMin, spanFlags);
                                }
                            }
                        }
                        arrayList.add(spannableStringBuilder);
                    }
                    i = 0;
                }
                listSingletonList = arrayList;
            }
        }
        return (CharSequence) ww3.D1(listSingletonList);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        float paddingLeft;
        float paddingTop;
        float f;
        super.onDraw(canvas);
        if (this.e < this.c || getLineCount() <= 0) {
            paddingLeft = getPaddingLeft();
            paddingTop = getPaddingTop() + (getLineHeight() * getLineCount());
            f = getPaint().getFontMetrics().top;
        } else {
            Editable text = getText();
            paddingLeft = (this.f / 2.0f) + (!(text == null || text.length() == 0) ? getPaddingLeft() * 1.5f : getPaddingLeft()) + this.d;
            paddingTop = getPaddingTop() + (getLineHeight() * (getLineCount() - 1));
            f = getPaint().getFontMetrics().ascent;
        }
        canvas.drawText(this.a, paddingLeft, paddingTop - f, this.b);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int lineHeight;
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout == null) {
            return;
        }
        this.c = this.b.measureText(this.a) + getPaddingLeft();
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int lineWidth = getLineCount() > 0 ? (int) layout.getLineWidth(getLineCount() - 1) : 0;
        this.d = lineWidth;
        int i3 = measuredWidth - lineWidth;
        this.e = i3;
        if (i3 >= this.c) {
            lineHeight = getPaddingBottom() + layout.getHeight() + getPaddingTop();
        } else {
            lineHeight = getLineHeight() + layout.getHeight() + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(getMeasuredWidth(), lineHeight);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        return null;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int iK;
        Object obj;
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i == i3) {
            return;
        }
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        Paint.FontMetricsInt fontMetricsInt = getPaint().getFontMetricsInt();
        int i5 = fontMetricsInt.descent - fontMetricsInt.ascent;
        long j = g;
        if (width > 0) {
            iK = gm0.K(((int) (j >> 32)) * yl5.d().getDisplayMetrics().density);
            gj8 gj8Var = (gj8) new hj8(iK, gm0.K(((int) (j & 4294967295L)) * yl5.d().getDisplayMetrics().density), 1).iterator();
            if (gj8Var.c) {
                Object next = gj8Var.next();
                if (gj8Var.c) {
                    int iIntValue = ((Number) next).intValue() + i5;
                    int i6 = width - ((width / iIntValue) * iIntValue);
                    do {
                        Object next2 = gj8Var.next();
                        int iIntValue2 = ((Number) next2).intValue() + i5;
                        int i7 = width - ((width / iIntValue2) * iIntValue2);
                        if (i6 > i7) {
                            next = next2;
                            i6 = i7;
                        }
                    } while (gj8Var.c);
                }
                obj = next;
            } else {
                obj = null;
            }
            Integer num = (Integer) obj;
            if (num != null) {
                iK = num.intValue();
            }
        } else {
            iK = gm0.K(((int) (j >> 32)) * yl5.d().getDisplayMetrics().density);
        }
        this.f = iK;
        Editable text = getText();
        if (text != null) {
            a(text);
        }
        setLineSpacing(this.f, 1.0f);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.b.setColor(kbcVar.getText().e);
        Drawable drawableR = np4.r(this);
        ShapeDrawable shapeDrawable = drawableR instanceof ShapeDrawable ? (ShapeDrawable) drawableR : null;
        if (shapeDrawable != null) {
            shapeDrawable.getPaint().setColor(kbcVar.getText().h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable instanceof Animatable) || super.verifyDrawable(drawable);
    }
}
