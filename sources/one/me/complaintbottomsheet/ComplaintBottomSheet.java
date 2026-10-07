package one.me.complaintbottomsheet;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.b64;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.f64;
import defpackage.fj3;
import defpackage.fz6;
import defpackage.h;
import defpackage.ha9;
import defpackage.i19;
import defpackage.ifh;
import defpackage.jz;
import defpackage.lq4;
import defpackage.mc4;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.pq3;
import defpackage.r54;
import defpackage.s54;
import defpackage.s63;
import defpackage.vv;
import defpackage.ylc;
import defpackage.z4f;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zu;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BI\b\u0010\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0006\u0010\u0015¨\u0006\u0016"}, d2 = {"Lone/me/complaintbottomsheet/ComplaintBottomSheet;", "Lone/me/sdk/arch/Widget;", "Lz4f;", "Lmc4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "parentId", "postServerId", "", "ids", "", "type", "", "sourceScreen", "Lha9;", "localAccountId", "", "forceDarkTheme", "(Ljava/lang/Long;Ljava/lang/Long;[JLjava/lang/String;Ljava/lang/Integer;Lha9;Z)V", "complaint-bottomsheet"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ComplaintBottomSheet extends Widget implements z4f, mc4 {
    public static final /* synthetic */ zv8[] n = {new dwd(ComplaintBottomSheet.class, "ids", "getIds()[J", 0), zo5.f(zfe.a, ComplaintBottomSheet.class, "parentId", "getParentId()Ljava/lang/Long;", 0), new dwd(ComplaintBottomSheet.class, "postServerId", "getPostServerId()Ljava/lang/Long;", 0), new dwd(ComplaintBottomSheet.class, "complaintTypeString", "getComplaintTypeString()Ljava/lang/String;", 0), new dwd(ComplaintBottomSheet.class, "sourceScreen", "getSourceScreen()Ljava/lang/Integer;", 0), new dwd(ComplaintBottomSheet.class, "forceDarkTheme", "getForceDarkTheme()Z", 0)};
    public final vv a;
    public final vv b;
    public final vv c;
    public final vv d;
    public final vv e;
    public final vv f;
    public final int g;
    public final h h;
    public final ifh i;
    public final ny8 j;
    public final ifh k;
    public final ifh l;
    public final s63 m;

    public ComplaintBottomSheet(Bundle bundle) {
        super(bundle);
        this.a = new vv("ids", long[].class);
        this.b = new vv("parent_id", Long.class);
        this.c = new vv(Long.class, null, "post_server_id");
        this.d = new vv("type", String.class);
        this.e = new vv("source_screen", Integer.class);
        this.f = new vv("is_dark", Boolean.class);
        this.g = 3;
        this.h = new h(m35getAccountScopeuqN4xOY());
        this.i = new ifh(new r54(this, 0));
        this.j = createViewModelLazy(f64.class, new fj3(3, new r54(this, 1)));
        this.k = new ifh(new r54(this, 2));
        this.l = new ifh(new r54(this, 3));
        this.m = new s63(5, this);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        if (i == R.id.oneme_complaint_action_cancel) {
            return;
        }
        ((f64) this.j.getValue()).E(i);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.m;
    }

    @Override // defpackage.z4f
    public final boolean l0() {
        zv8 zv8Var = n[5];
        return ((Boolean) this.f.a(this)).booleanValue() || pq3.j.e(getContext()).n();
    }

    public final b64 o1() {
        return (b64) this.i.getValue();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setLayoutParams(new ActionBar.LayoutParams(-1, -1));
        frameLayout.setAlpha(0.0f);
        n1g.N(new zu(this, (lq4) null, 6), frameLayout);
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ny8 ny8Var = this.j;
        jz jzVar = new jz(((f64) ny8Var.getValue()).o, 13);
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        lq4 lq4Var = null;
        int i = 3;
        e9i.j0(new fz6(n1g.v(jzVar, i19VarF, n09Var), new s54(lq4Var, this, 0), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((f64) ny8Var.getValue()).q, getViewLifecycleOwner().f(), n09Var), new s54(lq4Var, this, 1), i), getViewLifecycleScope());
    }

    @Override // defpackage.z4f
    /* JADX INFO: renamed from: v, reason: from getter */
    public final int getG() {
        return this.g;
    }

    public ComplaintBottomSheet(Long l, Long l2, long[] jArr, String str, Integer num, ha9 ha9Var, boolean z) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a)), new ylc("parent_id", l), new ylc("post_server_id", l2), new ylc("ids", jArr), new ylc("type", str), new ylc("source_screen", num), new ylc("is_dark", Boolean.valueOf(z))));
    }
}
