package defpackage;

import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aml implements IBinder.DeathRecipient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aml(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                t6m t6mVar = (t6m) obj;
                t6mVar.b.a("reportBinderDeath", new Object[0]);
                if (t6mVar.i.get() != null) {
                    ore.m();
                    return;
                }
                t6mVar.b.a("%s : Binder has died.", t6mVar.c);
                for (lil lilVar : t6mVar.d) {
                    RemoteException remoteException = new RemoteException(String.valueOf(t6mVar.c).concat(" : Binder has died."));
                    qjh qjhVar = lilVar.a;
                    if (qjhVar != null) {
                        qjhVar.c(remoteException);
                    }
                }
                t6mVar.d.clear();
                synchronized (t6mVar.f) {
                    t6mVar.c();
                    break;
                }
                return;
            default:
                sbm sbmVar = (sbm) obj;
                sbmVar.b.c("reportBinderDeath", new Object[0]);
                if (sbmVar.i.get() != null) {
                    ore.m();
                    return;
                }
                sbmVar.b.c("%s : Binder has died.", sbmVar.c);
                for (iul iulVar : sbmVar.d) {
                    RemoteException remoteException2 = new RemoteException(String.valueOf(sbmVar.c).concat(" : Binder has died."));
                    qjh qjhVar2 = iulVar.a;
                    if (qjhVar2 != null) {
                        qjhVar2.c(remoteException2);
                    }
                }
                sbmVar.d.clear();
                synchronized (sbmVar.f) {
                    sbmVar.e();
                    break;
                }
                return;
        }
    }
}
