package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class q1f {
    public static final long[] a = {-9187201950435737345L, -1};
    public static final b9b b = new b9b(0);

    public static final int a(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    public static final b9b b() {
        return new b9b();
    }

    public static final b9b c(ylc... ylcVarArr) {
        b9b b9bVar = new b9b(ylcVarArr.length);
        for (ylc ylcVar : ylcVarArr) {
            b9bVar.o(ylcVar.a, ylcVar.b);
        }
        return b9bVar;
    }

    public static final int d(int i) {
        if (i == 0) {
            return 6;
        }
        return (i * 2) + 1;
    }

    public static final int e(int i) {
        if (i > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }

    public static final int f(int i) {
        if (i == 7) {
            return 8;
        }
        return ((i - 1) / 7) + i;
    }
}
