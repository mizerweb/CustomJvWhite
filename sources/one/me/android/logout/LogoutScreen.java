package one.me.android.logout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.j6c;
import defpackage.lvb;
import defpackage.m6c;
import defpackage.r6c;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/android/logout/LogoutScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "oneme"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LogoutScreen extends Widget {
    public LogoutScreen() {
        super(null, 1, 0 == true ? 1 : 0);
    }

    @Override // defpackage.br4
    public final boolean handleBack() {
        return true;
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setBackgroundColor(lvb.I0(-7829368, 0.5f));
        r6c r6cVar = new r6c(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        r6cVar.setLayoutParams(layoutParams);
        r6cVar.setAppearance(j6c.a);
        r6cVar.setSize(m6c.a);
        frameLayout.addView(r6cVar);
        return frameLayout;
    }
}
