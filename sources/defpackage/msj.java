package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class msj implements pkj {
    public static final msj a;
    public static final /* synthetic */ msj[] b;
    public static final /* synthetic */ ma6 c;

    static {
        msj msjVar = new msj("GET_VIEWPORT_SIZE", 0);
        a = msjVar;
        msj[] msjVarArr = {msjVar};
        b = msjVarArr;
        c = new ma6(msjVarArr);
    }

    public static msj valueOf(String str) {
        return (msj) Enum.valueOf(msj.class, str);
    }

    public static msj[] values() {
        return (msj[]) b.clone();
    }

    @Override // defpackage.pkj
    public final Integer a() {
        return null;
    }

    @Override // defpackage.pkj
    public final String h() {
        return "WebAppGetViewportSize";
    }

    @Override // defpackage.pkj
    public final String i() {
        return "get_viewport_size";
    }
}
