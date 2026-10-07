package defpackage;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextWatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class jgf implements TextWatcher {
    public final wga a;
    public final qma b;
    public CharSequence c;

    public jgf(wga wgaVar, qma qmaVar) {
        this.a = wgaVar;
        this.b = qmaVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            this.c = null;
            this.b.invoke(charSequence);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (((Boolean) this.a.invoke()).booleanValue()) {
            return;
        }
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned != null && i >= 0 && i < spanned.length()) {
            Spanned spanned2 = (Spanned) charSequence;
            if (spanned2.charAt(i) == '\n' && i2 == 0 && i3 == 1) {
                if (i == spanned2.length() - 1) {
                    this.c = lvb.d0(spanned);
                    return;
                }
                for (y2e y2eVar : (y2e[]) spanned.getSpans(i, i, y2e.class)) {
                    if (spanned.getSpanEnd(y2eVar) == i) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spanned);
                        spannableStringBuilder.delete(i, i + 1);
                        this.c = spannableStringBuilder;
                        return;
                    }
                }
            }
        }
    }
}
