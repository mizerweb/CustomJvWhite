package defpackage;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ac4 implements InputFilter {
    public final /* synthetic */ int a;

    public /* synthetic */ ac4(int i) {
        this.a = i;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        switch (this.a) {
            case 0:
                return bc4.b.b(charSequence) ? charSequence : "";
            default:
                zv8[] zv8VarArr = tha.p1;
                return "";
        }
    }
}
