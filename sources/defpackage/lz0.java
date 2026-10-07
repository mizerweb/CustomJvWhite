package defpackage;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public final class lz0 extends CountDownLatch implements s8g, m64, mp9 {
    public Object a;
    public Throwable b;
    public ko5 c;
    public volatile boolean d;

    @Override // defpackage.s8g
    public final void a(Object obj) {
        this.a = obj;
        countDown();
    }

    @Override // defpackage.m64
    public final void b() {
        countDown();
    }

    @Override // defpackage.s8g
    public final void c(ko5 ko5Var) {
        this.c = ko5Var;
        if (this.d) {
            ko5Var.dispose();
        }
    }

    @Override // defpackage.s8g
    public final void onError(Throwable th) {
        this.b = th;
        countDown();
    }
}
