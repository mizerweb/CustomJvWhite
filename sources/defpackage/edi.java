package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import one.me.messages.list.loader.MessageModel;

/* JADX INFO: loaded from: classes2.dex */
public final class edi {
    public static final /* synthetic */ zv8[] j;
    public final gjg a;
    public final gjg b;
    public final gu4 c;
    public final xhh d;
    public volatile boolean g;
    public final String e = edi.class.getName();
    public final ddi f = new ddi();
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final p3c i = qyj.S();

    static {
        z8b z8bVar = new z8b(edi.class, "invalidateMarkerJob", "getInvalidateMarkerJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        j = new zv8[]{z8bVar};
    }

    public edi(r8e r8eVar, r8e r8eVar2, dq4 dq4Var, xhh xhhVar) {
        this.a = r8eVar;
        this.b = r8eVar2;
        this.c = dq4Var;
        this.d = xhhVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    public final Object a(rt2 rt2Var, opa opaVar, mdh mdhVar) {
        je9 je9Var = je9.d;
        sbi sbiVar = sbi.a;
        if (!this.g) {
            long jC = pll.c(rt2Var);
            int iD = opaVar.d(jC);
            if (iD < 0) {
                iD = Math.abs(iD) - 1;
            }
            MessageModel messageModel = (MessageModel) ww3.u1(iD, opaVar.a);
            boolean z = messageModel != null && messageModel.c == jC;
            if ((iD == 0 && opaVar.c && !z) || messageModel == null) {
                this.g = false;
                String str = this.e;
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, zo5.w(qt4.u(jC, "Can't find unreadMarker by chatReadMark:", ", isExact:", z), ", firstUnread:", messageModel != null ? messageModel.x() : null), null);
                    return sbiVar;
                }
            } else {
                if (!rt2Var.O()) {
                    jC = 0;
                } else if (jC >= messageModel.c) {
                    if (z) {
                        MessageModel messageModel2 = (MessageModel) ww3.u1(iD + 1, opaVar.a);
                        if (messageModel2 != null) {
                            if (messageModel2.b == 0) {
                                jC = 0;
                            } else {
                                jC = messageModel2.c - 1;
                            }
                        } else if (opaVar.b) {
                            jC++;
                        } else {
                            jC = 0;
                        }
                    } else {
                        jC = pll.c(rt2Var);
                    }
                }
                String str2 = this.e;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, str2, zo5.j(jC, "Found unreadMarker, mark:"), null);
                }
                this.g = true;
                Object objEmit = this.f.a.emit(new adi(jC), mdhVar);
                hu4 hu4Var = hu4.a;
                if (objEmit != hu4Var) {
                    objEmit = sbiVar;
                }
                if (objEmit == hu4Var) {
                    return objEmit;
                }
            }
        }
        return sbiVar;
    }

    public final void b(boolean z, af7 af7Var) {
        rt2 rt2Var = (rt2) this.a.getValue();
        if (rt2Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = this.h;
        if (z) {
            atomicBoolean.getAndSet(true);
            return;
        }
        if (!rt2Var.O()) {
            atomicBoolean.getAndSet(false);
            return;
        }
        if (atomicBoolean.getAndSet(false)) {
            sgg sggVarH0 = yab.h0(this.c, ((n0c) this.d).a(), 2, new p7g(this, rt2Var, af7Var, null, 14));
            this.i.B(this, j[0], sggVarH0);
        }
    }
}
