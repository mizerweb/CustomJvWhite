package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class x6l implements zpb {
    public static final x6l a = new x6l();
    public static final jp6 b = new jp6("modelType", p.h(ewi.g(xqk.class, new ppk(1))));
    public static final jp6 c = new jp6("isSuccessful", p.h(ewi.g(xqk.class, new ppk(2))));
    public static final jp6 d = new jp6("modelName", p.h(ewi.g(xqk.class, new ppk(3))));

    @Override // defpackage.v76
    public final void a(Object obj, Object obj2) {
        sql sqlVar = (sql) obj;
        aqb aqbVar = (aqb) obj2;
        aqbVar.a(b, sqlVar.a);
        aqbVar.a(c, sqlVar.b);
        aqbVar.a(d, null);
    }
}
