package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class q8k {
    public final long a;
    public final long b;

    public q8k(long j, long j2) {
        if (j > j2) {
            ore.a();
            throw null;
        }
        this.a = j;
        this.b = j2;
    }

    public static void a(long j, ArrayList arrayList) {
        q8k q8kVar;
        q8k q8kVar2;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            q8k q8kVar3 = (q8k) it.next();
            long j2 = q8kVar3.a;
            long j3 = q8kVar3.b;
            if (j >= j2 && j <= j3) {
                return;
            }
            if (j == j2 - 1 || j == j3 + 1) {
                q8k q8kVar4 = it.hasNext() ? (q8k) it.next() : null;
                if (q8kVar4 != null) {
                    long j4 = q8kVar4.b;
                    long j5 = q8kVar4.a;
                    if (j == j5 - 1 || j == j4 + 1) {
                        q8k q8kVar5 = (q8k) arrayList.get(i);
                        if (j == j4 + 1 && q8kVar5.a - 1 == j) {
                            q8kVar2 = new q8k(j5, q8kVar5.b);
                        } else {
                            if (q8kVar5.b + 1 != j || j != j5 - 1) {
                                ore.a();
                                return;
                            }
                            q8kVar2 = new q8k(q8kVar5.a, j4);
                        }
                        arrayList.set(i, q8kVar2);
                        arrayList.remove(i + 1);
                        return;
                    }
                }
                q8k q8kVar6 = (q8k) arrayList.get(i);
                long j6 = q8kVar6.b;
                long j7 = j6 + 1;
                long j8 = q8kVar6.a;
                if (j == j7) {
                    q8kVar = new q8k(j8, j7);
                } else {
                    long j9 = j8 - 1;
                    if (j != j9) {
                        ore.p(zo5.j(j, "Range cannot be extended with that number "));
                        return;
                    }
                    q8kVar = new q8k(j9, j6);
                }
                arrayList.set(i, q8kVar);
                return;
            }
            if (j3 < j) {
                arrayList.add(i, new q8k(j));
                return;
            }
            i++;
        }
        arrayList.add(i, new q8k(j));
    }

    public final boolean b(q8k q8kVar) {
        return this.a < q8kVar.a && this.b > q8kVar.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8k)) {
            return false;
        }
        q8k q8kVar = (q8k) obj;
        return Long.valueOf(this.a).equals(Long.valueOf(q8kVar.a)) && Long.valueOf(this.b).equals(Long.valueOf(q8kVar.b));
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b));
    }

    public final String toString() {
        return c0a.m(this.a, "]", qt4.s(this.b, "[", ".."));
    }

    public q8k(long j) {
        this.a = j;
        this.b = j;
    }
}
