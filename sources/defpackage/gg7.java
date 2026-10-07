package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class gg7 implements Callable, qah, sf7 {
    public final Object a;

    public gg7(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public final Object mo41apply(Object obj) {
        return this.a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a;
    }

    @Override // defpackage.qah
    public final Object get() {
        return this.a;
    }
}
