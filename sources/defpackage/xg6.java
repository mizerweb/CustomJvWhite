package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class xg6 extends View implements eph {
    public static final /* synthetic */ zv8[] q;
    public final ky8 a;
    public final CharSequence b;
    public final zb c;
    public at3 d;
    public final wg6 e;
    public final TextPaint f;
    public SpannableString g;
    public int h;
    public Layout i;
    public Layout j;
    public Layout k;
    public boolean l;
    public boolean m;
    public boolean n;
    public Integer o;
    public rz0 p;

    static {
        z8b z8bVar = new z8b(xg6.class, "typography", "getTypography()Lone/me/sdk/design/TextStyle;");
        zfe.a.getClass();
        q = new zv8[]{z8bVar};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg6(Context context) {
        super(context);
        r7 r7Var = r7.a;
        ky8 ky8Var = (ky8) new wtc(r7.d(ha9.b)).getAccessor().c(178);
        this.a = ky8Var;
        String strD = new tnh(R.string.oneme_profile_description_expand_suffix).d(this);
        this.b = strD == null ? "" : strD;
        this.c = new zb(q9i.e, 13, this);
        this.e = new wg6(this);
        TextPaint textPaint = new TextPaint(1);
        p90.Q(this, textPaint, getTypography());
        a8g a8gVar = pq3.j;
        textPaint.setColor(a8gVar.h(this).getText().b);
        this.f = textPaint;
        this.h = Integer.MAX_VALUE;
        onThemeChanged(a8gVar.h(this));
    }

    public final Layout a(int i, CharSequence charSequence) {
        int i2 = jeg.a;
        return ky8.a(this.a, ku6.v(charSequence), this.f, i, Integer.MAX_VALUE, false, null, 0.0f, false, 496);
    }

    public final void b(int i) {
        Layout layoutA;
        CharSequence charSequenceSubSequence;
        CharSequence charSequence = this.g;
        if (charSequence == null) {
            return;
        }
        Layout layoutA2 = a(i, charSequence);
        this.k = layoutA2;
        if (layoutA2.getLineCount() <= this.h) {
            layoutA = this.k;
        } else {
            StringBuilder sb = new StringBuilder("… ");
            CharSequence charSequence2 = this.b;
            sb.append((Object) charSequence2);
            String string = sb.toString();
            TextPaint textPaint = this.f;
            float fMeasureText = textPaint.measureText(string);
            SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(charSequence).append((CharSequence) string);
            Layout layoutA3 = a(i, spannableStringBuilderAppend);
            int lineCount = layoutA3.getLineCount();
            int i2 = this.h;
            if (lineCount > i2) {
                int lineStart = layoutA3.getLineStart(i2 - 1);
                CharSequence charSequenceSubSequence2 = spannableStringBuilderAppend.subSequence(0, layoutA3.getLineEnd(this.h - 1));
                while (layoutA3.getWidth() <= textPaint.measureText(charSequenceSubSequence2, lineStart, charSequenceSubSequence2.length()) + fMeasureText) {
                    int length = charSequenceSubSequence2.length() - 1;
                    if (length < 0) {
                        length = 0;
                    }
                    charSequenceSubSequence2 = r5h.t1(length, charSequenceSubSequence2);
                }
                int length2 = charSequenceSubSequence2.length() - 1;
                if (length2 < 0) {
                    charSequenceSubSequence = "";
                    break;
                }
                while (true) {
                    int i3 = length2 - 1;
                    if (charSequenceSubSequence2.charAt(length2) != '\n') {
                        charSequenceSubSequence = charSequenceSubSequence2.subSequence(0, length2 + 1);
                        break;
                    } else {
                        if (i3 < 0) {
                            charSequenceSubSequence = "";
                            break;
                        }
                        length2 = i3;
                    }
                }
                spannableStringBuilderAppend = new SpannableStringBuilder(charSequenceSubSequence);
            }
            layoutA = a(i, new SpannableStringBuilder(tre.z0(spannableStringBuilderAppend)).append((CharSequence) "… ").append(charSequence2, this.e, 33));
        }
        this.j = layoutA;
        if (this.n) {
            layoutA = this.k;
        }
        this.i = layoutA;
    }

    public final void c() {
        if (isAttachedToWindow() && getMeasuredWidth() > 0) {
            b(getMeasuredWidth());
            this.l = true;
            requestLayout();
        } else {
            if (this.p != null) {
                return;
            }
            this.p = new rz0(1, this);
            getViewTreeObserver().addOnPreDrawListener(this.p);
        }
    }

    public final at3 getLinkMovementMethod() {
        return this.d;
    }

    public final SpannableString getText() {
        return this.g;
    }

    public final Layout getTextLayout() {
        return this.i;
    }

    public final noh getTypography() {
        zv8 zv8Var = q[0];
        return (noh) this.c.b;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        rz0 rz0Var = this.p;
        if (rz0Var != null) {
            if (getViewTreeObserver().isAlive()) {
                getViewTreeObserver().removeOnPreDrawListener(rz0Var);
            }
            this.p = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        int iSave = canvas.save();
        canvas.translate(paddingLeft, paddingTop);
        try {
            Layout layout = this.i;
            if (layout != null) {
                layout.draw(canvas);
            }
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0008 A[PHI: r2
  0x0008: PHI (r2v9 java.lang.Integer) = (r2v1 java.lang.Integer), (r2v4 java.lang.Integer) binds: [B:3:0x0006, B:9:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iIntValue;
        int size = View.MeasureSpec.getSize(i);
        Integer numValueOf = this.o;
        if (numValueOf == null) {
            Layout layout = this.i;
            numValueOf = layout != null ? Integer.valueOf(layout.getHeight()) : null;
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 0;
            }
        } else {
            iIntValue = numValueOf.intValue();
        }
        setMeasuredDimension(size, iIntValue);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i3 == i) {
            return;
        }
        post(new k36(7, this));
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        Object[] spans;
        this.f.setColor(kbcVar.getText().b);
        SpannableString spannableString = this.g;
        if (spannableString != null) {
            try {
                spans = spannableString.getSpans(0, spannableString.length(), n59.class);
            } catch (Throwable unused) {
                spans = null;
            }
            n59[] n59VarArr = (n59[]) spans;
            if (n59VarArr != null) {
                for (n59 n59Var : n59VarArr) {
                    n59Var.b = pq3.j.h(this).getText().h;
                }
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] spans;
        Layout layout = this.i;
        CharSequence text = layout != null ? layout.getText() : null;
        Layout layout2 = this.i;
        if (!this.n && motionEvent.getAction() == 0 && text != null && layout2 != null) {
            int offsetForHorizontal = layout2.getOffsetForHorizontal(layout2.getLineForVertical((int) (motionEvent.getY() - getPaddingTop())), motionEvent.getX() - getPaddingLeft());
            int iD = zo5.D(2.0f, yl5.d().getDisplayMetrics().density, offsetForHorizontal);
            if (iD < 0) {
                iD = 0;
            }
            int iB = zo5.b(2.0f, yl5.d().getDisplayMetrics().density, offsetForHorizontal);
            int length = text.length();
            if (iB > length) {
                iB = length;
            }
            try {
                Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
                spans = spanned != null ? spanned.getSpans(iD, iB, ClickableSpan.class) : null;
            } catch (Throwable unused) {
            }
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spans;
            ClickableSpan clickableSpan = clickableSpanArr != null ? (ClickableSpan) a.b1(clickableSpanArr) : null;
            if (cqk.d(clickableSpan, this.e)) {
                clickableSpan.onClick(this);
                return true;
            }
        }
        SpannableString spannableString = this.g;
        at3 at3Var = this.d;
        if (at3Var == null || spannableString == null) {
            return super.onTouchEvent(motionEvent);
        }
        Layout layout3 = this.i;
        if (motionEvent.getAction() == 0) {
            at3Var.d = new xp9(new WeakReference(this), 11, layout3);
            at3Var.e = spannableString;
        }
        return at3Var.l.onTouchEvent(motionEvent);
    }

    public final void setCollapsedLines(int i) {
        this.h = i;
    }

    public final void setExpandWithAnimation(boolean z) {
        this.m = z;
    }

    public final void setLinkMovementMethod(at3 at3Var) {
        this.d = at3Var;
    }

    public final void setText(CharSequence charSequence) {
        jeg jegVarV;
        Spannable spannableK = xr8.k(charSequence, pq3.j.h(this).getText().h, (24 & 4) != 0, null);
        if (spannableK != null) {
            int i = jeg.a;
            jegVarV = ku6.v(spannableK);
        } else {
            jegVarV = null;
        }
        this.g = jegVarV;
        this.n = false;
        this.l = false;
        c();
    }

    public final void setTextColor(int i) {
        this.f.setColor(i);
        invalidate();
    }

    public final void setTypography(noh nohVar) {
        this.c.B(this, q[0], nohVar);
    }

    public final void setText(SpannableString spannableString) {
        this.g = spannableString;
    }
}
