package defpackage;

import android.text.Spannable;
import android.text.Spanned;
import android.util.TypedValue;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class b56 {
    public final ny8 a;
    public final ny8 b;

    public b56(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    public final f66 a() {
        return (f66) this.a.getValue();
    }

    public final CharSequence b(long j, String str, String str2, CharSequence charSequence, int i) {
        Object[] spans;
        CharSequence charSequenceC = c(i, charSequence);
        int length = charSequenceC.length();
        try {
            Spanned spanned = charSequenceC instanceof Spanned ? (Spanned) charSequenceC : null;
            spans = spanned != null ? spanned.getSpans(0, length, h56.class) : null;
        } catch (Throwable unused) {
        }
        h56[] h56VarArr = (h56[]) spans;
        h56 h56Var = h56VarArr != null ? (h56) a.b1(h56VarArr) : null;
        return (h56Var == null || str == null) ? charSequenceC : ((dm) this.b.getValue()).b(j, str, str2, h56Var, charSequence, i);
    }

    public final CharSequence c(int i, CharSequence charSequence) {
        Spannable spannableF = a().f(i, charSequence);
        return spannableF == null ? "" : spannableF;
    }

    public final CharSequence d(CharSequence charSequence) {
        f66 f66VarA = a();
        f66VarA.e.getClass();
        Spannable spannableF = f66VarA.f(gm0.K(TypedValue.applyDimension(2, 20.0f, yl5.d().getDisplayMetrics())), charSequence);
        return spannableF == null ? "" : spannableF;
    }
}
