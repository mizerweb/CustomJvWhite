package defpackage;

import androidx.media3.exoplayer.offline.DownloadException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class i15 extends tcf {
    public final ljf m;

    public i15(ry9 ry9Var, qmc qmcVar, j71 j71Var, Executor executor, long j, long j2) {
        super(ry9Var, qmcVar, j71Var, executor, j, j2);
        this.m = new ljf(5);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x017e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x016e A[SYNTHETIC] */
    @Override // defpackage.tcf
    public final ArrayList e(final k71 k71Var, ou6 ou6Var, boolean z) throws IOException {
        ga gaVar;
        int i;
        long j;
        x15 gj2Var;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (k15 k15Var = (k15) ou6Var; i2 < k15Var.m.size(); k15Var = k15Var) {
            fsc fscVarB = k15Var.b(i2);
            long jX = vqi.X(fscVarB.b);
            long jE = k15Var.e(i2);
            long j2 = this.a;
            if (jE == -9223372036854775807L || jX + jE > j2) {
                long j3 = this.b;
                if (j3 != -9223372036854775807L && jX >= j2 + j3) {
                    break;
                }
                List list = fscVarB.c;
                int i3 = 0;
                while (i3 < list.size()) {
                    int i4 = i3;
                    ga gaVar2 = (ga) list.get(i3);
                    List list2 = list;
                    int i5 = 0;
                    while (i5 < gaVar2.c.size()) {
                        final ble bleVar = (ble) gaVar2.c.get(i5);
                        int i6 = i5;
                        try {
                            final int i7 = gaVar2.b;
                            x15 x15VarC = bleVar.c();
                            if (x15VarC != null) {
                                gaVar = gaVar2;
                                gj2Var = x15VarC;
                                i = i2;
                                j = j3;
                            } else {
                                gaVar = gaVar2;
                                try {
                                    i = i2;
                                    try {
                                        vq3 vq3Var = (vq3) this.c(new pah(this) { // from class: f15
                                            @Override // defpackage.pah
                                            public final Object get() {
                                                return new g15(k71Var, i7, bleVar);
                                            }
                                        }, z);
                                        if (vq3Var == null) {
                                            gj2Var = null;
                                            j = j3;
                                        } else {
                                            j = j3;
                                            try {
                                                gj2Var = new gj2(vq3Var, bleVar.c, 3);
                                            } catch (IOException e) {
                                                e = e;
                                                if (z) {
                                                    throw e;
                                                }
                                                i5 = i6 + 1;
                                                this = this;
                                                z = z;
                                                gaVar2 = gaVar;
                                                i2 = i;
                                                j3 = j;
                                                jX = jX;
                                            }
                                        }
                                    } catch (IOException e2) {
                                        e = e2;
                                        j = j3;
                                        if (z) {
                                            throw e;
                                        }
                                        i5 = i6 + 1;
                                        this = this;
                                        z = z;
                                        gaVar2 = gaVar;
                                        i2 = i;
                                        j3 = j;
                                        jX = jX;
                                    }
                                } catch (IOException e3) {
                                    e = e3;
                                    i = i2;
                                    j = j3;
                                    if (z) {
                                        throw e;
                                    }
                                    i5 = i6 + 1;
                                    this = this;
                                    z = z;
                                    gaVar2 = gaVar;
                                    i2 = i;
                                    j3 = j;
                                    jX = jX;
                                }
                            }
                            if (gj2Var != null) {
                                long jS = gj2Var.s(jE);
                                if (jS == -1) {
                                    throw new DownloadException("Unbounded segment index");
                                }
                                ws0 ws0VarW = this.m.W(bleVar.b);
                                String str = vqi.a;
                                String str2 = ws0VarW.a;
                                l4e l4eVar = bleVar.e;
                                if (l4eVar != null) {
                                    arrayList.add(new rcf(jX, bql.a(bleVar, str2, l4eVar, 0)));
                                }
                                l4e l4eVarE = bleVar.e();
                                if (l4eVarE != null) {
                                    arrayList.add(new rcf(jX, bql.a(bleVar, str2, l4eVarE, 0)));
                                }
                                long j4 = j2 - jX;
                                long j5 = j3 != -9223372036854775807L ? j4 + j : -9223372036854775807L;
                                long jH = (z || j4 <= 0) ? gj2Var.H() : gj2Var.n(j4, jE);
                                long jH2 = (j5 == -9223372036854775807L || z || j5 >= jX + jE) ? (gj2Var.H() + jS) - 1 : gj2Var.n(j5, jE);
                                while (jH <= jH2) {
                                    arrayList.add(new rcf(gj2Var.b(jH) + jX, bql.a(bleVar, str2, gj2Var.j(jH), 0)));
                                    jH++;
                                    gj2Var = gj2Var;
                                }
                                i5 = i6 + 1;
                                this = this;
                                z = z;
                                gaVar2 = gaVar;
                                i2 = i;
                                j3 = j;
                                jX = jX;
                            } else {
                                try {
                                    throw new DownloadException("Missing segment index");
                                } catch (IOException e4) {
                                    e = e4;
                                    if (z) {
                                        throw e;
                                    }
                                    i5 = i6 + 1;
                                    this = this;
                                    z = z;
                                    gaVar2 = gaVar;
                                    i2 = i;
                                    j3 = j;
                                    jX = jX;
                                }
                            }
                        } catch (IOException e5) {
                            e = e5;
                            gaVar = gaVar2;
                        }
                    }
                    i3 = i4 + 1;
                    this = this;
                    z = z;
                    list = list2;
                }
            }
            i2++;
        }
        return arrayList;
    }
}
