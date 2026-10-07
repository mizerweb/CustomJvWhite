package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class m94 {
    public static final od6 a;
    public static final od6 b;
    public static final ny8 c;
    public static final ifh d;
    public static final ifh e;
    public static final od6 f;
    public static final ku6 g;
    public static final z1c h;
    public static final ifh i;
    public static final ifh j;
    public static final ifh k;
    public static final ifh l;
    public static final ifh m;
    public static final ifh n;
    public static final ifh o;

    static {
        od6 od6Var = new od6("common", 1, 1, 5000L, true, true, 0, false, true, 64);
        a = od6Var;
        b = od6.a(od6Var, "single-net", 382);
        c = rx8.P(2, new b6(28));
        d = new ifh(new i94(4));
        e = new ifh(new i94(5));
        f = new od6("computation", 1, (Runtime.getRuntime().availableProcessors() * 2) - 1, 5000L, true, false, 0, false, false, 96);
        ku6 ku6Var = ku6.f;
        g = ku6Var;
        ghb ghbVar = ew5.b;
        lw5 lw5Var = lw5.SECONDS;
        h = new z1c(true ? 1 : 0, qe7.O(1, lw5Var), qe7.O(3, lw5Var), new c6(26), new c6(27), ku6Var, 2);
        i = new ifh(new i94(6));
        j = new ifh(new i94(7));
        k = new ifh(new i94(8));
        l = new ifh(new b6(29));
        m = new ifh(new i94(0));
        n = new ifh(new i94(2));
        o = new ifh(new i94(3));
    }
}
