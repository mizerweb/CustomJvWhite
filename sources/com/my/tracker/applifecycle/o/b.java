package com.my.tracker.applifecycle.o;

import com.huawei.hms.ads.installreferrer.api.InstallReferrerClient;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerStateListener;
import com.huawei.hms.ads.installreferrer.api.ReferrerDetails;
import com.my.tracker.core.EngineCore;
import com.my.tracker.core.Tracer;
import com.my.tracker.core.utils.ContextUtils;
import defpackage.hed;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    static int e = 3;
    static volatile b f;
    private final EngineCore a;
    private final d b;
    InstallReferrerClient c;
    int d;

    /* JADX INFO: loaded from: classes2.dex */
    public final class a implements InstallReferrerStateListener {
        public a() {
        }

        public void onInstallReferrerServiceDisconnected() {
            Tracer.d("HuaweiReferrerHandler: install referrer service is disconnected. Connection attempts: " + b.this.d);
            b.this.a(this);
        }

        public void onInstallReferrerSetupFinished(int i) {
            if (i == -1) {
                b.this.a(this);
            } else {
                Tracer.d("HuaweiReferrerHandler: install referrer setup is finished");
                b.this.a(i);
            }
        }
    }

    private b(EngineCore engineCore, d dVar) {
        this.a = engineCore;
        this.b = dVar;
    }

    public void a(ReferrerDetails referrerDetails) {
        if (this.a.getPrefs().getBoolean("huaweiApiReferrerSent")) {
            Tracer.d("HuaweiReferrerHandler: api referrer has been tracked");
            return;
        }
        String installReferrer = referrerDetails.getInstallReferrer();
        Tracer.d("HuaweiReferrerHandler: retrieving install referrer is completed. Referrer: " + installReferrer);
        this.b.b(this.a, installReferrer, ContextUtils.getInstaller(this.a.getApplication()), referrerDetails.getInstallBeginTimestampSeconds(), referrerDetails.getReferrerClickTimestampSeconds());
        this.a.handleReferrerAttribution(installReferrer);
        this.a.getPrefs().setBoolean("huaweiApiReferrerSent", true);
    }

    public static void a(EngineCore engineCore, d dVar) {
        if (f != null) {
            return;
        }
        b bVar = new b(engineCore, dVar);
        engineCore.getAsyncCore().onEngineWorker(new hed(12, bVar));
        f = bVar;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002f -> B:17:0x0034). Please report as a decompilation issue!!! */
    public void a(int i) {
        if (this.c == null) {
            Tracer.e("HuaweiReferrerHandler: install referrer client is null");
            return;
        }
        try {
            if (i == 0) {
                Tracer.d("HuaweiReferrerHandler: retrieving install referrer");
                a(this.c.getInstallReferrer());
            } else {
                Tracer.d("HuaweiReferrerHandler: InstallReferrerResponse code: " + i);
            }
        } catch (Throwable th) {
            Tracer.e("HuaweiReferrerHandler: error occurred while retrieving install referrer", th);
        }
        try {
            this.c.endConnection();
        } catch (Throwable unused) {
        }
        this.c = null;
    }

    public void a() {
        if (this.a.getPrefs().getBoolean("huaweiApiReferrerSent")) {
            return;
        }
        try {
            Tracer.d("HuaweiReferrerHandler: initialize InstallReferrerClient");
            this.c = InstallReferrerClient.newBuilder(this.a.getApplication()).build();
            a(new a());
        } catch (Throwable th) {
            if (th instanceof NoClassDefFoundError) {
                Tracer.d("HuaweiReferrerHandler: InstallReferrerClient is not found");
            } else {
                Tracer.d("HuaweiReferrerHandler: error occurred while initialization InstallReferrerClient", th);
            }
        }
    }

    public void a(InstallReferrerStateListener installReferrerStateListener) {
        if (this.c == null) {
            Tracer.d("HuaweiReferrerHandler: InstallReferrerClient is null");
            return;
        }
        int i = this.d;
        if (i >= e) {
            Tracer.d("HuaweiReferrerHandler: max count of reconnection attempts is reached");
            try {
                this.c.endConnection();
            } catch (Throwable unused) {
            }
            this.c = null;
            return;
        }
        this.d = i + 1;
        try {
            Tracer.d("HuaweiReferrerHandler: connect to referrer client");
            this.c.startConnection(installReferrerStateListener);
        } catch (Throwable th) {
            Tracer.e("HuaweiReferrerHandler: error occurred while connection InstallReferrerClient", th);
            a(installReferrerStateListener);
        }
    }
}
