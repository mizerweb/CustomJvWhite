package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes2.dex */
public final class k9b implements ck2, qbj {
    public final ek2 a;
    public final /* synthetic */ l9b b;

    public k9b(l9b l9bVar, ek2 ek2Var) {
        this.b = l9bVar;
        this.a = ek2Var;
    }

    @Override // defpackage.qbj
    public final void a(gcf gcfVar, int i) {
        this.a.a(gcfVar, i);
    }

    @Override // defpackage.ck2
    public final c5b e(Object obj, tf7 tf7Var) {
        l9b l9bVar = this.b;
        dk2 dk2Var = new dk2(l9bVar, this);
        c5b c5bVarG = this.a.G((sbi) obj, dk2Var);
        if (c5bVarG != null) {
            l9b.j.set(l9bVar, null);
        }
        return c5bVarG;
    }

    @Override // defpackage.lq4
    public final vt4 getContext() {
        return this.a.e;
    }

    @Override // defpackage.ck2
    public final boolean isActive() {
        return this.a.t() instanceof hib;
    }

    @Override // defpackage.ck2
    public final boolean isCancelled() {
        return this.a.t() instanceof ok2;
    }

    @Override // defpackage.ck2
    public final void j(Object obj, tf7 tf7Var) throws IllegalAccessException, DispatchException, InvocationTargetException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l9b.j;
        l9b l9bVar = this.b;
        atomicReferenceFieldUpdater.set(l9bVar, null);
        lh9 lh9Var = new lh9(l9bVar, this);
        ek2 ek2Var = this.a;
        ek2Var.D((sbi) obj, ek2Var.c, new dk2(0, lh9Var));
    }

    @Override // defpackage.ck2
    public final void m(Object obj) throws DispatchException {
        this.a.m(obj);
    }

    @Override // defpackage.lq4
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
