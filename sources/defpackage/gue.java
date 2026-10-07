package defpackage;

import android.app.Application;
import android.app.KeyguardManager;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class gue implements r77 {
    public static final /* synthetic */ int k = 0;
    public final l4f a;
    public final KeyguardManager b;
    public int c;
    public volatile int d;
    public volatile boolean f;
    public long h;
    public volatile boolean i;
    public final CopyOnWriteArraySet e = new CopyOnWriteArraySet();
    public volatile boolean g = true;
    public final xf2 j = new xf2(1, this);

    public gue(Application application, l4f l4fVar) {
        this.a = l4fVar;
        this.b = (KeyguardManager) application.getSystemService("keyguard");
        application.registerActivityLifecycleCallbacks(new qt(1, this));
    }

    public final void a() {
        this.i = true;
        long jElapsedRealtime = this.h != 0 ? SystemClock.elapsedRealtime() - this.h : 0L;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "gue", "app enter background, time=" + vd7.K(Long.valueOf(System.currentTimeMillis())) + ", interactiveTime=" + jElapsedRealtime, null);
            }
        }
        this.h = SystemClock.elapsedRealtime();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((ou) it.next()).w(this.h);
        }
    }

    public final void b() {
        this.i = true;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "gue", "app enter foreground, time = " + vd7.K(Long.valueOf(System.currentTimeMillis())) + ", backgroundTime=" + (this.h != 0 ? SystemClock.elapsedRealtime() - this.h : 0L), null);
            }
        }
        this.h = SystemClock.elapsedRealtime();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((ou) it.next()).h(this.h);
        }
    }

    public final void c(ou ouVar) {
        this.e.add(ouVar);
    }

    public final void d(ou ouVar) {
        this.e.remove(ouVar);
    }

    public final boolean e() {
        boolean z = this.f;
        boolean z2 = this.g;
        String name = gue.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.e;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, zo5.q("visible=", " screenOn=", z, z2), null);
            }
        }
        return z && z2;
    }
}
