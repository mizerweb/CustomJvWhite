package defpackage;

import android.os.Build;
import java.util.Arrays;
import java.util.concurrent.Executor;
import one.me.sdk.database.OneMeRoomDatabase;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sre implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w6c b;

    public /* synthetic */ sre(w6c w6cVar, int i) {
        this.a = i;
        this.b = w6cVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        w6c w6cVar = this.b;
        switch (i) {
            case 0:
                pre preVarI = np4.i(w6cVar.a, OneMeRoomDatabase.class, w6cVar.b);
                preVarI.s = Build.VERSION.SDK_INT < 30 ? 2 : 3;
                eh9 eh9Var = w6cVar.h;
                preVarI.a((zxa[]) Arrays.copyOf(new zxa[]{new cya(eh9Var, w6cVar.i), new aya(4, 5, 12), new aya(7, 8, 14), new aya(14, 15, 10), new hya(eh9Var), new pya(eh9Var), new dya(eh9Var), new eya(), new hya(0), new aya(41, 42, 11), new iya(0), new aya(51, 52, 13), new jya(0), new kya(eh9Var), new dya(w6cVar.j), new lya(0), new mya(0), new pya(0)}, 18));
                preVarI.f = (Executor) w6cVar.d.getValue();
                preVarI.g = (Executor) w6cVar.e.getValue();
                for (Object obj : w6cVar.c) {
                    preVarI.e.add(obj);
                }
                preVarI.o = false;
                preVarI.p = true;
                preVarI.q = true;
                a1c a1cVar = w6cVar.f;
                sre sreVar = new sre(w6cVar, 1);
                xvc xvcVar = new xvc(18);
                u50 u50Var = new u50();
                u50Var.a = a1cVar;
                u50Var.b = sreVar;
                u50Var.c = xvcVar;
                preVarI.h = u50Var;
                preVarI.d.add(new gs3(1, w6cVar));
                return preVarI.b();
            default:
                return (j48) ((OneMeRoomDatabase) ((rre) w6cVar.g.getValue())).n.getValue();
        }
    }
}
