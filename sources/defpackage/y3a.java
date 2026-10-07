package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class y3a extends Service {
    public static final /* synthetic */ int l = 0;
    public g85 a;
    public final i1m b = new i1m(this);
    public final ms9 c = new ms9(this, "android.media.session.MediaController", -1, -1, null);
    public final ArrayList d = new ArrayList();
    public final mw e = new mw(0);
    public ms9 f;
    public final jf g;
    public u2a h;
    public final t3a i;
    public final d3a j;
    public final gvb k;

    public y3a(d3a d3aVar) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        jf jfVar = new jf(looperMyLooper);
        jfVar.b = this;
        this.g = jfVar;
        this.i = t3a.m(d3aVar.f);
        this.j = d3aVar;
        this.k = new gvb(d3aVar);
    }

    public final void a(u2a u2aVar) {
        attachBaseContext(this.j.f);
        onCreate();
        if (u2aVar == null) {
            ore.p("Session token may not be null");
            return;
        }
        if (this.h != null) {
            ore.k("The session token has already been set");
            return;
        }
        this.h = u2aVar;
        g85 g85Var = this.a;
        g85Var.getClass();
        ((y3a) g85Var.d).g.a(new ng7((Object) g85Var, (Object) u2aVar, false, 11));
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        g85 g85Var = this.a;
        g85Var.getClass();
        ns9 ns9Var = (ns9) g85Var.b;
        ns9Var.getClass();
        return ns9Var.onBind(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 28) {
            this.a = new os9(this);
        } else {
            this.a = new g85(this);
        }
        g85 g85Var = this.a;
        g85Var.getClass();
        ns9 ns9Var = new ns9(g85Var, (y3a) g85Var.e);
        g85Var.b = ns9Var;
        ns9Var.onCreate();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.g.b = null;
    }
}
