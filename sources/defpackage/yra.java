package defpackage;

import java.util.List;
import java.util.Locale;
import one.me.messages.list.loader.MessageModel;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class yra extends mdh implements qf7 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ jsa f;
    public final /* synthetic */ List g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yra(jsa jsaVar, List list, lq4 lq4Var) {
        super(2, lq4Var);
        this.f = jsaVar;
        this.g = list;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        List list = this.g;
        jsa jsaVar = this.f;
        switch (i) {
            case 0:
                return new yra(list, jsaVar, lq4Var);
            default:
                return new yra(jsaVar, list, lq4Var);
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
                ((yra) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((yra) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        rt2 rt2Var;
        Long l;
        int i = this.e;
        List list = this.g;
        jsa jsaVar = this.f;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ch3.d0(obj);
                Long l2 = (Long) ww3.t1(list);
                if (l2 != null) {
                    MessageModel messageModelH = ((opa) jsaVar.z2.a.getValue()).h(l2.longValue());
                    if (messageModelH != null && (rt2Var = (rt2) jsaVar.w2.a.getValue()) != null) {
                        jsa.M(jsaVar, rt2Var, messageModelH.b);
                    }
                }
                break;
            default:
                ch3.d0(obj);
                rt2 rt2Var2 = (rt2) jsaVar.w2.a.getValue();
                if (rt2Var2 != null && rt2Var2.e0() && (l = (Long) ww3.t1(list)) != null) {
                    MessageModel messageModelH2 = ((opa) jsaVar.z2.a.getValue()).h(l.longValue());
                    if (messageModelH2 != null) {
                        w69 w69Var = (w69) jsaVar.r1.getValue();
                        long jA = rt2Var2.A();
                        long j = messageModelH2.b;
                        w69Var.getClass();
                        it3.a(jsaVar.U(), (jA == 0 || j == 0) ? "" : w69.b(j, String.format(Locale.getDefault(), "%s://%s/c/%d/", "https", "max.ru", Long.valueOf(jA))).toString());
                        if (it3.b()) {
                            a8j.x(jsaVar.E2, new n3g(new tnh(R.string.chat_screen_action_share_link_success_copied), new Integer(R.drawable.icon_check_round_fill), null, 4));
                        }
                    }
                }
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yra(List list, jsa jsaVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = list;
        this.f = jsaVar;
    }
}
