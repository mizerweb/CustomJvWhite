package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k15 implements ou6 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final ewe i;
    public final ijf j;
    public final Uri k;
    public final fvd l;
    public final List m;

    public k15(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, fvd fvdVar, ewe eweVar, ijf ijfVar, Uri uri, ArrayList arrayList) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.l = fvdVar;
        this.i = eweVar;
        this.k = uri;
        this.j = ijfVar;
        this.m = arrayList;
    }

    @Override // defpackage.ou6
    public final Object a(List list) {
        long j;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new k4h(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i = 0;
        while (true) {
            if (i >= this.m.size()) {
                break;
            }
            if (((k4h) linkedList.peek()).a != i) {
                long jD = d(i);
                if (jD != -9223372036854775807L) {
                    j2 += jD;
                }
            } else {
                fsc fscVarB = b(i);
                List list2 = fscVarB.c;
                k4h k4hVar = (k4h) linkedList.poll();
                int i2 = k4hVar.a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i3 = k4hVar.b;
                    ga gaVar = (ga) list2.get(i3);
                    List list3 = gaVar.c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((ble) list3.get(k4hVar.c));
                        k4hVar = (k4h) linkedList.poll();
                        if (k4hVar.a != i2) {
                            break;
                        }
                    } while (k4hVar.b == i3);
                    j = j2;
                    arrayList2.add(new ga(gaVar.a, gaVar.b, arrayList3, gaVar.d, gaVar.e, gaVar.f));
                    if (k4hVar.a != i2) {
                        break;
                    }
                    j2 = j;
                }
                linkedList.addFirst(k4hVar);
                arrayList.add(new fsc(fscVarB.a, fscVarB.b - j, arrayList2, fscVarB.d));
                j2 = j;
            }
            i++;
        }
        long j3 = j2;
        long j4 = this.b;
        return new k15(this.a, j4 != -9223372036854775807L ? j4 - j3 : -9223372036854775807L, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, this.j, this.k, arrayList);
    }

    public final fsc b(int i) {
        return (fsc) this.m.get(i);
    }

    public final int c() {
        return this.m.size();
    }

    public final long d(int i) {
        long j;
        long j2;
        List list = this.m;
        if (i == list.size() - 1) {
            j = this.b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j2 = ((fsc) list.get(i)).b;
        } else {
            j = ((fsc) list.get(i + 1)).b;
            j2 = ((fsc) list.get(i)).b;
        }
        return j - j2;
    }

    public final long e(int i) {
        return vqi.X(d(i));
    }
}
