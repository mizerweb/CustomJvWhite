package defpackage;

import android.R;
import android.content.Context;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public class p1c extends EditText {
    public final boolean a;

    public p1c(Context context, int i) {
        super(context, null, R.attr.editTextStyle, 0);
        f55.f(this, pq3.j.e(context).m());
        this.a = true;
        setClickable(true);
        setLongClickable(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setCursorVisible(true);
        setInputType(131073);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean getDefaultEditable() {
        return this.a;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.a) {
            super.setText(charSequence, bufferType);
        }
    }
}
