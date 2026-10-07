package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class g81 {
    public final int a;
    public final String b;
    public final TreeSet c;
    public final ArrayList d;
    public k95 e;

    public g81(int i, String str, k95 k95Var) {
        this.a = i;
        this.b = str;
        this.e = k95Var;
        this.c = new TreeSet();
        this.d = new ArrayList();
    }

    public final void a(m6g m6gVar) {
        this.c.add(m6gVar);
    }

    public final boolean b(xp9 xp9Var) {
        k95 k95Var = this.e;
        k95 k95VarB = k95Var.b(xp9Var);
        this.e = k95VarB;
        return !k95VarB.equals(k95Var);
    }

    public final long c(long j, long j2) {
        lvb.R(j >= 0);
        lvb.R(j2 >= 0);
        m6g m6gVarE = e(j, j2);
        long j3 = m6gVarE.c;
        boolean z = m6gVarE.d;
        long j4 = BuildConfig.MAX_TIME_TO_UPLOAD;
        if (!z) {
            if (j3 == -1) {
                j3 = Long.MAX_VALUE;
            }
            return -Math.min(j3, j2);
        }
        long j5 = j + j2;
        if (j5 >= 0) {
            j4 = j5;
        }
        long jMax = m6gVarE.b + j3;
        if (jMax < j4) {
            for (m6g m6gVar : this.c.tailSet(m6gVarE, false)) {
                long j6 = m6gVar.b;
                if (j6 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j6 + m6gVar.c);
                if (jMax >= j4) {
                    break;
                }
            }
        }
        return Math.min(jMax - j, j2);
    }

    public final k95 d() {
        return this.e;
    }

    public final m6g e(long j, long j2) {
        m6g m6gVar = new m6g(this.b, j, -1L, -9223372036854775807L, null);
        TreeSet treeSet = this.c;
        m6g m6gVar2 = (m6g) treeSet.floor(m6gVar);
        if (m6gVar2 != null && m6gVar2.b + m6gVar2.c > j) {
            return m6gVar2;
        }
        m6g m6gVar3 = (m6g) treeSet.ceiling(m6gVar);
        if (m6gVar3 != null) {
            long jMin = m6gVar3.b - j;
            if (j2 != -1) {
                jMin = Math.min(jMin, j2);
            }
            j2 = jMin;
        }
        return m6g.e(j, j2, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g81.class == obj.getClass()) {
            g81 g81Var = (g81) obj;
            if (this.a == g81Var.a && this.b.equals(g81Var.b) && this.c.equals(g81Var.c) && this.e.equals(g81Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final TreeSet f() {
        return this.c;
    }

    public final boolean g() {
        return this.c.isEmpty();
    }

    public final boolean h(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return false;
            }
            f81 f81Var = (f81) arrayList.get(i);
            long j3 = f81Var.a;
            long j4 = f81Var.b;
            if (j4 == -1) {
                if (j >= j3) {
                    return true;
                }
            } else if (j2 != -1 && j3 <= j && j + j2 <= j3 + j4) {
                return true;
            }
            i++;
        }
    }

    public final int hashCode() {
        return this.e.hashCode() + zo5.d(this.a * 31, 31, this.b);
    }

    public final boolean i() {
        return this.d.isEmpty();
    }

    public final boolean j(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                arrayList.add(new f81(j, j2));
                return true;
            }
            f81 f81Var = (f81) arrayList.get(i);
            long j3 = f81Var.a;
            if (j3 <= j) {
                long j4 = f81Var.b;
                if (j4 == -1 || j3 + j4 > j) {
                    return false;
                }
                i++;
            } else {
                if (j2 == -1 || j + j2 > j3) {
                    return false;
                }
                i++;
            }
        }
    }

    public final boolean k(m6g m6gVar) {
        if (!this.c.remove(m6gVar)) {
            return false;
        }
        File file = m6gVar.e;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public final m6g l(m6g m6gVar, long j, boolean z) {
        long j2;
        File file;
        TreeSet treeSet = this.c;
        lvb.b0(treeSet.remove(m6gVar));
        File file2 = m6gVar.e;
        file2.getClass();
        if (z) {
            File parentFile = file2.getParentFile();
            parentFile.getClass();
            j2 = j;
            File fileF = m6g.f(parentFile, this.a, m6gVar.b, j2);
            if (file2.renameTo(fileF)) {
                file = fileF;
            } else {
                lvb.G0("CachedContent", "Failed to rename " + file2 + " to " + fileF);
            }
            lvb.b0(m6gVar.d);
            m6g m6gVar2 = new m6g(m6gVar.a, m6gVar.b, m6gVar.c, j2, file);
            treeSet.add(m6gVar2);
            return m6gVar2;
        }
        j2 = j;
        file = file2;
        lvb.b0(m6gVar.d);
        m6g m6gVar3 = new m6g(m6gVar.a, m6gVar.b, m6gVar.c, j2, file);
        treeSet.add(m6gVar3);
        return m6gVar3;
    }

    public final void m(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                c.t();
                return;
            } else {
                if (((f81) arrayList.get(i)).a == j) {
                    arrayList.remove(i);
                    return;
                }
                i++;
            }
        }
    }

    public g81(int i, String str) {
        this(i, str, k95.c);
    }
}
