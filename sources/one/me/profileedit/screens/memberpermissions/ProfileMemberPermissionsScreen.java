package one.me.profileedit.screens.memberpermissions;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.a2c;
import defpackage.a8j;
import defpackage.c9;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.ha9;
import defpackage.hta;
import defpackage.k9d;
import defpackage.lrd;
import defpackage.n;
import defpackage.n1g;
import defpackage.nrd;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.rt3;
import defpackage.srd;
import defpackage.w8;
import defpackage.wtc;
import defpackage.ylc;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/profileedit/screens/memberpermissions/ProfileMemberPermissionsScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "Lha9;", "localAccountId", "(JLha9;)V", "profile-edit"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ProfileMemberPermissionsScreen extends Widget {
    public final oi8 a;
    public final wtc b;
    public final ny8 c;
    public final lrd d;

    public ProfileMemberPermissionsScreen(Bundle bundle) {
        super(bundle);
        this.a = oi8.f;
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.b = wtcVar;
        this.c = createViewModelLazy(srd.class, new hta(26, new k9d(bundle, 11, this)));
        this.d = new lrd(((a2c) wtcVar.getAccessor().c(27)).a(), this);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getZ1() {
        return this.a;
    }

    @Override // defpackage.br4
    public final boolean handleBack() {
        a8j.x(o1().m, rt3.b);
        return true;
    }

    public final srd o1() {
        return (srd) this.c.getValue();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        nrd nrdVar = new nrd(this, 0);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        n1g.N(new n(3, null, 14), linearLayout);
        nrdVar.invoke(linearLayout);
        return linearLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        e9i.j0(new fz6(o1().l, new w8(2, this.d, lrd.class, "submitList", "submitList(Ljava/util/List;)V", 4, 29), 3), getViewLifecycleScope());
        e9i.j0(new fz6(o1().m, new c9(2, null, 15), 3), getViewLifecycleScope());
    }

    public ProfileMemberPermissionsScreen(long j, ha9 ha9Var) {
        this(n1g.i(new ylc("id", Long.valueOf(j)), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
