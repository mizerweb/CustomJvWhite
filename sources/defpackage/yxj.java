package defpackage;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;

/* JADX INFO: loaded from: classes4.dex */
public final class yxj extends Binder {
    public final ex8 c;

    public yxj(ex8 ex8Var) {
        this.c = ex8Var;
    }

    public final void a(zxj zxjVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        int i = 3;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = zxjVar.a;
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.c.b;
        qjh qjhVar = new qjh();
        firebaseMessagingService.a.execute(new d86(firebaseMessagingService, intent, qjhVar, i));
        qjhVar.a.c(new sv(1), new atj(2, zxjVar));
    }
}
