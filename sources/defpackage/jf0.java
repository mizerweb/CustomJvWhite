package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jf0 implements zpb {
    public static final jf0 a = new jf0();
    public static final jp6 b = new jp6("logSource", p.h(p.g(owd.class, new z30(1))));
    public static final jp6 c = new jp6("logEventDropped", p.h(p.g(owd.class, new z30(2))));

    @Override // defpackage.v76
    public final void a(Object obj, Object obj2) {
        me9 me9Var = (me9) obj;
        aqb aqbVar = (aqb) obj2;
        aqbVar.a(b, me9Var.a);
        aqbVar.a(c, me9Var.b);
    }
}
