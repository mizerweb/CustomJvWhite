package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class cqb {
    public static final Object[] a = new Object[0];
    public static final u8b b = new u8b(0);

    public static final void a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            gol.e("Index " + i + " is out of bounds. The list has " + size + " elements.");
            throw null;
        }
    }

    public static final void b(int i, int i2, List list) {
        int size = list.size();
        if (i > i2) {
            gol.c("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
            throw null;
        }
        if (i < 0) {
            gol.e("fromIndex (" + i + ") is less than 0.");
            throw null;
        }
        if (i2 <= size) {
            return;
        }
        gol.e("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
        throw null;
    }

    public static final u8b c(Object obj) {
        u8b u8bVar = new u8b(1);
        u8bVar.b(obj);
        return u8bVar;
    }
}
