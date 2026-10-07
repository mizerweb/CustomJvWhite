package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class atc {
    public static final atc a;
    public static final atc b;
    public static final atc c;
    public static final /* synthetic */ atc[] d;

    static {
        atc atcVar = new atc("READY", 0);
        a = atcVar;
        atc atcVar2 = new atc("SKIP", 1);
        b = atcVar2;
        atc atcVar3 = new atc("REMOVE", 2);
        c = atcVar3;
        d = new atc[]{atcVar, atcVar2, atcVar3};
    }

    public static atc valueOf(String str) {
        return (atc) Enum.valueOf(atc.class, str);
    }

    public static atc[] values() {
        return (atc[]) d.clone();
    }
}
