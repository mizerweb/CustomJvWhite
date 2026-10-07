package one.me.mediapicker.crop;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.dwd;
import defpackage.dx;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.h;
import defpackage.jx;
import defpackage.kbc;
import defpackage.lq4;
import defpackage.lx;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.qo7;
import defpackage.r;
import defpackage.sfd;
import defpackage.t3f;
import defpackage.vv;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zsj;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.mediapicker.crop.AspectRatiosBottomSheet;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/mediapicker/crop/AspectRatiosBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "Landroid/net/Uri;", "imageUri", "(Lt3f;Landroid/net/Uri;)V", "media-picker"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AspectRatiosBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ zv8[] x;
    public final h u;
    public final vv v;
    public final zsj w;

    static {
        dwd dwdVar = new dwd(AspectRatiosBottomSheet.class, "imageUri", "getImageUri()Landroid/net/Uri;", 0);
        zfe.a.getClass();
        x = new zv8[]{dwdVar};
    }

    public AspectRatiosBottomSheet(Bundle bundle) {
        super(bundle);
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.u = hVar;
        this.v = new vv("arg_image_uri", Uri.class);
        ny8 ny8VarCreateViewModelLazy = createViewModelLazy(lx.class, new r(10, new qo7(14, this)));
        this.w = new zsj(new jx() { // from class: kx
            @Override // defpackage.jx
            public final void J0(int i, int i2) {
                zv8[] zv8VarArr = AspectRatiosBottomSheet.x;
                AspectRatiosBottomSheet aspectRatiosBottomSheet = this.a;
                Object targetController = aspectRatiosBottomSheet.getTargetController();
                jx jxVar = targetController instanceof jx ? (jx) targetController : null;
                if (jxVar != null) {
                    jxVar.J0(i, i2);
                }
                if (aspectRatiosBottomSheet.getView() != null) {
                    aspectRatiosBottomSheet.v1(true);
                }
            }
        }, ((a2c) hVar.getAccessor().d(27).getValue()).a(), 2);
        e9i.j0(new fz6(n1g.v(((lx) ny8VarCreateViewModelLazy.getValue()).c, getViewLifecycleOwner().f(), n09.d), new sfd(9, (lq4) null, this), 3), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View D1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        q9i.a(q9i.b, textView);
        textView.setGravity(1);
        textView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(16.0f * yl5.d().getDisplayMetrics().density), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        textView.setTextColor(t1().getText().b);
        textView.setText(R.string.media_picker_aspect_ratios_bottom_sheet_title);
        linearLayout.addView(textView);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext());
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.w);
        recyclerView.setItemAnimator(null);
        recyclerView.h(new dx(recyclerView.getContext()), -1);
        linearLayout.addView(recyclerView);
        return linearLayout;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final kbc t1() {
        return pq3.j.e(getContext()).j().b;
    }

    public AspectRatiosBottomSheet(t3f t3fVar, Uri uri) {
        this(n1g.i(new ylc("arg_scope_id", t3fVar), new ylc("arg_image_uri", uri), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(t3fVar.b().a))));
    }
}
