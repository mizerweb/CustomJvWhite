package defpackage;

import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class asl extends iul {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ qjh c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asl(i3m i3mVar, qjh qjhVar, String str, qjh qjhVar2) {
        super(qjhVar);
        this.e = i3mVar;
        this.d = str;
        this.c = qjhVar2;
    }

    @Override // defpackage.iul
    public final void a() {
        switch (this.b) {
            case 0:
                qjh qjhVar = this.c;
                i3m i3mVar = (i3m) this.e;
                String str = (String) this.d;
                try {
                    i3mVar.a.m.x(i3mVar.b, i3m.a(i3mVar, str), new h1m(i3mVar, qjhVar, str));
                    return;
                } catch (RemoteException e) {
                    ste steVar = i3m.e;
                    Object[] objArr = {str};
                    steVar.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", ste.d(steVar.b, "requestUpdateInfo(%s)", objArr), e);
                    }
                    qjhVar.c(new RuntimeException(e));
                    return;
                }
            default:
                synchronized (((sbm) this.e).f) {
                    try {
                        sbm sbmVar = (sbm) this.e;
                        qjh qjhVar2 = this.c;
                        sbmVar.e.add(qjhVar2);
                        qjhVar2.a.b(new cmf(sbmVar, qjhVar2, false, 16));
                        if (((sbm) this.e).k.getAndIncrement() > 0) {
                            ((sbm) this.e).b.c("Already connected to the service.", new Object[0]);
                        }
                        sbm.b((sbm) this.e, (asl) this.d);
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asl(sbm sbmVar, qjh qjhVar, qjh qjhVar2, asl aslVar) {
        super(qjhVar);
        this.e = sbmVar;
        this.c = qjhVar2;
        this.d = aslVar;
    }
}
