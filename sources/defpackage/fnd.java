package defpackage;

import android.widget.FrameLayout;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fnd implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileEditAdminPermissionsWidget b;

    public /* synthetic */ fnd(ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget, int i) {
        this.a = i;
        this.b = profileEditAdminPermissionsWidget;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = this.b;
        switch (i) {
            case 0:
                vv vvVar = profileEditAdminPermissionsWidget.b;
                zv8[] zv8VarArr = ProfileEditAdminPermissionsWidget.n;
                zv8 zv8Var = zv8VarArr[0];
                long jLongValue = ((Number) vvVar.a(profileEditAdminPermissionsWidget)).longValue();
                vv vvVar2 = profileEditAdminPermissionsWidget.c;
                zv8 zv8Var2 = zv8VarArr[1];
                long jLongValue2 = ((Number) vvVar2.a(profileEditAdminPermissionsWidget)).longValue();
                zmd zmdVarO1 = profileEditAdminPermissionsWidget.o1();
                wtc wtcVar = profileEditAdminPermissionsWidget.e;
                xn3 xn3Var = (xn3) wtcVar.getAccessor().d(144).getValue();
                no4 no4Var = (no4) wtcVar.getAccessor().d(132).getValue();
                ifh ifhVarD = wtcVar.getAccessor().d(837);
                ifh ifhVarD2 = wtcVar.getAccessor().d(23);
                ifh ifhVarD3 = wtcVar.getAccessor().d(836);
                ifh ifhVarD4 = wtcVar.getAccessor().d(146);
                wtcVar.getAccessor().getClass();
                return new end(jLongValue, jLongValue2, zmdVarO1, xn3Var, no4Var, ifhVarD3, ifhVarD4, ifhVarD2, ifhVarD, wtcVar.getAccessor().d(85), wtcVar.getAccessor().d(630));
            default:
                zv8[] zv8VarArr2 = ProfileEditAdminPermissionsWidget.n;
                cyb cybVar = new cyb(profileEditAdminPermissionsWidget.getContext());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
                int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                layoutParams.leftMargin = iK;
                layoutParams.rightMargin = iK;
                layoutParams.topMargin = iK;
                layoutParams.bottomMargin = iK;
                cybVar.setLayoutParams(layoutParams);
                cybVar.setSize(ayb.g);
                cybVar.setAppearance(zxb.PRIMARY);
                cybVar.setVisibility(profileEditAdminPermissionsWidget.o1() != zmd.SETUP_NEW_ADMIN ? 8 : 0);
                cybVar.setText(profileEditAdminPermissionsWidget.o1() == zmd.CHANGE_ADMIN ? np4.q(cybVar.getContext(), R.string.profile_edit_admin_permissions_save_admin_changes_action) : np4.q(cybVar.getContext(), R.string.profile_edit_admin_permissions_add_admin_action));
                qe7.H(cybVar, 300L, new gwc(11, profileEditAdminPermissionsWidget));
                return cybVar;
        }
    }
}
