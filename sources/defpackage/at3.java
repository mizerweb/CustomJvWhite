package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
public final class at3 extends LinkMovementMethod {
    public static final String m = zfe.a(at3.class).h();
    public final zs3 a;
    public final RectF b = new RectF();
    public String c;
    public xp9 d;
    public Spannable e;
    public ClickableSpan f;
    public boolean g;
    public af7 h;
    public boolean i;
    public Runnable j;
    public final pi9 k;
    public final GestureDetector l;

    public at3(Context context, zs3 zs3Var) {
        this.a = zs3Var;
        pi9 pi9Var = new pi9(8, this);
        this.k = pi9Var;
        this.l = new GestureDetector(context, pi9Var);
    }

    public static final ClickableSpan a(at3 at3Var, xp9 xp9Var, Spannable spannable, MotionEvent motionEvent) {
        View view;
        Layout layout;
        Object poeVar;
        RectF rectF = at3Var.b;
        if (xp9Var == null || (view = (View) ((WeakReference) xp9Var.b).get()) == null || (layout = (Layout) xp9Var.c) == null) {
            return null;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int paddingLeft = x - view.getPaddingLeft();
        int paddingTop = y - view.getPaddingTop();
        int scrollX = view.getScrollX() + paddingLeft;
        int scrollY = view.getScrollY() + paddingTop;
        int lineForVertical = layout.getLineForVertical(scrollY);
        float f = scrollX;
        try {
            int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f);
            rectF.left = layout.getLineLeft(lineForVertical);
            rectF.top = layout.getLineTop(lineForVertical);
            rectF.right = layout.getLineMax(lineForVertical) + rectF.left;
            rectF.bottom = layout.getLineBottom(lineForVertical);
            poeVar = rectF.contains(f, (float) scrollY) ? (ClickableSpan) a.b1(spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class)) : null;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            gm0.V(m, "findClickableSpanUnderTouch failed:", thA);
        }
        return (ClickableSpan) (poeVar instanceof poe ? null : poeVar);
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.d = new xp9(new WeakReference(textView), 11, textView.getLayout());
            this.e = spannable;
        }
        return this.l.onTouchEvent(motionEvent);
    }
}
