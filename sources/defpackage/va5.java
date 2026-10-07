package defpackage;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes3.dex */
public final class va5 {
    public static final ThreadLocal b = new ThreadLocal();
    public final TextPaint a;

    public va5() {
        TextPaint textPaint = new TextPaint();
        this.a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
