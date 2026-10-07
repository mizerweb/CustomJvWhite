package defpackage;

import java.util.List;
import one.me.polls.screens.result.voterslist.PollAnswerVotersListScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class e6d extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ PollAnswerVotersListScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e6d(lq4 lq4Var, PollAnswerVotersListScreen pollAnswerVotersListScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = pollAnswerVotersListScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        PollAnswerVotersListScreen pollAnswerVotersListScreen = this.g;
        switch (i) {
            case 0:
                e6d e6dVar = new e6d(lq4Var, pollAnswerVotersListScreen, 0);
                e6dVar.f = obj;
                return e6dVar;
            case 1:
                e6d e6dVar2 = new e6d(lq4Var, pollAnswerVotersListScreen, 1);
                e6dVar2.f = obj;
                return e6dVar2;
            case 2:
                e6d e6dVar3 = new e6d(lq4Var, pollAnswerVotersListScreen, 2);
                e6dVar3.f = obj;
                return e6dVar3;
            default:
                e6d e6dVar4 = new e6d(lq4Var, pollAnswerVotersListScreen, 3);
                e6dVar4.f = obj;
                return e6dVar4;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((e6d) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((e6d) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((e6d) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((e6d) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                Object obj2 = this.f;
                ch3.d0(obj);
                h6d h6dVar = (h6d) obj2;
                PollAnswerVotersListScreen pollAnswerVotersListScreen = this.g;
                rcc rccVar = (rcc) pollAnswerVotersListScreen.k.m(pollAnswerVotersListScreen, PollAnswerVotersListScreen.n[4]);
                CharSequence charSequenceD = h6dVar.a.d(rccVar);
                if (charSequenceD == null) {
                    charSequenceD = "";
                }
                rccVar.setTitle(charSequenceD);
                rccVar.s(h6dVar.b, false);
                return sbi.a;
            case 1:
                Object obj3 = this.f;
                ch3.d0(obj);
                this.g.h.H((List) obj3);
                PollAnswerVotersListScreen pollAnswerVotersListScreen2 = this.g;
                ((k96) pollAnswerVotersListScreen2.l.m(pollAnswerVotersListScreen2, PollAnswerVotersListScreen.n[5])).setRefreshingNext(this.g.o1().k.j != -1);
                return sbi.a;
            case 2:
                Object obj4 = this.f;
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj4;
                if (cqk.d(rbbVar, rt3.b)) {
                    mad.b.b().f();
                } else if (rbbVar instanceof i65) {
                    mad.b.e((i65) rbbVar);
                }
                return sbi.a;
            default:
                Object obj5 = this.f;
                ch3.d0(obj);
                p3g p3gVar = (p3g) obj5;
                if (p3gVar == null) {
                    ore.o();
                    return null;
                }
                h8c h8cVar = new h8c(this.g);
                h8cVar.m(p3gVar.a);
                h8cVar.h(new w8c(R.drawable.icon_warning));
                h8cVar.p();
                return sbi.a;
        }
    }
}
