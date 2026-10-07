package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l76 {
    public static final mj9 a = new mj9(8);

    public static String a(kbc kbcVar, x0g x0gVar, Integer num) {
        String name = kbcVar.getName();
        String strName = x0gVar.name();
        String strH = num != null ? zo5.h(num.intValue(), "_") : null;
        if (strH == null) {
            strH = "";
        }
        return nbh.v(name, "_", strName, strH);
    }
}
