package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class t3h extends qrc {
    public final AtomicReference g;

    public t3h(erc ercVar) {
        super(ercVar);
        this.g = new AtomicReference(p3h.a);
    }

    public static boolean B(azg azgVar, azg azgVar2) {
        return azgVar.a() == azgVar2.a();
    }

    public static void z(t3h t3hVar, azg azgVar, long j, String str, int i, b9b b9bVar, int i2) {
        boolean z = (i2 & 16) == 0;
        if ((i2 & 32) != 0) {
            b9bVar = q1f.b;
        }
        AtomicReference atomicReference = t3hVar.g;
        r3h r3hVar = (r3h) atomicReference.get();
        if (r3hVar instanceof o3h) {
            o3h o3hVar = (o3h) r3hVar;
            if (B(o3hVar.b(), azgVar)) {
                if (o3hVar instanceof n3h) {
                    n3h n3hVar = (n3h) o3hVar;
                    v0h.j(atomicReference, o3hVar, n3hVar.e(j));
                    String strA = n3hVar.a();
                    long[] jArr = q1f.a;
                    b9b b9bVar2 = b9bVar;
                    b9b b9bVar3 = new b9b();
                    b9bVar3.k("story_id", Long.valueOf(j));
                    b9bVar3.l(b9bVar2);
                    qrc.k(t3hVar, str, i, strA, z, null, b9bVar3, 80);
                    return;
                }
                b9b b9bVar4 = b9bVar;
                if (!(o3hVar instanceof q3h)) {
                    ore.o();
                    return;
                }
                q3h q3hVar = (q3h) o3hVar;
                if (wxg.b(q3hVar.e(), j)) {
                    qrc.k(t3hVar, str, i, q3hVar.a(), z, null, b9bVar4, 80);
                } else {
                    qrc.o(t3hVar, m3h.MOVED_TO_OTHER_STORY, q3hVar.a(), null, null, 28);
                }
            }
        }
    }

    public final void A(azg azgVar, m3h m3hVar, Throwable th) {
        r3h r3hVar = (r3h) this.g.get();
        if (r3hVar instanceof o3h) {
            o3h o3hVar = (o3h) r3hVar;
            if (B(o3hVar.b(), azgVar)) {
                qrc.o(this, m3hVar, o3hVar.a(), null, th != null ? th.getClass().getName() : null, 20);
            }
        }
    }

    @Override // defpackage.zqc
    public final void c(pxa pxaVar, int i) {
        this.g.updateAndGet(new ea1(8, pxaVar));
    }
}
