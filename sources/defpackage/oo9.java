package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.appcompat.widget.AppCompatTextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class oo9 extends AppCompatTextView {
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (e9i.t0(R.attr.textAppearanceLineHeightEnabled, context, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, k3e.v);
            Context context2 = getContext();
            int[] iArr = {1, 2};
            int iS = -1;
            for (int i2 = 0; i2 < 2 && iS < 0; i2++) {
                iS = cqk.s(context2, typedArrayObtainStyledAttributes, iArr[i2], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iS >= 0) {
                setLineHeight(iS);
            }
        }
    }
}
