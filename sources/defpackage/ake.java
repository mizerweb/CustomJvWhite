package defpackage;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class ake {
    public int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;

    public ake(zje zjeVar) {
        this.b = zjeVar;
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = new PriorityQueue();
        this.a = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r10 < r3.b) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(long r10, defpackage.nmc r12) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.d
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            java.lang.Object r1 = r9.e
            java.util.PriorityQueue r1 = (java.util.PriorityQueue) r1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 == 0) goto L9f
            int r3 = r9.a
            if (r3 == 0) goto L9f
            r4 = -1
            if (r3 == r4) goto L2f
            int r3 = r1.size()
            int r5 = r9.a
            if (r3 < r5) goto L2f
            java.lang.Object r3 = r1.peek()
            yje r3 = (defpackage.yje) r3
            java.lang.String r5 = defpackage.vqi.a
            long r5 = r3.b
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 >= 0) goto L2f
            goto L9f
        L2f:
            java.lang.Object r3 = r9.c
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L3f
            nmc r3 = new nmc
            r3.<init>()
            goto L45
        L3f:
            java.lang.Object r3 = r3.pop()
            nmc r3 = (defpackage.nmc) r3
        L45:
            int r5 = r12.a()
            r3.K(r5)
            byte[] r5 = r12.a
            int r12 = r12.b
            byte[] r6 = r3.a
            int r7 = r3.a()
            r8 = 0
            java.lang.System.arraycopy(r5, r12, r6, r8, r7)
            java.lang.Object r12 = r9.f
            yje r12 = (defpackage.yje) r12
            if (r12 == 0) goto L6c
            long r5 = r12.b
            int r5 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r5 != 0) goto L6c
            java.util.ArrayList r9 = r12.a
            r9.add(r3)
            return
        L6c:
            boolean r12 = r0.isEmpty()
            if (r12 == 0) goto L78
            yje r12 = new yje
            r12.<init>()
            goto L7e
        L78:
            java.lang.Object r12 = r0.pop()
            yje r12 = (defpackage.yje) r12
        L7e:
            java.util.ArrayList r0 = r12.a
            if (r2 == 0) goto L83
            r8 = 1
        L83:
            defpackage.lvb.R(r8)
            boolean r2 = r0.isEmpty()
            defpackage.lvb.b0(r2)
            r12.b = r10
            r0.add(r3)
            r1.add(r12)
            r9.f = r12
            int r10 = r9.a
            if (r10 == r4) goto L9e
            r9.c(r10)
        L9e:
            return
        L9f:
            java.lang.Object r9 = r9.b
            zje r9 = (defpackage.zje) r9
            r9.o(r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ake.a(long, nmc):void");
    }

    public void b() {
        int iA = ((tme) this.d).a((Context) this.b);
        if (this.a != iA) {
            this.a = iA;
            ks5 ks5Var = (ks5) ((s63) this.c).b;
            if (ks5Var.e != iA) {
                ks5Var.e = iA;
                ks5Var.c++;
                ks5Var.a.obtainMessage(3, iA, 0).sendToTarget();
            }
            boolean zB = ks5Var.b();
            Iterator it = ks5Var.b.iterator();
            if (it.hasNext()) {
                throw qt4.h(it);
            }
            if (zB) {
                ks5Var.a();
            }
        }
    }

    public void c(int i) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.e;
        while (priorityQueue.size() > i) {
            yje yjeVar = (yje) priorityQueue.poll();
            String str = vqi.a;
            int i2 = 0;
            while (true) {
                arrayList = yjeVar.a;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((zje) this.b).o(yjeVar.b, (nmc) arrayList.get(i2));
                ((ArrayDeque) this.c).push((nmc) arrayList.get(i2));
                i2++;
            }
            arrayList.clear();
            yje yjeVar2 = (yje) this.f;
            if (yjeVar2 != null && yjeVar2.b == yjeVar.b) {
                this.f = null;
            }
            ((ArrayDeque) this.d).push(yjeVar);
        }
    }

    public void d(int i) {
        lvb.b0(i >= 0);
        this.a = i;
        c(i);
    }

    public ake(Context context, s63 s63Var) {
        tme tmeVar = ks5.h;
        this.b = context.getApplicationContext();
        this.c = s63Var;
        this.d = tmeVar;
        this.e = vqi.q(null);
    }
}
