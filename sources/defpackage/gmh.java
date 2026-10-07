package defpackage;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class gmh {
    public float c;
    public float d;
    public final WeakReference f;
    public zlh g;
    public final TextPaint a = new TextPaint(1);
    public final aq3 b = new aq3(1, this);
    public boolean e = true;

    public gmh(fmh fmhVar) {
        this.f = new WeakReference(null);
        this.f = new WeakReference(fmhVar);
    }

    public final void a(String str) {
        TextPaint textPaint = this.a;
        this.c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.e = false;
    }

    public final void b(zlh zlhVar, Context context) {
        if (this.g != zlhVar) {
            this.g = zlhVar;
            WeakReference weakReference = this.f;
            if (zlhVar != null) {
                TextPaint textPaint = this.a;
                aq3 aq3Var = this.b;
                zlhVar.f(context, textPaint, aq3Var);
                fmh fmhVar = (fmh) weakReference.get();
                if (fmhVar != null) {
                    textPaint.drawableState = fmhVar.getState();
                }
                zlhVar.e(context, textPaint, aq3Var);
                this.e = true;
            }
            fmh fmhVar2 = (fmh) weakReference.get();
            if (fmhVar2 != null) {
                fmhVar2.a();
                fmhVar2.onStateChange(fmhVar2.getState());
            }
        }
    }
}
