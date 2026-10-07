package defpackage;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nrd implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileMemberPermissionsScreen b;

    public /* synthetic */ nrd(ProfileMemberPermissionsScreen profileMemberPermissionsScreen, int i) {
        this.a = i;
        this.b = profileMemberPermissionsScreen;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        ProfileMemberPermissionsScreen profileMemberPermissionsScreen = this.b;
        switch (i) {
            case 0:
                LinearLayout linearLayout = (LinearLayout) obj;
                rcc rccVar = new rcc(linearLayout.getContext());
                rccVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                rccVar.setTitle(R.string.profile_edit_member_permissions_toolbar_title);
                rccVar.setForm(gcc.Compact);
                rccVar.setTextShimmerEnabled(false);
                rccVar.setLeftActions(new wbc(new nrd(profileMemberPermissionsScreen, 1)));
                linearLayout.addView(rccVar);
                RecyclerView recyclerView = new RecyclerView(linearLayout.getContext());
                recyclerView.setId(R.id.profile_edit_member_permissions_recycler_view);
                recyclerView.setLayoutParams(new uf4(-1, -1));
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setClipToPadding(false);
                recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), gm0.K(16.0f * yl5.d().getDisplayMetrics().density), recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
                recyclerView.setAdapter(profileMemberPermissionsScreen.d);
                recyclerView.setItemAnimator(null);
                f8b f8bVar = jj8.a;
                f8b f8bVar2 = new f8b(1);
                f8bVar2.h(np0.q);
                recyclerView.h(new sbf(pq3.j.h(recyclerView), new fv9(profileMemberPermissionsScreen, 25, f8bVar2), null, null, null, 60), -1);
                int iK = gm0.K(yl5.d().getDisplayMetrics().density * 6.0f);
                int i2 = aj8.a;
                c8b c8bVar = new c8b();
                c8bVar.e(1024, 0);
                c8bVar.e(np0.q, iK);
                int iK2 = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
                c8b c8bVar2 = new c8b();
                c8bVar2.e(1024, 0);
                c8bVar2.e(np0.q, iK2);
                int iK3 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                int iK4 = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
                c8b c8bVar3 = new c8b();
                c8bVar3.e(1024, iK3);
                c8bVar3.e(np0.q, iK4);
                recyclerView.h(new ym9(c8bVar3, c8bVar, c8bVar2, 0), -1);
                linearLayout.addView(recyclerView);
                break;
            default:
                a8j.x(profileMemberPermissionsScreen.o1().m, rt3.b);
                break;
        }
        return sbiVar;
    }
}
