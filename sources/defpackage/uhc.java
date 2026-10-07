package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif(with = vhc.class)
public final class uhc extends Enum<uhc> {
    public static final thc Companion;
    public static final uhc a;
    public static final /* synthetic */ uhc[] b;
    public static final /* synthetic */ ma6 c;

    static {
        uhc uhcVar = new uhc("ORG_MAIN", 0);
        a = uhcVar;
        uhc[] uhcVarArr = {uhcVar};
        b = uhcVarArr;
        c = new ma6(uhcVarArr);
        Companion = new thc();
    }

    public static uhc valueOf(String str) {
        return (uhc) Enum.valueOf(uhc.class, str);
    }

    public static uhc[] values() {
        return (uhc[]) b.clone();
    }
}
