package com.my.tracker.core.o;

import android.app.Application;
import android.text.TextUtils;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.my.tracker.core.EnginePrefs;
import com.my.tracker.core.Tracer;
import defpackage.cub;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    private final Application a;
    private final EnginePrefs b;
    private final AtomicReference c = new AtomicReference();
    protected boolean d = false;

    public static final class a {
        public static final boolean a;

        static {
            boolean z;
            try {
                z = AppSet.class.equals(Class.forName("com.google.android.gms.appset.AppSet")) && AppSetIdClient.class.equals(AppSetIdClient.class) && AppSetIdInfo.class.equals(Class.forName("com.google.android.gms.appset.AppSetIdInfo"));
            } catch (Throwable th) {
                if (th instanceof NoClassDefFoundError) {
                    Tracer.d("AppSetIdProvider: App Set library classes not found");
                } else {
                    Tracer.d("AppSetIdProvider: error occurred while working with App Set library classes", th);
                }
            }
            a = z;
        }
    }

    public d(Application application, EnginePrefs enginePrefs) {
        this.a = application;
        this.b = enginePrefs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i, String str, AppSetIdInfo appSetIdInfo) {
        int scope = appSetIdInfo.getScope();
        if (scope != i) {
            this.b.setLong("appSetIdScope", scope);
        }
        String id = appSetIdInfo.getId();
        if (!id.equals(str)) {
            this.b.setString("appSetId", id);
            Tracer.d("AppSetIdProvider: new id value has been received: ".concat(id));
        }
        if (TextUtils.isEmpty(id) || scope == -1) {
            this.c.set(null);
        } else {
            this.c.set(new c(id, scope));
        }
        synchronized (this.c) {
            this.c.notify();
        }
    }

    private void c() {
        final String string = this.b.getString("appSetId");
        final int i = (int) this.b.getLong("appSetIdScope");
        if (!TextUtils.isEmpty(string)) {
            this.c.set(new c(string, i));
        }
        if (!a.a) {
            Tracer.d("AppSetIdProvider: app set library is not available");
            return;
        }
        Executor executorA = g.a();
        if (executorA == null) {
            Tracer.e("AppSetIdProvider: background executor is not found");
            return;
        }
        try {
            AppSet.getClient(this.a).getAppSetIdInfo().e(executorA, new cub() { // from class: tck
                @Override // defpackage.cub
                public final void a(Object obj) {
                    this.a.a(i, string, (AppSetIdInfo) obj);
                }
            });
        } catch (Throwable th) {
            Tracer.d("AppSetIdProvider: error occurred while trying to access app set id info", th);
        }
        a();
    }

    public c b() {
        if (!this.d) {
            c();
            this.d = true;
        }
        return (c) this.c.get();
    }

    private void a() {
        try {
            c cVar = (c) this.c.get();
            if (cVar != null) {
                Tracer.d("AppSetIdProvider: app set id has been collected, value: " + cVar.a);
            } else {
                synchronized (this.c) {
                    this.c.wait(300L);
                }
                Tracer.d("AppSetIdProvider: timeout for collecting id has exceeded");
            }
        } catch (Throwable th) {
            Tracer.d("AppSetIdProvider: attempt to block thread retrieving app set id finished unsuccessfully", th);
        }
    }
}
