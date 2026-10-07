package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class w6i {
    public static final w6i a;
    public static final w6i b;
    public static final w6i c;
    public static final /* synthetic */ w6i[] d;

    static {
        w6i w6iVar = new w6i("CREATE", 0);
        a = w6iVar;
        w6i w6iVar2 = new w6i("EDIT", 1);
        b = w6iVar2;
        w6i w6iVar3 = new w6i("RESTORE", 2);
        c = w6iVar3;
        d = new w6i[]{w6iVar, w6iVar2, w6iVar3};
    }

    public static w6i valueOf(String str) {
        return (w6i) Enum.valueOf(w6i.class, str);
    }

    public static w6i[] values() {
        return (w6i[]) d.clone();
    }
}
