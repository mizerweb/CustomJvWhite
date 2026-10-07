package defpackage;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import com.my.tracker.MyTrackerConfig;
import java.util.Iterator;
import one.me.chats.list.ChatsListWidget;
import one.me.pinbars.PinBarsWidget;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gve implements rah, t47, k74, e40, s89, rv9, c3a, MyTrackerConfig.Logger, btb, cbh {
    public final /* synthetic */ Object a;

    public /* synthetic */ gve(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.k74
    public Object B(h74 h74Var) {
        return this.a;
    }

    @Override // defpackage.c3a
    public void a(h2a h2aVar, int i) {
        h2aVar.g(i, (h3d) this.a);
    }

    @Override // defpackage.cbh
    public dbh b(bbh bbhVar) {
        Context context = (Context) this.a;
        String str = (String) bbhVar.d;
        n31 n31Var = (n31) bbhVar.e;
        if (str != null && str.length() != 0) {
            return new md7(context, str, n31Var, true, true);
        }
        ore.p("Must set a non-null database name to a configuration that uses the no backup directory.");
        return null;
    }

    @Override // defpackage.s89
    public void c(Object obj, cx6 cx6Var) {
        ((j3d) obj).u0(((jv9) this.a).a, new i3d(cx6Var));
    }

    public void d() {
        hve hveVar = (hve) this.a;
        if (hveVar.f) {
            Iterator it = hveVar.e().iterator();
            int i = 0;
            while (it.hasNext()) {
                dtb dtbVar = ((lve) it.next()).a.onBackPressedCallback;
                int i2 = i + 1;
                boolean z = true;
                if (i <= 0 && hveVar.e == 1) {
                    z = false;
                }
                dtbVar.f(z);
                i = i2;
            }
        }
    }

    public void e(o47 o47Var) {
        ChatsListWidget chatsListWidget = (ChatsListWidget) this.a;
        zv8[] zv8VarArr = ChatsListWidget.X;
        rl3 rl3VarT1 = chatsListWidget.t1();
        String str = rl3VarT1.U1;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.e;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onFolderWidgetClicked " + o47Var, null);
            }
        }
        n47 n47VarI = o47Var.i();
        if (n47VarI instanceof m47) {
            String strA = ((m47) o47Var.i()).a();
            e9i.j0(e9i.T(new fz6(((c59) rl3VarT1.w.getValue()).g(strA), new jd3(rl3VarT1, strA, (lq4) null, 4), 3), ((n0c) rl3VarT1.h).b()), rl3VarT1.b);
        } else if (n47VarI instanceof l47) {
            a8j.x(rl3VarT1.K1, zm3.z(zm3.b, ((l47) o47Var.i()).a(), bdj.FOLDER, ((l47) o47Var.i()).c(), ((l47) o47Var.i()).b(), 8));
        } else {
            if (n47VarI == null) {
                return;
            }
            ore.o();
        }
    }

    @Override // defpackage.e40
    public void error(String str, Throwable th) {
        ((as6) this.a).b.error(str, th);
    }

    public void f(boolean z) {
        PinBarsWidget pinBarsWidget = (PinBarsWidget) this.a;
        pinBarsWidget.w.B(pinBarsWidget, PinBarsWidget.z[2], Boolean.valueOf(z));
    }

    @Override // defpackage.rah
    public Object get() {
        ((Runnable) this.a).run();
        return null;
    }

    @Override // defpackage.rv9
    public void l(jv9 jv9Var) {
        re4 re4Var = (re4) this.a;
        xnf xnfVar = jv9Var.e;
        iu9 iu9Var = jv9Var.a;
        if (jv9Var.D != null) {
            lvb.k0("MCImplBase", "Cannot be notified about the connection result many times. Probably a bug or malicious app.");
            iu9Var.Q();
            return;
        }
        e38 e38Var = re4Var.c;
        c98 c98Var = re4Var.n;
        Bundle bundle = re4Var.i;
        jv9Var.D = e38Var;
        jv9Var.r = re4Var.d;
        jv9Var.w = re4Var.e;
        h3d h3dVar = re4Var.f;
        jv9Var.x = h3dVar;
        h3d h3dVar2 = re4Var.g;
        jv9Var.y = h3dVar2;
        h3d h3dVarY = jv9.Y(h3dVar, h3dVar2);
        jv9Var.z = h3dVarY;
        c98 c98Var2 = re4Var.k;
        jv9Var.s = c98Var2;
        c98 c98Var3 = re4Var.l;
        jv9Var.t = c98Var3;
        ghe gheVarN0 = jv9.n0(c98Var3, c98Var2, jv9Var.w, h3dVarY, bundle);
        jv9Var.u = gheVarN0;
        jv9Var.v = jv9.m0(gheVarN0, jv9Var.s, bundle, jv9Var.w, jv9Var.z);
        hle hleVar = new hle(4);
        for (int i = 0; i < c98Var.size(); i++) {
            by3 by3Var = (by3) c98Var.get(i);
            emf emfVar = by3Var.a;
            if (emfVar != null && emfVar.a == 0) {
                hleVar.j(emfVar.b, by3Var);
            }
        }
        hleVar.c(true);
        jv9Var.q = re4Var.j;
        MediaSession.Token tokenH = re4Var.m;
        if (tokenH == null) {
            tokenH = xnfVar.a.h();
        }
        MediaSession.Token token = tokenH;
        if (token != null) {
            jv9Var.E = new MediaController(jv9Var.d, token);
        }
        try {
            re4Var.c.asBinder().linkToDeath(jv9Var.g, 0);
            jv9Var.n = new xnf(xnfVar.a.a(), re4Var.a, re4Var.b, xnfVar.a.getPackageName(), re4Var.c, re4Var.h, token);
            jv9Var.I = bundle;
            iu9Var.P();
        } catch (RemoteException unused) {
            iu9Var.Q();
        }
    }

    @Override // com.my.tracker.MyTrackerConfig.Logger
    public void log(int i, String str, Throwable th) {
        Object next;
        if (i >= ((Number) ((e5d) this.a).X1.a(e5d.S6[152]).i()).intValue()) {
            Iterator it = je9.k.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((je9) next).a != i);
            je9 je9Var = (je9) next;
            if (je9Var == null) {
                je9Var = je9.c;
            }
            gm0.D(je9Var, "OneMeMyTracker", str, th);
        }
    }

    @Override // defpackage.btb
    public ixj s(View view, ixj ixjVar) {
        j11 j11Var;
        vjg vjgVar = (vjg) this.a;
        if (vjgVar.g) {
            return ixjVar;
        }
        vjgVar.e = ixjVar;
        WindowInsets windowInsetsF = ixjVar.f();
        int iMax = 0;
        if (windowInsetsF != null) {
            if (Build.VERSION.SDK_INT < 31 || (j11Var = vjgVar.b.d) == null || !j11Var.c) {
                windowInsetsF = null;
            }
            if (windowInsetsF != null) {
                RoundedCorner roundedCorner = windowInsetsF.getRoundedCorner(3);
                int radius = roundedCorner != null ? roundedCorner.getRadius() : 0;
                RoundedCorner roundedCorner2 = windowInsetsF.getRoundedCorner(2);
                iMax = Math.max(radius / 2, (roundedCorner2 != null ? roundedCorner2.getRadius() : 0) / 2);
            }
        }
        vjgVar.f = iMax;
        vjgVar.c(ixjVar);
        return vjgVar.d(ixjVar);
    }
}
