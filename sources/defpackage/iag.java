package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class iag extends AtomicReference implements s8g {
    public final hrb a;
    public final int b;

    public iag(hrb hrbVar, int i) {
        this.a = hrbVar;
        this.b = i;
    }

    @Override // defpackage.s8g
    public final void a(Object obj) {
        hrb hrbVar = this.a;
        s8g s8gVar = (s8g) hrbVar.b;
        Object[] objArr = (Object[]) hrbVar.e;
        objArr[this.b] = obj;
        if (hrbVar.decrementAndGet() == 0) {
            try {
                Object objMo41apply = ((sf7) hrbVar.c).mo41apply(objArr);
                Objects.requireNonNull(objMo41apply, "The zipper returned a null value");
                s8gVar.a(objMo41apply);
            } catch (Throwable th) {
                iwl.a(th);
                s8gVar.onError(th);
            }
        }
    }

    @Override // defpackage.s8g
    public final void c(ko5 ko5Var) {
        oo5.e(this, ko5Var);
    }

    @Override // defpackage.s8g
    public final void onError(Throwable th) {
        this.a.a(this.b, th);
    }
}
