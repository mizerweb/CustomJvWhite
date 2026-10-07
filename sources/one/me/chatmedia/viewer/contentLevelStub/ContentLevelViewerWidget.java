package one.me.chatmedia.viewer.contentLevelStub;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.a8g;
import defpackage.pq3;
import defpackage.r1c;
import defpackage.tnh;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/chatmedia/viewer/contentLevelStub/ContentLevelViewerWidget;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "chat-media-viewer"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ContentLevelViewerWidget extends Widget {
    public ContentLevelViewerWidget() {
        super(null, 1, 0 == true ? 1 : 0);
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        r1c r1cVar = new r1c(frameLayout.getContext());
        r1cVar.setId(R.id.oneme_chatmedia_viewer_content_level_stub_view);
        r1cVar.setTitle(new tnh(R.string.oneme_chatmedia_viewer_content_level_title));
        r1cVar.setSubtitle(new tnh(R.string.oneme_chatmedia_viewer_content_level_subtitle));
        r1cVar.setIcon(R.drawable.icon_eye_crossed_fill);
        a8g a8gVar = pq3.j;
        r1cVar.setBackgroundColor(a8gVar.h(r1cVar).h().b);
        r1cVar.setCustomTheme(a8gVar.l(r1cVar).b);
        frameLayout.addView(r1cVar);
        return frameLayout;
    }
}
