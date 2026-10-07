package one.me.sdk.vendor.rustore.push;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.vk.push.common.Logger;
import com.vk.push.core.base.DelayedAction;
import defpackage.ao5;
import defpackage.cqk;
import defpackage.dq4;
import defpackage.er3;
import defpackage.gce;
import defpackage.gg5;
import defpackage.hgk;
import defpackage.ifh;
import defpackage.kdk;
import defpackage.lb5;
import defpackage.lq4;
import defpackage.mwe;
import defpackage.yab;
import defpackage.zgk;

/* JADX INFO: loaded from: classes3.dex */
public final class RustoreMessagingService extends Service {
    public static final /* synthetic */ int k = 0;
    public final ifh a = new ifh(gg5.i);
    public final ifh b = new ifh(gg5.h);
    public final ifh c = new ifh(gg5.l);
    public final dq4 d;
    public final ifh e;
    public final ifh f;
    public volatile int g;
    public final ifh h;
    public final ifh i;
    public final String j;

    public RustoreMessagingService() {
        ao5 ao5Var = ao5.a;
        this.d = cqk.a(lb5.c);
        this.e = new ifh(new mwe(this, 0));
        this.f = new ifh(gg5.k);
        this.h = new ifh(gg5.j);
        this.i = new ifh(new mwe(this, 2));
        this.j = "RUSTORE";
    }

    public final Logger a() {
        return (Logger) this.h.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f3, code lost:
    
        if (r10.c(r9, r0) == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.hhk r9, defpackage.nq4 r10) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.vendor.rustore.push.RustoreMessagingService.b(hhk, nq4):java.lang.Object");
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return new zgk(this.f, this.e, this.h);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (er3.l) {
            yab.i0(this.d, null, 0, new gce(this, (lq4) null, 6), 3);
        } else {
            Log.w("VkpnsMessagingService", "Client SDK is not initialized, did you call init method in your Application class?");
        }
        ((DelayedAction) this.i.getValue()).runWithDelay(20000L);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        if (er3.l) {
            Logger.DefaultImpls.info$default(a(), "Service is destroying", null, 2, null);
            cqk.g(this.d);
            ((kdk) this.e.getValue()).onDestroy();
            ((hgk) this.f.getValue()).onDestroy();
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        this.g = i2;
        return 3;
    }
}
