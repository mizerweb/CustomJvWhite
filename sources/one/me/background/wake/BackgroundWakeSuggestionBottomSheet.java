package one.me.background.wake;

import defpackage.ah3;
import defpackage.br4;
import defpackage.g02;
import defpackage.id8;
import defpackage.ld8;
import defpackage.lq4;
import defpackage.xw3;
import defpackage.yab;
import kotlin.Metadata;
import one.me.chats.tab.ChatsTabWidget;
import one.me.sdk.bottomsheet.info.InfoBottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/background/wake/BackgroundWakeSuggestionBottomSheet;", "Lone/me/sdk/bottomsheet/info/InfoBottomSheetWidget;", "<init>", "()V", "background-wake"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BackgroundWakeSuggestionBottomSheet extends InfoBottomSheetWidget {
    public final int A;
    public final id8 B;
    public final int C;
    public final int z;

    public BackgroundWakeSuggestionBottomSheet() {
        super(null, 1, null);
        this.z = R.string.oneme_background_wake_sheet_title;
        this.A = R.string.oneme_background_wake_sheet_description;
        this.B = new id8(R.drawable.bad_connection_attention_avd, xw3.P0("signal_bar_1", "signal_bar_2", "signal_bar_3", "warning"), null, 500L);
        this.C = R.string.oneme_background_wake_sheet_button;
    }

    @Override // one.me.sdk.bottomsheet.info.InfoBottomSheetWidget
    public final ld8 G1() {
        return this.B;
    }

    @Override // one.me.sdk.bottomsheet.info.InfoBottomSheetWidget
    /* JADX INFO: renamed from: H1, reason: from getter */
    public final int getC() {
        return this.C;
    }

    @Override // one.me.sdk.bottomsheet.info.InfoBottomSheetWidget
    public final Integer J1() {
        return Integer.valueOf(this.A);
    }

    @Override // one.me.sdk.bottomsheet.info.InfoBottomSheetWidget
    /* JADX INFO: renamed from: M1, reason: from getter */
    public final int getZ() {
        return this.z;
    }

    @Override // one.me.sdk.bottomsheet.info.InfoBottomSheetWidget
    public final void P1() {
        br4 targetController = getTargetController();
        lq4 lq4Var = null;
        ChatsTabWidget chatsTabWidget = targetController instanceof ChatsTabWidget ? (ChatsTabWidget) targetController : null;
        boolean z = true;
        if (chatsTabWidget != null) {
            ah3 ah3Var = (ah3) chatsTabWidget.C.getValue();
            ah3Var.c.j(true);
            yab.i0(ah3Var.b, null, 0, new g02(ah3Var, z, lq4Var, 2), 3);
        }
        v1(true);
    }
}
