package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class jhj implements pkj {
    public static final jhj a;
    public static final /* synthetic */ jhj[] b;
    public static final /* synthetic */ ma6 c;

    static {
        jhj jhjVar = new jhj("DOWNLOAD_FILE", 0);
        a = jhjVar;
        jhj[] jhjVarArr = {jhjVar};
        b = jhjVarArr;
        c = new ma6(jhjVarArr);
    }

    public static jhj valueOf(String str) {
        return (jhj) Enum.valueOf(jhj.class, str);
    }

    public static jhj[] values() {
        return (jhj[]) b.clone();
    }

    @Override // defpackage.pkj
    public final Integer a() {
        return 12;
    }

    @Override // defpackage.pkj
    public final String h() {
        return "WebAppDownloadFile";
    }

    @Override // defpackage.pkj
    public final String i() {
        return "download_file";
    }
}
