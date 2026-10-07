package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;
import one.me.stories.publish.PublishStoryBottomSheet;

/* JADX INFO: loaded from: classes3.dex */
public final class eyd extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ PublishStoryBottomSheet g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eyd(lq4 lq4Var, PublishStoryBottomSheet publishStoryBottomSheet, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = publishStoryBottomSheet;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        PublishStoryBottomSheet publishStoryBottomSheet = this.g;
        switch (i) {
            case 0:
                eyd eydVar = new eyd(lq4Var, publishStoryBottomSheet, 0);
                eydVar.f = obj;
                return eydVar;
            case 1:
                eyd eydVar2 = new eyd(lq4Var, publishStoryBottomSheet, 1);
                eydVar2.f = obj;
                return eydVar2;
            case 2:
                eyd eydVar3 = new eyd(lq4Var, publishStoryBottomSheet, 2);
                eydVar3.f = obj;
                return eydVar3;
            default:
                eyd eydVar4 = new eyd(lq4Var, publishStoryBottomSheet, 3);
                eydVar4.f = obj;
                return eydVar4;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((eyd) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((eyd) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((eyd) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((eyd) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.e;
        PublishStoryBottomSheet publishStoryBottomSheet = this.g;
        sbi sbiVar = sbi.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj2;
                if (cqk.d(rbbVar, rt3.b)) {
                    psg.b.j();
                } else if (rbbVar instanceof i65) {
                    psg.b.e((i65) rbbVar);
                }
                return sbiVar;
            case 1:
                ch3.d0(obj);
                cyb cybVar = (cyb) publishStoryBottomSheet.r.m(publishStoryBottomSheet, PublishStoryBottomSheet.t[1]);
                CharSequence charSequenceB = ((ynh) obj2).b(publishStoryBottomSheet.getContext());
                if (charSequenceB == null) {
                    charSequenceB = "";
                }
                cybVar.setText(charSequenceB);
                return sbiVar;
            case 2:
                ch3.d0(obj);
                cyd cydVar = (cyd) obj2;
                if (cydVar instanceof byd) {
                    Collection collection = ((byd) cydVar).a;
                    zv8[] zv8VarArr = PublishStoryBottomSheet.t;
                    if (publishStoryBottomSheet.getView() != null) {
                        opl.b(publishStoryBottomSheet, 1).g().f((cyb) publishStoryBottomSheet.r.m(publishStoryBottomSheet, PublishStoryBottomSheet.t[1])).l(collection).c().build().u(publishStoryBottomSheet);
                        View view = publishStoryBottomSheet.getView();
                        if (view != null) {
                            p0m.a(view, mt7.LONG_PRESS);
                        }
                    }
                } else {
                    if (!cqk.d(cydVar, ayd.a)) {
                        ore.o();
                        return null;
                    }
                    g8c g8cVar = publishStoryBottomSheet.s;
                    if (g8cVar != null) {
                        g8cVar.a();
                    }
                }
                return sbiVar;
            default:
                ch3.d0(obj);
                dtc dtcVar = (dtc) obj2;
                if (dtcVar == null) {
                    ore.o();
                    return null;
                }
                zv8[] zv8VarArr2 = PublishStoryBottomSheet.t;
                publishStoryBottomSheet.E1().m.k();
                g8c g8cVar2 = publishStoryBottomSheet.s;
                if (g8cVar2 != null) {
                    g8cVar2.a();
                }
                View viewS1 = publishStoryBottomSheet.s1();
                ViewGroup viewGroup = viewS1 instanceof ViewGroup ? (ViewGroup) viewS1 : null;
                h8c h8cVar = viewGroup != null ? new h8c(viewGroup) : new h8c(publishStoryBottomSheet);
                h8cVar.c(new o8c(0, 0, 0, 7));
                h8cVar.m(dtcVar.a);
                h8cVar.a(dtcVar.c);
                Integer num = dtcVar.b;
                if (num != null) {
                    h8cVar.h(new w8c(num.intValue()));
                }
                publishStoryBottomSheet.s = h8cVar.p();
                return sbiVar;
        }
    }
}
