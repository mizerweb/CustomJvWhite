package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import one.me.rlottie.RLottieDrawable;

/* JADX INFO: loaded from: classes3.dex */
public final class dm {
    public final bm a;
    public final Context b;
    public final lk9 c;

    public dm(bm bmVar, Context context, lk9 lk9Var) {
        this.a = bmVar;
        this.b = context;
        this.c = lk9Var;
    }

    public final qn a(long j, String str, String str2, Drawable drawable, int i, int i2) {
        qn qnVar = new qn(j, i, true, drawable == null ? fm.a : new em(drawable), this.a, this.b, p90.a(new yl(i, i2, j, str2, str)), this.c);
        qnVar.setBounds(0, 0, i, i);
        RLottieDrawable rLottieDrawable = qnVar.o;
        if (rLottieDrawable != null) {
            rLottieDrawable.setAutoRepeat(i2);
        }
        return qnVar;
    }

    public final CharSequence b(long j, String str, String str2, h56 h56Var, CharSequence charSequence, int i) {
        if (charSequence == null || charSequence.length() == 0) {
            return "";
        }
        qn qnVar = new qn(j, i, true, new em(h56Var.f), this.a, this.b, p90.a(new yl(i, str.length() > 0 ? 1 : 3, j, str2, str)), this.c);
        qnVar.setBounds(0, 0, i, i);
        RLottieDrawable rLottieDrawable = qnVar.o;
        if (rLottieDrawable != null) {
            rLottieDrawable.setAutoRepeat(1);
        }
        rn rnVar = new rn(j, qnVar);
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(rnVar, 0, charSequence.length(), 33);
        return spannableString;
    }
}
