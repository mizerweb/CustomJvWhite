package defpackage;

import java.util.ArrayDeque;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class wag implements lo0 {
    public final int a;
    public final double b;
    public final ArrayDeque c;
    public final TreeSet d;
    public double e;
    public long f;

    public wag(double d) {
        lvb.R(d >= 0.0d && d <= 1.0d);
        this.a = 10;
        this.b = d;
        this.c = new ArrayDeque();
        this.d = new TreeSet();
        this.f = Long.MIN_VALUE;
    }

    @Override // defpackage.lo0
    public final long a() {
        return this.f;
    }

    @Override // defpackage.lo0
    public final void b(long j, long j2) {
        ArrayDeque arrayDeque;
        TreeSet<vag> treeSet;
        long j3;
        while (true) {
            arrayDeque = this.c;
            int size = arrayDeque.size();
            int i = this.a;
            treeSet = this.d;
            if (size < i) {
                break;
            }
            vag vagVar = (vag) arrayDeque.remove();
            treeSet.remove(vagVar);
            this.e -= vagVar.b;
        }
        double dSqrt = Math.sqrt(j);
        vag vagVar2 = new vag((j * 8000000) / j2, dSqrt);
        arrayDeque.add(vagVar2);
        treeSet.add(vagVar2);
        this.e += dSqrt;
        if (arrayDeque.isEmpty()) {
            j3 = Long.MIN_VALUE;
        } else {
            double d = this.e * this.b;
            double d2 = 0.0d;
            double d3 = 0.0d;
            long j4 = 0;
            for (vag vagVar3 : treeSet) {
                double d4 = d2 + (vagVar3.b / 2.0d);
                if (d4 < d) {
                    j4 = vagVar3.a;
                    d3 = d4;
                    d2 = (vagVar3.b / 2.0d) + d4;
                } else if (j4 == 0) {
                    j3 = vagVar3.a;
                } else {
                    j3 = ((long) (((d - d3) * (vagVar3.a - j4)) / (d4 - d3))) + j4;
                }
            }
            j3 = j4;
        }
        this.f = j3;
    }

    @Override // defpackage.lo0
    public final void reset() {
        this.c.clear();
        this.d.clear();
        this.e = 0.0d;
        this.f = Long.MIN_VALUE;
    }
}
