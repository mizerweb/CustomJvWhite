package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wv6 implements cub {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseMessaging b;

    public /* synthetic */ wv6(FirebaseMessaging firebaseMessaging, int i) {
        this.a = i;
        this.b = firebaseMessaging;
    }

    @Override // defpackage.cub
    public final void a(Object obj) {
        boolean z;
        int i = this.a;
        FirebaseMessaging firebaseMessaging = this.b;
        switch (i) {
            case 0:
                wvh wvhVar = (wvh) obj;
                if (!firebaseMessaging.e.f() || wvhVar.h.a() == null) {
                    return;
                }
                synchronized (wvhVar) {
                    z = wvhVar.g;
                }
                if (z) {
                    return;
                }
                wvhVar.f(0L);
                return;
            default:
                eu3 eu3Var = (eu3) obj;
                if (eu3Var != null) {
                    ouk.c(eu3Var.a);
                    firebaseMessaging.i();
                    return;
                }
                return;
        }
    }
}
