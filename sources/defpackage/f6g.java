package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class f6g extends ux8 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f6g(Object obj, int i, Object obj2) {
        super(1);
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        sbi sbiVar;
        int i = this.a;
        sbi sbiVar2 = sbi.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                ((ik5) obj3).invoke(th);
                p41 p41Var = (p41) ((xde) obj2).d;
                p41Var.l(false, th);
                do {
                    Object objH = p41Var.h();
                    if (objH instanceof cs2) {
                        objH = null;
                    }
                    if (objH == null) {
                        sbiVar = null;
                    } else {
                        z8g z8gVar = (z8g) objH;
                        if (z8gVar instanceof y8g) {
                            ((y8g) z8gVar).b.j0(th == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th);
                        }
                        sbiVar = sbiVar2;
                    }
                } while (sbiVar != null);
                break;
            default:
                yab.i0((gu4) obj3, null, 0, new fij((fjh) obj, (lq4) null, (u9k) obj2), 3);
                break;
        }
        return sbiVar2;
    }
}
