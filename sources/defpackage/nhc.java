package defpackage;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nhc implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a9m b;

    public /* synthetic */ nhc(int i, a9m a9mVar) {
        this.a = i;
        this.b = a9mVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        HandlerThread handlerThread;
        int i = this.a;
        a9m a9mVar = this.b;
        switch (i) {
            case 0:
                int i2 = a9mVar.b;
                int i3 = i2 + 1;
                synchronized (a9mVar.e) {
                    handlerThread = (HandlerThread) a9mVar.d;
                }
                StringBuilder sbP = qv1.p("New HandlerThread acquire: ", i2, " -> ", i3, ", current: ");
                sbP.append(handlerThread);
                return sbP.toString();
            default:
                int i4 = a9mVar.b;
                return qt4.l("New Handler Thread release: ", i4, i4 - 1, " -> ");
        }
    }
}
