package one.me.profile.screens.media;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.a33;
import defpackage.bxd;
import defpackage.ca2;
import defpackage.dhb;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.f00;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.h47;
import defpackage.ha9;
import defpackage.i19;
import defpackage.i43;
import defpackage.j8e;
import defpackage.k96;
import defpackage.ka0;
import defpackage.lq4;
import defpackage.m43;
import defpackage.mc4;
import defpackage.mg5;
import defpackage.mt7;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.ow0;
import defpackage.p0m;
import defpackage.p23;
import defpackage.p3c;
import defpackage.q91;
import defpackage.qq2;
import defpackage.qyj;
import defpackage.r8e;
import defpackage.rx8;
import defpackage.svj;
import defpackage.t7a;
import defpackage.tre;
import defpackage.u3d;
import defpackage.vo8;
import defpackage.vp4;
import defpackage.vv;
import defpackage.w23;
import defpackage.wsc;
import defpackage.wtc;
import defpackage.x43;
import defpackage.x7a;
import defpackage.y23;
import defpackage.yab;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.ysc;
import defpackage.z23;
import defpackage.z8b;
import defpackage.za2;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import java.util.Iterator;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB)\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0007\u0010\u0011¨\u0006\u0012"}, d2 = {"Lone/me/profile/screens/media/ChatMediaListWidget;", "Lone/me/sdk/arch/Widget;", "Lw23;", "Lvp4;", "Lmc4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "Lmg5;", "itemType", "Li43;", "type", "Lha9;", "localAccountId", "(JLmg5;Li43;Lha9;)V", "profile"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ChatMediaListWidget extends Widget implements w23, vp4, mc4 {
    public static final /* synthetic */ zv8[] m = {new z8b(ChatMediaListWidget.class, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;"), zo5.f(zfe.a, ChatMediaListWidget.class, "mediaType", "getMediaType()Lone/me/profile/screens/media/model/ChatMediaType;", 0), new dwd(ChatMediaListWidget.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new dwd(ChatMediaListWidget.class, "emptyView", "getEmptyView()Lone/me/profile/screens/media/view/ChatMediaEmptyView;", 0)};
    public x7a a;
    public final p3c b;
    public final vv c;
    public final wtc d;
    public final ca2 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final j8e i;
    public final ny8 j;
    public final h47 k;
    public final ow0 l;

    public ChatMediaListWidget(Bundle bundle) {
        super(bundle);
        this.b = qyj.S();
        this.c = new vv("media_type", i43.class);
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.d = wtcVar;
        this.e = new ca2(m35getAccountScopeuqN4xOY());
        this.f = createViewModelLazy(x43.class, new qq2(6, new za2(this, 8, bundle)));
        int i = 3;
        this.g = rx8.P(3, new y23(this, 0));
        this.h = wtcVar.getAccessor().d(878);
        this.i = viewBinding(R.id.profile_media_list_rv);
        this.j = ysc.a.a();
        this.k = new h47(wtcVar.getExecutors().a(), this, i);
        tre.m0(new fz6(o1().p1, new z23(this, null), i), getLifecycleScope());
        this.l = binding(new y23(this, 1));
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        x7a x7aVar = this.a;
        if (x7aVar != null) {
            this.a = null;
            o1().L(i, x7aVar);
        }
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        Object next;
        if (bundle != null) {
            long j = bundle.getLong("selected_message_id");
            long j2 = bundle.getLong("selected_attach_id");
            x43 x43VarO1 = o1();
            Iterator it = ((m43) x43VarO1.o1.getValue()).a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                x7a x7aVar = (x7a) next;
                if (x7aVar.l() == j && x7aVar.k() == j2) {
                    break;
                }
            }
            x7a x7aVar2 = (x7a) next;
            if (x7aVar2 == null) {
                return;
            }
            x43VarO1.L(i, x7aVar2);
        }
    }

    public final x43 o1() {
        return (x43) this.f.getValue();
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        if (p1() != i43.b) {
            return;
        }
        ka0 ka0Var = ((u3d) this.h.getValue()).b;
        ka0Var.h = true;
        ka0Var.g();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        k96 k96Var = new k96(layoutInflater.getContext());
        k96Var.setId(R.id.profile_media_list_rv);
        k96Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        k96Var.setPager(o1().n1);
        k96Var.setThreshold(20);
        k96Var.setAdapter(this.k);
        k96Var.setIgnoreRefreshingFlagsForScrollEvent(true);
        dhb dhbVar = new dhb(0);
        dhbVar.g = false;
        k96Var.setItemAnimator(dhbVar);
        k96Var.setOverScrollMode(2);
        zv8[] zv8VarArr = m;
        int i = 3;
        zv8 zv8Var = zv8VarArr[3];
        ow0 ow0Var = this.l;
        k96Var.setEmptyView((p23) ow0Var.getValue());
        k96Var.setHasFixedSize(true);
        if (a33.$EnumSwitchMapping$0[p1().ordinal()] == 1) {
            k96Var.getContext();
            k96Var.setLayoutManager(new GridLayoutManager(3));
            k96Var.h(new q91(i, gm0.K(3.0f * yl5.d().getDisplayMetrics().density), 5), -1);
        } else {
            k96Var.getContext();
            k96Var.setLayoutManager(new LinearLayoutManager());
        }
        frameLayout.addView(k96Var);
        zv8 zv8Var2 = zv8VarArr[3];
        frameLayout.addView((p23) ow0Var.getValue());
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDetach(View view) {
        if (p1() != i43.b) {
            return;
        }
        ka0 ka0Var = ((u3d) this.h.getValue()).b;
        ka0Var.h = false;
        bxd bxdVar = ka0Var.b;
        if (ka0Var.f) {
            ka0Var.f = false;
            bxdVar.b();
            bxdVar.h.remove(ka0Var.i);
        }
    }

    @Override // defpackage.vp4
    public final void onDismiss() {
        vo8 vo8Var = (vo8) this.b.m(this, m[0]);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        this.a = null;
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 157) {
            for (int i2 : iArr) {
                if (i2 != -1) {
                    x43 x43VarO1 = o1();
                    t7a t7aVar = x43VarO1.J;
                    x43VarO1.J = null;
                    if (t7aVar != null) {
                        x43VarO1.K(t7aVar);
                        return;
                    }
                    return;
                }
            }
            o1().J = null;
            wsc wscVar = (wsc) this.j.getValue();
            svj svjVar = new svj(this, 1);
            wscVar.getClass();
            wsc.t(svjVar, strArr, iArr, R.string.oneme_request_storage_permission_title, R.string.oneme_request_storage_permission_subtitle);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        r8e r8eVar = o1().p1;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        lq4 lq4Var = null;
        int i = 3;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new z23(lq4Var, this, 1), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(o1().K, getViewLifecycleOwner().f(), n09Var), new z23(lq4Var, this, 2), i), getViewLifecycleScope());
    }

    public final i43 p1() {
        zv8 zv8Var = m[1];
        return (i43) this.c.a(this);
    }

    public final void q1(x7a x7aVar, View view) {
        if (x7aVar.i()) {
            return;
        }
        p0m.a(view, mt7.LONG_PRESS);
        if (this.a == null) {
            zv8[] zv8VarArr = m;
            zv8 zv8Var = zv8VarArr[0];
            p3c p3cVar = this.b;
            vo8 vo8Var = (vo8) p3cVar.m(this, zv8Var);
            if (vo8Var == null || !vo8Var.isActive()) {
                p3cVar.B(this, zv8VarArr[0], yab.i0(getViewLifecycleScope(), null, 2, new f00(this, x7aVar, view, (lq4) null, 15), 1));
            }
        }
    }

    public ChatMediaListWidget(long j, mg5 mg5Var, i43 i43Var, ha9 ha9Var) {
        this(n1g.i(new ylc("chat_id", Long.valueOf(j)), new ylc("item_type_id", Byte.valueOf(mg5Var.a)), new ylc("media_type", i43Var), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
