package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m41 extends fg7 implements tf7 {
    public static final m41 a = new m41(3, p41.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        p41 p41Var = (p41) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = p41.d;
        p41Var.getClass();
        if (obj3 == r41.l) {
            obj3 = new bs2(p41Var.s());
        }
        return new ds2(obj3);
    }
}
