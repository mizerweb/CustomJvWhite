package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class vhd {
    public static final vhd a;
    public static final vhd b;
    public static final vhd c;
    public static final /* synthetic */ vhd[] d;

    static {
        vhd vhdVar = new vhd("DEFAULT", 0);
        a = vhdVar;
        vhd vhdVar2 = new vhd("VERY_LOW", 1);
        b = vhdVar2;
        vhd vhdVar3 = new vhd("HIGHEST", 2);
        c = vhdVar3;
        d = new vhd[]{vhdVar, vhdVar2, vhdVar3};
    }

    public static vhd valueOf(String str) {
        return (vhd) Enum.valueOf(vhd.class, str);
    }

    public static vhd[] values() {
        return (vhd[]) d.clone();
    }
}
