package defpackage;

import one.me.calls.ui.ui.previewjoinlink.CallJoinLinkPreviewWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rp1 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallJoinLinkPreviewWidget b;

    public /* synthetic */ rp1(CallJoinLinkPreviewWidget callJoinLinkPreviewWidget, int i) {
        this.a = i;
        this.b = callJoinLinkPreviewWidget;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        CallJoinLinkPreviewWidget callJoinLinkPreviewWidget = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = CallJoinLinkPreviewWidget.v;
                return callJoinLinkPreviewWidget.getRouter();
            case 1:
                return vd7.o(callJoinLinkPreviewWidget.a, new ifh(new rp1(callJoinLinkPreviewWidget, 0)), callJoinLinkPreviewWidget);
            case 2:
                zv8[] zv8VarArr2 = CallJoinLinkPreviewWidget.v;
                return callJoinLinkPreviewWidget.getContext().getDrawable(R.drawable.icon_microphone_crossed_fill);
            case 3:
                zv8[] zv8VarArr3 = CallJoinLinkPreviewWidget.v;
                return callJoinLinkPreviewWidget.getContext().getDrawable(R.drawable.icon_microphone_fill);
            case 4:
                zv8[] zv8VarArr4 = CallJoinLinkPreviewWidget.v;
                return callJoinLinkPreviewWidget.getContext().getDrawable(R.drawable.icon_video_call_crossed_fill);
            default:
                zv8[] zv8VarArr5 = CallJoinLinkPreviewWidget.v;
                return callJoinLinkPreviewWidget.getContext().getDrawable(R.drawable.icon_video_call_fill);
        }
    }
}
