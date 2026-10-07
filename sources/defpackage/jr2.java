package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class jr2 extends aq implements qih {
    public final String f;
    public final String g;
    public final int h;

    public jr2(long j, String str, String str2) {
        super(j);
        this.f = str;
        this.g = str2;
        this.h = 4;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00aa A[LOOP:0: B:5:0x001b->B:28:0x00aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ae A[EDGE_INSN: B:33:0x00ae->B:29:0x00ae BREAK  A[LOOP:0: B:5:0x001b->B:28:0x00aa], SYNTHETIC] */
    @Override // defpackage.qih
    public final void b(kih kihVar) {
        s4b s4bVar = (s4b) kihVar;
        m8b m8bVarC0 = p().c0(Collections.singletonList(s4bVar.f));
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
                            long j3 = s4bVar.c;
                            sfa sfaVarL = r().l(r().d(j2, s4bVar.e, t().a.t(), null));
                            String str = this.g;
                            if (str != null && str.length() != 0) {
                                n().h(j2, j3, this.g);
                            }
                            if (sfaVarL != null) {
                                bq bqVar = this.e;
                                if (bqVar == null) {
                                    bqVar = null;
                                }
                                ((eei) bqVar.c0.getValue()).a(j2, s4bVar.c, sfaVarL, -1, -1L);
                            }
                            o().c(new kr2(this.a, j2));
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
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        o().c(new yq0(this.a, yhhVar));
    }

    @Override // defpackage.aq
    public final Object m() {
        oq4 oq4Var = new oq4(2, null, r66.a, this.f, null, null, null, null, null, null, true, this.h, null, null, false, false);
        s60 s60Var = new s60();
        s60Var.a = System.currentTimeMillis();
        b50 b50Var = new b50(1);
        b50Var.add(oq4Var);
        s60Var.e = b50Var;
        return new h3b(0L, null, 0L, s60Var.b(), null);
    }
}
