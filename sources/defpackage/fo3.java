package defpackage;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import one.me.chats.tab.StoriesAppBarBehavior;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class fo3 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pk6 b;
    public final /* synthetic */ ko3 c;
    public final /* synthetic */ ho3 d;

    public /* synthetic */ fo3(pk6 pk6Var, ko3 ko3Var, ho3 ho3Var, int i) {
        this.a = i;
        this.b = pk6Var;
        this.c = ko3Var;
        this.d = ho3Var;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        final ho3 ho3Var = this.d;
        ko3 ko3Var = this.c;
        pk6 pk6Var = this.b;
        int i2 = 0;
        switch (i) {
            case 0:
                rq rqVar = (rq) obj;
                k96 k96Var = new k96(rqVar.getContext());
                k96Var.setId(R.id.chats_list_stories_recycler_view);
                k96Var.setLayoutParams(new LinearLayout.LayoutParams(-1, gm0.K(88.0f * yl5.d().getDisplayMetrics().density)));
                k96Var.getContext();
                k96Var.setLayoutManager(new LinearLayoutManager() { // from class: one.me.chats.tab.ChatsTabViewHelper$storiesRecycler$1$1
                    {
                        q1(0);
                    }

                    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.vee
                    /* JADX INFO: renamed from: e */
                    public final boolean getX() {
                        return ho3Var.getAsBoolean();
                    }
                });
                k96Var.setAdapter(pk6Var);
                k96Var.setHasFixedSize(true);
                k96Var.h(new prg(), -1);
                k96Var.setElevation(10.0f);
                k96Var.k(ko3Var);
                k96Var.w0(0);
                rqVar.addView(k96Var);
                vd7.u(rqVar, true);
                vd7.I(rqVar, true);
                break;
            default:
                et4 et4Var = (et4) obj;
                fo3 fo3Var = new fo3(pk6Var, ko3Var, ho3Var, i2);
                rq rqVar2 = new rq(et4Var.getContext());
                rqVar2.setId(R.id.chats_list_appbar);
                rqVar2.setExpanded(false);
                bt4 bt4Var = new bt4(-1, -2);
                bt4Var.b(new StoriesAppBarBehavior());
                rqVar2.setLayoutParams(bt4Var);
                rqVar2.setElevation(0.0f);
                rqVar2.setLiftOnScroll(false);
                rqVar2.setStateListAnimator(null);
                rqVar2.setClipChildren(false);
                n1g.N(new adh(3, (lq4) null, 8), rqVar2);
                fo3Var.invoke(rqVar2);
                et4Var.addView(rqVar2);
                y8j y8jVar = new y8j(et4Var.getContext());
                y8jVar.setId(R.id.chats_list_folders_pager);
                bt4 bt4Var2 = new bt4(-1, -1);
                bt4Var2.b(new AppBarLayout$ScrollingViewBehavior());
                y8jVar.setLayoutParams(bt4Var2);
                lvb.m0(y8jVar);
                et4Var.addView(y8jVar);
                break;
        }
        return sbiVar;
    }
}
