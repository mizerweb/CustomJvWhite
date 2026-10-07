package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class gef {
    public static final gef a;
    public static final gef b;
    public static final gef c;
    public static final /* synthetic */ gef[] d;

    static {
        gef gefVar = new gef("DEFAULT", 0);
        a = gefVar;
        gef gefVar2 = new gef("FILE", 1);
        b = gefVar2;
        gef gefVar3 = new gef("COLLAGE", 2);
        c = gefVar3;
        d = new gef[]{gefVar, gefVar2, gefVar3};
    }

    public static gef valueOf(String str) {
        return (gef) Enum.valueOf(gef.class, str);
    }

    public static gef[] values() {
        return (gef[]) d.clone();
    }
}
