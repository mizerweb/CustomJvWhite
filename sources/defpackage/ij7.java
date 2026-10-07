package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class ij7 implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();
    public static final o6 f = new o6(8);
    public ArrayList a;
    public long b;
    public long c;
    public ArrayList d;

    public static lfe c(RecyclerView recyclerView, int i, long j) {
        int iZ = recyclerView.f.z();
        for (int i2 = 0; i2 < iZ; i2++) {
            lfe lfeVarT = RecyclerView.T(recyclerView.f.y(i2));
            if (lfeVarT.c == i && !lfeVarT.q()) {
                return null;
            }
        }
        cfe cfeVar = recyclerView.c;
        try {
            recyclerView.d0();
            lfe lfeVarK = cfeVar.k(i, j);
            if (lfeVarK != null) {
                if (!lfeVarK.p() || lfeVarK.q()) {
                    cfeVar.a(lfeVarK, false);
                } else {
                    cfeVar.h(lfeVarK.a);
                }
            }
            return lfeVarK;
        } finally {
            recyclerView.e0(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.s) {
            if (RecyclerView.Z1 && !this.a.contains(recyclerView)) {
                ore.k("attempting to post unregistered view!");
                return;
            } else if (this.b == 0) {
                this.b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        nk5 nk5Var = recyclerView.F1;
        nk5Var.a = i;
        nk5Var.b = i2;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ca  */
    public final void b(long j) {
        hj7 hj7Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        hj7 hj7Var2;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            nk5 nk5Var = recyclerView3.F1;
            if (windowVisibility == 0) {
                nk5Var.c(recyclerView3, false);
                i += nk5Var.c;
            }
        }
        arrayList.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                nk5 nk5Var2 = recyclerView4.F1;
                int iAbs = Math.abs(nk5Var2.b) + Math.abs(nk5Var2.a);
                for (int i5 = 0; i5 < nk5Var2.c * 2; i5 += 2) {
                    if (i3 >= arrayList.size()) {
                        hj7Var2 = new hj7();
                        arrayList.add(hj7Var2);
                    } else {
                        hj7Var2 = (hj7) arrayList.get(i3);
                    }
                    int[] iArr = (int[]) nk5Var2.d;
                    int i6 = iArr[i5 + 1];
                    hj7Var2.a = i6 <= iAbs;
                    hj7Var2.b = iAbs;
                    hj7Var2.c = i6;
                    hj7Var2.d = recyclerView4;
                    hj7Var2.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList, f);
        for (int i7 = 0; i7 < arrayList.size() && (recyclerView = (hj7Var = (hj7) arrayList.get(i7)).d) != null; i7++) {
            lfe lfeVarC = c(recyclerView, hj7Var.e, hj7Var.a ? BuildConfig.MAX_TIME_TO_UPLOAD : j);
            if (lfeVarC != null && lfeVarC.b != null && lfeVarC.p() && !lfeVarC.q() && (recyclerView2 = (RecyclerView) lfeVarC.b.get()) != null) {
                if (recyclerView2.D && recyclerView2.f.z() != 0) {
                    recyclerView2.n0();
                }
                nk5 nk5Var3 = recyclerView2.F1;
                nk5Var3.c(recyclerView2, true);
                if (nk5Var3.c != 0) {
                    try {
                        int i8 = mwh.a;
                        Trace.beginSection("RV Nested Prefetch");
                        hfe hfeVar = recyclerView2.G1;
                        nee neeVar = recyclerView2.m;
                        hfeVar.e = 1;
                        hfeVar.f = neeVar.l();
                        hfeVar.h = false;
                        hfeVar.i = false;
                        hfeVar.j = false;
                        for (int i9 = 0; i9 < nk5Var3.c * 2; i9 += 2) {
                            c(recyclerView2, ((int[]) nk5Var3.d)[i9], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i10 = mwh.a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            hj7Var.a();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        try {
            int i = mwh.a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.c);
                }
            }
            this.b = 0L;
        } finally {
            this.b = 0L;
            int i3 = mwh.a;
            Trace.endSection();
        }
    }
}
