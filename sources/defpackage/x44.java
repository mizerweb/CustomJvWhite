package defpackage;

import android.util.Size;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class x44 implements Comparator {
    public final boolean a;

    public x44(boolean z) {
        this.a = z;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        int iSignum = Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
        return this.a ? iSignum * (-1) : iSignum;
    }
}
