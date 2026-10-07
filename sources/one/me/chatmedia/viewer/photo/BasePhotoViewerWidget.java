package one.me.chatmedia.viewer.photo;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.b68;
import defpackage.bwc;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.ex8;
import defpackage.fz6;
import defpackage.j8e;
import defpackage.lq4;
import defpackage.n09;
import defpackage.n1g;
import defpackage.r8e;
import defpackage.sfd;
import defpackage.zfe;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lone/me/chatmedia/viewer/photo/BasePhotoViewerWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "as0", "chat-media-viewer"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class BasePhotoViewerWidget extends Widget {
    public static final /* synthetic */ zv8[] b;
    public final j8e a;

    static {
        dwd dwdVar = new dwd(BasePhotoViewerWidget.class, "photoView", "getPhotoView()Lone/me/chatmedia/viewer/photo/PhotoView;", 0);
        zfe.a.getClass();
        b = new zv8[]{dwdVar};
    }

    public BasePhotoViewerWidget(Bundle bundle) {
        super(bundle);
        this.a = viewBinding(R.id.oneme_chatmedia_viewer_photo_view);
    }

    public abstract void o1();

    @Override // defpackage.br4
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        bwc bwcVar = new bwc(frameLayout.getContext());
        bwcVar.setId(R.id.oneme_chatmedia_viewer_photo_view);
        frameLayout.addView(bwcVar);
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        q1().setZoomEnabled(getArgs().getBoolean("arg_key_zoom_enabled", true));
        q1().setListener(new ex8(3, this));
        o1();
        e9i.j0(new fz6(n1g.v(t1(), getViewLifecycleOwner().f(), n09.d), new sfd(21, (lq4) null, this), 3), getViewLifecycleScope());
    }

    public abstract b68 p1();

    public final bwc q1() {
        return (bwc) this.a.m(this, b[0]);
    }

    public abstract void r1();

    public abstract void s1();

    public abstract r8e t1();
}
