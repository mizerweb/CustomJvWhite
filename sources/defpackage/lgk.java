package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class lgk {
    public static final lgk a;
    public static final lgk b;
    public static final lgk c;
    public static final /* synthetic */ lgk[] d;

    static {
        lgk lgkVar = new lgk("TCP_RELAY", 0);
        a = lgkVar;
        lgk lgkVar2 = new lgk("UDP_RELAY", 1);
        b = lgkVar2;
        lgk lgkVar3 = new lgk("SRFLX", 2);
        c = lgkVar3;
        d = new lgk[]{lgkVar, lgkVar2, lgkVar3};
    }

    public static lgk valueOf(String str) {
        return (lgk) Enum.valueOf(lgk.class, str);
    }

    public static lgk[] values() {
        return (lgk[]) d.clone();
    }
}
