package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Size;
import android.view.Display;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes2.dex */
public final class dka extends View implements View.OnLongClickListener, o59, GestureDetector.OnDoubleTapListener, r46 {
    public static final /* synthetic */ zv8[] t;
    public final at3 a;
    public final ny8 b;
    public View.OnLongClickListener c;
    public zs3 d;
    public final r59 e;
    public o59 f;
    public final zb g;
    public at3 h;
    public int i;
    public float j;
    public float k;
    public float l;
    public boolean m;
    public aka n;
    public Drawable o;
    public int p;
    public int q;
    public final Rect r;
    public final gn s;

    static {
        z8b z8bVar = new z8b(dka.class, "onDoubleClickListener", "getOnDoubleClickListener()Lkotlin/jvm/functions/Function1;");
        zfe.a.getClass();
        t = new zv8[]{z8bVar};
    }

    public dka(Context context) {
        super(context, null, 0);
        at3 at3Var = new at3(context, new b1k(20, this));
        this.a = at3Var;
        this.b = rx8.P(3, new cka(0));
        this.e = new r59(null, new ww8(27, this), 7);
        this.g = new zb(this, 21);
        this.h = at3Var;
        this.i = 1;
        this.m = true;
        Display defaultDisplay = sb8.M(context).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.q = new Size(point.x, point.y).getHeight();
        this.r = new Rect();
        this.s = new gn(3, this);
        super.setOnLongClickListener(this);
    }

    public static void f(dka dkaVar) {
        ArrayList arrayList = dkaVar.getHighlightTextHelper().a;
        if (!arrayList.isEmpty()) {
            arrayList.clear();
        }
        CharSequence text = dkaVar.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            for (Object obj : spannable.getSpans(0, spannable.length(), k9f.class)) {
                k9f k9fVar = (k9f) obj;
                ForegroundColorSpan foregroundColorSpan = k9fVar.a;
                if (foregroundColorSpan != null) {
                    spannable.removeSpan(foregroundColorSpan);
                }
                BackgroundColorSpan backgroundColorSpan = k9fVar.b;
                if (backgroundColorSpan != null) {
                    spannable.removeSpan(backgroundColorSpan);
                }
                spannable.removeSpan(k9fVar);
            }
        }
        dkaVar.invalidate();
    }

    private final yv7 getHighlightTextHelper() {
        return (yv7) this.b.getValue();
    }

    public static final void setLayout$lambda$0(dka dkaVar) {
        try {
            dkaVar.setContentDescription(dkaVar.getText());
        } catch (NullPointerException e) {
            IssueKeyException issueKeyException = new IssueKeyException("50112", "Wrong state when we try set contentDescription", e);
            gm0.V(dkaVar.getClass().getName(), issueKeyException.getMessage(), issueKeyException);
        }
    }

    public static final void setStartDrawable$lambda$0(Drawable drawable) {
        ((AnimationDrawable) drawable).start();
    }

    @Override // defpackage.o59
    public final void a(String str, t59 t59Var, ClickableSpan clickableSpan) {
        o59 o59Var = this.f;
        if (o59Var != null) {
            o59Var.a(str, t59Var, clickableSpan);
        }
    }

    @Override // defpackage.o59
    public final void b(cga cgaVar) {
        o59 o59Var = this.f;
        if (o59Var != null) {
            o59Var.b(cgaVar);
        }
    }

    public final int e(int i) {
        Layout layout = getLayout();
        if (layout != null) {
            if (layout.getLineCount() == 1) {
                return getMeasuredWidth();
            }
            if (layout.getLineCount() > 1) {
                return (int) layout.getLineRight(layout.getLineCount() - 1);
            }
        }
        return i;
    }

    @Override // defpackage.r46
    public final void g() {
        invalidate();
    }

    public final at3 getDefaultMovementMethod() {
        return this.a;
    }

    public final Layout getLayout() {
        aka akaVar = this.n;
        if (akaVar != null) {
            return akaVar.b();
        }
        return null;
    }

    public final int getLineCount() {
        Layout layoutB;
        aka akaVar = this.n;
        if (akaVar == null || (layoutB = akaVar.b()) == null) {
            return 0;
        }
        return layoutB.getLineCount();
    }

    public final boolean getLinksClickable() {
        return this.m;
    }

    public final int getMaxHeightForClip() {
        return this.q;
    }

    public final at3 getMovementMethod() {
        return this.h;
    }

    public final cf7 getOnDoubleClickListener() {
        zv8 zv8Var = t[0];
        return (cf7) this.g.b;
    }

    public final CharSequence getText() {
        Layout layoutB;
        aka akaVar = this.n;
        if (akaVar == null || (layoutB = akaVar.b()) == null) {
            return null;
        }
        return layoutB.getText();
    }

    public final void h(List list) {
        yv7 highlightTextHelper = getHighlightTextHelper();
        CharSequence text = getText();
        Layout layout = getLayout();
        ArrayList arrayList = highlightTextHelper.a;
        if (!arrayList.isEmpty()) {
            arrayList.clear();
        }
        List list2 = list;
        if (list2 != null && !list2.isEmpty() && text != null && !r5h.X0(text) && layout != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                caf cafVar = (caf) it.next();
                float height = layout.getHeight() / layout.getLineCount();
                int i = cafVar.a;
                int i2 = cafVar.b;
                while (true) {
                    int lineForOffset = layout.getLineForOffset(i);
                    int lineEnd = layout.getLineEnd(lineForOffset);
                    boolean z = i2 <= lineEnd;
                    String string = text.subSequence(i, z ? i2 : lineEnd).toString();
                    highlightTextHelper.a.add(new xv7(lineForOffset, string, layout.getPrimaryHorizontal(i), layout.getLineTop(lineForOffset), layout.getLineBaseline(lineForOffset), layout.getPaint().measureText(string), height));
                    if (z) {
                        break;
                    } else {
                        i = lineEnd;
                    }
                }
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i() {
        CharSequence text = getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        return spanned != null && spanned.nextSpanTransition(spanned.length() - 1, spanned.length() + 1, y2e.class) == spanned.length();
    }

    public final void j() {
        y2e[] y2eVarArr;
        int iMax;
        int i;
        int i2;
        aka akaVar = this.n;
        Layout layoutB = akaVar != null ? akaVar.b() : null;
        Drawable drawable = this.o;
        int i3 = 0;
        int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() + this.p : 0;
        this.k = intrinsicWidth;
        int paddingLeft = getPaddingLeft();
        if (layoutB == null) {
            iMax = 0;
        } else {
            aka akaVar2 = this.n;
            if (akaVar2 == null || (y2eVarArr = (y2e[]) akaVar2.d.getValue()) == null) {
                y2eVarArr = new y2e[0];
            }
            CharSequence text = layoutB.getText();
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            int lineCount = layoutB.getLineCount();
            int i4 = 0;
            iMax = 0;
            while (i4 < lineCount) {
                int lineStart = layoutB.getLineStart(i4);
                int lineEnd = layoutB.getLineEnd(i4);
                if (spanned == null) {
                    i = i3;
                } else {
                    int length = y2eVarArr.length;
                    int i5 = i3;
                    i = i5;
                    while (i5 < length) {
                        y2e y2eVar = y2eVarArr[i5];
                        int spanStart = spanned.getSpanStart(y2eVar);
                        Spanned spanned2 = spanned;
                        int spanEnd = spanned.getSpanEnd(y2eVar) + 1;
                        if (spanStart != lineStart || lineEnd > spanEnd) {
                            if (spanStart <= lineStart && lineEnd <= spanEnd) {
                                i2 = y2eVar.a.m;
                            }
                            i5++;
                            spanned = spanned2;
                        } else {
                            x2e x2eVar = y2eVar.a;
                            i = i + x2eVar.m + x2eVar.g;
                            i2 = x2eVar.j;
                        }
                        i += i2;
                        i5++;
                        spanned = spanned2;
                    }
                }
                Spanned spanned3 = spanned;
                iMax = Math.max(iMax, gm0.K(layoutB.getLineMax(i4)) + i);
                i4++;
                spanned = spanned3;
                i3 = 0;
            }
        }
        setMeasuredDimension(getPaddingRight() + paddingLeft + iMax + intrinsicWidth, layoutB != null ? layoutB.getHeight() : 0);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        aka akaVar = this.n;
        if (akaVar != null) {
            akaVar.e.add(this);
        }
        CharSequence text = getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            this.e.c(spannable);
        }
        aka akaVar2 = this.n;
        if (akaVar2 != null) {
            osk.b(this, akaVar2.b(), this.s);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        aka akaVar = this.n;
        if (akaVar != null) {
            akaVar.e.remove(this);
        }
        aka akaVar2 = this.n;
        if (akaVar2 == null || !(!akaVar2.e.isEmpty())) {
            CharSequence text = getText();
            Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
            if (spannable != null) {
                this.e.getClass();
                r59.a(spannable);
            }
        }
        aka akaVar3 = this.n;
        if (akaVar3 != null) {
            osk.d(akaVar3.b(), this.s);
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        cf7 onDoubleClickListener = getOnDoubleClickListener();
        return onDoubleClickListener != null && ((Boolean) onDoubleClickListener.invoke(this)).booleanValue();
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        cf7 onDoubleClickListener;
        return motionEvent.getActionMasked() == 1 && (onDoubleClickListener = getOnDoubleClickListener()) != null && ((Boolean) onDoubleClickListener.invoke(this)).booleanValue();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Layout layout = getLayout();
        if (layout == null) {
            return;
        }
        Rect rect = this.r;
        if (!rect.isEmpty()) {
            canvas.clipRect(rect);
        }
        Drawable drawable = this.o;
        int iSave = canvas.save();
        if (drawable != null) {
            canvas.translate(this.j, this.l);
            drawable.draw(canvas);
        }
        canvas.translate(this.j + this.k, 0.0f);
        layout.draw(canvas);
        yv7 highlightTextHelper = getHighlightTextHelper();
        kbc kbcVarH = pq3.j.h(this);
        ny8 ny8Var = highlightTextHelper.c;
        ny8 ny8Var2 = highlightTextHelper.b;
        TextPaint textPaint = (TextPaint) ny8Var.getValue();
        textPaint.set(layout.getPaint());
        textPaint.setColor(kbcVarH.getText().g);
        ((Paint) ny8Var2.getValue()).setColor(kbcVarH.h().a);
        for (xv7 xv7Var : highlightTextHelper.a) {
            float f = xv7Var.c;
            float f2 = xv7Var.d;
            Canvas canvas2 = canvas;
            canvas2.drawRect(f, f2, f + xv7Var.f, f2 + xv7Var.g, (Paint) ny8Var2.getValue());
            canvas2.drawText(xv7Var.b, xv7Var.c, xv7Var.e, textPaint);
            canvas = canvas2;
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        View.OnLongClickListener onLongClickListener = this.c;
        if (onLongClickListener == null) {
            return true;
        }
        onLongClickListener.onLongClick(view);
        return true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        j();
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return performClick();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.j = this.i == -1 ? getPaddingRight() : getPaddingLeft();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        at3 at3Var = this.h;
        if ((getText() instanceof Spannable) && this.m && at3Var != null) {
            CharSequence text = getText();
            Spannable spannableString = text instanceof Spannable ? (Spannable) text : null;
            if (spannableString == null) {
                spannableString = new SpannableString(getText());
            }
            Layout layout = getLayout();
            if (motionEvent.getAction() == 0) {
                at3Var.d = new xp9(new WeakReference(this), 11, layout);
                at3Var.e = spannableString;
            }
            if (at3Var.l.onTouchEvent(motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
    }

    public final void setLayout(aka akaVar) {
        aka akaVar2 = this.n;
        if (akaVar2 != null) {
            akaVar2.e.remove(this);
        }
        this.n = akaVar;
        akaVar.e.add(this);
        this.i = akaVar.b().getParagraphDirection(0);
        akaVar.b().getLineRight(0);
        CharSequence text = getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            this.e.c(spannable);
        }
        osk.b(this, akaVar.b(), this.s);
        this.l = akaVar.b().getTopPadding();
        requestLayout();
        invalidate();
        post(new k36(24, this));
    }

    public final void setLinkListener(o59 o59Var) {
        this.f = o59Var;
        this.e.a = o59Var;
    }

    public final void setLinkLongClickListener(zs3 zs3Var) {
        this.d = zs3Var;
    }

    public final void setLinksClickable(boolean z) {
        this.m = z;
    }

    public final void setMaxHeightForClip(int i) {
        this.q = i;
    }

    public final void setMovementMethod(at3 at3Var) {
        this.h = at3Var;
    }

    public final void setOnDoubleClickListener(cf7 cf7Var) {
        this.g.B(this, t[0], cf7Var);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.c = onLongClickListener;
    }

    public final void setSingleClickAction(Runnable runnable) {
        at3 at3Var = this.h;
        if (runnable == null) {
            if (at3Var != null) {
                at3Var.h = null;
            }
        } else if (at3Var != null) {
            at3Var.h = new bka(runnable, 0);
        }
    }

    public final void setStartDrawable(Drawable drawable) {
        this.o = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        if (drawable instanceof AnimationDrawable) {
            post(new k36(25, (AnimationDrawable) drawable));
        }
        requestLayout();
    }

    public final void setStartDrawablePadding(int i) {
        if (this.p == i) {
            return;
        }
        this.p = i;
        requestLayout();
    }

    public final void setTextColors(xac xacVar) {
        TextPaint paint;
        wac wacVar = xacVar.b;
        int i = wacVar.a;
        Layout layout = getLayout();
        if (layout != null && (paint = layout.getPaint()) != null) {
            paint.setColor(wacVar.d);
        }
        CharSequence text = getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        if (spanned != null) {
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            if (spans != null) {
                for (Object obj : spans) {
                    if (obj instanceof au7) {
                        ((au7) obj).c = i;
                    } else if (obj instanceof fga) {
                        ((fga) obj).b = i;
                    } else if (obj instanceof k59) {
                        ((k59) obj).a = i;
                    } else if (obj instanceof n59) {
                        ((n59) obj).b = i;
                    } else if (obj instanceof y2e) {
                        ((y2e) obj).d(xacVar);
                    } else if (obj instanceof rud) {
                        ((rud) obj).b = i;
                    }
                }
            }
        }
        invalidate();
    }

    public final void setTryToSingleClickAction(Runnable runnable) {
        at3 at3Var = this.h;
        if (at3Var != null) {
            at3Var.j = runnable;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable instanceof Animatable) || super.verifyDrawable(drawable);
    }
}
