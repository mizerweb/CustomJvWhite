package defpackage;

import java.util.Collection;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class b42 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b42(Object obj, lq4 lq4Var, int i) {
        super(3, lq4Var);
        this.e = i;
        this.h = obj;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                b42 b42Var = new b42((e42) obj4, (lq4) obj3, 0);
                b42Var.f = zBooleanValue;
                b42Var.g = (t4f) obj2;
                return b42Var.invokeSuspend(sbiVar);
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                b42 b42Var2 = new b42((y85) obj4, (lq4) obj3, 1);
                b42Var2.g = (enc) obj;
                b42Var2.f = zBooleanValue2;
                return b42Var2.invokeSuspend(sbiVar);
            default:
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                b42 b42Var3 = new b42((ioj) obj4, (lq4) obj3, 2);
                b42Var3.g = (plc) obj;
                b42Var3.f = zBooleanValue3;
                return b42Var3.invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c9  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        CharSequence charSequence;
        boolean z = true;
        switch (this.e) {
            case 0:
                boolean z2 = this.f;
                t4f t4fVar = (t4f) this.g;
                ch3.d0(obj);
                if (!z2) {
                    return null;
                }
                int iOrdinal = t4fVar.a.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                        return null;
                    }
                    ore.o();
                    return null;
                }
                if (t4fVar.c) {
                    return null;
                }
                tmc tmcVarB = ((e42) this.h).d.b();
                m4f m4fVar = t4fVar.b;
                if (cqk.d(m4fVar != null ? m4fVar.c : null, tmcVarB.a.getId()) || (charSequence = t4fVar.d) == null || r5h.X0(charSequence)) {
                    return null;
                }
                return new jvh(new vnh(R.string.call_screen_record_user_description, a.n1(new Object[]{charSequence})), new tnh(tmcVarB.a.j() ? R.string.call_screen_record_start_tooltip_admin : R.string.call_screen_record_start_tooltip_user));
            case 1:
                enc encVar = (enc) this.g;
                boolean z3 = this.f;
                ch3.d0(obj);
                if (z3) {
                    z = false;
                } else {
                    y85 y85Var = (y85) this.h;
                    er3 er3Var = y85.N1;
                    if (y85Var.K().i) {
                        z = false;
                    } else {
                        Collection<tmc> collectionValues = encVar.c.values();
                        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                            z = false;
                        } else {
                            for (tmc tmcVar : collectionValues) {
                                if (tmcVar.a.l() || !tmcVar.a.m()) {
                                }
                            }
                            z = false;
                        }
                    }
                }
                return Boolean.valueOf(z);
            default:
                moj mojVar = moj.a;
                plc plcVar = (plc) this.g;
                boolean z4 = this.f;
                ch3.d0(obj);
                String str = ((ioj) this.h).C;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "loadingState: " + plcVar + " isShowBackButton: " + z4, null);
                    }
                }
                ((ioj) this.h).Z.f(z4);
                if (cqk.d(plcVar, mlc.a)) {
                    return mojVar;
                }
                if ((plcVar instanceof nlc) || cqk.d(plcVar, olc.a)) {
                    return new noj(z4);
                }
                if (cqk.d(plcVar, llc.a)) {
                    return loj.a;
                }
                ooj oojVar = ((ioj) this.h).g;
                return oojVar != null ? oojVar.c : mojVar;
        }
    }
}
