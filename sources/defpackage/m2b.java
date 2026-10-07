package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class m2b extends gn2 {
    public final long c;
    public final ArrayList d;
    public final ArrayList e;

    public m2b(int i, long j) {
        super(i, 1);
        this.c = j;
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    public final m2b g(int i) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            m2b m2bVar = (m2b) arrayList.get(i2);
            if (m2bVar.b == i) {
                return m2bVar;
            }
        }
        return null;
    }

    public final n2b h(int i) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            n2b n2bVar = (n2b) arrayList.get(i2);
            if (n2bVar.b == i) {
                return n2bVar;
            }
        }
        return null;
    }

    @Override // defpackage.gn2
    public final String toString() {
        return gn2.a(this.b) + " leaves: " + Arrays.toString(this.d.toArray()) + " containers: " + Arrays.toString(this.e.toArray());
    }
}
