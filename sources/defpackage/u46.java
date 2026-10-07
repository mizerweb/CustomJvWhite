package defpackage;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: loaded from: classes3.dex */
public final class u46 implements InputFilter {
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        Spanned spanned2 = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned2 == null) {
            return "";
        }
        int length = spanned2.length() + 1;
        return spanned2.nextSpanTransition(0, length, geg.class) < length ? charSequence : "";
    }
}
