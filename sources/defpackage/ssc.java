package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ssc {
    public static final ssc a;
    public static final ssc b;
    public static final /* synthetic */ ssc[] c;

    static {
        ssc sscVar = new ssc("GRANTED", 0);
        a = sscVar;
        ssc sscVar2 = new ssc("DENIED", 1);
        b = sscVar2;
        c = new ssc[]{sscVar, sscVar2};
    }

    public static ssc valueOf(String str) {
        return (ssc) Enum.valueOf(ssc.class, str);
    }

    public static ssc[] values() {
        return (ssc[]) c.clone();
    }
}
