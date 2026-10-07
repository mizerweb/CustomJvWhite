package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rp8 extends fg7 implements tf7 {
    public static final rp8 a = new rp8(3, up8.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        Object objJ;
        up8 up8Var = (up8) obj;
        tdf tdfVar = (tdf) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = up8.a;
        do {
            objJ = up8Var.J();
            if (!(objJ instanceof qc8)) {
                if (!(objJ instanceof s64)) {
                    objJ = rx8.m0(objJ);
                }
                ((sdf) tdfVar).e = objJ;
            }
            return sbi.a;
        } while (up8Var.d0(objJ) < 0);
        ((sdf) tdfVar).c = vd7.D(up8Var, new op8(up8Var, tdfVar));
        return sbi.a;
    }
}
