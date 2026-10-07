package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class zoc {
    public static final zoc a;
    public static final zoc b;
    public static final zoc c;
    public static final zoc d;
    public static final zoc e;
    public static final zoc f;
    public static final zoc g;
    public static final zoc h;
    public static final /* synthetic */ zoc[] i;

    static {
        zoc zocVar = new zoc("NO_VALUE", 0);
        a = zocVar;
        zoc zocVar2 = new zoc("ENCODING_INVALID", 1);
        b = zocVar2;
        zoc zocVar3 = new zoc("ENCODING_PCM_8BIT", 2);
        c = zocVar3;
        zoc zocVar4 = new zoc("ENCODING_PCM_16BIT", 3);
        d = zocVar4;
        zoc zocVar5 = new zoc("ENCODING_PCM_16BIT_BIG_ENDIAN", 4);
        e = zocVar5;
        zoc zocVar6 = new zoc("ENCODING_PCM_24BIT", 5);
        f = zocVar6;
        zoc zocVar7 = new zoc("ENCODING_PCM_32BIT", 6);
        g = zocVar7;
        zoc zocVar8 = new zoc("ENCODING_PCM_FLOAT", 7);
        h = zocVar8;
        i = new zoc[]{zocVar, zocVar2, zocVar3, zocVar4, zocVar5, zocVar6, zocVar7, zocVar8};
    }

    public static zoc valueOf(String str) {
        return (zoc) Enum.valueOf(zoc.class, str);
    }

    public static zoc[] values() {
        return (zoc[]) i.clone();
    }
}
