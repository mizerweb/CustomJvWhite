package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class yn8 implements Iterator {
    public static final yn8 a;
    public static final /* synthetic */ yn8[] b;

    static {
        yn8 yn8Var = new yn8("INSTANCE", 0);
        a = yn8Var;
        b = new yn8[]{yn8Var};
    }

    public static yn8 valueOf(String str) {
        return (yn8) Enum.valueOf(yn8.class, str);
    }

    public static yn8[] values() {
        return (yn8[]) b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        lvb.Z("no calls to next() since the last call to remove()", false);
    }
}
