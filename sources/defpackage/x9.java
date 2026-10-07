package defpackage;

import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class x9 extends ux8 implements af7 {
    public static final x9 b = new x9(0, 0);
    public static final x9 c = new x9(0, 1);
    public static final x9 d = new x9(0, 2);
    public static final x9 e = new x9(0, 3);
    public static final x9 f = new x9(0, 4);
    public static final x9 g = new x9(0, 5);
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x9(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        String str;
        switch (this.a) {
            case 0:
                return Integer.valueOf(i4e.b.d(2147418112) + 65536);
            case 1:
                return new UriMatcher(-1);
            case 2:
                Context context = swh.d;
                Context context2 = context != null ? context : null;
                String strP = ch3.p();
                if (strP.equals(context2.getPackageName())) {
                    str = "tracer";
                } else {
                    str = "tracer-" + ((Object) Uri.encode(z5h.I0(strP, ':', '-', false)));
                }
                return new pv5(lu6.q0(new File(context2.getCacheDir(), str), "drops.json"));
            case 3:
                Context context3 = swh.d;
                if (context3 == null) {
                    context3 = null;
                }
                swh swhVar = swh.a;
                Object obj = swh.c().get(cqk.b);
                lt4 lt4Var = obj instanceof lt4 ? (lt4) obj : null;
                if (lt4Var == null) {
                    lt4Var = new lt4(new v2a(18));
                }
                return kyl.a(context3, lt4Var.c);
            case 4:
                swh swhVar2 = swh.a;
                Object obj2 = swh.c().get(cqk.b);
                if ((obj2 instanceof lt4 ? (lt4) obj2 : null) == null) {
                    new v2a(18).j();
                }
                return Executors.newSingleThreadExecutor(new xxh());
            default:
                swh swhVar3 = swh.a;
                Object obj3 = swh.c().get(cqk.b);
                if ((obj3 instanceof lt4 ? (lt4) obj3 : null) == null) {
                    new v2a(18).j();
                }
                return Executors.newCachedThreadPool(new ct5(1, new AtomicInteger(0)));
        }
    }
}
