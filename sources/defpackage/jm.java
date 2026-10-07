package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import one.me.chats.search.ChatsListSearchScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jm(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        pwi pwiVar;
        switch (this.a) {
            case 0:
                boolean z = this.b;
                km kmVar = (km) this.c;
                yt1 yt1Var = (yt1) this.d;
                if (!z) {
                    if (!kmVar.p) {
                        kmVar.n.log("AniRenderDispatch", "Postponed renderer for " + yt1Var + " is no longer needed, remove it from waiting list");
                        kmVar.l.remove(yt1Var);
                    }
                    return;
                }
                kmVar.b(yt1Var);
                if (kmVar.p) {
                    return;
                }
                kmVar.n.log("AniRenderDispatch", "Renderer for " + yt1Var + " can not be created right now, postpone creation for a while");
                kmVar.l.add(yt1Var);
                return;
            case 1:
                ((w22) this.c).N((List) this.d, !this.b);
                return;
            case 2:
                boolean z2 = this.b;
                ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) this.c;
                l48 l48Var = (l48) this.d;
                zv8[] zv8VarArr = ChatsListSearchScreen.F;
                if (z2) {
                    chatsListSearchScreen.u1();
                }
                chatsListSearchScreen.v1(false);
                chatsListSearchScreen.z.H((List) ((zo0) chatsListSearchScreen.m.getValue()).i.a.getValue());
                chatsListSearchScreen.r.H(!l48Var.b.isEmpty() ? Collections.singletonList(lae.a) : r66.a);
                chatsListSearchScreen.t.H(l48Var.b);
                chatsListSearchScreen.u.H(l48Var.c);
                return;
            case 3:
                guc gucVar = (guc) this.c;
                gfh gfhVar = (gfh) this.d;
                try {
                    gucVar.d(gfhVar.b, gfhVar.c, gfhVar.d, this.b);
                    return;
                } catch (Exception e) {
                    ((t1c) gucVar.l).a(new IllegalStateException("guc".concat("onSyncSuccess: exception"), e));
                    return;
                }
            case 4:
                Context context = (Context) this.c;
                boolean z3 = this.b;
                qjh qjhVar = (qjh) this.d;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        SharedPreferences.Editor editorEdit = fml.b(context).edit();
                        editorEdit.putBoolean("proxy_notification_initialized", true);
                        editorEdit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (z3) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                            notificationManager.setNotificationDelegate(null);
                        }
                    } else {
                        Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                    }
                    return;
                } finally {
                    qjhVar.d(null);
                }
            case 5:
                whh whhVar = (whh) this.c;
                Collection collection = (Collection) this.d;
                boolean z4 = this.b;
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    whhVar.g(collection, z4);
                    break;
                } catch (Exception e2) {
                    gm0.l("whh", "sync exception", e2);
                    ((t1c) whhVar.j).a(e2);
                }
                gm0.m("whh", "syncWorker: sync %d ids done for %d", Integer.valueOf(collection.size()), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                return;
            case 6:
                o02 o02Var = (o02) this.c;
                boolean z5 = this.b;
                pwi pwiVar2 = (pwi) this.d;
                try {
                    synchronized (o02Var.f) {
                        try {
                            if (!o02Var.b || !z5) {
                                while (true) {
                                    synchronized (o02Var.f) {
                                        pwiVar = (pwi) ((ArrayDeque) o02Var.g).poll();
                                        break;
                                    }
                                    if (pwiVar == null) {
                                        pwiVar2.run();
                                    } else {
                                        pwiVar.run();
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Exception e3) {
                    o02Var.l(e3);
                    return;
                }
            default:
                o3k o3kVar = (o3k) this.c;
                f25 f25Var = (f25) this.d;
                boolean z6 = this.b;
                rve rveVar = o3kVar.a;
                f25 f25Var2 = (f25) rveVar.b.get();
                if (rveVar.j.get() || f25Var2 != f25Var) {
                    return;
                }
                if (z6) {
                    rveVar.b();
                    return;
                } else {
                    rveVar.a();
                    return;
                }
        }
    }

    public /* synthetic */ jm(Object obj, boolean z, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    public /* synthetic */ jm(boolean z, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }
}
