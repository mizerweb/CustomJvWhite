package defpackage;

import android.graphics.Rect;
import android.text.Spannable;
import android.text.method.TransformationMethod;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class r59 implements TransformationMethod {
    public static final s8 d = new s8();
    public o59 a;
    public final boolean b;
    public final af7 c;

    public r59(o59 o59Var, af7 af7Var, int i) {
        o59Var = (i & 1) != 0 ? null : o59Var;
        boolean z = (i & 2) != 0;
        this.a = o59Var;
        this.b = z;
        this.c = af7Var;
    }

    public static void a(CharSequence charSequence) {
        Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannable != null) {
            Object[] spans = spannable.getSpans(0, spannable.length(), Object.class);
            if (spans != null) {
                for (Object obj : spans) {
                    if (obj instanceof n59) {
                        ((n59) obj).a = null;
                    } else if (obj instanceof rud) {
                        ((rud) obj).d = null;
                    } else if (obj instanceof au7) {
                        ((au7) obj).b = null;
                    } else if (obj instanceof e01) {
                        ((e01) obj).c = null;
                    } else if (obj instanceof fga) {
                        ((fga) obj).c = null;
                    } else if (obj instanceof k59) {
                        ((k59) obj).d = null;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(View view, String str, t59 t59Var, ClickableSpan clickableSpan) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        s8 s8Var = d;
        if (jCurrentTimeMillis - s8Var.a > 300) {
            s8Var.a = jCurrentTimeMillis;
            o59 o59Var = this.a;
            if (o59Var == null) {
                o59Var = view instanceof o59 ? (o59) view : null;
            }
            if (o59Var != null) {
                o59Var.a(str, t59Var, clickableSpan);
            }
        }
    }

    public final void c(CharSequence charSequence) {
        Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannable != null) {
            Object[] spans = spannable.getSpans(0, spannable.length(), Object.class);
            if (spans != null) {
                for (Object obj : spans) {
                    d(obj);
                }
            }
        }
    }

    public final void d(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof n59) {
            ((n59) obj).a = this.a;
            return;
        }
        if (obj instanceof rud) {
            ((rud) obj).d = new p59(this);
            return;
        }
        if (obj instanceof au7) {
            ((au7) obj).b = new m59(this, obj);
            return;
        }
        if (obj instanceof e01) {
            ((e01) obj).c = new m59(this, obj);
        } else if (obj instanceof fga) {
            ((fga) obj).c = new q59(this);
        } else if (obj instanceof k59) {
            ((k59) obj).d = new m59(this, obj);
        }
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        Spannable spannableK = xr8.k(charSequence, ((Number) this.c.invoke()).intValue(), this.b, new nv4(26, this));
        return spannableK == null ? charSequence : spannableK;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }
}
