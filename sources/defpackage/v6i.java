package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class v6i {
    public static final v6i a;
    public static final v6i b;
    public static final /* synthetic */ v6i[] c;

    static {
        v6i v6iVar = new v6i("CREATE_PASSWORD", 0);
        a = v6iVar;
        v6i v6iVar2 = new v6i("CREATE_HINT", 1);
        v6i v6iVar3 = new v6i("ADD_EMAIL", 2);
        v6i v6iVar4 = new v6i("VERIFY_EMAIL", 3);
        b = v6iVar4;
        c = new v6i[]{v6iVar, v6iVar2, v6iVar3, v6iVar4};
    }

    public static v6i valueOf(String str) {
        return (v6i) Enum.valueOf(v6i.class, str);
    }

    public static v6i[] values() {
        return (v6i[]) c.clone();
    }
}
