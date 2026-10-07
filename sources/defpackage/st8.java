package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class st8 extends pj7 {
    public static final int[] l = lt2.j;
    public final sa6 f;
    public int[] g;
    public final int h;
    public oif i;
    public final boolean j;
    public final boolean k;

    public st8(int i, l38 l38Var) {
        super(i, l38Var);
        this.g = l;
        this.i = pt8.o;
        this.f = l38Var.h;
        if (qt8.ESCAPE_NON_ASCII.a(i)) {
            this.h = 127;
        }
        this.k = qt8.WRITE_HEX_UPPER_CASE.a(i);
        this.j = !qt8.QUOTE_FIELD_NAMES.a(i);
    }
}
