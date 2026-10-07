package one.me.android;

import defpackage.ch3;
import defpackage.gm0;
import defpackage.lq4;
import defpackage.mdh;
import defpackage.sbi;
import defpackage.tf7;
import defpackage.yx6;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class a extends mdh implements tf7 {
    public /* synthetic */ yx6 e;
    public /* synthetic */ Throwable f;

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        a aVar = new a(3, (lq4) obj3);
        aVar.e = (yx6) obj;
        aVar.f = (Throwable) obj2;
        sbi sbiVar = sbi.a;
        aVar.invokeSuspend(sbiVar);
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        yx6 yx6Var = this.e;
        Throwable th = this.f;
        ch3.d0(obj);
        if (!(th instanceof CancellationException)) {
            gm0.V(yx6Var.getClass().getName(), "fail to check link", new MainActivity.a(th));
        }
        return sbi.a;
    }
}
