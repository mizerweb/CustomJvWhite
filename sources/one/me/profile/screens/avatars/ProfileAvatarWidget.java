package one.me.profile.screens.avatars;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.a8d;
import defpackage.b78;
import defpackage.br4;
import defpackage.ckd;
import defpackage.dwd;
import defpackage.ek7;
import defpackage.gk7;
import defpackage.ha9;
import defpackage.i1f;
import defpackage.ifh;
import defpackage.j8e;
import defpackage.k70;
import defpackage.kbc;
import defpackage.n1g;
import defpackage.ore;
import defpackage.r66;
import defpackage.sb8;
import defpackage.t1d;
import defpackage.u78;
import defpackage.v78;
import defpackage.vd7;
import defpackage.vv;
import defpackage.wc8;
import defpackage.xj7;
import defpackage.ylc;
import defpackage.yw3;
import defpackage.z1k;
import defpackage.z68;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0004\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0004\u0010\u0010¨\u0006\u0012"}, d2 = {"Lone/me/profile/screens/avatars/ProfileAvatarWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "", "", "urls", "Lha9;", "localAccountId", "(JLjava/util/List;Lha9;)V", "Lckd;", "model", "(Lckd;Lha9;)V", "one/me/profile/screens/avatars/ProfileAvatarsScreen", "profile"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ProfileAvatarWidget extends Widget {
    public static final /* synthetic */ zv8[] e = {new dwd(ProfileAvatarWidget.class, "imageId", "getImageId()J", 0), zo5.f(zfe.a, ProfileAvatarWidget.class, "imageUrls", "getImageUrls()Ljava/util/List;", 0), new dwd(ProfileAvatarWidget.class, "imageView", "getImageView()Lone/me/sdk/zoom/ZoomableDraweeView;", 0)};
    public final ifh a;
    public final vv b;
    public final vv c;
    public final j8e d;

    public ProfileAvatarWidget(Bundle bundle) {
        super(bundle);
        this.a = new ifh(new a8d(9, this));
        this.b = new vv(Long.class, 0L, "extra.id");
        this.c = new vv(List.class, r66.a, "extra.urls");
        this.d = viewBinding(R.id.profile_contact_avatars_image_view);
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        z1k z1kVar = new z1k(frameLayout.getContext());
        z1kVar.setId(R.id.profile_contact_avatars_image_view);
        z1kVar.setAdjustViewBounds(true);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        z1kVar.setLayoutParams(layoutParams);
        frameLayout.addView(z1kVar);
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        br4 parentController = getParentController();
        ProfileAvatarsScreen profileAvatarsScreen = parentController instanceof ProfileAvatarsScreen ? (ProfileAvatarsScreen) parentController : null;
        zv8[] zv8VarArr = e;
        z1k z1kVar = (z1k) this.d.m(this, zv8VarArr[2]);
        int i = ((kbc) this.a.getValue()).getIcon().b;
        xj7 xj7Var = new xj7(z1kVar.getResources());
        xj7Var.l = i1f.n;
        xj7Var.j = new k70(z1kVar.getContext());
        xj7Var.f = sb8.D(R.drawable.icon_arrow_down, i, z1kVar.getContext());
        xj7Var.h = sb8.D(R.drawable.icon_arrow_down, i, z1kVar.getContext());
        xj7Var.b = 0;
        z1kVar.setHierarchy(xj7Var.a());
        z1kVar.setZoomEnabled(true);
        z1kVar.setOnTouchListener(new ek7(new GestureDetector(z1kVar.getContext(), new gk7(profileAvatarsScreen, 3, this)), 4));
        zv8 zv8Var = zv8VarArr[1];
        List<String> list = (List) this.c.a(this);
        ArrayList arrayList = new ArrayList(yw3.W0(list, 10));
        for (String str : list) {
            v78 v78VarB = v78.b(str);
            if (v78VarB == null) {
                ore.p("Required value was null.");
                return;
            } else {
                b78 b78VarA = vd7.A();
                b78VarA.getClass();
                arrayList.add(new z68(b78VarA, v78VarB, str, u78.FULL_FETCH));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        t1d t1dVar = vd7.a.get();
        t1dVar.e = new wc8(arrayList, false);
        t1dVar.g = true;
        t1dVar.j = z1kVar.getController();
        z1kVar.setController(t1dVar.a());
    }

    public ProfileAvatarWidget(ckd ckdVar, ha9 ha9Var) {
        this(ckdVar.a, ckdVar.b, ha9Var);
    }

    public ProfileAvatarWidget(long j, List<String> list, ha9 ha9Var) {
        this(n1g.i(new ylc("extra.id", Long.valueOf(j)), new ylc("extra.urls", list), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
