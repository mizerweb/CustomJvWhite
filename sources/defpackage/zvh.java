package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zvh extends Enum {
    public static final zvh a;
    public static final zvh b;
    public static final zvh c;
    public static final /* synthetic */ zvh[] d;

    static {
        zvh zvhVar = new zvh("DUMMY", 0);
        a = zvhVar;
        zvh zvhVar2 = new zvh("DIRECT", 1);
        b = zvhVar2;
        zvh zvhVar3 = new zvh("SERVER", 2);
        c = zvhVar3;
        d = new zvh[]{zvhVar, zvhVar2, zvhVar3};
    }

    public static final zvh a(String str) {
        if (str.equals("DIRECT")) {
            return b;
        }
        return str.equals("SERVER") ? c : a;
    }

    public static zvh valueOf(String str) {
        return (zvh) Enum.valueOf(zvh.class, str);
    }

    public static zvh[] values() {
        return (zvh[]) d.clone();
    }
}
