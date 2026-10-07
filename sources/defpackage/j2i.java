package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.util.SparseArray;
import androidx.media3.transformer.ExportException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class j2i implements dy {
    public final int a;
    public final s26 b;
    public final k84 c;
    public final b2i d;
    public final so2 e;
    public final rwi f;
    public final g85 g;
    public final p51 h;
    public final LogSessionId i;
    public long j;
    public final /* synthetic */ k2i k;

    public j2i(k2i k2iVar, int i, k84 k84Var, b2i b2iVar, so2 so2Var, rwi rwiVar, g85 g85Var, p51 p51Var, LogSessionId logSessionId) {
        this.k = k2iVar;
        this.a = i;
        this.b = (s26) ((t26) ((c98) k84Var.b).get(i)).a.get(0);
        this.c = k84Var;
        this.d = b2iVar;
        this.e = so2Var;
        this.f = rwiVar;
        this.g = g85Var;
        this.h = p51Var;
        this.i = logSessionId;
    }

    @Override // defpackage.dy
    public final void a(int i) {
        if (i <= 0) {
            b(ExportException.a(1001, new IllegalStateException("AssetLoader instances must provide at least 1 track.")));
            return;
        }
        synchronized (this.k.l) {
            xde xdeVar = this.k.m;
            ((h2i) ((ArrayList) xdeVar.b).get(this.a)).b = i;
        }
    }

    @Override // defpackage.dy
    public final void b(ExportException exportException) {
        this.k.d(exportException);
    }

    public final void c(b87 b87Var) throws ExportException {
        b87 b87Var2;
        long j;
        String str = b87Var.n;
        int iK = izl.k(str);
        k2i k2iVar = this.k;
        dc9 dc9Var = k2iVar.d;
        xde xdeVar = k2iVar.m;
        lvb.b0(((tye) ((SparseArray) xdeVar.c).get(iK)) == null);
        SparseArray sparseArray = ((h2i) ((ArrayList) xdeVar.b).get(this.a)).a;
        lvb.b0(vqi.l(sparseArray, iK));
        b87 b87Var3 = (b87) sparseArray.get(iK);
        boolean zI = uya.i(str);
        k84 k84Var = this.c;
        if (zI) {
            xdeVar.O(1, new sb0(b87Var3, b87Var, this.d, this.b, ((j36) k84Var.d).a, this.e, dc9Var, k2iVar.o, this.g, this.i));
            return;
        }
        if (uya.m(str)) {
            boolean z = this.d.d == 1;
            ex3 ex3Var = b87Var3.D;
            if (ex3Var == null || !ex3Var.f()) {
                ex3Var = ex3.h;
            }
            if (z && ex3.h(ex3Var)) {
                ex3Var = ex3.h;
            }
            a87 a87VarA = b87Var3.a();
            a87VarA.C = ex3Var;
            b87Var2 = new b87(a87VarA);
        } else {
            if (!uya.k(str)) {
                throw ExportException.d(new IllegalArgumentException("assetLoaderOutputFormat has to have a audio, video or image mimetype."));
            }
            a87 a87VarA2 = b87Var.a();
            ex3 ex3Var2 = b87Var.D;
            if (ex3Var2 == null || !ex3Var2.f()) {
                ex3Var2 = ex3.h;
            }
            a87VarA2.C = ex3Var2;
            b87Var2 = new b87(a87VarA2);
        }
        Context context = k2iVar.a;
        er3 er3Var = (er3) k84Var.c;
        c98 c98Var = ((j36) k84Var.d).b;
        t9b t9bVar = k2iVar.o;
        vuf vufVar = new vuf(18, this);
        b87 b87Var4 = b87Var2;
        long j2 = k2iVar.h;
        ArrayList arrayList = (ArrayList) xdeVar.b;
        if (arrayList.size() >= 2) {
            int i = 0;
            int i2 = 0;
            while (i2 < arrayList.size()) {
                long j3 = j2;
                if (vqi.l(((h2i) arrayList.get(i2)).a, 2)) {
                    i++;
                }
                i2++;
                j2 = j3;
            }
            j = j2;
            boolean z2 = i > 1;
            xdeVar.O(2, new d4j(context, b87Var4, this.d, er3Var, c98Var, this.f, dc9Var, t9bVar, vufVar, this.g, this.h, j, z2, k2iVar.u, k2iVar.v, this.i));
        }
        j = j2;
        xdeVar.O(2, new d4j(context, b87Var4, this.d, er3Var, c98Var, this.f, dc9Var, t9bVar, vufVar, this.g, this.h, j, z2, k2iVar.u, k2iVar.v, this.i));
    }

    @Override // defpackage.dy
    public final void d(long j) {
    }

    @Override // defpackage.dy
    public final boolean e(int i, b87 b87Var) {
        boolean zH;
        int iK = izl.k(b87Var.n);
        synchronized (this.k.l) {
            try {
                xde xdeVar = this.k.m;
                int i2 = this.a;
                xdeVar.getClass();
                int iK2 = izl.k(b87Var.n);
                SparseArray sparseArray = ((h2i) ((ArrayList) xdeVar.b).get(i2)).a;
                boolean z = true;
                lvb.b0(!vqi.l(sparseArray, iK2));
                sparseArray.put(iK2, b87Var);
                if (this.k.m.B()) {
                    ArrayList arrayList = (ArrayList) this.k.m.b;
                    int i3 = 0;
                    int i4 = 0;
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        SparseArray sparseArray2 = ((h2i) arrayList.get(i5)).a;
                        if (vqi.l(sparseArray2, 1)) {
                            i3 = 1;
                        }
                        if (sparseArray2.indexOfKey(2) >= 0) {
                            i4 = 1;
                        }
                    }
                    int i6 = i3 + i4;
                    t9b t9bVar = this.k.o;
                    if (t9bVar.m != 2) {
                        lvb.Z("The track count cannot be changed after adding track formats.", t9bVar.d.size() == 0);
                        t9bVar.s = i6;
                    }
                    ((AtomicInteger) this.g.d).set(i6);
                }
                zH = h(i, b87Var);
                if (!zH && izl.k(b87Var.n) == 2) {
                    t9b t9bVar2 = this.k.o;
                    float fM = izl.m(b87Var, this.b.f.b);
                    if (fM == 90.0f || fM == 180.0f || fM == 270.0f) {
                        int iRound = 360 - Math.round(fM);
                        lvb.Z("The additional rotation cannot be changed after adding track formats.", t9bVar2.d.size() == 0 || t9bVar2.r == iRound);
                        t9bVar2.r = iRound;
                    }
                }
                SparseArray sparseArray3 = (SparseArray) this.k.m.d;
                if (vqi.l(sparseArray3, iK)) {
                    if (zH != ((Boolean) sparseArray3.get(iK)).booleanValue()) {
                        z = false;
                    }
                    lvb.b0(z);
                } else {
                    sparseArray3.put(iK, Boolean.valueOf(zH));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zH;
    }

    @Override // defpackage.dy
    public final rye f(b87 b87Var) {
        synchronized (this.k.l) {
            try {
                if (!this.k.m.B()) {
                    return null;
                }
                final int iK = izl.k(b87Var.n);
                SparseArray sparseArray = (SparseArray) this.k.m.d;
                lvb.b0(vqi.l(sparseArray, iK));
                if (((Boolean) sparseArray.get(iK)).booleanValue()) {
                    xde xdeVar = this.k.m;
                    ArrayList arrayList = (ArrayList) xdeVar.b;
                    lvb.Z("Primary track can only be queried after all tracks are added.", xdeVar.B());
                    int i = 0;
                    while (true) {
                        if (i >= arrayList.size()) {
                            i = -1;
                            break;
                        }
                        if (vqi.l(((h2i) arrayList.get(i)).a, iK)) {
                            break;
                        }
                        i++;
                    }
                    if (i == this.a) {
                        c(b87Var);
                    }
                } else {
                    g(iK);
                }
                tye tyeVar = (tye) ((SparseArray) this.k.m.c).get(iK);
                if (tyeVar == null) {
                    return null;
                }
                final sp7 sp7VarI = tyeVar.i(this.b, b87Var, this.a);
                wtb wtbVar = new wtb() { // from class: i2i
                    @Override // defpackage.wtb
                    public final void b(s26 s26Var, long j, b87 b87Var2, boolean z) {
                        j2i j2iVar = this.a;
                        int i2 = iK;
                        sp7 sp7Var = sp7VarI;
                        k2i k2iVar = j2iVar.k;
                        if (k2iVar.c) {
                            synchronized (k2iVar.l) {
                                try {
                                    boolean z2 = true;
                                    if (((h2i) ((ArrayList) j2iVar.k.m.b).get(j2iVar.a)).a.size() <= 1 || i2 != 2) {
                                        ((t26) ((c98) j2iVar.c.b).get(j2iVar.a)).getClass();
                                        lvb.Z("MediaItem duration required for sequence looping could not be extracted.", j != -9223372036854775807L);
                                        j2iVar.j += j;
                                        synchronized (j2iVar.k.q) {
                                            if (z) {
                                                try {
                                                    j2iVar.k.z--;
                                                } catch (Throwable th) {
                                                    throw th;
                                                }
                                            }
                                            k2i k2iVar2 = j2iVar.k;
                                            if (k2iVar2.z != 0) {
                                                z2 = false;
                                            }
                                            long j2 = j2iVar.j;
                                            long j3 = k2iVar2.y;
                                            if (j2 > j3 || z2) {
                                                k2iVar2.y = Math.max(j2, j3);
                                                for (int i3 = 0; i3 < j2iVar.k.k.size(); i3++) {
                                                    ((shf) j2iVar.k.k.get(i3)).getClass();
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        sp7Var.b(s26Var, j, b87Var2, z);
                    }
                };
                HashMap map = ((shf) this.k.k.get(this.a)).h;
                lvb.R(iK == 1 || iK == 2);
                lvb.R(map.get(Integer.valueOf(iK)) == null);
                map.put(Integer.valueOf(iK), wtbVar);
                SparseArray sparseArray2 = (SparseArray) this.k.m.e;
                sparseArray2.put(iK, Integer.valueOf(vqi.l(sparseArray2, iK) ? 1 + ((Integer) sparseArray2.get(iK)).intValue() : 1));
                xde xdeVar2 = this.k.m;
                ArrayList arrayList2 = (ArrayList) xdeVar2.b;
                int i2 = 0;
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    if (vqi.l(((h2i) arrayList2.get(i3)).a, iK)) {
                        i2++;
                    }
                }
                if (((Integer) ((SparseArray) xdeVar2.e).get(iK)).intValue() == i2) {
                    this.k.e();
                    this.k.j.c(2, tyeVar).b();
                }
                return sp7VarI;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(int i) {
        k2i k2iVar = this.k;
        xde xdeVar = k2iVar.m;
        lvb.b0(((tye) ((SparseArray) xdeVar.c).get(i)) == null);
        c98 c98Var = (c98) this.c.b;
        int i2 = this.a;
        lvb.O("Gaps can not be transmuxed.", !((t26) c98Var.get(i2)).a());
        SparseArray sparseArray = ((h2i) ((ArrayList) xdeVar.b).get(i2)).a;
        lvb.b0(vqi.l(sparseArray, i));
        xdeVar.O(i, new s76((b87) sparseArray.get(i), this.d, k2iVar.o, this.g, k2iVar.h));
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0142  */
    /* JADX WARN: Code duplicated, block: B:91:0x0163  */
    public final boolean h(int i, b87 b87Var) {
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        k2i k2iVar = this.k;
        boolean z4 = k2iVar.w;
        dc9 dc9Var = k2iVar.d;
        boolean z5 = true;
        boolean z6 = (i & 1) != 0;
        int iK = izl.k(b87Var.n);
        if (!z6) {
            return true;
        }
        b2i b2iVar = this.d;
        int i2 = this.a;
        k84 k84Var = this.c;
        if (iK == 1) {
            t9b t9bVar = k2iVar.o;
            c98 c98Var = (c98) k84Var.b;
            if (c98Var.size() > 1 || ((t26) c98Var.get(i2)).a.d > 1) {
                z2 = !k84Var.e;
                return z2;
            }
            c98 c98Var2 = (c98) k84Var.b;
            int i3 = 0;
            while (true) {
                if (i3 >= c98Var2.size()) {
                    z3 = false;
                    break;
                }
                if (((t26) c98Var2.get(i3)).a()) {
                    z3 = true;
                    break;
                }
                i3++;
            }
            if (z3 || dc9Var.n()) {
                return true;
            }
            String str2 = b2iVar.b;
            if (str2 != null && !str2.equals(b87Var.n)) {
                return true;
            }
            if ((b2iVar.b == null && !t9bVar.d(b87Var.n)) || !((s26) ((t26) c98Var.get(i2)).a.get(0)).f.a.isEmpty() || !((j36) k84Var.d).a.isEmpty()) {
                return true;
            }
            return false;
        }
        if (iK == 2) {
            t9b t9bVar2 = k2iVar.o;
            c98 c98Var3 = (c98) k84Var.b;
            if (c98Var3.size() > 1 || ((t26) c98Var3.get(i2)).a.d > 1) {
                z = !k84Var.f;
            } else if (!dc9Var.f() && b2iVar.d == 0 && (((str = b2iVar.c) == null || str.equals(b87Var.n) || str.equals(ut9.c(b87Var))) && ((str != null || t9bVar2.d(b87Var.n) || t9bVar2.d(ut9.c(b87Var))) && b87Var.A == 1.0f))) {
                s26 s26Var = (s26) ((t26) c98Var3.get(i2)).a.get(0);
                z88 z88Var = new z88(4);
                z88Var.f(s26Var.f.b);
                z88Var.f(((j36) k84Var.d).b);
                ghe gheVarH = z88Var.h();
                if (gheVarH.isEmpty() || izl.m(b87Var, gheVarH) != -1.0f) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = true;
            }
            if (z) {
                z2 = true;
            } else {
                ry9 ry9Var = this.b.a;
                if (!z4) {
                    dy9 dy9Var = ry9Var.e;
                    if (dy9Var.a > 0 && !dy9Var.g) {
                        z2 = true;
                    }
                }
                z2 = false;
            }
            if (z4 && z2) {
                z5 = false;
            }
            lvb.Z("Transcoding is required for track " + b87Var + " but MP4 edit list trimming is enabled. Disable mp4EditListTrimEnabled or ensure this track does not require transcoding.", z5);
            return z2;
        }
        return false;
    }
}
