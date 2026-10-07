package com.my.tracker.applifecycle.o;

import android.app.Service;
import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.my.tracker.TrackerUtils;
import com.my.tracker.core.EngineCore;
import com.my.tracker.core.Tracer;
import com.my.tracker.core.utils.ContextUtils;
import defpackage.hed;
import defpackage.o90;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    static int e = 3;
    static volatile a f;
    final EngineCore a;
    final d b;
    InstallReferrerClient c;
    int d;

    /* JADX INFO: renamed from: com.my.tracker.applifecycle.o.a$a */
    public final class C0001a implements InstallReferrerStateListener {
        public C0001a() {
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
            Tracer.d("ReferrerHandler: install referrer service is disconnected. Connection attempts: " + a.this.d);
            a.this.a(this);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int i) {
            Tracer.d("ReferrerHandler: install referrer setup is finished");
            a aVar = a.this;
            if (i == -1) {
                aVar.a(this);
            } else {
                aVar.a(i);
            }
        }
    }

    public a(EngineCore engineCore, d dVar) {
        this.a = engineCore;
        this.b = dVar;
    }

    private void b() {
        String string = this.a.getPrefs().getString("referrer");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        a(string);
    }

    public /* synthetic */ void c() {
        try {
            Tracer.d("ReferrerHandler: initialize InstallReferrerClient");
            this.c = InstallReferrerClient.newBuilder(this.a.getApplication()).build();
            a(new C0001a());
        } catch (Throwable th) {
            if (th instanceof NoClassDefFoundError) {
                Tracer.d("ReferrerHandler: InstallReferrerClient not found");
            } else {
                Tracer.d("ReferrerHandler: error occurred while initialization InstallReferrerClient", th);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void b(ReferrerDetails referrerDetails) {
        if (this.a.getPrefs().getBoolean("apiReferrerSent")) {
            Tracer.d("ReferrerHandler: api referrer has been tracked");
            return;
        }
        String installReferrer = referrerDetails.getInstallReferrer();
        Tracer.d("ReferrerHandler: retrieving install referrer is completed. Referrer: " + installReferrer);
        this.b.a(this.a, installReferrer, ContextUtils.getInstaller(this.a.getApplication()), referrerDetails.getInstallBeginTimestampSeconds(), referrerDetails.getReferrerClickTimestampSeconds());
        this.a.handleReferrerAttribution(installReferrer);
        this.a.getPrefs().setBoolean("apiReferrerSent", true);
    }

    public static void a(EngineCore engineCore, d dVar) {
        if (f != null) {
            return;
        }
        a aVar = new a(engineCore, dVar);
        aVar.b();
        aVar.a();
        f = aVar;
    }

    public static void a(String str, Service service) {
        a aVar = f;
        if (aVar == null) {
            TrackerUtils.saveReferrerIfRequired(str, service);
        } else {
            aVar.a(str);
        }
    }

    public void a() {
        if (this.a.getPrefs().getBoolean("apiReferrerSent")) {
            return;
        }
        this.a.getAsyncCore().onUi(new hed(10, this));
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003c -> B:17:0x0041). Please report as a decompilation issue!!! */
    public void a(int i) {
        if (this.c == null) {
            Tracer.e("ReferrerHandler: install referrer client is null");
            return;
        }
        try {
            if (i == 0) {
                Tracer.d("ReferrerHandler: retrieving install referrer");
                this.a.getAsyncCore().onEngineWorker(new o90(this, 28, this.c.getInstallReferrer()));
            } else {
                Tracer.d("ReferrerHandler: InstallReferrerResponse code: " + i);
            }
        } catch (Throwable th) {
            Tracer.e("ReferrerHandler: error occurred while retrieving install referrer", th);
        }
        try {
            this.c.endConnection();
        } catch (Throwable unused) {
        }
        this.c = null;
    }

    public void a(InstallReferrerStateListener installReferrerStateListener) {
        InstallReferrerClient installReferrerClient = this.c;
        if (installReferrerClient == null) {
            Tracer.d("ReferrerHandler: InstallReferrerClient is null");
            return;
        }
        int i = this.d;
        if (i >= e) {
            try {
                installReferrerClient.endConnection();
            } catch (Throwable unused) {
            }
            this.c = null;
            return;
        }
        this.d = i + 1;
        try {
            Tracer.d("ReferrerHandler: connect to referrer client");
            this.c.startConnection(installReferrerStateListener);
        } catch (Throwable th) {
            Tracer.e("ReferrerHandler: error occurred while connection InstallReferrerClient", th);
            a(installReferrerStateListener);
        }
    }

    public void a(String str) {
        long jCurrentTimeSec = this.a.getTimeCore().currentTimeSec();
        if (this.a.getPrefs().getBoolean("referrerSent")) {
            Tracer.d("ReferrerHandler: referrer has been tracked");
            return;
        }
        this.b.a(this.a, jCurrentTimeSec, str, ContextUtils.getInstaller(this.a.getApplication()));
        this.a.handleReferrerAttribution(str);
        this.a.getPrefs().setBoolean("referrerSent", true);
    }
}
