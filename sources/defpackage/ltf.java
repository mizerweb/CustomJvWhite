package defpackage;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import one.me.settings.SettingsListScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ltf implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SettingsListScreen b;

    public /* synthetic */ ltf(SettingsListScreen settingsListScreen, int i) {
        this.a = i;
        this.b = settingsListScreen;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        SettingsListScreen settingsListScreen = this.b;
        switch (i) {
            case 0:
                et4 et4Var = (et4) obj;
                zv8[] zv8VarArr = SettingsListScreen.r;
                rq rqVar = new rq(et4Var.getContext());
                rqVar.setId(R.id.oneme_settings_list_screen_appbar);
                rqVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                n1g.N(new meb(3, null, 2), rqVar);
                settingsListScreen.o = rqVar;
                rqVar.setLiftOnScroll(true);
                zv8[] zv8VarArr2 = SettingsListScreen.r;
                ltf ltfVar = new ltf(settingsListScreen, 1);
                rw3 rw3Var = new rw3(rqVar.getContext());
                rw3Var.setId(R.id.oneme_settings_collapsingstoolbar);
                pq pqVar = new pq();
                pqVar.a = 19;
                rw3Var.setLayoutParams(pqVar);
                rw3Var.setTitleEnabled(false);
                ltfVar.invoke(rw3Var);
                rqVar.addView(rw3Var);
                et4Var.addView(rqVar);
                RecyclerView recyclerViewR1 = settingsListScreen.r1(24);
                bt4 bt4Var = new bt4(-1, -1);
                bt4Var.b(new AppBarLayout$ScrollingViewBehavior());
                recyclerViewR1.setLayoutParams(bt4Var);
                recyclerViewR1.setPaddingRelative(recyclerViewR1.getPaddingStart(), recyclerViewR1.getPaddingTop(), recyclerViewR1.getPaddingEnd(), gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
                recyclerViewR1.setClipToPadding(false);
                recyclerViewR1.setItemAnimator(null);
                recyclerViewR1.setClipChildren(false);
                recyclerViewR1.h(new ph1(10), -1);
                recyclerViewR1.h(new ph1(11), -1);
                et4Var.addView(recyclerViewR1);
                break;
            case 1:
                rw3 rw3Var2 = (rw3) obj;
                zv8[] zv8VarArr3 = SettingsListScreen.r;
                Toolbar toolbar = new Toolbar(rw3Var2.getContext());
                toolbar.setId(R.id.oneme_settings_list_screen_pinned_toolbar);
                ow3 ow3Var = new ow3(-1, -2);
                ow3Var.a = 1;
                toolbar.setLayoutParams(ow3Var);
                toolbar.setNavigationIcon((Drawable) null);
                toolbar.s(0, 0);
                zv8[] zv8VarArr4 = SettingsListScreen.r;
                rcc rccVar = new rcc(toolbar.getContext());
                rccVar.setId(R.id.oneme_settings_toolbar);
                rccVar.setForm(gcc.Compact);
                rccVar.setRightActions(new acc(null, new hcc(R.drawable.icon_edit, new ltf(settingsListScreen, 2)), null));
                rccVar.setLeftActions(new zbc(new hcc(R.drawable.icon_qr_code, new ltf(settingsListScreen, 3))));
                toolbar.addView(rccVar);
                rw3Var2.addView(toolbar);
                rw3Var2.addView(new mwf(rw3Var2.getContext()));
                break;
            case 2:
                zv8[] zv8VarArr5 = SettingsListScreen.r;
                bpf bpfVarT1 = settingsListScreen.t1();
                Long lE = bpfVarT1.E();
                if (lE != null) {
                    a8j.x(bpfVarT1.z, new juf(lE.longValue()));
                }
                break;
            default:
                sm8 sm8Var = (sm8) settingsListScreen.e.getValue();
                Integer numC = ((tbb) sm8Var.b.getValue()).c();
                sm8Var.a("click_qr", (numC != null && numC.intValue() == 100) ? "plus" : "main", "invite_friends");
                bpf bpfVarT2 = settingsListScreen.t1();
                xt4 xt4VarA = ((n0c) bpfVarT2.D()).a();
                yt4 yt4VarC = bpfVarT2.C();
                xt4VarA.getClass();
                a8j.t(bpfVarT2, lvb.x0(xt4VarA, yt4VarC), new apf(bpfVarT2, null, 5), 2);
                break;
        }
        return sbiVar;
    }
}
