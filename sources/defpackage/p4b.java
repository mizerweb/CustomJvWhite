package defpackage;

import java.util.Collections;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class p4b extends aq implements qih, btc {
    public final String f;
    public final String g;
    public final long h;
    public final long i;
    public final g61 j;
    public final j61 k;

    public p4b(long j, String str, String str2, long j2, long j3, g61 g61Var, j61 j61Var) {
        super(j);
        this.f = str;
        this.g = str2;
        this.h = j2;
        this.i = j3;
        this.j = g61Var;
        this.k = j61Var;
    }

    @Override // defpackage.qih, defpackage.btc
    public final boolean a() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0108  */
    /* JADX WARN: Code duplicated, block: B:56:0x016d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x016f A[LOOP:0: B:47:0x013c->B:57:0x016f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x0172 A[SYNTHETIC] */
    @Override // defpackage.qih
    public final void b(kih kihVar) {
        long j;
        long j2;
        q4b q4bVar = (q4b) kihVar;
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        sfa sfaVarL = bqVar.i().l(this.i);
        if (sfaVarL == null || sfaVarL.j == wja.DELETED) {
            d();
            return;
        }
        long j3 = sfaVarL.h;
        gda gdaVar = q4bVar.c;
        if (gdaVar == null) {
            j = 0;
        } else {
            bq bqVar2 = this.e;
            if (bqVar2 == null) {
                bqVar2 = null;
            }
            rt2 rt2VarN = bqVar2.c().N(j3);
            bq bqVar3 = this.e;
            if (bqVar3 == null) {
                bqVar3 = null;
            }
            bze bzeVar = (bze) bqVar3.K.getValue();
            long j4 = rt2VarN.c.a.b;
            t51 t51Var = bzeVar.c;
            gm0.n("bze", "onSaveMessage: insert new message");
            sfa sfaVarL2 = bzeVar.a.l(bzeVar.a.d(rt2VarN.a, gdaVar, !rt2VarN.Z() ? bzeVar.d.a.t() : 0L, null));
            if (sfaVarL2 == null) {
                j = 0;
            } else {
                mg5 mg5Var = sfaVarL2.H;
                bzeVar.b.d(rt2VarN, sfaVarL2);
                gm0.m("bze", "onSaveMessage: chunks count = %d", Integer.valueOf(rt2VarN.b.n.d(mg5Var)));
                gei geiVar = (gei) bzeVar.f.getValue();
                long j5 = rt2VarN.a;
                geiVar.getClass();
                rt2 rt2VarA = geiVar.a(j5, sfaVarL2, (60 & 4) != 0 ? -1L : j4, -1, -1L, false);
                if (rt2VarA != null) {
                    gm0.m("bze", "onSaveMessage: chunks count = %d", Integer.valueOf(rt2VarA.b.n.e(mg5Var).size()));
                    t51Var.c(new wo3(Collections.singletonList(Long.valueOf(rt2VarA.a)), true));
                    j = 0;
                    t51Var.c(new ajc(rt2VarA.a, gdaVar.f, sfaVarL2.a, null, sfaVarL2.e, sfaVarL2.H));
                    if (sfaVarL2.C()) {
                        bzeVar.e.a(sfaVarL2);
                    }
                } else {
                    j = 0;
                }
            }
        }
        w(false);
        st2 st2Var = q4bVar.d;
        String str = q4bVar.e;
        if (st2Var == null || ch3.r(str)) {
            return;
        }
        bq bqVar4 = this.e;
        if (bqVar4 == null) {
            bqVar4 = null;
        }
        m8b m8bVarC0 = bqVar4.c().c0(Collections.singletonList(st2Var));
        if (m8bVarC0.j()) {
            long[] jArr = m8bVarC0.b;
            long[] jArr2 = m8bVarC0.a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j6 = jArr2[i];
                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j6) < 128) {
                                j2 = jArr[(i << 3) + i3];
                                break loop0;
                            }
                            j6 >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
            }
            ore.f("The LongSet is empty");
            return;
        }
        bq bqVar5 = this.e;
        if (bqVar5 == null) {
            bqVar5 = null;
        }
        rt2 rt2VarK = bqVar5.c().K(st2Var.a);
        j2 = rt2VarK != null ? rt2VarK.a : j;
        if (j2 != j) {
            bq bqVar6 = this.e;
            (bqVar6 != null ? bqVar6 : null).b().c(new r4b());
        }
    }

    @Override // defpackage.btc
    public final void d() {
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        bqVar.k().d(this.a);
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        if (p90.C(yhhVar.b)) {
            w(true);
            return;
        }
        d();
        w(false);
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        sfa sfaVarL = bqVar.i().l(this.i);
        if (sfaVarL == null || sfaVarL.j == wja.DELETED) {
            d();
        } else {
            bq bqVar2 = this.e;
            (bqVar2 != null ? bqVar2 : null).b().c(new otc(yhhVar));
        }
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.MsgSendCallback msgSendCallback = new Tasks.MsgSendCallback();
        msgSendCallback.requestId = this.a;
        msgSendCallback.callbackId = this.f;
        msgSendCallback.payload = this.g;
        msgSendCallback.timestamp = this.h;
        msgSendCallback.messageId = this.i;
        msgSendCallback.buttonType = this.k.a;
        Tasks.MsgSendCallback.ButtonPosition buttonPosition = new Tasks.MsgSendCallback.ButtonPosition();
        g61 g61Var = this.j;
        buttonPosition.row = g61Var.a;
        buttonPosition.column = g61Var.b;
        msgSendCallback.buttonPosition = buttonPosition;
        return sia.toByteArray(msgSendCallback);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_MSG_SEND_CALLBACK;
    }

    @Override // defpackage.btc
    public final atc j() {
        return atc.a;
    }

    @Override // defpackage.btc
    public final int l() {
        return 1000000;
    }

    @Override // defpackage.aq
    public final Object m() {
        Long l = new Long(this.h);
        String str = this.k.a;
        h3b h3bVar = new h3b((kfc) null, 11);
        h3bVar.h("callbackId", this.f);
        h3bVar.h(ApiProtocol.PARAM_PAYLOAD, this.g);
        h3bVar.a.put("timestamp", l);
        h3bVar.h("type", str);
        return h3bVar;
    }

    public final void w(boolean z) {
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        qfa qfaVarI = bqVar.i();
        long j = this.i;
        sfa sfaVarL = qfaVarI.l(j);
        if (sfaVarL == null || sfaVarL.j == wja.DELETED) {
            d();
            return;
        }
        bq bqVar2 = this.e;
        if (bqVar2 == null) {
            bqVar2 = null;
        }
        sua suaVar = (sua) bqVar2.x.getValue();
        ((ose) suaVar.a).C(j, new nua(new b52(this, z, 3), suaVar));
        bq bqVar3 = this.e;
        (bqVar3 != null ? bqVar3 : null).b().c(new kfi(sfaVarL.h, sfaVarL.a, false));
    }
}
