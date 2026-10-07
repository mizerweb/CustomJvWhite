package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import one.video.transloader.TranscodingUploader;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class epe implements sf7, d3i {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ epe(cf7 cf7Var, qn0 qn0Var, qf7 qf7Var, z2f z2fVar, cf7 cf7Var2) {
        this.a = cf7Var;
        this.c = qn0Var;
        this.d = qf7Var;
        this.e = z2fVar;
        this.b = cf7Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        cf7 cf7Var = (cf7) this.a;
        qn0 qn0Var = (qn0) this.c;
        qf7 qf7Var = (qf7) this.d;
        z2f z2fVar = (z2f) this.e;
        cf7 cf7Var2 = (cf7) this.b;
        fqb fqbVar = (fqb) obj;
        fqbVar.getClass();
        g85 g85Var = new g85(cf7Var, qn0Var, qf7Var, z2fVar, cf7Var2);
        int i = w07.a;
        idl.d(Integer.MAX_VALUE, "maxConcurrency");
        idl.d(i, "bufferSize");
        if (!(fqbVar instanceof f1f)) {
            return new vqb(fqbVar, g85Var, i, 0);
        }
        Object obj2 = ((f1f) fqbVar).get();
        return obj2 == null ? pqb.a : new grb(obj2, g85Var);
    }

    @Override // defpackage.d3i
    public void cancel() {
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.a;
        v56 v56Var = (v56) this.b;
        AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.c;
        TranscodingUploader transcodingUploader = (TranscodingUploader) this.d;
        l3i l3iVar = (l3i) this.e;
        if (atomicBoolean.compareAndSet(false, true)) {
            v56Var.K(new i8f(atomicBoolean2, transcodingUploader, l3iVar, 8));
        }
    }

    public /* synthetic */ epe(AtomicBoolean atomicBoolean, v56 v56Var, AtomicBoolean atomicBoolean2, TranscodingUploader transcodingUploader, l3i l3iVar) {
        this.a = atomicBoolean;
        this.b = v56Var;
        this.c = atomicBoolean2;
        this.d = transcodingUploader;
        this.e = l3iVar;
    }
}
