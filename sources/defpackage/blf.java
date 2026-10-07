package defpackage;

import java.util.Collections;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class blf extends ilf {
    public final String l;
    public final long m;
    public final int n;
    public final String o;
    public final String p;

    public blf(alf alfVar) {
        super(alfVar);
        this.l = alfVar.h;
        this.m = alfVar.i;
        this.n = alfVar.j;
        this.o = alfVar.k;
        this.p = alfVar.l;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fd  */
    @Override // defpackage.ilf
    public final rfa C() {
        int i;
        njf njfVar;
        f70 f70Var = new f70();
        c30 c30Var = new c30(false);
        long j = this.m;
        c30Var.c = j != 0 ? j : 0L;
        String strA = this.l;
        if (ch3.r(strA)) {
            if (j <= 0) {
                i = this.n;
                if (i <= 0) {
                    strA = null;
                } else {
                    njfVar = this.a;
                    if (njfVar == null) {
                        njfVar = null;
                    }
                    strA = ((h4c) ((c2a) njfVar.H.getValue())).e.a(i);
                    if (ch3.r(strA)) {
                        strA = null;
                    }
                }
            } else {
                njf njfVar2 = this.a;
                if (njfVar2 == null) {
                    njfVar2 = null;
                }
                c2a c2aVar = (c2a) njfVar2.H.getValue();
                njf njfVar3 = this.a;
                if (njfVar3 == null) {
                    njfVar3 = null;
                }
                bi4 bi4Var = (bi4) njfVar3.l.getValue();
                njf njfVar4 = this.a;
                if (njfVar4 == null) {
                    njfVar4 = null;
                }
                sse sseVar = (sse) njfVar4.J.getValue();
                ks6 ks6Var = ((h4c) c2aVar).e;
                ks6Var.getClass();
                gm0.m("ks6", "getVcfByContactId: contactId %d", Long.valueOf(j));
                try {
                    if (((wsc) ((wwb) ks6Var.b).a.getValue()).c(wsc.g)) {
                        if (bi4Var == null) {
                            gm0.W("ks6", "Contact controller is null", new Object[0]);
                        }
                        vg4 vg4VarF = bi4Var.f(j, false);
                        if (vg4VarF == null) {
                            gm0.W("ks6", "getVcfByContactId: no contact found for id %d", Long.valueOf(j));
                        } else {
                            if (vg4VarF.w() <= 0) {
                                gm0.W("ks6", "getVcfByContactId: no server phone for contact id %d", Long.valueOf(j));
                            } else {
                                strA = ks6Var.c(vg4VarF.w(), sseVar);
                            }
                            if (ch3.r(strA)) {
                                i = this.n;
                                if (i <= 0) {
                                    strA = null;
                                } else {
                                    njfVar = this.a;
                                    if (njfVar == null) {
                                        njfVar = null;
                                    }
                                    strA = ((h4c) ((c2a) njfVar.H.getValue())).e.a(i);
                                    if (ch3.r(strA)) {
                                        strA = null;
                                    }
                                }
                            }
                        }
                    } else {
                        gm0.W("ks6", "getVcfByContactId: no permissions for contacts", new Object[0]);
                    }
                } catch (Exception e) {
                    Locale locale = Locale.ENGLISH;
                    gm0.V("ks6", "getVcfByContactId: exception for contactId " + j, e);
                }
                strA = null;
                if (ch3.r(strA)) {
                    i = this.n;
                    if (i <= 0) {
                        strA = null;
                    } else {
                        njfVar = this.a;
                        if (njfVar == null) {
                            njfVar = null;
                        }
                        strA = ((h4c) ((c2a) njfVar.H.getValue())).e.a(i);
                        if (ch3.r(strA)) {
                            strA = null;
                        }
                    }
                }
            }
        }
        c30Var.b = strA;
        String str = this.p;
        if (ch3.r(str)) {
            str = null;
        }
        c30Var.i = str;
        String str2 = this.o;
        c30Var.d = ch3.r(str2) ? null : str2;
        c30Var.e = ch3.r(str2) ? null : str2;
        f60 f60Var = new f60(c30Var);
        c60 c60Var = new c60();
        c60Var.s = f60Var;
        c60Var.a = y60.k;
        f70Var.a = Collections.singletonList(c60Var.a());
        c46 c46VarC = f70Var.c();
        rfa rfaVar = new rfa();
        rfaVar.n = c46VarC;
        return rfaVar;
    }

    @Override // defpackage.ilf
    public final String D() {
        return "ServiceTaskSendContactMessage";
    }
}
