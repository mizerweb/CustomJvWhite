package defpackage;

import android.text.TextPaint;
import android.util.LruCache;

/* JADX INFO: loaded from: classes.dex */
public final class bnh extends LruCache {
    public final /* synthetic */ cnh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnh(cnh cnhVar) {
        super(3);
        this.a = cnhVar;
    }

    @Override // android.util.LruCache
    public final Object create(Object obj) {
        anh anhVar = (anh) obj;
        noh nohVar = anhVar.a;
        int i = anhVar.b;
        bx5 bx5Var = anhVar.c;
        TextPaint textPaint = new TextPaint(1);
        noh.d(nohVar, this.a.a, textPaint, null, bx5Var, 4);
        textPaint.setColor(i);
        return textPaint;
    }
}
