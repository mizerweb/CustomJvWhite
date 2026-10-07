package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class msh {
    public static final msh a;
    public static final msh b;
    public static final /* synthetic */ msh[] c;

    static {
        msh mshVar = new msh("UPTIME", 0);
        a = mshVar;
        msh mshVar2 = new msh("REALTIME", 1);
        b = mshVar2;
        c = new msh[]{mshVar, mshVar2};
    }

    public static msh valueOf(String str) {
        return (msh) Enum.valueOf(msh.class, str);
    }

    public static msh[] values() {
        return (msh[]) c.clone();
    }
}
