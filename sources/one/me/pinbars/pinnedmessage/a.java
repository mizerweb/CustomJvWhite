package one.me.pinbars.pinnedmessage;

import defpackage.ch3;
import defpackage.gm0;
import defpackage.lq4;
import defpackage.mdh;
import defpackage.sbi;
import defpackage.tf7;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends mdh implements tf7 {
    public /* synthetic */ Throwable e;
    public final /* synthetic */ b f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, lq4 lq4Var) {
        super(3, lq4Var);
        this.f = bVar;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        a aVar = new a(this.f, (lq4) obj3);
        aVar.e = (Throwable) obj2;
        sbi sbiVar = sbi.a;
        aVar.invokeSuspend(sbiVar);
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.e;
        ch3.d0(obj);
        if (!(th instanceof TimeoutCancellationException)) {
            gm0.V(this.f.n, "fail in combine observing", new PinnedMessageException.Observe(th));
        }
        return sbi.a;
    }
}
