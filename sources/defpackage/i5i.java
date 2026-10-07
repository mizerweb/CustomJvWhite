package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class i5i extends uk8 {
    public final Callable c;
    public final /* synthetic */ j5i d;

    public i5i(j5i j5iVar, Callable callable) {
        this.d = j5iVar;
        callable.getClass();
        this.c = callable;
    }

    @Override // defpackage.uk8
    public final void a(Throwable th) {
        this.d.n(th);
    }

    @Override // defpackage.uk8
    public final void b(Object obj) {
        this.d.m(obj);
    }

    @Override // defpackage.uk8
    public final boolean d() {
        return this.d.isDone();
    }

    @Override // defpackage.uk8
    public final Object e() {
        return this.c.call();
    }

    @Override // defpackage.uk8
    public final String f() {
        return this.c.toString();
    }
}
