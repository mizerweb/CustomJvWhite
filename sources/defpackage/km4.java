package defpackage;

import java.text.CollationKey;
import java.text.Collator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class km4 implements qf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ km4(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        Object itiVar;
        int iCompareTo = 1;
        switch (this.a) {
            case 0:
                mm4 mm4Var = (mm4) this.b;
                cf7 cf7Var = (cf7) this.c;
                Collator collator = (Collator) this.d;
                mw mwVar = (mw) this.e;
                String str = (String) cf7Var.invoke(obj);
                String str2 = (String) cf7Var.invoke(obj2);
                mm4Var.getClass();
                CollationKey collationKey = (CollationKey) mwVar.get(str);
                if (collationKey == null) {
                    collationKey = collator.getCollationKey(str.toLowerCase(Locale.getDefault()));
                    mwVar.put(str, collationKey);
                }
                CollationKey collationKey2 = (CollationKey) mwVar.get(str2);
                if (collationKey2 == null) {
                    collationKey2 = collator.getCollationKey(str2.toLowerCase(Locale.getDefault()));
                    mwVar.put(str2, collationKey2);
                }
                boolean z = false;
                boolean z2 = str.length() != 0 && Character.isLetter(str.charAt(0));
                if (str2.length() != 0 && Character.isLetter(str2.charAt(0))) {
                    z = true;
                }
                if ((z2 && z) || (!z2 && !z)) {
                    iCompareTo = collationKey.compareTo(collationKey2);
                } else if (z2) {
                    iCompareTo = -1;
                }
                return Integer.valueOf(iCompareTo);
            case 1:
                pti ptiVar = (pti) this.b;
                lti ltiVar = (lti) this.c;
                e3j e3jVar = (e3j) this.d;
                rui ruiVar = (rui) this.e;
                t50 t50Var = (t50) obj;
                long jLongValue = ((Long) obj2).longValue();
                String str3 = ltiVar.a;
                if (t50Var instanceof oxi) {
                    String str4 = ptiVar.g;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            int iG = ptiVar.y.g();
                            boolean zD = e3jVar.d();
                            StringBuilder sbT = qt4.t(jLongValue, "Player autoplay. stop autoplay to start a video message, \n                                |msgId:", ", \n                                |attachId:", str3);
                            sbT.append("\n                                |states count:");
                            sbT.append(iG);
                            sbT.append("\n                                |playing:");
                            sbT.append(zD);
                            a4cVar.c(je9Var, str4, s5h.y0(sbT.toString()), null);
                        }
                    }
                    ptiVar.c(e3jVar, str3);
                    itiVar = new jti(jLongValue, (oxi) t50Var);
                } else {
                    itiVar = new iti(jLongValue, str3, t50Var, e3jVar.e(), t50Var instanceof h8g ? 0L : e3jVar.getDuration(), ruiVar.h());
                }
                ptiVar.c.invoke(itiVar);
                return sbi.a;
            default:
                mvi mviVar = (mvi) this.b;
                wui wuiVar = (wui) this.c;
                d1e d1eVar = (d1e) this.d;
                f4c f4cVar = (f4c) this.e;
                xui xuiVar = (xui) obj;
                vo8 vo8VarH = (xf5) obj2;
                String str5 = mvi.f;
                je9 je9Var2 = je9.d;
                if (vo8VarH == null || !vo8VarH.isActive()) {
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, str5, "creating new job", null);
                    }
                    vo8VarH = yab.h(mviVar.c, null, 2, new b2f(mviVar, wuiVar, d1eVar, f4cVar, xuiVar, null, 8), 1);
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                        a4cVar3.c(je9Var2, str5, "returned new job", null);
                    }
                } else {
                    a4c a4cVar4 = gm0.f;
                    if (a4cVar4 != null && a4cVar4.b(je9Var2)) {
                        a4cVar4.c(je9Var2, str5, c0a.k(vo8VarH.hashCode(), "have active job[", "]"), null);
                    }
                }
                return vo8VarH;
        }
    }
}
