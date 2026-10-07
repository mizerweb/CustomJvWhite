package defpackage;

import android.content.Context;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ap3 extends er {
    public int e;

    public ap3(Context context) {
        super(context, null, R.attr.checkboxStyle);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        return super.getCompoundPaddingLeft() + this.e;
    }

    public final int getPaddingBetweenCheckbox() {
        return this.e;
    }

    public final void setPaddingBetweenCheckbox(int i) {
        this.e = i;
        invalidate();
        requestLayout();
    }
}
