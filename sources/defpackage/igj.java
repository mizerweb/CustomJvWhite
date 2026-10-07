package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class igj implements pkj {
    public static final igj a;
    public static final /* synthetic */ igj[] b;
    public static final /* synthetic */ ma6 c;

    static {
        igj igjVar = new igj("CHANGE_SCREEN_BRIGHTNESS", 0);
        a = igjVar;
        igj[] igjVarArr = {igjVar};
        b = igjVarArr;
        c = new ma6(igjVarArr);
    }

    public static igj valueOf(String str) {
        return (igj) Enum.valueOf(igj.class, str);
    }

    public static igj[] values() {
        return (igj[]) b.clone();
    }

    @Override // defpackage.pkj
    public final Integer a() {
        return null;
    }

    @Override // defpackage.pkj
    public final String h() {
        return "WebAppChangeScreenBrightness";
    }

    @Override // defpackage.pkj
    public final String i() {
        return "change_screen_brightness";
    }
}
