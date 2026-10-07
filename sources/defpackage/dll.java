package defpackage;

import android.text.Spannable;
import android.text.SpannableString;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dll {
    public static Spannable a(CharSequence charSequence) {
        CharSequence charSequenceY1 = r5h.y1(charSequence);
        Spannable spannableString = charSequenceY1 instanceof Spannable ? (Spannable) charSequenceY1 : null;
        if (spannableString == null) {
            spannableString = new SpannableString(charSequenceY1);
        }
        int iU0 = r5h.U0(charSequenceY1, '\n', 0, 6);
        while (iU0 >= 0) {
            int i = iU0 + 1;
            spannableString.setSpan(new cmc(), iU0, i, 33);
            iU0 = r5h.U0(charSequenceY1, '\n', i, 4);
        }
        return spannableString;
    }

    public static nnd b(String str) {
        y1 y1Var = new y1(0, nnd.e);
        while (y1Var.hasNext()) {
            nnd nndVar = (nnd) y1Var.next();
            if (nndVar.a.equals(str)) {
                return nndVar;
            }
        }
        ore.f("Collection contains no element matching the predicate.");
        return null;
    }
}
