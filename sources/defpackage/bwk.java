package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bwk {
    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public static final String a(sfa sfaVar, qib qibVar) {
        c46 c46Var;
        e70 e70VarL;
        if (qibVar.c != 0 && sfaVar.J()) {
            c46 c46Var2 = sfaVar.n;
            if (c46Var2 != null) {
                e70VarL = c46Var2.l(y60.e);
            } else {
                e70VarL = null;
            }
        } else if (qibVar.e != 0 && sfaVar.P()) {
            c46 c46Var3 = sfaVar.n;
            if (c46Var3 != null) {
                e70VarL = c46Var3.l(y60.j);
            } else {
                e70VarL = null;
            }
        } else if (qibVar.d == 0 || !sfaVar.Z() || (c46Var = sfaVar.n) == null) {
            e70VarL = null;
        } else {
            e70VarL = c46Var.l(y60.d);
        }
        if (e70VarL != null) {
            return e70VarL.t;
        }
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "l70", "Can't add span to metric due to empty attach data!", null);
            }
        }
        return null;
    }

    public static final b9b b(gda gdaVar) {
        w50 w50Var;
        int i;
        long[] jArr = q1f.a;
        b9b b9bVar = new b9b();
        if (gdaVar != null) {
            for (l40 l40Var : gdaVar.h) {
                int iIntValue = 0;
                if ((l40Var != null ? l40Var.a : null) == w50.UNKNOWN) {
                    i = 0;
                } else {
                    w50 w50Var2 = l40Var != null ? l40Var.a : null;
                    w50 w50Var3 = w50.VIDEO;
                    if (w50Var2 == w50Var3 && qt4.a(((eti) l40Var).e.intValue()) == 1) {
                        i = 1;
                    } else if ((l40Var != null ? l40Var.a : null) == w50Var3) {
                        i = 2;
                    } else if ((l40Var != null ? l40Var.a : null) == w50.PHOTO) {
                        i = 3;
                    } else if ((l40Var != null ? l40Var.a : null) == w50.FILE) {
                        i = 4;
                    } else if ((l40Var != null ? l40Var.a : null) == w50.AUDIO) {
                        i = 5;
                    } else if ((l40Var != null ? l40Var.a : null) == w50.STICKER) {
                        i = 6;
                    } else if ((l40Var != null ? l40Var.a : null) == w50.CONTROL) {
                        i = 8;
                    } else if ((l40Var != null ? l40Var.a : null) == w50.SHARE) {
                        i = 9;
                    } else if ((l40Var != null ? l40Var.a : null) == w50.CALL) {
                        i = 10;
                    } else if ((l40Var != null ? l40Var.a : null) == w50.CONTACT) {
                        i = 11;
                    } else if ((l40Var != null ? l40Var.a : null) == w50.INLINE_KEYBOARD) {
                        i = 12;
                    } else if ((l40Var != null ? l40Var.a : null) == w50.LOCATION) {
                        i = 13;
                    } else if ((l40Var != null ? l40Var.a : null) == w50.REPLY_KEYBOARD) {
                        i = 14;
                    } else if ((l40Var != null ? l40Var.a : null) == w50.WIDGET) {
                        i = 15;
                    } else if ((l40Var != null ? l40Var.a : null) == w50.APP) {
                        i = 17;
                    } else {
                        i = (l40Var != null ? l40Var.a : null) == w50.PRESENT ? 18 : -((l40Var == null || (w50Var = l40Var.a) == null) ? 0 : w50Var.ordinal());
                    }
                }
                String strValueOf = String.valueOf(i);
                Integer num = (Integer) b9bVar.d(strValueOf);
                if (num != null) {
                    iIntValue = num.intValue();
                }
                b9bVar.k(strValueOf, Integer.valueOf(iIntValue + 1));
            }
        }
        return b9bVar;
    }
}
