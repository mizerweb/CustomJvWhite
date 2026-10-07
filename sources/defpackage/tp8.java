package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tp8 extends fg7 implements tf7 {
    public static final tp8 a = new tp8(3, up8.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        Object objJ;
        sbi sbiVar;
        up8 up8Var = (up8) obj;
        tdf tdfVar = (tdf) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = up8.a;
        do {
            objJ = up8Var.J();
            boolean z = objJ instanceof qc8;
            sbiVar = sbi.a;
            if (!z) {
                ((sdf) tdfVar).e = sbiVar;
                return sbiVar;
            }
        } while (up8Var.d0(objJ) < 0);
        ((sdf) tdfVar).c = vd7.D(up8Var, new pp8(up8Var, tdfVar));
        return sbiVar;
    }
}
