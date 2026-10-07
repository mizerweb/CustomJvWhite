package defpackage;

import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class arl {
    public static void a(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    public static final Object b(zo7 zo7Var) {
        hv8 hv8Var = (hv8) zo7Var.b;
        w65 w65Var = new w65();
        w65Var.a = hv8Var;
        w65Var.b = w65Var;
        hu4 hu4Var = hu4.a;
        w65Var.c = hu4Var;
        while (true) {
            Object obj = w65Var.c;
            lq4 lq4Var = w65Var.b;
            if (lq4Var == null) {
                ch3.d0(obj);
                return obj;
            }
            if (hu4Var.equals(obj)) {
                try {
                    hv8 hv8Var2 = w65Var.a;
                    e9i.l(3, hv8Var2);
                    hv8 hv8Var3 = new hv8(hv8Var2.e, lq4Var);
                    hv8Var3.d = w65Var;
                    Object objInvokeSuspend = hv8Var3.invokeSuspend(sbi.a);
                    if (objInvokeSuspend != hu4Var) {
                        lq4Var.resumeWith(objInvokeSuspend);
                    }
                } catch (Throwable th) {
                    lq4Var.resumeWith(new poe(th));
                }
            } else {
                w65Var.c = hu4Var;
                lq4Var.resumeWith(obj);
            }
        }
    }
}
