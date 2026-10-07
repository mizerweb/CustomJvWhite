package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class vcf {
    public static final fcf a = new fcf(new byte[0], 0, 0, false, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(fcf fcfVar) {
        if (fcfVar.f != null || fcfVar.g != null) {
            ore.p("Failed requirement.");
            return;
        }
        if (fcfVar.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        fcf fcfVar2 = a;
        fcf fcfVar3 = (fcf) atomicReference.getAndSet(fcfVar2);
        if (fcfVar3 == fcfVar2) {
            return;
        }
        int i = fcfVar3 != null ? fcfVar3.c : 0;
        if (i >= 65536) {
            atomicReference.set(fcfVar3);
            return;
        }
        fcfVar.f = fcfVar3;
        fcfVar.b = 0;
        fcfVar.c = i + 8192;
        atomicReference.set(fcfVar);
    }

    public static final fcf b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        fcf fcfVar = a;
        fcf fcfVar2 = (fcf) atomicReference.getAndSet(fcfVar);
        if (fcfVar2 == fcfVar) {
            return new fcf();
        }
        if (fcfVar2 == null) {
            atomicReference.set(null);
            return new fcf();
        }
        atomicReference.set(fcfVar2.f);
        fcfVar2.f = null;
        fcfVar2.c = 0;
        return fcfVar2;
    }
}
