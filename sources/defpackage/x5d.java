package defpackage;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: loaded from: classes4.dex */
public final class x5d implements InputFilter {
    public final ifh a = new ifh(new gvc(13));

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (charSequence == null || charSequence.length() == 0 || charSequence.length() <= 1) {
            return null;
        }
        return r5h.y1(((lge) this.a.getValue()).d(" ", charSequence.subSequence(i, i2))).toString();
    }
}
