package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import one.me.folders.list.FoldersListScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class i57 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ FoldersListScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i57(lq4 lq4Var, FoldersListScreen foldersListScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = foldersListScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        FoldersListScreen foldersListScreen = this.g;
        switch (i) {
            case 0:
                i57 i57Var = new i57(lq4Var, foldersListScreen, 0);
                i57Var.f = obj;
                return i57Var;
            default:
                i57 i57Var2 = new i57(lq4Var, foldersListScreen, 1);
                i57Var2.f = obj;
                return i57Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((i57) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((i57) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                Object obj2 = this.f;
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj2;
                if (rbbVar instanceof i65) {
                    r37.b.e((i65) rbbVar);
                }
                break;
            default:
                Object obj3 = this.f;
                ch3.d0(obj);
                FoldersListScreen foldersListScreen = this.g;
                ((f57) ((RecyclerView) foldersListScreen.g.m(foldersListScreen, FoldersListScreen.h[0])).getAdapter()).I((List) obj3, new pi(18, foldersListScreen));
                break;
        }
        return sbiVar;
    }
}
