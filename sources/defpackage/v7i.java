package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class v7i {
    public static final v7i a;
    public static final v7i b;
    public static final /* synthetic */ v7i[] c;

    static {
        v7i v7iVar = new v7i("START", 0);
        a = v7iVar;
        v7i v7iVar2 = new v7i("FINISH", 1);
        b = v7iVar2;
        c = new v7i[]{v7iVar, v7iVar2};
    }

    public static v7i valueOf(String str) {
        return (v7i) Enum.valueOf(v7i.class, str);
    }

    public static v7i[] values() {
        return (v7i[]) c.clone();
    }
}
