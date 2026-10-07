package defpackage;

import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class ez8 implements o71 {
    public final long a;
    public final TreeSet b = new TreeSet(new vv2(5));
    public long c;

    public ez8(long j) {
        this.a = j;
    }

    @Override // defpackage.o71
    public final void a(j6g j6gVar, m6g m6gVar) {
        this.b.add(m6gVar);
        this.c += m6gVar.c;
        e(j6gVar, 0L);
    }

    @Override // defpackage.o71
    public final void b(j6g j6gVar, m6g m6gVar) {
        this.b.remove(m6gVar);
        this.c -= m6gVar.c;
    }

    @Override // defpackage.o71
    public final void c(j6g j6gVar, m6g m6gVar, m6g m6gVar2) {
        b(j6gVar, m6gVar);
        a(j6gVar, m6gVar2);
    }

    @Override // defpackage.o71
    public final void d(j6g j6gVar, String str, long j, long j2) {
        if (j2 != -1) {
            e(j6gVar, j2);
        }
    }

    public final void e(j6g j6gVar, long j) {
        while (this.c + j > this.a && !this.b.isEmpty()) {
            m6g m6gVar = (m6g) this.b.first();
            synchronized (j6gVar) {
                lvb.b0(!j6gVar.j);
                j6gVar.o(m6gVar);
            }
        }
    }
}
