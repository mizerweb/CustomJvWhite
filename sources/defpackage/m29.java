package defpackage;

import java.util.Collections;
import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes3.dex */
public final class m29 extends aq implements qih {
    public final String f;
    public final String g;

    public m29(long j, String str) {
        super(j);
        this.f = str;
        this.g = m29.class.getName();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x009e A[LOOP:0: B:10:0x0031->B:24:0x009e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x00a1 A[EDGE_INSN: B:68:0x00a1->B:25:0x00a1 BREAK  A[LOOP:0: B:10:0x0031->B:24:0x009e], SYNTHETIC] */
    @Override // defpackage.qih
    public final void b(kih kihVar) throws Throwable {
        n29 n29Var = (n29) kihVar;
        String str = n29Var.f;
        oui ouiVar = n29Var.h;
        st2 st2Var = n29Var.c;
        if (st2Var != null) {
            try {
                s().j(st2Var);
            } catch (TamErrorException unused) {
            }
            m8b m8bVarC0 = p().c0(Collections.singletonList(st2Var));
            if (m8bVarC0.d > 0) {
                long[] jArr = m8bVarC0.b;
                long[] jArr2 = m8bVarC0.a;
                int length = jArr2.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr2[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    long j2 = jArr[(i << 3) + i3];
                                    o().c(new o29(this.a, Long.valueOf(j2), n29Var.e != null ? r().d(j2, n29Var.e, t().a.t(), null) : -1L, null, null, null, null, str));
                                    return;
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                ore.f("The LongSet is empty");
                return;
            }
            return;
        }
        byte b = 0;
        if (ouiVar != null) {
            a0b a0bVarS = s();
            a0bVarS.getClass();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "MissedContactsController", "requestForVideoConference: videoConference=" + ouiVar, null);
                }
            }
            pj4 pj4Var = ouiVar.a;
            if (pj4Var != null) {
                a0bVarS.j.a(pj4Var.a);
            }
            o().c(new o29(this.a, null, -1L, null, null, ouiVar, null, str));
            return;
        }
        fmg fmgVar = n29Var.i;
        if (fmgVar != null) {
            bq bqVar = this.e;
            if (bqVar == null) {
                bqVar = null;
            }
            yab.i0(bqVar.l(), null, 0, new vk4((Object) this, (Object) fmgVar, (Object) str, (lq4) (b == true ? 1 : 0), 23), 3);
            return;
        }
        gm4 gm4Var = n29Var.d;
        if (gm4Var != null) {
            pj4 pj4Var2 = gm4Var.a;
            vg4 vg4VarF = q().f(pj4Var2.a, false);
            if (vg4VarF == null || !vg4VarF.h()) {
                q().n(Collections.singletonList(pj4Var2), ji4.b);
                bq bqVar2 = this.e;
                yfd yfdVar = (yfd) (bqVar2 != null ? bqVar2 : null).Q.getValue();
                long j3 = pj4Var2.a;
                rfd rfdVar = gm4Var.c;
                yfdVar.getClass();
                qfd qfdVar = new qfd(rfdVar.a, rfdVar.b);
                l8b l8bVar = ki9.a;
                l8b l8bVar2 = new l8b();
                l8bVar2.l(j3, qfdVar);
                yfdVar.I(l8bVar2, ((Boolean) yfdVar.v.i()).booleanValue());
            } else {
                q().n(Collections.singletonList(pj4Var2), ji4.a);
            }
            o().c(new o29(this.a, null, -1L, gm4Var, null, null, null, str));
        }
        ir7 ir7Var = n29Var.g;
        if (ir7Var != null) {
            o().c(new o29(this.a, null, -1L, null, ir7Var, null, null, str));
        }
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        o().c(new yq0(this.a, yhhVar));
    }

    @Override // defpackage.aq
    public final Object m() {
        return new wy2(this.f);
    }
}
