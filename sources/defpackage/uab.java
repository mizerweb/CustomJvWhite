package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class uab {
    public final ny8 a;
    public final boolean b;
    public final p3c c = new p3c(0L);

    public uab(ny8 ny8Var, boolean z) {
        this.a = ny8Var;
        this.b = z;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004f  */
    public final void a(long j, String str) {
        Integer num;
        long j2;
        if (!this.b) {
            gm0.n(uab.class.getName(), "отправка событий отключена");
            return;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1510827895) {
            if (iHashCode != -951532658) {
                if (iHashCode == 107876 && str.equals("max")) {
                    num = 0;
                } else {
                    num = null;
                }
            } else if (str.equals("qrcode")) {
                num = 2;
            } else {
                num = null;
            }
        } else if (str.equals("jlottie")) {
            num = 1;
        } else {
            num = null;
        }
        if (num == null) {
            String name = uab.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "Не найден бит для ".concat(str), null);
                return;
            }
            return;
        }
        int iIntValue = num.intValue();
        AtomicLong atomicLong = (AtomicLong) this.c.b;
        if (iIntValue < 0 || iIntValue >= 64) {
            ore.p("Index must be in 0..63");
            return;
        }
        long j3 = 1 << iIntValue;
        do {
            j2 = atomicLong.get();
            if ((j2 & j3) != 0) {
                String name2 = uab.class.getName();
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 == null) {
                    return;
                }
                je9 je9Var2 = je9.d;
                if (a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, name2, str.concat(" уже загружен"), null);
                    return;
                }
                return;
            }
        } while (!atomicLong.compareAndSet(j2, j2 | j3));
        yj5.a((yj5) this.a.getValue(), xj5.NATIVE_LIB_INIT_DURATION, j, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, str, null, null, null, null, null, null, -131076);
    }
}
