package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class of0 implements zpb {
    public static final of0 a = new of0();
    public static final jp6 b = new jp6("currentCacheSizeBytes", p.h(p.g(owd.class, new z30(1))));
    public static final jp6 c = new jp6("maxCacheSizeBytes", p.h(p.g(owd.class, new z30(2))));

    @Override // defpackage.v76
    public final void a(Object obj, Object obj2) {
        lqg lqgVar = (lqg) obj;
        aqb aqbVar = (aqb) obj2;
        aqbVar.e(b, lqgVar.a);
        aqbVar.e(c, lqgVar.b);
    }
}
