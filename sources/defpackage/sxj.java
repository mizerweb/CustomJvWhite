package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sxj extends Enum {
    public static final sxj a;
    public static final sxj b;
    public static final sxj c;
    public static final sxj d;
    public static final sxj e;
    public static final sxj f;
    public static final sxj g;
    public static final sxj h;
    public static final sxj i;
    public static final /* synthetic */ sxj[] j;

    static {
        sxj sxjVar = new sxj("INT", 0);
        a = sxjVar;
        sxj sxjVar2 = new sxj("LONG", 1);
        b = sxjVar2;
        sxj sxjVar3 = new sxj("FLOAT", 2);
        c = sxjVar3;
        sxj sxjVar4 = new sxj("DOUBLE", 3);
        d = sxjVar4;
        sxj sxjVar5 = new sxj("BOOLEAN", 4);
        e = sxjVar5;
        sxj sxjVar6 = new sxj("STRING", 5);
        f = sxjVar6;
        c71 c71Var = c71.c;
        sxj sxjVar7 = new sxj("BYTE_STRING", 6);
        g = sxjVar7;
        sxj sxjVar8 = new sxj("ENUM", 7);
        h = sxjVar8;
        sxj sxjVar9 = new sxj("MESSAGE", 8);
        i = sxjVar9;
        j = new sxj[]{sxjVar, sxjVar2, sxjVar3, sxjVar4, sxjVar5, sxjVar6, sxjVar7, sxjVar8, sxjVar9};
    }

    public static sxj valueOf(String str) {
        return (sxj) Enum.valueOf(sxj.class, str);
    }

    public static sxj[] values() {
        return (sxj[]) j.clone();
    }
}
