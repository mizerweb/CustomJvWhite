package defpackage;

import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class hci extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ jci g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hci(jci jciVar, int i, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 2;
        this.g = jciVar;
        this.f = i;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        jci jciVar = this.g;
        switch (i) {
            case 0:
                return new hci(jciVar, lq4Var, 0);
            case 1:
                return new hci(jciVar, lq4Var, 1);
            default:
                return new hci(jciVar, this.f, lq4Var);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                return ((hci) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
            case 1:
                return ((hci) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
            default:
                ((hci) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0066  */
    /* JADX WARN: Code duplicated, block: B:13:0x006e  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ea  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object objA;
        h54 h54Var;
        ra2 pa2Var;
        int i = this.e;
        hu4 hu4Var = hu4.a;
        sbi sbiVar = sbi.a;
        jci jciVar = this.g;
        Object objK = null;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    ghb ghbVar = ew5.b;
                    long jO = qe7.O(10, lw5.SECONDS);
                    this.f = 1;
                    if (rx8.u(jO, this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                jciVar.B().h(qa2.HIDE, jciVar.c);
                a8j.x(jciVar.q, dci.a);
                return sbiVar;
            case 1:
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj);
                    } else {
                        if (i3 != 2) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj);
                        objA = obj;
                    }
                    vg4 vg4Var = (vg4) objA;
                    objK = vg4Var != null ? vg4Var.k() : null;
                    if (objK == null) {
                        objK = "";
                    }
                    a8j.x(jciVar.q, new eci(new vnh(R.string.unknown_call_snackbar_contact_added_text, a.n1(new Object[]{objK})), R.drawable.icon_user_fill, g9c.a));
                    return sbiVar;
                }
                ch3.d0(obj);
                ch4 ch4Var = (ch4) jciVar.f.getValue();
                long j = jciVar.d;
                this.f = 1;
                if (ch4Var.a(j, this, null, null) == hu4Var) {
                    return hu4Var;
                }
                jciVar.B().h(qa2.TO_CONTACTS, jciVar.c);
                hk7 hk7Var = (hk7) jciVar.g.getValue();
                long j2 = jciVar.d;
                this.f = 2;
                objA = hk7.a(hk7Var, j2, this);
                if (objA == hu4Var) {
                    return hu4Var;
                }
                vg4 vg4Var2 = (vg4) objA;
                if (vg4Var2 != null) {
                }
                if (objK == null) {
                    objK = "";
                }
                a8j.x(jciVar.q, new eci(new vnh(R.string.unknown_call_snackbar_contact_added_text, a.n1(new Object[]{objK})), R.drawable.icon_user_fill, g9c.a));
                return sbiVar;
            default:
                ch3.d0(obj);
                pvb pvbVar = (pvb) jciVar.j.getValue();
                byte b = (byte) this.f;
                pvb.t(pvbVar, new e54(pvbVar.u().a.g(), q54.UNKNOWN_CALL, b, new long[0], new long[]{jciVar.d}, null, null, null));
                for (Object obj2 : (Iterable) jciVar.n.getValue()) {
                    if (((h54) obj2).a == b) {
                        objK = obj2;
                        h54Var = (h54) objK;
                        if (h54Var != null) {
                            pa2Var = new pa2(h54Var.b);
                        } else {
                            pa2Var = zpe.e;
                        }
                        jciVar.B().h(pa2Var, jciVar.c);
                        a8j.x(jciVar.q, new eci(new tnh(R.string.unknown_call_snackbar_blocked_text), R.drawable.ic_secure_animated, g9c.b));
                        return sbiVar;
                    }
                }
                h54Var = (h54) objK;
                if (h54Var != null) {
                    pa2Var = new pa2(h54Var.b);
                } else {
                    pa2Var = zpe.e;
                }
                jciVar.B().h(pa2Var, jciVar.c);
                a8j.x(jciVar.q, new eci(new tnh(R.string.unknown_call_snackbar_blocked_text), R.drawable.ic_secure_animated, g9c.b));
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hci(jci jciVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = jciVar;
    }
}
