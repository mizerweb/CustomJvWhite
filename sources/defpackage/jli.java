package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class jli {
    public static final jli a;
    public static final jli b;
    public static final jli c;
    public static final /* synthetic */ jli[] d;
    public static final /* synthetic */ ma6 e;

    static {
        jli jliVar = new jli("SESSION_CONFIG", 0);
        a = jliVar;
        jli jliVar2 = new jli("DEFAULT", 1);
        b = jliVar2;
        jli jliVar3 = new jli("CAMERA2_CAMERA_CONTROL", 2);
        c = jliVar3;
        jli[] jliVarArr = {jliVar, jliVar2, jliVar3};
        d = jliVarArr;
        e = new ma6(jliVarArr);
    }

    public static jli valueOf(String str) {
        return (jli) Enum.valueOf(jli.class, str);
    }

    public static jli[] values() {
        return (jli[]) d.clone();
    }
}
