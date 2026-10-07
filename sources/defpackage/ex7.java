package defpackage;

import android.net.Uri;
import android.util.Pair;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ex7 {
    public final ab5 a;
    public final u25 b;
    public final u25 c;
    public final eth d;
    public final Uri[] e;
    public final b87[] f;
    public final db5 g;
    public final hyh h;
    public final List i;
    public final z3d k;
    public boolean l;
    public BehindLiveWindowException n;
    public Uri o;
    public Uri p;
    public boolean q;
    public rg6 r;
    public final b1k j = new b1k(15);
    public byte[] m = vqi.b;
    public long s = -9223372036854775807L;

    public ex7(ab5 ab5Var, db5 db5Var, Uri[] uriArr, b87[] b87VarArr, uik uikVar, v1i v1iVar, eth ethVar, List list, z3d z3dVar) {
        this.a = ab5Var;
        this.g = db5Var;
        this.e = uriArr;
        this.f = b87VarArr;
        this.d = ethVar;
        this.i = list;
        this.k = z3dVar;
        u25 u25VarA = ((s25) uikVar.b).a();
        this.b = u25VarA;
        if (v1iVar != null) {
            u25VarA.w(v1iVar);
        }
        this.c = ((s25) uikVar.b).a();
        this.h = new hyh("", b87VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((b87VarArr[i].f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        hyh hyhVar = this.h;
        int[] iArrH = k4m.h(arrayList);
        cx7 cx7Var = new cx7(0, hyhVar, iArrH);
        cx7Var.g = cx7Var.n(hyhVar.d[iArrH[0]]);
        this.r = cx7Var;
    }

    public static dx7 d(sx7 sx7Var, long j, int i) {
        long j2 = sx7Var.k;
        c98 c98Var = sx7Var.s;
        int i2 = (int) (j - j2);
        c98 c98Var2 = sx7Var.r;
        if (i2 == c98Var2.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < c98Var.size()) {
                return new dx7((qx7) c98Var.get(i), j, i);
            }
            return null;
        }
        px7 px7Var = (px7) c98Var2.get(i2);
        if (i == -1) {
            return new dx7(px7Var, j, -1);
        }
        if (i < px7Var.m.size()) {
            return new dx7((qx7) px7Var.m.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < c98Var2.size()) {
            return new dx7((qx7) c98Var2.get(i3), j + 1, -1);
        }
        if (c98Var.isEmpty()) {
            return null;
        }
        return new dx7((qx7) c98Var.get(0), j + 1, 0);
    }

    public final gt9[] a(ix7 ix7Var, long j) {
        List listUnmodifiableList;
        ex7 ex7Var = this;
        ix7 ix7Var2 = ix7Var;
        int iB = ix7Var2 == null ? -1 : ex7Var.h.b(ix7Var2.d);
        int length = ex7Var.r.length();
        gt9[] gt9VarArr = new gt9[length];
        boolean z = false;
        int i = 0;
        while (i < length) {
            int iE = ex7Var.r.e(i);
            Uri uri = ex7Var.e[iE];
            db5 db5Var = ex7Var.g;
            if (db5Var.c(uri)) {
                sx7 sx7VarA = db5Var.a(uri, z);
                sx7VarA.getClass();
                long j2 = sx7VarA.h - db5Var.n;
                Pair pairC = ex7Var.c(ix7Var2, iE != iB ? true : z, sx7VarA, j2, j);
                long jLongValue = ((Long) pairC.first).longValue();
                int iIntValue = ((Integer) pairC.second).intValue();
                long j3 = sx7VarA.k;
                c98 c98Var = sx7VarA.s;
                c98 c98Var2 = sx7VarA.r;
                int i2 = (int) (jLongValue - j3);
                if (i2 < 0 || c98Var2.size() < i2) {
                    a98 a98Var = c98.b;
                    listUnmodifiableList = ghe.e;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i2 < c98Var2.size()) {
                        if (iIntValue != -1) {
                            px7 px7Var = (px7) c98Var2.get(i2);
                            if (iIntValue == 0) {
                                arrayList.add(px7Var);
                            } else if (iIntValue < px7Var.m.size()) {
                                c98 c98Var3 = px7Var.m;
                                arrayList.addAll(c98Var3.subList(iIntValue, c98Var3.size()));
                            }
                            i2++;
                        }
                        arrayList.addAll(c98Var2.subList(i2, c98Var2.size()));
                        iIntValue = 0;
                    }
                    if (sx7VarA.n != -9223372036854775807L) {
                        if (iIntValue == -1) {
                            iIntValue = 0;
                        }
                        if (iIntValue < c98Var.size()) {
                            arrayList.addAll(c98Var.subList(iIntValue, c98Var.size()));
                        }
                    }
                    listUnmodifiableList = Collections.unmodifiableList(arrayList);
                }
                gt9VarArr[i] = new bx7(j2, listUnmodifiableList);
            } else {
                gt9VarArr[i] = gt9.H0;
            }
            i++;
            ex7Var = this;
            ix7Var2 = ix7Var;
            z = false;
        }
        return gt9VarArr;
    }

    public final int b(ix7 ix7Var) {
        int i = ix7Var.o;
        if (i == -1) {
            return 1;
        }
        sx7 sx7VarA = this.g.a(this.e[this.h.b(ix7Var.d)], false);
        sx7VarA.getClass();
        c98 c98Var = sx7VarA.r;
        int i2 = (int) (ix7Var.j - sx7VarA.k);
        if (i2 < 0) {
            return 1;
        }
        c98 c98Var2 = i2 < c98Var.size() ? ((px7) c98Var.get(i2)).m : sx7VarA.s;
        if (i >= c98Var2.size()) {
            return 2;
        }
        nx7 nx7Var = (nx7) c98Var2.get(i);
        if (nx7Var.m) {
            return 0;
        }
        return Objects.equals(Uri.parse(w1m.d(sx7VarA.a, nx7Var.a)), ix7Var.b.a) ? 1 : 2;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00af  */
    public final Pair c(ix7 ix7Var, boolean z, sx7 sx7Var, long j, long j2) {
        c98 c98Var;
        int i = -1;
        if (ix7Var != null) {
            long jA = ix7Var.j;
            int i2 = ix7Var.o;
            if (!z) {
                if (!ix7Var.H) {
                    return new Pair(Long.valueOf(jA), Integer.valueOf(i2));
                }
                if (i2 == -1) {
                    jA = ix7Var.a();
                }
                return new Pair(Long.valueOf(jA), Integer.valueOf(i2 != -1 ? i2 + 1 : -1));
            }
        }
        long j3 = sx7Var.u;
        long j4 = sx7Var.k;
        c98 c98Var2 = sx7Var.s;
        c98 c98Var3 = sx7Var.r;
        long j5 = j + j3;
        long j6 = (ix7Var == null || this.q) ? j2 : ix7Var.g;
        if (!sx7Var.o && j6 >= j5) {
            return new Pair(Long.valueOf(j4 + ((long) c98Var3.size())), -1);
        }
        long j7 = j6 - j;
        Long lValueOf = Long.valueOf(j7);
        db5 db5Var = this.g;
        int iD = vqi.d(c98Var3, lValueOf, true, !db5Var.m || ix7Var == null);
        long j8 = ((long) iD) + j4;
        if (!db5Var.m) {
            return new Pair(Long.valueOf(j8), -1);
        }
        if (iD >= 0) {
            if (c98Var3.isEmpty()) {
                c98Var = c98Var2;
            } else {
                px7 px7Var = (px7) c98Var3.get(iD);
                if (j7 < px7Var.e + px7Var.c) {
                    c98Var = px7Var.m;
                } else {
                    c98Var = c98Var2;
                }
            }
            for (int i3 = 0; i3 < c98Var.size(); i3++) {
                nx7 nx7Var = (nx7) c98Var.get(i3);
                if (j7 < nx7Var.e + nx7Var.c) {
                    if (!nx7Var.l) {
                        break;
                    }
                    j8 += (c98Var != c98Var2 || c98Var3.isEmpty()) ? 0L : 1L;
                    i = i3;
                    break;
                }
            }
        }
        return new Pair(Long.valueOf(j8), Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ax7 e(Uri uri, int i, boolean z) {
        if (uri == null) {
            return null;
        }
        b1k b1kVar = this.j;
        byte[] bArr = (byte[]) ((xe7) b1kVar.b).remove(uri);
        if (bArr != null) {
            return null;
        }
        a35 a35Var = new a35(uri, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1, null);
        b87 b87Var = this.f[i];
        int iT = this.r.t();
        Object objI = this.r.i();
        byte[] bArr2 = this.m;
        ax7 ax7Var = new ax7(this.c, a35Var, 3, b87Var, iT, objI, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = vqi.b;
        }
        ax7Var.j = bArr2;
        return ax7Var;
    }
}
