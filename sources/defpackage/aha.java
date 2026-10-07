package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class aha implements TextWatcher {
    public boolean a;
    public final /* synthetic */ tha b;

    public aha(tha thaVar) {
        this.b = thaVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable != null) {
            ysk.b(editable);
        }
        tha thaVar = this.b;
        mjg mjgVar = thaVar.I;
        Integer numValueOf = Integer.valueOf(thaVar.f.getSelectionEnd());
        mjgVar.getClass();
        Object[] spans = null;
        mjgVar.j(null, numValueOf);
        thaVar.G.setValue(editable != null ? lvb.d0(editable) : null);
        if (editable == null || r5h.X0(editable) || !this.a) {
            thaVar.p(thaVar.getCurrentTheme());
        }
        if (editable != null) {
            try {
                spans = editable.getSpans(0, editable.length(), hi.class);
            } catch (Throwable unused) {
            }
            if (spans == null) {
                spans = new hi[0];
            }
            for (hi hiVar : (hi[]) spans) {
                ((rn) hiVar).b.start();
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a = !(charSequence == null || r5h.X0(charSequence));
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
