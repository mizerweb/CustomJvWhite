package one.me.chatscreen.chatstatus;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.f7;
import defpackage.gm0;
import defpackage.n1g;
import defpackage.q9i;
import defpackage.qb3;
import defpackage.t3f;
import defpackage.yl5;
import defpackage.ylc;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/chatscreen/chatstatus/CommentsDisabledBottomWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "(Lt3f;)V", "chat-screen"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CommentsDisabledBottomWidget extends Widget {
    public CommentsDisabledBottomWidget(t3f t3fVar) {
        this(n1g.i(new ylc(Widget.ARG_SCOPE_ID, t3fVar)));
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        n1g.N(new qb3(3, null, 3), frameLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setId(R.id.chat__bottom_container_comments_disabled_text);
        q9i.a(q9i.q, textView);
        textView.setGravity(17);
        textView.setText(R.string.chat_screen_comments_disabled);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), gm0.K(16.0f * yl5.d().getDisplayMetrics().density), gm0.K(10.0f * yl5.d().getDisplayMetrics().density));
        textView.setLayoutParams(layoutParams);
        n1g.N(new f7(3, null, 11), textView);
        frameLayout.addView(textView);
        return frameLayout;
    }

    public CommentsDisabledBottomWidget(Bundle bundle) {
        super(bundle);
    }
}
