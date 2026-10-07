package defpackage;

import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mth implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ guh b;

    public /* synthetic */ mth(guh guhVar, int i) {
        this.a = i;
        this.b = guhVar;
    }

    @Override // defpackage.af7
    public final Object invoke() throws SSLException {
        int i = this.a;
        sbi sbiVar = sbi.a;
        guh guhVar = this.b;
        switch (i) {
            case 0:
                guhVar.a.beginHandshake();
                return sbiVar;
            case 1:
                Runnable delegatedTask = guhVar.a.getDelegatedTask();
                if (delegatedTask == null) {
                    return null;
                }
                delegatedTask.run();
                return sbiVar;
            default:
                Runnable delegatedTask2 = guhVar.a.getDelegatedTask();
                if (delegatedTask2 == null) {
                    return null;
                }
                delegatedTask2.run();
                return sbiVar;
        }
    }
}
