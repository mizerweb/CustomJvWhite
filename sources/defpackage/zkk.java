package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.a;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes4.dex */
public final class zkk implements otb {
    public final jo7 a;
    public final int b;
    public final jp c;
    public final long d;
    public final long e;

    public zkk(jo7 jo7Var, int i, jp jpVar, long j, long j2) {
        this.a = jo7Var;
        this.b = i;
        this.c = jpVar;
        this.d = j;
        this.e = j2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    public static zkk a(jo7 jo7Var, int i, jp jpVar) {
        if (!jo7Var.a()) {
            return null;
        }
        eue eueVar = (eue) due.x().a;
        boolean z = true;
        if (eueVar != null) {
            if (!eueVar.b) {
                return null;
            }
            boolean z2 = eueVar.c;
            skk skkVar = (skk) jo7Var.j.get(jpVar);
            if (skkVar != null) {
                fo foVar = skkVar.d;
                if (!(foVar instanceof a)) {
                    return null;
                }
                a aVar = (a) foVar;
                if (aVar.u == null || aVar.b()) {
                    z = z2;
                } else {
                    te4 te4VarB = b(skkVar, aVar, i);
                    if (te4VarB == null) {
                        return null;
                    }
                    skkVar.n++;
                    z = te4VarB.c;
                }
            } else {
                z = z2;
            }
        }
        return new zkk(jo7Var, i, jpVar, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0031 A[RETURN] */
    public static te4 b(skk skkVar, a aVar, int i) {
        qil qilVar = aVar.u;
        te4 te4Var = qilVar == null ? null : qilVar.d;
        if (te4Var != null && te4Var.b) {
            int[] iArr = te4Var.d;
            int i2 = 0;
            if (iArr == null) {
                int[] iArr2 = te4Var.f;
                if (iArr2 != null) {
                    while (i2 < iArr2.length) {
                        if (iArr2[i2] != i) {
                            i2++;
                        }
                    }
                    if (skkVar.n < te4Var.e) {
                        return te4Var;
                    }
                } else if (skkVar.n < te4Var.e) {
                    return te4Var;
                }
            } else {
                while (i2 < iArr.length) {
                    if (iArr[i2] != i) {
                        i2++;
                    } else if (skkVar.n < te4Var.e) {
                        return te4Var;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0088 A[PHI: r10
  0x0088: PHI (r10v3 int) = (r10v0 int), (r10v2 int) binds: [B:38:0x0086, B:44:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.otb
    public final void j(Task task) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        long j2;
        if (this.a.a()) {
            eue eueVar = (eue) due.x().a;
            if (eueVar == null || eueVar.b) {
                skk skkVar = (skk) this.a.j.get(this.c);
                if (skkVar != null) {
                    fo foVar = skkVar.d;
                    if (foVar instanceof a) {
                        a aVar = (a) foVar;
                        int i5 = 0;
                        boolean z = this.d > 0;
                        int i6 = aVar.p;
                        int i7 = 100;
                        if (eueVar != null) {
                            z &= eueVar.c;
                            int i8 = eueVar.d;
                            int i9 = eueVar.e;
                            i = eueVar.a;
                            if (aVar.u != null && !aVar.b()) {
                                te4 te4VarB = b(skkVar, aVar, this.b);
                                if (te4VarB == null) {
                                    return;
                                }
                                boolean z2 = te4VarB.c && this.d > 0;
                                i9 = te4VarB.e;
                                z = z2;
                            }
                            i3 = i8;
                            i2 = i9;
                        } else {
                            i = 0;
                            i2 = 100;
                            i3 = 5000;
                        }
                        jo7 jo7Var = this.a;
                        int iElapsedRealtime = -1;
                        if (task.j()) {
                            i4 = 0;
                        } else if (((kam) task).d) {
                            i4 = i7;
                            i5 = -1;
                        } else {
                            Exception excG = task.g();
                            if (excG instanceof ApiException) {
                                Status status = ((ApiException) excG).a;
                                i7 = status.a;
                                le4 le4Var = status.d;
                                if (le4Var == null) {
                                    i4 = i7;
                                    i5 = -1;
                                } else {
                                    i5 = le4Var.b;
                                    i4 = i7;
                                }
                            } else {
                                i4 = 101;
                                i5 = -1;
                            }
                        }
                        if (z) {
                            long j3 = this.d;
                            long j4 = this.e;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j4);
                            j2 = jCurrentTimeMillis;
                            j = j3;
                        } else {
                            j = 0;
                            j2 = 0;
                        }
                        alk alkVar = new alk(new oxa(this.b, i4, i5, j, j2, null, null, i6, iElapsedRealtime), i, i3, i2);
                        bmk bmkVar = jo7Var.m;
                        bmkVar.sendMessage(bmkVar.obtainMessage(18, alkVar));
                    }
                }
            }
        }
    }
}
