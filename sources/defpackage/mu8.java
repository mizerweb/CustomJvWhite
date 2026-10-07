package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.LinkedHashMap;
import one.me.background.wake.BackgroundListenService;

/* JADX INFO: loaded from: classes2.dex */
public final class mu8 implements hu8 {
    public static void a(Context context) {
        Object poeVar;
        a4c a4cVar;
        gm0.n("KeepBackground", "BackgroundListenService.start() requested");
        try {
            context.startForegroundService(new Intent(context, (Class<?>) BackgroundListenService.class));
            poeVar = sbi.a;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA == null || (a4cVar = gm0.f) == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "KeepBackground", qv1.k("Failed to start service: ", thA.getMessage()), thA);
        }
    }

    @Override // defpackage.hu8
    public Object parse(vu8 vu8Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        vu8Var.p();
        while (vu8Var.hasNext()) {
            linkedHashMap.put(vu8Var.name(), vu8Var.F());
        }
        vu8Var.t();
        return linkedHashMap;
    }
}
