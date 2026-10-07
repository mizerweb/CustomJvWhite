package one.me.mediapicker.permissions;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.ayb;
import defpackage.cyb;
import defpackage.dwd;
import defpackage.gm0;
import defpackage.n1g;
import defpackage.np4;
import defpackage.ny8;
import defpackage.o37;
import defpackage.o77;
import defpackage.q1a;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.svj;
import defpackage.t3f;
import defpackage.vv;
import defpackage.wsc;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.ysc;
import defpackage.zfe;
import defpackage.zv8;
import defpackage.zxb;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/mediapicker/permissions/MediaPickerPermissionWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "(Lt3f;)V", "media-picker"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MediaPickerPermissionWidget extends Widget {
    public static final /* synthetic */ zv8[] d;
    public final vv a;
    public final ny8 b;
    public final ny8 c;

    static {
        dwd dwdVar = new dwd(MediaPickerPermissionWidget.class, "scopeId", "getScopeId()Lone/me/sdk/arch/store/ScopeId;", 0);
        zfe.a.getClass();
        d = new zv8[]{dwdVar};
    }

    public MediaPickerPermissionWidget(Bundle bundle) {
        super(bundle);
        this.a = new vv(t3f.class, t3f.d, Widget.ARG_SCOPE_ID);
        this.b = getSharedViewModel(getB(), q1a.class, null);
        this.c = ysc.a.a();
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScopeId */
    public final t3f getB() {
        zv8 zv8Var = d[0];
        return (t3f) this.a.a(this);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onActivityResumed(Activity activity) {
        q1a q1aVar = (q1a) this.b.getValue();
        q1aVar.q.e();
        q1aVar.r.e();
        super.onActivityResumed(activity);
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(yl5.d().getDisplayMetrics().density * 0.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density), gm0.K(0.0f * yl5.d().getDisplayMetrics().density));
        linearLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setText(R.string.media_type_picker__permissions_dialog__title);
        q9i.a(q9i.i, textView);
        textView.setGravity(17);
        TextView textView2 = new TextView(linearLayout.getContext());
        textView2.setText(R.string.media_type_picker__permissions_dialog__subtitle);
        q9i.a(q9i.k, textView2);
        textView2.setPadding(textView2.getPaddingLeft(), gm0.K(4.0f * yl5.d().getDisplayMetrics().density), textView2.getPaddingRight(), gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
        textView2.setGravity(17);
        cyb cybVar = new cyb(linearLayout.getContext());
        cybVar.setText(np4.q(cybVar.getContext(), R.string.media_type_picker__permissions_dialog__button));
        cybVar.setSize(ayb.h);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        qe7.H(cybVar, 300L, new o37(17, this));
        n1g.N(new o77(textView, textView2, null, 1), linearLayout);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        linearLayout.addView(cybVar);
        return linearLayout;
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        ny8 ny8Var = this.c;
        int i2 = 0;
        if (i != 157) {
            if (i != 162) {
                return;
            }
            int length = iArr.length;
            while (i2 < length) {
                if (iArr[i2] != -1) {
                    return;
                } else {
                    i2++;
                }
            }
            wsc.v((wsc) ny8Var.getValue(), new svj(this, 1), strArr, iArr, wsc.p, R.string.media_type_picker__permissions_dialog__gallery_camera_title, R.string.media_type_picker__permissions_dialog__gallery_camera_subtitle, 192);
            return;
        }
        int length2 = iArr.length;
        while (i2 < length2) {
            if (iArr[i2] != -1) {
                return;
            } else {
                i2++;
            }
        }
        wsc wscVar = (wsc) ny8Var.getValue();
        svj svjVar = new svj(this, 1);
        wscVar.getClass();
        wsc.t(svjVar, strArr, iArr, R.string.media_type_picker__permissions_dialog__gallery_title, R.string.media_type_picker__permissions_dialog__gallery_subtitle);
    }

    public MediaPickerPermissionWidget(t3f t3fVar) {
        this(n1g.i(new ylc(Widget.ARG_SCOPE_ID, t3fVar)));
    }
}
