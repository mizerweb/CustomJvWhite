package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: loaded from: classes2.dex */
public final class cmc implements LineHeightSpan {
    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (i2 >= charSequence.length() || charSequence.charAt(i2 - 1) != '\n') {
            return;
        }
        fontMetricsInt.bottom = zo5.b(8.0f, yl5.d().getDisplayMetrics().density, fontMetricsInt.bottom);
        fontMetricsInt.descent = zo5.b(8.0f, yl5.d().getDisplayMetrics().density, fontMetricsInt.descent);
    }
}
