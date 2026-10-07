package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xv6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseMessaging b;
    public final /* synthetic */ qjh c;

    public /* synthetic */ xv6(FirebaseMessaging firebaseMessaging, qjh qjhVar, int i) {
        this.a = i;
        this.b = firebaseMessaging;
        this.c = qjhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                FirebaseMessaging firebaseMessaging = this.b;
                qjh qjhVar = this.c;
                firebaseMessaging.getClass();
                try {
                    yfj yfjVar = firebaseMessaging.c;
                    yfjVar.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("delete", "1");
                    gwl.a(yfjVar.k(yfjVar.q(q1j.c((ov6) yfjVar.a), "*", bundle)));
                    zo7 zo7VarE = FirebaseMessaging.e(firebaseMessaging.b);
                    String strF = firebaseMessaging.f();
                    String strC = q1j.c(firebaseMessaging.a);
                    synchronized (zo7VarE) {
                        String strH = zo7.h(strF, strC);
                        SharedPreferences.Editor editorEdit = ((SharedPreferences) zo7VarE.b).edit();
                        editorEdit.remove(strH);
                        editorEdit.commit();
                    }
                    qjhVar.b(null);
                    return;
                } catch (Exception e) {
                    qjhVar.a(e);
                    return;
                }
            default:
                FirebaseMessaging firebaseMessaging2 = this.b;
                qjh qjhVar2 = this.c;
                try {
                    qjhVar2.b(firebaseMessaging2.a());
                    return;
                } catch (Exception e2) {
                    qjhVar2.a(e2);
                    return;
                }
        }
    }
}
