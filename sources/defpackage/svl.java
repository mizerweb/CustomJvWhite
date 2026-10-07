package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class svl {
    public static final dih a(yhh yhhVar) {
        String str;
        zhh zhhVar = zhh.a;
        if (yhhVar == null) {
            return zhhVar;
        }
        String str2 = yhhVar.d;
        String str3 = yhhVar.b;
        if ((yhhVar instanceof eih) && (str = ((eih) yhhVar).e) != null && str.length() != 0) {
            return new cih(str);
        }
        if (str2 != null && str2.length() > 0) {
            return new cih(str2);
        }
        if (p90.C(str3 == null ? "" : str3) && "io.exception".equals(str3)) {
            return aih.a;
        }
        if (str3 == null) {
            str3 = "";
        }
        return p90.C(str3) ? bih.a : zhhVar;
    }

    public abstract void b(Throwable th);

    public abstract void c(ljf ljfVar);
}
