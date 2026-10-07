package defpackage;

import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes.dex */
public final class o35 {
    public final String a = o35.class.getName();
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;

    public o35(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
    }

    public static final String a(o35 o35Var, List list) {
        ts8 ts8Var = new ts8();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fhh fhhVar = (fhh) it.next();
            du8 du8Var = new du8();
            l51.d(du8Var, SdkMetricStatEvent.NAME_KEY, fhhVar.b());
            l51.c(du8Var, "rows", Long.valueOf(fhhVar.c()));
            l51.c(du8Var, "bytes", Long.valueOf(fhhVar.a()));
            ts8Var.a(du8Var.a());
        }
        return ts8Var.b().toString();
    }
}
