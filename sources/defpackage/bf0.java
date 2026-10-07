package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bf0 implements zpb {
    public static final bf0 a = new bf0();
    public static final jp6 b = jp6.c("networkType");
    public static final jp6 c = jp6.c("mobileSubtype");

    @Override // defpackage.v76
    public final void a(Object obj, Object obj2) {
        tcb tcbVar = (tcb) obj;
        aqb aqbVar = (aqb) obj2;
        aqbVar.a(b, ((di0) tcbVar).a);
        aqbVar.a(c, ((di0) tcbVar).b);
    }
}
