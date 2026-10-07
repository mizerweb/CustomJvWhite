package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes4.dex */
public final class ylh extends mwl {
    public final /* synthetic */ Context a;
    public final /* synthetic */ TextPaint b;
    public final /* synthetic */ mwl c;
    public final /* synthetic */ zlh d;

    public ylh(zlh zlhVar, Context context, TextPaint textPaint, mwl mwlVar) {
        this.d = zlhVar;
        this.a = context;
        this.b = textPaint;
        this.c = mwlVar;
    }

    @Override // defpackage.mwl
    public final void b(int i) {
        this.c.b(i);
    }

    @Override // defpackage.mwl
    public final void c(Typeface typeface, boolean z) {
        this.d.g(this.a, this.b, typeface);
        this.c.c(typeface, z);
    }
}
