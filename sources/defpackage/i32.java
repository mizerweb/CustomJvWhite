package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class i32 {
    public final jb1 a;
    public final ifh b;
    public final zfh c;
    public final so2 d;
    public final vn7 e;
    public final ih f;
    public final n11 g;
    public final d32 h;
    public final g85 i;
    public final gi1 j;
    public final ih k;
    public final cf4 l;
    public final ec1 m;
    public final h9 n;

    public i32(Context context, jb1 jb1Var, esh eshVar, ConnectivityManager connectivityManager, CidLogger cidLogger, due dueVar, qs4 qs4Var, xt1 xt1Var) {
        context.getClass();
        eshVar.getClass();
        xt1Var.getClass();
        this.a = jb1Var;
        this.b = new ifh(new yk1(10, this));
        zfh zfhVar = new zfh(dueVar);
        this.c = zfhVar;
        so2 so2Var = new so2(21);
        this.d = so2Var;
        vn7 vn7Var = new vn7(12, qs4Var);
        this.e = vn7Var;
        ih ihVar = new ih(connectivityManager, cidLogger);
        this.f = ihVar;
        v88 v88Var = xt1Var.r;
        n11 n11Var = new n11(v88Var.E.a(), dueVar, 7);
        this.g = n11Var;
        this.h = new d32(jb1Var, cidLogger, zfhVar, so2Var, vn7Var, ihVar, eshVar, n11Var, xt1Var);
        g85 g85Var = new g85();
        ljf ljfVar = new ljf(27);
        g85Var.a = ljfVar;
        uvc uvcVar = new uvc(ljfVar);
        zu4 zu4Var = new zu4(ljfVar);
        y50 y50Var = new y50();
        y50Var.d = ljfVar;
        y50Var.e = uvcVar;
        y50Var.f = zu4Var;
        y50Var.g = new Object();
        g85Var.b = y50Var;
        g85Var.c = new bv4(ljfVar);
        g85Var.d = new sti(ljfVar);
        g85Var.e = new w74();
        this.i = g85Var;
        gi1 gi1Var = new gi1((CallAnalyticsSender) jb1Var.d, eshVar, zfhVar, vn7Var, ihVar, cidLogger);
        this.j = gi1Var;
        ih ihVar2 = new ih();
        ihVar2.a = gi1Var;
        ihVar2.b = new AtomicBoolean(false);
        this.k = ihVar2;
        this.l = new cf4(jb1Var, cidLogger, new bf4(v88Var.i, v88Var.j, v88Var.k));
        CallAnalyticsSender callAnalyticsSender = (CallAnalyticsSender) jb1Var.d;
        context.getClass();
        eshVar.getClass();
        g85 g85Var2 = new g85();
        g85Var2.a = context;
        g85Var2.b = cidLogger;
        g85Var2.c = eshVar;
        g85Var2.e = new cg(4, g85Var2);
        this.m = new ec1(callAnalyticsSender, g85Var2, eshVar);
        this.n = new h9(gi1Var, eshVar, cidLogger);
    }
}
