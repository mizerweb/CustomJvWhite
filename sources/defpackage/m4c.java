package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public final class m4c implements TextWatcher {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public m4c(r5c r5cVar) {
        this.b = r5cVar;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = this.a;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 0:
                ((i8b) this.b).a((((long) (i + i2)) << 32) | (((long) (i3 - i2)) & 4294967295L));
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        x0c x0cVar;
        String str;
        String strE;
        switch (this.a) {
            case 0:
                break;
            default:
                r5c r5cVar = (r5c) this.b;
                EditText editText = r5cVar.i;
                if (i3 > 1 && !r5cVar.e && (x0cVar = r5cVar.c) != null && (str = x0cVar.a) != null) {
                    String strValueOf = String.valueOf(charSequence);
                    q5c phoneFormatterProvider = r5cVar.getPhoneFormatterProvider();
                    if (phoneFormatterProvider != null && (strE = phoneFormatterProvider.e(str, strValueOf)) != null) {
                        strValueOf = strE;
                    }
                    editText.removeTextChangedListener(r5cVar.j);
                    r5cVar.setText(strValueOf);
                    editText.addTextChangedListener(r5cVar.j);
                    break;
                }
                break;
        }
    }

    public m4c(i8b i8bVar, o4c o4cVar) {
        this.b = i8bVar;
    }
}
