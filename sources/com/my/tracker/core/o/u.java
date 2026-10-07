package com.my.tracker.core.o;

import android.app.Application;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.my.tracker.core.EnginePrefs;
import com.my.tracker.core.Tracer;
import defpackage.atj;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class u {
    private final Application a;
    private final EnginePrefs b;
    protected t c;
    boolean d = false;

    /* JADX INFO: loaded from: classes2.dex */
    public interface c {
        void a();

        void a(String str);
    }

    public u(Application application, EnginePrefs enginePrefs) {
        this.a = application;
        this.b = enginePrefs;
    }

    public t a() {
        if (this.d) {
            return this.c;
        }
        String string = this.b.getString("firebaseAppInstanceId");
        if (!TextUtils.isEmpty(string)) {
            Tracer.d("FirebaseAppInstanceIdProvider: retrieved cached firebase app instance id " + string);
        }
        if (b.a) {
            b.a(this.a, new a());
            this.d = true;
            return this.c;
        }
        Tracer.d("FirebaseAppInstanceIdProvider: firebase analytics is not available, use cached value '" + string + "'");
        t tVar = new t(string);
        this.c = tVar;
        return tVar;
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class a implements c {
        public a() {
        }

        @Override // com.my.tracker.core.o.u.c
        public void a(String str) {
            u.this.c = new t(str);
            u.this.b.setString("firebaseAppInstanceId", str);
            Tracer.d("FirebaseAppInstanceIdProvider: retrieved firebase app instance id %" + u.this.c.a);
        }

        @Override // com.my.tracker.core.o.u.c
        public void a() {
            Tracer.d("FirebaseAppInstanceIdProvider: retrieving firebase app instance id finished unsuccessfully");
        }
    }

    public static final class b {
        public static final boolean a;

        static {
            boolean zEquals;
            try {
                zEquals = FirebaseAnalytics.class.equals(Class.forName("com.google.firebase.analytics.FirebaseAnalytics"));
            } catch (Throwable th) {
                if (th instanceof NoClassDefFoundError) {
                    Tracer.d("FirebaseHelper: FirebaseAnalytics is not found");
                } else {
                    Tracer.d("FirebaseHelper: error occurred while working with FirebaseAnalytics", th);
                }
                zEquals = false;
            }
            a = zEquals;
        }

        public static void a(Application application, c cVar) {
            Executor executorA = g.a();
            if (executorA == null) {
                Tracer.e("FirebaseHelper: background executor is not found");
                cVar.a();
                return;
            }
            try {
                Tracer.d("FirebaseHelper: retrieving firebase app instance id");
                FirebaseAnalytics.getInstance(application).getAppInstanceId().c(executorA, new atj(8, cVar));
            } catch (Throwable th) {
                Tracer.d("FirebaseHelper: retrieving firebase app instance id error", th);
                cVar.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void a(c cVar, Task task) {
            if (task.i() && task.j()) {
                cVar.a((String) task.h());
            } else {
                cVar.a();
            }
        }
    }
}
