package defpackage;

import android.widget.TextView;
import one.me.settings.twofa.restore.ProfileDeletionInfoScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class omd extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ProfileDeletionInfoScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ omd(lq4 lq4Var, ProfileDeletionInfoScreen profileDeletionInfoScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = profileDeletionInfoScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ProfileDeletionInfoScreen profileDeletionInfoScreen = this.g;
        switch (i) {
            case 0:
                omd omdVar = new omd(lq4Var, profileDeletionInfoScreen, 0);
                omdVar.f = obj;
                return omdVar;
            case 1:
                omd omdVar2 = new omd(lq4Var, profileDeletionInfoScreen, 1);
                omdVar2.f = obj;
                return omdVar2;
            default:
                omd omdVar3 = new omd(lq4Var, profileDeletionInfoScreen, 2);
                omdVar3.f = obj;
                return omdVar3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((omd) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((omd) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((omd) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        ProfileDeletionInfoScreen profileDeletionInfoScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                ((TextView) profileDeletionInfoScreen.e.m(profileDeletionInfoScreen, ProfileDeletionInfoScreen.g[0])).setText(((pmd) obj2).a.b(profileDeletionInfoScreen.getContext()));
                break;
            case 1:
                ch3.d0(obj);
                if (((rbb) obj2) instanceof rt3) {
                    profileDeletionInfoScreen.getRouter().D();
                }
                break;
            default:
                ch3.d0(obj);
                m7i m7iVar = (m7i) obj2;
                j8e j8eVar = profileDeletionInfoScreen.f;
                zv8[] zv8VarArr = ProfileDeletionInfoScreen.g;
                if (m7iVar instanceof k7i) {
                    h8c h8cVar = new h8c(profileDeletionInfoScreen);
                    k7i k7iVar = (k7i) m7iVar;
                    h8cVar.h(new w8c(k7iVar.b));
                    h8cVar.m(k7iVar.a);
                    h8cVar.p();
                    ((cyb) j8eVar.m(profileDeletionInfoScreen, ProfileDeletionInfoScreen.g[1])).setLoading(false);
                } else if (m7iVar instanceof l7i) {
                    ((cyb) j8eVar.m(profileDeletionInfoScreen, ProfileDeletionInfoScreen.g[1])).setLoading(((l7i) m7iVar).a);
                }
                break;
        }
        return sbiVar;
    }
}
