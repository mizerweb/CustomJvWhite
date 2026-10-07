package defpackage;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class p64 extends v7g {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ p64(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.v7g
    public final void i(s8g s8gVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((h64) obj).a(new ex8(this, s8gVar));
                return;
            case 1:
                ((sqb) obj).f(new e17(s8gVar, 1));
                return;
            case 2:
                b8g b8gVar = new b8g(s8gVar);
                s8gVar.c(b8gVar);
                try {
                    ((u8g) obj).c(b8gVar);
                    return;
                } catch (Throwable th) {
                    iwl.a(th);
                    if (b8gVar.d(th)) {
                        return;
                    }
                    tre.s0(th);
                    return;
                }
            case 3:
                try {
                    Object obj2 = ((qah) obj).get();
                    if (obj2 == null) {
                        throw gd6.a("Supplier returned a null Throwable.");
                    }
                    fd6 fd6Var = gd6.a;
                    th = (Throwable) obj2;
                    l66.a(th, s8gVar);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    iwl.a(th);
                }
                break;
            case 4:
                j66 j66Var = new j66(vm9.c);
                s8gVar.c(j66Var);
                if (j66Var.a()) {
                    return;
                }
                try {
                    Object objCall = ((Callable) obj).call();
                    Objects.requireNonNull(objCall, "The callable returned a null value");
                    if (j66Var.a()) {
                        return;
                    }
                    s8gVar.a(objCall);
                    return;
                } catch (Throwable th3) {
                    iwl.a(th3);
                    if (j66Var.a()) {
                        tre.s0(th3);
                        return;
                    } else {
                        s8gVar.onError(th3);
                        return;
                    }
                }
            default:
                s8gVar.c(l66.a);
                s8gVar.a(obj);
                return;
        }
    }
}
