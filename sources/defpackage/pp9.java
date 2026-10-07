package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class pp9 extends v7g {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ pp9(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.v7g
    public final void i(s8g s8gVar) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((ip9) obj2).a(new np9(s8gVar, 1, obj));
                break;
            case 1:
                ((v7g) obj2).h(new ewe(this, 2, s8gVar));
                break;
            case 2:
                ((v7g) obj2).h(new o72(s8gVar, 4, (rj5) obj));
                break;
            case 3:
                ((e8g) obj2).h(new o72(s8gVar, 6, (due) obj));
                break;
            case 4:
                hqb hqbVar = new hqb(s8gVar);
                s8gVar.c(hqbVar);
                oo5.d((AtomicReference) hqbVar.d, ((z2f) obj).c(hqbVar, 60L, TimeUnit.SECONDS));
                ((pp9) obj2).h(hqbVar);
                break;
            default:
                z9g[] z9gVarArr = (z9g[]) obj2;
                int length = z9gVarArr.length;
                if (length == 1) {
                    ((v7g) z9gVarArr[0]).h(new cmf(s8gVar, new c7k(25, this), false, 2));
                } else {
                    hrb hrbVar = new hrb(s8gVar, length, (sf7) obj);
                    s8gVar.c(hrbVar);
                    for (int i2 = 0; i2 < length; i2++) {
                        if (!(hrbVar.get() <= 0)) {
                            z9g z9gVar = z9gVarArr[i2];
                            if (z9gVar == null) {
                                hrbVar.a(i2, new NullPointerException("One of the sources is null"));
                            } else {
                                ((v7g) z9gVar).h(((iag[]) hrbVar.d)[i2]);
                            }
                        }
                    }
                }
                break;
        }
    }
}
