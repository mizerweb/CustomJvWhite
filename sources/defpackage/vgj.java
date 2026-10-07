package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class vgj implements pkj {
    public static final vgj a;
    public static final /* synthetic */ vgj[] b;
    public static final /* synthetic */ ma6 c;

    static {
        vgj vgjVar = new vgj("OPEN", 0);
        a = vgjVar;
        vgj[] vgjVarArr = {vgjVar};
        b = vgjVarArr;
        c = new ma6(vgjVarArr);
    }

    public static vgj valueOf(String str) {
        return (vgj) Enum.valueOf(vgj.class, str);
    }

    public static vgj[] values() {
        return (vgj[]) b.clone();
    }

    @Override // defpackage.pkj
    public final Integer a() {
        return 30;
    }

    @Override // defpackage.pkj
    public final String h() {
        return "WebAppOpenCodeReader";
    }

    @Override // defpackage.pkj
    public final String i() {
        return "open_code_reader";
    }
}
