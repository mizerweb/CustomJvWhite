package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fsc {
    public final String a;
    public final long b;
    public final List c;
    public final List d;

    public fsc(String str, long j, ArrayList arrayList, List list) {
        this.a = str;
        this.b = j;
        this.c = Collections.unmodifiableList(arrayList);
        this.d = Collections.unmodifiableList(list);
    }

    public final int a(int i) {
        List list = this.c;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((ga) list.get(i2)).b == i) {
                return i2;
            }
        }
        return -1;
    }
}
