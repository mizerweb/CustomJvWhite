package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.sdk.uikit.common.span.FitFontImageSpan;

/* JADX INFO: loaded from: classes.dex */
public final class ow6 implements Drawable.Callback {
    public final WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap();
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final ArrayList d = new ArrayList();
    public final /* synthetic */ FitFontImageSpan e;

    public ow6(FitFontImageSpan fitFontImageSpan, WeakHashMap weakHashMap) {
        this.e = fitFontImageSpan;
        this.a = weakHashMap;
    }

    public final void a() {
        this.c.set(false);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        FitFontImageSpan fitFontImageSpan;
        ArrayList arrayList;
        Object[] spans;
        if (this.c.compareAndSet(false, true)) {
            WeakHashMap weakHashMap = this.a;
            Iterator it = weakHashMap.keySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                fitFontImageSpan = this.e;
                arrayList = this.d;
                if (!zHasNext) {
                    break;
                }
                Object next = it.next();
                View view = (View) next;
                spans = null;
                Object[] spans2 = null;
                if (view instanceof TextView) {
                    TextView textView = (TextView) view;
                    ArrayList arrayList2 = soh.a;
                    CharSequence text = textView.getText();
                    Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
                    if (spanned != null && (spans = spanned.getSpans(0, textView.length(), fitFontImageSpan.getClass())) != null) {
                        int length = spans.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                if (spans[i] == fitFontImageSpan) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                    arrayList.add(next);
                    break;
                } else {
                    if (view instanceof trb) {
                        CharSequence spannableText = ((trb) view).getSpannableText();
                        if (spannableText != null) {
                            int length2 = spannableText.length();
                            try {
                                Spanned spanned2 = spannableText instanceof Spanned ? (Spanned) spannableText : null;
                                if (spanned2 != null) {
                                    spans2 = spanned2.getSpans(0, length2, FitFontImageSpan.class);
                                }
                            } catch (Throwable unused) {
                            }
                            if (spans2 != null) {
                                int length3 = spans2.length;
                                int i2 = 0;
                                while (true) {
                                    if (i2 < length3) {
                                        if (spans2[i2] == fitFontImageSpan) {
                                            break;
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                            }
                        }
                        arrayList.add(next);
                        break;
                        break;
                    }
                }
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                fitFontImageSpan.detach((View) arrayList.get(i3));
            }
            arrayList.clear();
            if (weakHashMap.keySet().isEmpty()) {
                a();
                return;
            }
            for (View view2 : weakHashMap.keySet()) {
                if (!Looper.getMainLooper().isCurrentThread()) {
                    Handler handler = view2.getHandler();
                    if (handler != null) {
                        handler.postAtFrontOfQueue(new lw6(fitFontImageSpan, view2, this, 0));
                    } else {
                        view2.post(new lw6(fitFontImageSpan, view2, this, 1));
                    }
                } else if (fitFontImageSpan.shouldInvalidateSpan) {
                    bdc.a(view2, new xz8(view2, view2, fitFontImageSpan, this));
                } else {
                    view2.invalidate();
                    a();
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        FitFontImageSpan fitFontImageSpan = this.e;
        boolean z = fitFontImageSpan.shouldInvalidateSpan;
        WeakHashMap weakHashMap = this.a;
        if (!z) {
            View view = (View) ww3.s1(weakHashMap.keySet());
            if (view != null) {
                view.postDelayed(runnable, j - SystemClock.uptimeMillis());
                return;
            }
            return;
        }
        d86 d86Var = new d86(runnable, this, fitFontImageSpan);
        this.b.put(runnable, d86Var);
        View view2 = (View) ww3.s1(weakHashMap.keySet());
        if (view2 != null) {
            view2.postDelayed(d86Var, j - SystemClock.uptimeMillis());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        boolean z = this.e.shouldInvalidateSpan;
        WeakHashMap weakHashMap = this.a;
        if (!z) {
            for (View view : weakHashMap.keySet()) {
                if (Looper.getMainLooper().isCurrentThread()) {
                    view.removeCallbacks(runnable);
                } else {
                    Handler handler = view.getHandler();
                    if (handler != null) {
                        handler.postAtFrontOfQueue(new mw6(view, runnable, 1));
                    } else {
                        view.post(new nw6(view, runnable, 1));
                    }
                }
            }
            return;
        }
        Runnable runnable2 = (Runnable) this.b.remove(runnable);
        for (View view2 : weakHashMap.keySet()) {
            if (Looper.getMainLooper().isCurrentThread()) {
                view2.removeCallbacks(runnable2);
            } else {
                Handler handler2 = view2.getHandler();
                if (handler2 != null) {
                    handler2.postAtFrontOfQueue(new mw6(view2, runnable2, 0));
                } else {
                    view2.post(new nw6(view2, runnable2, 0));
                }
            }
        }
    }
}
