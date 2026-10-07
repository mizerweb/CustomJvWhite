package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k4c implements cf7 {
    public final /* synthetic */ o4c a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ SpannableStringBuilder f;
    public final /* synthetic */ ufe g;
    public final /* synthetic */ ufe h;

    public /* synthetic */ k4c(o4c o4cVar, long j, int i, boolean z, int i2, SpannableStringBuilder spannableStringBuilder, ufe ufeVar, ufe ufeVar2) {
        this.a = o4cVar;
        this.b = j;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = spannableStringBuilder;
        this.g = ufeVar;
        this.h = ufeVar2;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        Object poeVar;
        SpannableStringBuilder spannableStringBuilder = this.f;
        ufe ufeVar = this.g;
        ufe ufeVar2 = this.h;
        o4c o4cVar = this.a;
        Context context = o4cVar.a;
        xm xmVar = (xm) o4cVar.b.getValue();
        long j = this.b;
        r8e r8eVar = new r8e(xmVar.j(j));
        int i = this.e;
        xx6 xx6VarI = e9i.I(new cb9(r8eVar, i, 1));
        int i2 = this.c;
        int iD = qt4.D(i2);
        gm emVar = fm.a;
        if (iD == 0) {
            try {
                poeVar = ((f66) o4cVar.d.getValue()).c(spannableStringBuilder.subSequence(ufeVar.a, ufeVar2.a).toString());
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            Drawable drawable = (Drawable) (poeVar instanceof poe ? null : poeVar);
            if (drawable != null) {
                emVar = new em(drawable);
            }
        } else if (iD != 1) {
            ore.o();
            return null;
        }
        qn qnVar = new qn(j, i, this.d && i2 == 1, emVar, o4cVar.i, context, xx6VarI, ((n0c) ((xhh) o4cVar.c.getValue())).c());
        qnVar.setBounds(0, 0, i, i);
        return qnVar;
    }
}
