package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class nkg {
    public static final nkg a;
    public static final nkg b;
    public static final nkg c;
    public static final /* synthetic */ nkg[] d;

    static {
        nkg nkgVar = new nkg("DEFAULT", 0);
        a = nkgVar;
        nkg nkgVar2 = new nkg("WITH_CALL_PIP", 1);
        b = nkgVar2;
        nkg nkgVar3 = new nkg("WITH_VIDEO_PIP", 2);
        c = nkgVar3;
        d = new nkg[]{nkgVar, nkgVar2, nkgVar3};
    }

    public static nkg valueOf(String str) {
        return (nkg) Enum.valueOf(nkg.class, str);
    }

    public static nkg[] values() {
        return (nkg[]) d.clone();
    }
}
