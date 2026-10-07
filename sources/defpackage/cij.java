package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class cij implements pkj {
    public static final cij a;
    public static final /* synthetic */ cij[] b;
    public static final /* synthetic */ ma6 c;

    static {
        cij cijVar = new cij("GET_LAUNCH_CONTEXT", 0);
        a = cijVar;
        cij[] cijVarArr = {cijVar};
        b = cijVarArr;
        c = new ma6(cijVarArr);
    }

    public static cij valueOf(String str) {
        return (cij) Enum.valueOf(cij.class, str);
    }

    public static cij[] values() {
        return (cij[]) b.clone();
    }

    @Override // defpackage.pkj
    public final Integer a() {
        return null;
    }

    @Override // defpackage.pkj
    public final String h() {
        return "WebAppGetLaunchContext";
    }

    @Override // defpackage.pkj
    public final String i() {
        return "get_launch_context";
    }
}
