package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class ege extends fs0 {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ wfe b;
    public final /* synthetic */ sgg c;

    public ege(AtomicBoolean atomicBoolean, wfe wfeVar, sgg sggVar) {
        this.a = atomicBoolean;
        this.b = wfeVar;
        this.c = sggVar;
    }

    @Override // defpackage.fs0
    public final void a() throws IllegalAccessException, InvocationTargetException {
        this.a.set(true);
        oof oofVar = (oof) this.b.a;
        if (oofVar != null) {
            oofVar.e();
        }
        this.c.b(null);
    }
}
