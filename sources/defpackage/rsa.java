package defpackage;

import java.util.concurrent.CancellationException;
import one.me.messages.list.ui.MessagesListHandleEventException;
import one.me.messages.list.ui.MessagesListWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class rsa extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Throwable f;
    public final /* synthetic */ MessagesListWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rsa(int i, lq4 lq4Var, MessagesListWidget messagesListWidget) {
        super(3, lq4Var);
        this.e = i;
        this.g = messagesListWidget;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) throws Throwable {
        int i = this.e;
        sbi sbiVar = sbi.a;
        MessagesListWidget messagesListWidget = this.g;
        Throwable th = (Throwable) obj2;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                rsa rsaVar = new rsa(0, lq4Var, messagesListWidget);
                rsaVar.f = th;
                rsaVar.invokeSuspend(sbiVar);
                break;
            default:
                rsa rsaVar2 = new rsa(1, lq4Var, messagesListWidget);
                rsaVar2.f = th;
                rsaVar2.invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.e;
        sbi sbiVar = sbi.a;
        MessagesListWidget messagesListWidget = this.g;
        Throwable th = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                gm0.X(messagesListWidget.a, th, "messages list update error", new Object[0]);
                return sbiVar;
            default:
                ch3.d0(obj);
                if (th instanceof CancellationException) {
                    throw th;
                }
                gm0.V(messagesListWidget.a, "fail to handleEvent", new MessagesListHandleEventException(th));
                return sbiVar;
        }
    }
}
